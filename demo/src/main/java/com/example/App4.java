package com.example;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class App4 extends Application{

    Stage window;
    Button button;

    public static void main(String[] args){
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        window.setTitle("I steel learning");
        button = new Button("Close program");

        window.setOnCloseRequest(e -> 
        {
            e.consume();
            closeProgram();
        }
        );

        button.setOnAction(e -> 
        {
            closeProgram();
        }
        
        );

        StackPane layout = new StackPane();
        layout.getChildren().add(button);
        Scene scene = new Scene(layout, 300, 250);
        window.setScene(scene);
        window.show();
    }

    private void closeProgram(){
        if (ConfirmBox.display("Title fo window", "Are you sure to close the window?")){
        System.out.println("File is saved");
        window.close();
        }
    }
    
}
