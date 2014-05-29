import javafx.application.Application;
import javafx.scene.layout.GridPane;
import javafx.scene.control.*;
import javafx.geometry.*;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.layout.HBox;

public class boldness extends Application {
    
    @Override
    public void start(Stage primaryStage) {

    	GridPane grid = new GridPane();
    	grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

        Label text1 = new Label("Enter Runnable:");
        grid.add(text1, 0, 0);
    	
    	TextField userTextField = new TextField();
        grid.add(userTextField, 0, 1);

        Label text2 = new Label("Runnables");
        grid.add(text2, 0, 2);

        Label text3 = new Label("Running Threads");
        grid.add(text3, 2, 2);

        ListView<String> list1 = new ListView<>();
        grid.add(list1, 0, 3);

		ListView<String> list2 = new ListView<>();
        grid.add(list2, 2, 3);

        Button btn1 = new Button("Start");
        HBox hbBtn1 = new HBox(10);
        hbBtn1.setAlignment(Pos.CENTER);
        hbBtn1.getChildren().add(btn1);
        grid.add(hbBtn1, 0, 4);

        Button btn2 = new Button("Stop");
        HBox hbBtn2 = new HBox(10);
        hbBtn2.setAlignment(Pos.CENTER);
        hbBtn2.getChildren().add(btn2);
        grid.add(hbBtn2, 2, 4);

        Scene scene = new Scene(grid, 450, 350);

        primaryStage.setTitle("Glory");
        primaryStage.setScene(scene);
        scene.getStylesheets().add
            (boldness.class.getResource("boldness.css").toExternalForm());
        primaryStage.show();
    }

 	public static void main(String[] args) {
        launch(args);
    }
}