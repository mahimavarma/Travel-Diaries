package com.example.minipr;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import java.sql.*;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;

public class registerController {

    @FXML
    TextField signup_email_tf;
    @FXML
    TextField signup_password_tf;
    @FXML
    TextField signup_confirm_pass;

    @FXML
    Label register_label;
    Stage stage;
    Parent root;
    Scene scene;

    @FXML
    public void toLoginHyperLink(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("login.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }


    @FXML
    public void toLogin(ActionEvent event) throws IOException, SQLException {


        if (!signup_confirm_pass.getText().equals(signup_password_tf.getText())) {
            register_label.setText("ERROR: Password mismatch");
            System.out.println("Passwords Don't Match");
            return;
        }

        if (signup_email_tf.getText().isEmpty()) {
            register_label.setText("ERROR: Enter Valid Email");
            System.out.println("Email Not Entered.");
            return;
        }

        if (signup_password_tf.getText().isEmpty()) {
            register_label.setText("ERROR: Please set a secure password");
            System.out.println("Password Not Entered.");
            return;
        }

        if (signup_confirm_pass.getText().isEmpty()) {
            register_label.setText("ERROR: Confirm Password");
            System.out.println("Repeated Password Not Entered.");
            return;
        }


        String url = "jdbc:mysql://localhost:3306/miniPr";
        String user = "root";
        String password = "9769";
        Connection con = DriverManager.getConnection(url, user, password);

        String query = "INSERT INTO User VALUES (?, ?)";
        PreparedStatement st1 = con.prepareStatement(query);
        st1.setString(1, signup_email_tf.getText());
        st1.setString(2, signup_password_tf.getText());

        try {
            int rowsAffected = st1.executeUpdate();

            if (rowsAffected > 0) {
                register_label.setText("Registered Successfully!");
                root = FXMLLoader.load(getClass().getResource("login.fxml"));
                stage = (Stage)((Node)event.getSource()).getScene().getWindow();
                scene = new Scene(root);
                stage.setScene(scene);
                stage.show();
            } else {
                register_label.setText("ERROR: Could not Register, Please Try Again");
                System.out.println("ERROR: Could not Register, Please Try Again");
            }
        } catch (SQLException | IOException exc) {
            register_label.setText("ERROR: Could not Register, Please Try Again");
            System.out.println("Insertion Went Wrong");
            exc.printStackTrace();
        } finally {
            st1.close();
            con.close();
        }

    }

}
