package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			Text testo = new Text();
			testo.setText("Siamo la classe più bella del mondo!");
			testo.setFont(Font.font("Verdana"));
			testo.setFill(Color.DARKBLUE); 
			testo.setX(50); // Posizione X
	        testo.setY(100); // Posizione Y
	        
	        Line linea = new Line();
	        linea.setStartX(70);
	        linea.setStartY(70);
	        linea.setEndX(140);
	        linea.setEndY(140);
	        linea.setStroke(Color.DARKORANGE);
	        linea.setStrokeWidth(3);
	        
	        Rectangle rectangle = new Rectangle();
	        rectangle.setX(150);           // Posizione X del rettangolo
	        rectangle.setY(250);            // Posizione Y del rettangolo
	        rectangle.setWidth(200);       // Larghezza del rettangolo
	        rectangle.setHeight(100);      // Altezza del rettangolo
	        rectangle.setFill(Color.CORNFLOWERBLUE);  // Colore di riempimento
	        rectangle.setStroke(Color.DARKBLUE);      // Colore del bordo
	        rectangle.setStrokeWidth(3);  // Spessore del bordo

	        Button btn = new Button();
	        btn.setText("Cliccami");
	        
	        btn.setOnAction(e -> System.out.println("Andiamo in PAUSA"));
	        
	        
			Group gruppo = new Group(testo, linea, rectangle, btn);
			//gruppo.getChildren().add(testo);
			
			Pane pannello = new Pane(gruppo);

			
			Scene scene = new Scene(pannello,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			
			
			
			
			
			
			primaryStage.setTitle("ITS SoftDev 2025 il Top!!!!");
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
