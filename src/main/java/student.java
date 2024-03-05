import javafx.application.Application;
import javafx.event.*;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class student extends Application {

    public void start(Stage primaryStage) throws Exception {
        VBox vb = new VBox();
        vb.setSpacing(10);
        vb.setAlignment(Pos.CENTER);

        Label l1 = new Label("Your Username");
        TextField tx1 = new TextField();
        tx1.setMaxWidth(160);

        Label l2 = new Label("Your Password");
        PasswordField tx2 = new PasswordField();
        tx2.setMaxWidth(160);

        Button button = new Button("Login");
        TextField tx3 = new TextField();
        tx3.setMaxWidth(160);

        vb.getChildren().addAll(l1, tx1, l2, tx2, button, tx3);
        button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent arg0) {
                String userName = tx1.getText();
                String password = tx2.getText();
                if (userName.equals("TSEC") && password.equals("bandra")) {
                    tx3.setText("Login Successful");
                } else {
                    tx3.setText("Invalid User");
                }
            }
        });
        Scene scene = new Scene(vb, 600, 400);
        primaryStage.setTitle("First JavaFX Application");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}