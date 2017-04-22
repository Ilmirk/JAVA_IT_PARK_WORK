package ru.itpark;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import jdk.nashorn.api.scripting.ClassFilter;

import java.util.Collection;

/**
 * Created by Student18 on 19.04.2017.
 */
    public class App extends Application {
    public static void main(String[] args) {
        Application.launch(args);
    }


    public void start(Stage stage) throws  Exception {
            /*Text text = new Text(10, 40, "Hello World!");
            text.setFont(new Font(40));*/
            /*Button button = new Button("Click me");
            Scene scene = new Scene(new Group(button));*/
       /* CheckBox checBox = new CheckBox("CH");
        Scene scene = new Scene(new Group(checBox));*/

        ClassFilter classfilter = new ClassFilter();
        Scene scene = new Scene(new Group((Collection<Node>) classfilter));

            stage.setTitle("Welcome to JavaFX!");
            stage.setScene(scene);
            stage.sizeToScene();
            stage.show();
    }
}
