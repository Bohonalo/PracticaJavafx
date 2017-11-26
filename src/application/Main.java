package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.ImageCursor;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Font;
import javafx.fxml.FXMLLoader;


/**
 * The main clas
 * @author Juan
 * @version 1.0
 * @since 24-11-2017
 * @see MainController
 */
public class Main extends Application {
	/**
	 * @param primaryStage the primary stage
	 * @see Override start
	 */
	@Override
	public void start(Stage primaryStage) {
		
		try {
			AnchorPane root = (AnchorPane)FXMLLoader.load(getClass().getResource("../views/Main.fxml"));
			Scene scene = new Scene(root,640,480);
			Image image = new Image("images/calabaza.png");  //pass in the image path
			scene.setCursor(new ImageCursor(image));
			scene.getCursor();
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
//			scene.getStylesheets().add("http://fonts.googleapis.com/css?family=Shadows+Into+Light");
			scene.getStylesheets().add("https://fonts.googleapis.com/css?family=Dancing+Script");
			Font.loadFont(getClass().getResourceAsStream("../fonts/ArchitectsDaughter-Regular.ttf"), 20);
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * The main metehod
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		launch(args);
	}
}
