package Controllers;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

import Utils.ConnectionUtil;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class AdminSignin implements Initializable  {
	
	@FXML
    private TextField Usernametxt;

    @FXML
    private Button signbttn;

    @FXML
    private Button signupbttn;

    @FXML
    private PasswordField Passwordtxt;
    
    
    @FXML
    private Label LabelError;


    @FXML
    void signinn(MouseEvent event) {
    	if (event.getSource() == signbttn) {
            //login here
            if (Login().equals("Success")) {
                try {

                    //add you loading or delays - ;-)
                    Node node = (Node) event.getSource();
                    Stage stage = (Stage) node.getScene().getWindow();
                    //stage.setMaximized(true);
                    
                    Scene scene = new Scene(FXMLLoader.load(getClass().getResource("/FXML/Adminview1.fxml")));
                    stage.setScene(scene);
                    stage.show();

                } catch (IOException ex) {
                    System.err.println(ex.getMessage());
                }

            }
    	}
    	
    }
    
    Connection con = null;
    PreparedStatement preparedStatement = null;
    ResultSet resultSet = null;
    
    public AdminSignin() {
        con = ConnectionUtil.conDB();
    }

    @FXML
    void signupbtnn(MouseEvent event) {
    	
    	
    	
    	 
    }
    
    
    private String Login() {
    	String status = "Success";
        String email = Usernametxt.getText();
        String password = Passwordtxt.getText();
        if(email.isEmpty() || password.isEmpty()) {
        	setLabelError(Color.TOMATO, "Empty credentials");
            status = "Error";
        } else {
            //query
            String sql = "SELECT * FROM adminLogin Where Email = ? and password = ?";
            try {
                preparedStatement = con.prepareStatement(sql);
                preparedStatement.setString(1, email);
                preparedStatement.setString(2, password);
                resultSet = preparedStatement.executeQuery();
                if (!resultSet.next()) {
                	setLabelError(Color.TOMATO, "Enter Correct Email/Password");
                    status = "Error";
                } else {
                	setLabelError(Color.GREEN, "Login Successful..Redirecting..");
                }
            } catch (SQLException ex) {
                System.err.println(ex.getMessage());
                status = "Exception";
            }
        }
        
        return status;
    }
    	
    	
   
    
    
    private void setLabelError(Color color, String text) {
    	 LabelError.setTextFill(color);
    	 LabelError.setText(text);
         System.out.println(text);
    }

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
		 if (con == null) {
			 LabelError.setTextFill(Color.TOMATO);
			 LabelError.setText("Server Error : Check");
	        } else {
	        	LabelError.setTextFill(Color.GREEN);
	        	LabelError.setText("Server is up : Good to go");
	        }
		
	}

}
































