package Controllers;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import Utils.ConnectionUtil;

public class OrderRidePage implements Initializable {
	

    @FXML
    private TextField txtStartLocation;

    @FXML
    private Button btnGetestimate;
    
    @FXML
    void GetEstimate(MouseEvent event) {
    	try {
		    FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/FXML/GetEstimate.fxml"));
		            Parent root = (Parent) fxmlLoader.load();
		            Stage stage = new Stage();
		            stage.setScene(new Scene(root));  
		            stage.show();
		           
		    } catch(Exception e) {
		       e.printStackTrace();
		      }


    }

    @FXML
    void HomePage(MouseEvent event) {
    	try {
		    FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/FXML/Login.fxml"));
		            Parent root = (Parent) fxmlLoader.load();
		            Stage stage = new Stage();
		            stage.setScene(new Scene(root));  
		            stage.show();
		           
		    } catch(Exception e) {
		       e.printStackTrace();
		      }

    }

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}


}
