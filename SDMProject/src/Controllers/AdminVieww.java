package Controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class AdminVieww {
	
	 @FXML
	    private Button AdminlogOut;
	
	@FXML
    private Button UserInfo;

    @FXML
    private Button TripHistroy;

    @FXML
    void ClickTripHistroy(MouseEvent event) {
    	
    	
    	try {
		    FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/FXML/TripHistroy.fxml"));
		            Parent root = (Parent) fxmlLoader.load();
		            Stage stage = new Stage();
		            stage.setScene(new Scene(root));  
		            stage.show();
		           
		    } catch(Exception e) {
		       e.printStackTrace();
		      }
		
		

    

    }

    @FXML
    void ClickUserinfo(MouseEvent event) {
    	
    	try {
		    FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/FXML/UserInfo.fxml"));
		            Parent root = (Parent) fxmlLoader.load();
		            Stage stage = new Stage();
		            stage.setScene(new Scene(root));  
		            stage.show();
		           
		    } catch(Exception e) {
		       e.printStackTrace();
		      }
		
		

    

    }
    
    @FXML
    void Logout(MouseEvent event) {
    	
    	Stage stage = (Stage) AdminlogOut.getScene().getWindow();
        // do what you have to do
        stage.close();

    }



}
