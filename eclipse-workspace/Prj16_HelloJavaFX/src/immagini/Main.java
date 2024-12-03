package immagini;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application {

	@Override
	public void start(Stage stage) throws Exception {

		VBox box = new VBox();
		
		Lampadina lamp = new Lampadina(5);
		
		ImageView iv = new ImageView();
		Image lampon = new Image("file:img/lampon.png");
		Image lampoff = new Image("file:img/lampoff.png");
		
		iv.setImage(lampoff);
        iv.setFitWidth(140);
        iv.setFitHeight(200);
		
        box.getChildren().add(iv);
        
        Button btn = new Button("Accendi");
        
        Text testo = new Text(lamp.stato());       
        
        btn.setOnAction(e -> {
        	if (lamp.isAccesa()){
                btn.setText("Accendi");
                iv.setImage(lampoff);
        	} else {
                btn.setText("Spegni");
                iv.setImage(lampon);                
            }
        	lamp.click();
        	testo.setText(lamp.stato());
        });
        
        box.getChildren().add(btn);
        box.getChildren().add(testo);

        
        
		Scene scena = new Scene(box, 500, 500);
		
		stage.setScene(scena);
		stage.setTitle("Lampadina");
		stage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

}
