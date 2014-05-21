import java.util.AbstractMap.SimpleEntry;
import javafx.scene.layout.GridPane;
import java.io.IOException;
import javafx.event.ActionEvent;
import java.util.Map.Entry;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.stage.FileChooser;
import java.io.File;
import java.awt.Desktop;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MenuExample extends Application {

	private final Desktop desktop = Desktop.getDesktop();

	@Override
    public void start(Stage stage) {

    	stage.setTitle("Menu Sample");
        Scene scene = new Scene(new VBox(), 400, 350);
         
        MenuBar menuBar = new MenuBar();
 
        // --- Menu File
        Menu menuFile = new Menu("File");
        MenuItem exit = new MenuItem("Exit");
        exit.setOnAction((ActionEvent t) -> {
    		System.exit(0);
		});

 		menuFile.getItems().addAll(exit);
 
        // --- Menu Edit
        Menu menuEdit = new Menu("Edit");
        MenuItem open = new MenuItem("Open File");
        final FileChooser fileChooser = new FileChooser();
        open.setOnAction((ActionEvent t) -> {
        	File file = fileChooser.showOpenDialog(stage);
            if (file != null) {
               openFile(file);
            }
		});

 		menuEdit.getItems().addAll(open);
 
        // --- Menu View
        Menu menuView = new Menu("View");
 
        menuBar.getMenus().addAll(menuFile, menuEdit, menuView);
 
        ((VBox) scene.getRoot()).getChildren().addAll(menuBar);
 
        stage.setScene(scene);
        stage.show();
    }

    private void openFile(File file) {
        try {
            desktop.open(file);
        } catch (IOException ex) {
            Logger.getLogger(
                MenuExample.class.getName()).log(
                    Level.SEVERE, null, ex
                );
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}