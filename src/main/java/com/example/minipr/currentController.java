package com.example.minipr;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class currentController implements Initializable {

    private Stage stage;
    private Scene scene;
    private Parent root;

    @FXML
    Group mumbai1;
    @FXML
    Group mumbai2;
    @FXML
    Group mumbai3;
    @FXML
    Group Jaiselmer1;
    @FXML
    Group Jaiselmer2;
    @FXML
    Group Jaiselmer3;
    @FXML
    Group Kolkata1;
    @FXML
    Group Kolkata2;
    @FXML
    Group Kolkata3;
    @FXML
    Group Amritsar1;
    @FXML
    Group Amritsar2;
    @FXML
    Group Amritsar3;

    @FXML
    Button goButton;



    @FXML
    private ComboBox<String> listOfCity;


    @FXML
    public void setDestinationVisible(ActionEvent event){
        Group []destination= {mumbai1,mumbai2,mumbai3, Jaiselmer1,Jaiselmer2,Jaiselmer3,Kolkata1,Kolkata2,Kolkata3, Amritsar1,Amritsar2,Amritsar3};
        String city = listOfCity.getValue();
        switch (city){
            case "Mumbai":
                for(int i=0;i<12;i++){
                    if(i==0 || i==1 || i==2){
                        destination[i].setVisible(true);
                    }
                    else
                    destination[i].setVisible(false);
                }
                break;

            case "Jaisalmer":
                for(int i=0;i<12;i++){
                    if(i==3 || i==4 || i==5){
                        destination[i].setVisible(true);
                    }
                    else
                    destination[i].setVisible(false);
                }
                break;

            case "Kolkata":
                for(int i=0;i<12;i++){
                    if(i==6 || i==7 || i==8){
                        destination[i].setVisible(true);
                    }
                    else
                    destination[i].setVisible(false);
                }
                break;

            case "Amritsar":
                for(int i=0;i<12;i++){
                    if(i==9 || i==10 || i==11){
                        destination[i].setVisible(true);
                    }
                    else
                        destination[i].setVisible(false);
                }
                break;
        }
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Group []destination= {mumbai1,mumbai2,mumbai3, Jaiselmer1,Jaiselmer2,Jaiselmer3,Kolkata1,Kolkata2,Kolkata3, Amritsar1,Amritsar2,Amritsar3};
        List<String> locations = new ArrayList<>();
        locations.add("Mumbai");
        locations.add("Jaisalmer");
        locations.add("Kolkata");
        locations.add("Amritsar");
        listOfCity.getItems().addAll(locations);
        for(int i=0;i<12;i++){
            destination[i].setVisible(false);
        }
    }

    @FXML
    public void toPreferenceScreen(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("preferencePage.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }


    @FXML
    public void toGatewayOfIndia(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("Mumbai_GatewayOfIndia.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void toNehruPlanetarium(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("Nehru Planetarium.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void toHangingGarden(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("HangingGardens.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }


    @FXML
    public void toHowrahBridge(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("HowrahBridge.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void toSamSandDunes(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("samSandDunes.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void toJaiselmerFort(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("JaisalmarFort.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void toPatwaonKiHavelli(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("PatwaonKiHaveli.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void toVictoriaMemorial(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("VictoriaMemorial.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void toCurrentIndianMuseum(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("CurrentIndianMuseum.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void toWagahBorder(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("WagahBorder.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void toJallianwalaBagh(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("JallianwalaBagh.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void toGoldenTemple(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("TheGoldenTemple.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
