package com.TongStarGe.ToDo.form;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseDragEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class mainForm extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        BorderPane borderPane = new BorderPane();
        HBox vBox = new HBox();
        HBox hBox = new HBox();
        vBox.setAlignment(Pos.CENTER);
        hBox.setAlignment(Pos.CENTER);
        hBox.setSpacing(20);
        hBox.setMinHeight(50);
        vBox.setMinHeight(50);
        vBox.setStyle("-fx-background-color: gold");
        hBox.setStyle("-fx-background-color: aqua");
        Button button1 = new Button("awa");
        button1.setStyle("-fx-cursor: pointer");
        Button button2 = new Button("awa?");
        Label label = new Label(" + ");
        label.setStyle("-fx-font-weight: bold; -fx-font-size: 20px; -fx-border-width: 3px; -fx-border-radius: 5px; -fx-border-color: black; -fx-background-color: blue; -fx-background-radius: 5px");
        label.setOnMouseClicked(event -> {
            System.out.println("awa");
            label.setStyle("-fx-font-weight: bold; -fx-font-size: 20px; -fx-border-width: 3px; -fx-border-radius: 5px; -fx-border-color: black; -fx-background-color: aqua; -fx-background-radius: 5px");
            new Thread(() -> {
                try {
                    wait(100);
                    label.setStyle("-fx-font-weight: bold; -fx-font-size: 20px; -fx-border-width: 3px; -fx-border-radius: 5px; -fx-border-color: black; -fx-background-color: black; -fx-background-radius: 5px");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        });
        label.setOnMouseDragExited(event -> {
            label.setStyle("-fx-font-weight: bold; -fx-font-size: 20px; -fx-border-width: 3px; -fx-border-radius: 5px; -fx-border-color: black; -fx-background-color: aqua; -fx-background-radius: 5px");
        });
        vBox.getChildren().add(0 , new Label("awa"));
        vBox.getChildren().add(1 , button2);
        hBox.getChildren().add(0 , button1);
        hBox.getChildren().add(1 , label);
        hBox.getChildren().add(2 , button2);
        borderPane.setTop(vBox);
        borderPane.setBottom(hBox);
        borderPane.setCenter(new Label("awa"));
        //borderPane.getChildren().add(1 , hBox);
        Scene scene = new Scene(borderPane , 200 , 300);
        primaryStage.setScene(scene);
        primaryStage.setTitle("awa");
        primaryStage.show();
    }
}
