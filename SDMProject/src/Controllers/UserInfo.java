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



public class UserInfo  implements Initializable{
	
	
	@FXML
    private TableView<UserinfoData> Tableview1;

    @FXML
    private TableColumn<UserinfoData, String> Col_email;

    @FXML
    private TableColumn<UserinfoData, String> Col_Password;

    @FXML
    private TableColumn<UserinfoData, String> Col_username;
    
    
   
   


	ObservableList<UserinfoData> Oblist = FXCollections.observableArrayList();
	
	

	

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
		Connection con = ConnectionUtil.conDB();
		    try {
				ResultSet resultSet = con.createStatement().executeQuery("Select * From admins");
				
				while(resultSet.next()) {
					Oblist.add(new UserinfoData(resultSet.getString("EMAIL"),resultSet.getString("PASSWORD"),resultSet.getString("USERNAME")));
					
					
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		Col_email.setCellValueFactory(new PropertyValueFactory<>("Email"));
		Col_Password.setCellValueFactory(new PropertyValueFactory<>("password"));
		Col_username.setCellValueFactory(new PropertyValueFactory<>("Username"));
		
		Tableview1.setItems(Oblist);
	}

	}


