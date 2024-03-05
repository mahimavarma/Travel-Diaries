package com.example.minipr;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.net.URL;
import java.sql.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class LoginController{

    Stage stage;
    Parent root;
    Scene  scene;

    @FXML
    TextField login_email_tf;
    @FXML
    TextField login_password_tf;

    @FXML
    Label login_error;

    @FXML
    private Label city;

    @FXML
    public void toRegister(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("signup.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void toPreferenceScreen(ActionEvent event) throws IOException, SQLException {

        String url = "jdbc:mysql://localhost:3306/miniPr";
        String user = "root";
        String password = "9769";
        Connection con = DriverManager.getConnection(url,user,password);
        String query = "Select * from User where email = '"+ login_email_tf.getText()+"'";


        PreparedStatement st1 = con.prepareStatement(query);

        try {
            ResultSet results = st1.executeQuery();
            results.next();

            if (results.getString(2).equals(login_password_tf.getText())) {
                root = FXMLLoader.load(getClass().getResource("preferencePage.fxml"));
                stage = (Stage)((Node)event.getSource()).getScene().getWindow();
                scene = new Scene(root);
                stage.setScene(scene);
                stage.show();
            }
            else
                login_error.setText("Incorrect Password");
//                System.out.println("Password Incorrect");
        }
        catch (SQLException | IOException sqe) {
            login_error.setText("Email Not Found!");
//            System.out.println("Email Not Found");
        }
        finally {
            con.close();
        }







//        root = FXMLLoader.load(getClass().getResource("preferencePage.fxml"));
//        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
//        scene = new Scene(root);
//        stage.setScene(scene);
//        stage.show();
    }



}
