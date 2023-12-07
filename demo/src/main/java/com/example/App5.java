package com.example;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class App5 extends Application{

    Stage window;

    public static void main(String[] args){
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        window.setTitle("Title of window");

        HBox topMenu = new HBox();
        Button buttonA = new Button("First file button");
        Button buttonB = new Button("First edit button");
        Button buttonC = new Button("First view button");

        topMenu.getChildren().addAll(buttonA, buttonB, buttonC);

        VBox leftMenu = new VBox();
        Button button1 = new Button("Second file button");
        Button button2 = new Button("Second edit button");
        Button button3 = new Button("Second view button");

        leftMenu.getChildren().addAll(button1, button2, button3);

        BorderPane borderPane = new BorderPane();
        borderPane.setTop(topMenu);
        borderPane.setLeft(leftMenu);

        StackPane layout = new StackPane();
        Scene scene = new Scene(borderPane, 400, 250);
        window.setScene(scene);
        window.show();
    }
    
}
