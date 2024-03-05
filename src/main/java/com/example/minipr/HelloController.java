package com.example.minipr;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController {

    private Stage stage;
    private Scene scene;
    private Parent root;



    @FXML
    public void toAroundMePage(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("currentLocation.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }


    @FXML
    public void toRegister(ActionEvent event) throws IOException {

        root = FXMLLoader.load(getClass().getResource("signup.fxml"));

        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void toLogin(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("login.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
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
    public void toMountainScreen(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("Mountains.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void toBeachScreen(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("beach.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }


    @FXML
    public void toTarkarliBeach(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("TarkarliBeach.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void toTarkarliaHotel(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("tarkarli.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void toVarkalaBeach(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("varkalaBeach.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void toVarkalaHotel(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("varkala.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void toPalolem(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("palolemBeach.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void toPalolemHotel(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("palolem.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    public void toManali(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("Manali.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void toManaliHotel(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("manaliHotel.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void toOoty(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("Ooty.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void toOotyHotel(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("ootyHotel.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void toDarjeeling(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("Darjeeling.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void toDarjeelingHotel(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("darjeelingHotel.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void toFortPage(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("fort.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void toChittorgarh(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("ChittorFort.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void toChittorgarhHotel(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("chittorgarh.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void toAgraFort(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("AgraFort.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void toAgraHotel(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("agra.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void toRaigadFort(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("RaigadFort.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void toRaigadHotel(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("raigad.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void toMonumentPage(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("monumentPage.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

//    MUSEUM
    @FXML
    public void toMuseumPage(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("MueseumPage.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void toIndianMuseum(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("Indian Museum.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void toIndianMuseumHotel(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("indianmuseum.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void toNationalMeseum(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("NationalMuseum.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void toNationalMeseumHotel(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("nationalmusuem.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void toCSM(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("ChatrapatiShivajiMaharaj.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void toCSMHotel(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("chhatrapatimuseum.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }


    @FXML
    public void toAjantaEllora(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("AjantaAndElloraMonument.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void toAjantaElloraHotel(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("ajantaandellora.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void toHawaMahal(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("hawaMahalPage.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void toHawaMahalHotel(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("hawamahal.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void toTajMahal(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("tajMahalPage.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void toTajMahalH(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("tajmahal.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void toNationalParkPage(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("nationalPark.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void toRanthamborePage(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("ranthamborePage.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void toRanthamboreHotel(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("ranthamboreHotel.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }


    @FXML
    public void toCorbettPage(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("corbettPage.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void toCorbettHotel(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("corbett.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }


    @FXML
    public void toKazirangaPage(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("kazirangaPage.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void toKazirangaHotel(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("kaziranga.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

}