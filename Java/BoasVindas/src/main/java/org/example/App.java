package org.example;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage stage) {
        VBox vbox = new VBox(10.0);
        vbox.setPadding(new Insets(15));

        Label labelNome = new Label("Nome: ");
        TextField tfNome = new TextField();
        Label labelMensagem = new Label();
        Button botaoOk = new Button("OK");

        botaoOk.setOnAction( e ->{

            labelMensagem.setText(tfNome.getText());

        });

        vbox.getChildren().addAll(labelNome, tfNome, botaoOk, labelMensagem);

        Scene cena = new Scene(vbox, 320, 240);

        stage.setTitle(":: Boas vindas! ::");
        stage.setResizable(false);
        stage.setScene(cena);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}