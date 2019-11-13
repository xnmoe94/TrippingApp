package Controllers;

import java.net.URL;
import java.util.ResourceBundle;

import com.mysql.jdbc.Statement;

import java.io.IOException;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javafx.event.ActionEvent;
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
import Utils.ConnectionUtil;





public class SignUpController implements Initializable {
	
	
	@FXML
    private TextField TxtFieldEmail;

    @FXML
    private TextField TxtFieldUsername;

    @FXML
    private PasswordField PasswordField;
    
    @FXML
    private Label PopMessage;


    @FXML
    private Button ButtonSignup;
    
    
    Connection con = null;
    PreparedStatement preparedStatement = null;
    ResultSet resultSet = null;
    
    public SignUpController() {
        con = ConnectionUtil.conDB();
    }
    
   
    @FXML
    void SignUpclicked(MouseEvent event) throws SQLException {
    	
    	PopMessage.setText("Successfully Registered.");
   
    	
    	 try {
             String st = "INSERT INTO ADMINS ( EMAIL, PASSWORD, USERNAME) VALUES (?,?,?)";
             preparedStatement = (PreparedStatement) con.prepareStatement(st);
             preparedStatement.setString(1, TxtFieldUsername.getText());
             preparedStatement.setString(2, TxtFieldEmail.getText());
             preparedStatement.setString(3, PasswordField.getText());
             

             preparedStatement.executeUpdate();
             
             
             
                   
            

           
           

         } catch (SQLException ex) {
             System.out.println(ex.getMessage());
            
            
         }
             }
    
    	
    	
    	
    	
    
    	
  

	

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}
	
}
	

