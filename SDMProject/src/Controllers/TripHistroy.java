package Controllers;

import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

import Utils.ConnectionUtil;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class TripHistroy implements Initializable{
	
	 @FXML
	    private TableView<TripHistroyData> TableView2;

	    @FXML
	    private TableColumn<TripHistroyData, String> Col_CustomerName;
;

	    @FXML
	    private TableColumn<TripHistroyData, String> Col_StartLcaotion;

	    @FXML
	    private TableColumn<TripHistroyData, String> Col_EndLocation;


		ObservableList<TripHistroyData> Oblist = FXCollections.observableArrayList();
		
		

		

		@Override
		public void initialize(URL location, ResourceBundle resources) {
			// TODO Auto-generated method stub
			
			Connection con = ConnectionUtil.conDB();
			    try {
					ResultSet resultSet = con.createStatement().executeQuery("Select * From rides");
					
					while(resultSet.next()) {
						Oblist.add(new TripHistroyData(resultSet.getString("CustomerName"),resultSet.getString("StartLocation"),resultSet.getString("EndLocation")));
						

						
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
			    Col_CustomerName.setCellValueFactory(new PropertyValueFactory<>("CustomerName"));
			    Col_StartLcaotion.setCellValueFactory(new PropertyValueFactory<>("StartLocation"));
			    Col_EndLocation.setCellValueFactory(new PropertyValueFactory<>("EndLocation"));
			   
			
			TableView2.setItems(Oblist);
		}

		}