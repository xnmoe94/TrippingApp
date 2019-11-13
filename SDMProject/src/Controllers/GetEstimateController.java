package Controllers;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class GetEstimateController implements Initializable {
	@FXML
    private Button UberX;

    @FXML
    private Button Lyft;

    @FXML
    private Button Taxi;

    @FXML
    void ClickUberX(MouseEvent event) {
    	
    	try {
            Desktop.getDesktop().browse(new URI("https://www.uber.com/global/en/sign-in/"));
        } catch (IOException e1) {
            e1.printStackTrace();
        } catch (URISyntaxException e1) {
            e1.printStackTrace();
        }

    }

    

    @FXML
    void Lyftbtn(MouseEvent event) {
    	
    	try {
            Desktop.getDesktop().browse(new URI("https://account.lyft.com/auth?next=https%3A%2F%2Fwww.lyft.com%2Flogin%2Fjump"));
        } catch (IOException e1) {
            e1.printStackTrace();
        } catch (URISyntaxException e1) {
            e1.printStackTrace();
        }
    	
    	

    }

    @FXML
    void Taxibtn(MouseEvent event) {
    	
//    	try {
//            Desktop.getDesktop().browse(new URI("https://blueandwhitetaxi.com/cart-service/#/admin/login"));
//        } catch (IOException e1) {
//            e1.printStackTrace();
//        } catch (URISyntaxException e1) {
//            e1.printStackTrace();
//        }
    	
    	try {
		    FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/FXML/LocalTaxiPage.fxml"));
		            Parent root = (Parent) fxmlLoader.load();
		            Stage stage = new Stage();
		            stage.setScene(new Scene(root));  
		            stage.show();
		           
		    } catch(Exception e) {
		       e.printStackTrace();
		      }

    	
    //	https://blueandwhitetaxi.com/cart-service/#/admin/login
    
    }

	
	

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}

}
