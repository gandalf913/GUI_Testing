package edu.bsu.cs222;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    Stage window;

    @Override
    public void start(Stage primaryStage) throws Exception{
        window = primaryStage;
        window.setTitle("Restaurant Filter");

        Button btn = new Button();
        btn.setText("Apply Filters");

        CheckBox driveThrough = new CheckBox("Drive Through");
        CheckBox takeout = new CheckBox("Takeout");
        CheckBox dineIn = new CheckBox("Dine In");

        btn.setOnAction(e -> handleOptions(driveThrough, takeout, dineIn));

        VBox layout = new VBox(10);
        layout.setPadding(new Insets(20,20,20,20));
        layout.getChildren().addAll(driveThrough, takeout, dineIn, btn);

        Scene scene = new Scene(layout, 300, 250);
        window.setScene(scene);
        window.show();;
    }

    private void handleOptions(CheckBox box1, CheckBox box2, CheckBox box3){
        String message = "Chosen filters:\n";

        if(box1.isSelected()){
            message += "Drive Through (Example: Arby's)\n";
        }

        if(box2.isSelected()){
            message += "Takeout (Example: Yats)\n";
        }
        if(box3.isSelected()){
            message += "Dine In (Example: Applebee's)\n";
        }
        System.out.println(message);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
