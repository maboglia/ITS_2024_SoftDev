package application;

	import javafx.application.Application;
	import javafx.scene.Scene;
	import javafx.scene.control.Button;
	import javafx.scene.layout.Pane;
	import javafx.scene.paint.Color;
	import javafx.scene.shape.Line;
	import javafx.stage.Stage;
	import javafx.animation.RotateTransition;
	import javafx.util.Duration;

	public class RotationLine extends Application {
	    @Override
	    public void start(Stage primaryStage) {
	        // Creazione della linea
	        Line line = new Line();
	        line.setStartX(150);
	        line.setStartY(50);
	        line.setEndX(150);
	        line.setEndY(250);
	        line.setStroke(Color.DARKBLUE);
	        line.setStrokeWidth(5);

	        // Creazione del pulsante
	        Button rotateButton = new Button("Ruota Linea");
	        rotateButton.setLayoutX(125);
	        rotateButton.setLayoutY(270);

	        // Aggiunta dell'azione al pulsante
	        rotateButton.setOnAction(e -> {
	            // Creazione di una transizione per la rotazione
	            RotateTransition rotate = new RotateTransition(Duration.seconds(0.5), line);
	            rotate.setByAngle(30);  // Ruota di 90 gradi
	            rotate.setCycleCount(1);  // Esegui una volta
	            rotate.play();  // Avvia l'animazione
	        });

	        // Creazione del layout
	        Pane root = new Pane();
	        root.getChildren().addAll(line, rotateButton);

	        // Creazione della scena
	        Scene scene = new Scene(root, 300, 350, Color.LIGHTGRAY);

	        // Configurazione della finestra
	        primaryStage.setTitle("Line Rotation Example");
	        primaryStage.setScene(scene);
	        primaryStage.show();
	    }

	    public static void main(String[] args) {
	        launch(args);
	    }
	}