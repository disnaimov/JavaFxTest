package com.example;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class App2 extends Application{
    Stage window;
    Scene scene1, scene2;

    public static void main(String[] args){
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;

        Button button1 = new Button("Go to scene 2");
        button1.setOnAction(e -> window.setScene(scene2));
        StackPane layout1 = new StackPane();
        layout1.getChildren().addAll(button1);

        scene1 = new Scene(layout1, 600, 600);

        Button button2 = new Button("Go to scene 1");
        button2.setOnAction(e -> window.setScene(scene1));
        StackPane layout2 = new StackPane();
        layout2.getChildren().addAll(button2);

        scene2 = new Scene(layout2, 600, 350);



        window.setTitle("Title here");
        window.setScene(scene1);
        window.show();
    }
    


}
