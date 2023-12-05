package com.example;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class App3 extends Application{

    Stage window;

    public static void main(String[] args){
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        Button button = new Button("Click me");
        //button.setOnAction(e -> AllertBox.display("Title of Window", "Allert box!"));
        button.setOnAction(e ->{
            boolean result = ConfirmBox.display("Title fo window", "Are you sure to close the window?");
            System.out.println(result);
        });


        StackPane layout = new StackPane();
        layout.getChildren().addAll(button);
        Scene scene = new Scene(layout, 300, 300);

       window.setScene(scene);
       window.show();
    }
    
}
