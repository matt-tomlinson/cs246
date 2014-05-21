import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.layout.FlowPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

//Note: The FlowPane isn't a great layout manager to use for 
//a grid style layout. This example is really shows how the controls flow 
//one after the other and can be manipulated into a grid. It offsets the 
//JavaFX example called TilePane Example Program.
public class FlowPaneExample extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        VBox mockCalendar = new VBox();
        FlowPane header = new FlowPane();
        
        //pad the header text objects on the top and bottom
        header.setPadding(new Insets(5, 0, 5, 0));
        
        //Set the vetical and horizontal gap between text objects
        header.setVgap(3);
        header.setHgap(3);
        
        
        //Creates a series of Text objects to file the top FlowPane
        Text monDay = new Text("Mon");
        monDay.setFont(Font.font("Arial", FontWeight.BOLD, 20));
        
        Text tueDay = new Text("Tue");
        tueDay.setFont(Font.font("Arial", FontWeight.BOLD, 20));
        
        Text wedDay = new Text("Wed");
        wedDay.setFont(Font.font("Arial", FontWeight.BOLD, 20));
        
        Text thuDay = new Text("Thu");
        thuDay.setFont(Font.font("Arial", FontWeight.BOLD, 20));
        
        Text friDay = new Text("Fri");
        friDay.setFont(Font.font("Arial", FontWeight.BOLD, 20));
        
        Text satDay = new Text("Sat");
        satDay.setFont(Font.font("Arial", FontWeight.BOLD, 20));
        
        Text sunDay = new Text("Sun");
        sunDay.setFont(Font.font("Arial", FontWeight.BOLD, 20));
        
        //Add the Text objects as children to the FlowPane
        header.getChildren().add(monDay);
        header.getChildren().add(tueDay);
        header.getChildren().add(wedDay);
        header.getChildren().add(thuDay);
        header.getChildren().add(friDay);
        header.getChildren().add(satDay);
        header.getChildren().add(sunDay);
        
        FlowPane content = new FlowPane();
        
        //pad the text objects to match the header FlowPane 
        content.setPadding(new Insets(5, 5, 5, 5));
        
        //Set the vetical and horizontal gap between text objects
        content.setVgap(10);
        content.setHgap(25);
        
        //Set the content of the second FlowPane using text objects created from
        //the string array
        for (int i = 0; i<33; i++)
        {
            String[] days = {"    " , "    " , "  1" , "  2" , "  3" , 
                     "  4" , "  5" , "  6" ,
                     "  7" , "  8" , "  9" , "10" , "11" , "12" ,
                     "13" , "14" , "15" , "16" , "17" , "18" ,
                     "19" , "20" , "21", "22" , "23" , "24" ,
                     "25" , "26" , "27" , "28" , "29" , "30" , "31"};
            content.getChildren().add(new Text(days[i]));
           
        }
        
        //Add the two FlowPane objects to the VBox
        mockCalendar.getChildren().add(header);
        mockCalendar.getChildren().add(content);
        
        //Use the Vbox as the root node of the Scene
        Scene scene = new Scene(mockCalendar, 280, 300);
        
        primaryStage.setTitle("FlowPane Example Program");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * The main() method is ignored in correctly deployed JavaFX application.
     * main() serves only as fallback in case the application can not be
     * launched through deployment artifacts, e.g., in IDEs with limited FX
     * support. NetBeans ignores main().
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
}