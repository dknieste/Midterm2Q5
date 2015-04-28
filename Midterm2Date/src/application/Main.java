package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;

public class Main extends Application {
	
	    /**
	     * @param args the command line arguments
	     */
	    public static void main(String[] args) { 
	        Application.launch(Main.class, (java.lang.String[]) null);
	    }

	    @Override
	    public void start(Stage primaryStage) {
	        try {
	            AnchorPane panel = FXMLLoader.load(Main.class.getResource("DateView.fxml"));
	            Scene scene = new Scene(panel);
	            primaryStage.setScene(scene);
	            primaryStage.setTitle("Date Picker");
	            primaryStage.show();
	        } catch (Exception ex) {
	        	ex.printStackTrace();
	    }
	}
}
