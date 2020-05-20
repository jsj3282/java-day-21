package day21;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Test09 extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		AnchorPane anchorPane = new AnchorPane();
		Label lbl = new Label("Values");
		lbl.setFont(new Font("Cambria", 32));
		lbl.setRotate(48);
		lbl.setTranslateX(100);
		lbl.setTranslateY(70);
		
		/*lbl.setOnMouseEntered(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent event) {
				lbl.setScaleX(1.5);
				lbl.setScaleY(1.5);			
			}			
		});*/
		
		EventHandler<MouseEvent> ttt = new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent event) {
				lbl.setScaleX(1.5);
				lbl.setScaleY(1.5);
				
			}
			
		};
		lbl.setOnMouseEntered(ttt);
		
		
		EventHandler<MouseEvent> aaa = e -> {
			lbl.setScaleX(1.5);
			lbl.setScaleY(1.5);
		};
		lbl.setOnMouseEntered(aaa);
		
		
		lbl.setOnMouseEntered(a->{lbl.setScaleX(1.5); lbl.setScaleY(1.5);});		//¶÷´Ù½Ä
		
		
		
		lbl.setOnMouseExited(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent event) {
				lbl.setScaleX(1);
				lbl.setScaleY(1);
			}		
		});
		
		anchorPane.getChildren().add(lbl);
		anchorPane.setPrefSize(300, 200);
		
		primaryStage.setTitle("Input Test");
		primaryStage.setScene(new Scene(anchorPane));
		primaryStage.show();
		
	}
	public static void main(String[] args) {
		launch(args);

	}


}
