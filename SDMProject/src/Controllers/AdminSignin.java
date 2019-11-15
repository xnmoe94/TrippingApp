package Controllers;

import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

import Utils.ConnectionUtil;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

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
    void signinn(MouseEvent event) {
    	
    	

    }
    
    Connection con = null;
    PreparedStatement preparedStatement = null;
    ResultSet resultSet = null;
    
    public AdminSignin() {
        con = ConnectionUtil.conDB();
    }

    @FXML
    void signupbtnn(MouseEvent event) {
    	
//    	 try {
//             String st = "SELECT * FROM ADMIN Where EMAIL = ? and PASSWORD = ?";
//             preparedStatement = (PreparedStatement) con.prepareStatement(st);
//             preparedStatement.setString(1, Usernametxt.getText());
//             preparedStatement.setString(2, Passwordtxt.getText());
//            
//
//             preparedStatement.executeUpdate();
//             
// 
//
//         } catch (SQLException ex) {
//             System.out.println(ex.getMessage());
//            
//            
//         }

    }

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}

}
