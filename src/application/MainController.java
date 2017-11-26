package application;


import javafx.scene.control.Button;
import javafx.scene.image.Image;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.ImageCursor;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.stage.Window;


/**
 * The Class MainController.
 */
public class MainController {
	
	
    /** The btn cerrar. */
    @FXML
    private Button btnCerrar;
	

    /**
     * Cerrar.
     *
     * @param event the event
     */
    @FXML
   void cerrar(MouseEvent event) {
   	System.exit(0);
   }
   
   /**
    * Cerrar segunda ventana.
    *
    * @param event the event
    */
   @FXML
   void cerrarSegundaVentana(MouseEvent event ) {
	   
	   Stage thisStage = (Stage)  btnCerrar.getScene().getWindow();
	   thisStage.close();

	   }
     

   /**
    * Mostrar ventana secundaria.
    */
   public void mostrarVentanaSecundaria() {
       try {
           FXMLLoader loader = new FXMLLoader(Main.class.getResource("../views/Superheader.fxml"));
           AnchorPane ventanaDos = (AnchorPane) loader.load();
           Stage ventana = new Stage();
           //ventana.setTitle("Venta Dos");
           Window stagePrincipal = null;
		   ventana.initOwner(stagePrincipal);
           Scene scene = new Scene(ventanaDos);
           Image image = new Image("images/calabaza.png");  //pass in the image path
           scene.setCursor(new ImageCursor(image));
           ventana.initStyle(StageStyle.UNDECORATED);
           ventana.setScene(scene);
           ventana.show();

       } catch (Exception e) {
           //tratar la excepción
       }
   }

 
   
}
