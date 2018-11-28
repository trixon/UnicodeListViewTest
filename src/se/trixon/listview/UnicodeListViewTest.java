/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.trixon.listview;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Patrik Karlström
 */
public class UnicodeListViewTest extends Application {

    @Override
    public void start(Stage stage) {

        StackPane root = new StackPane();
        ListView<String> listView = new ListView<>();
        listView.getItems().addAll("a", "b", "c");
        listView.getItems().add("🖉"); //Remove this row to make it work.
        listView.getItems().add("d");
        root.getChildren().add(listView);

        Scene scene = new Scene(root, 300, 250);

        stage.setTitle("Prism's Glyphcache");
        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
}
