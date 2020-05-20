package day21;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Test07 extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		HBox hbox = new HBox(10);
		hbox.setPadding(new Insets(10));
		Label lbl = new Label("A label that needs to be wrapped");
		
		lbl.setWrapText(true);
		
		hbox.getChildren().addAll(lbl);
		hbox.setPrefSize(100, 100);
		
		primaryStage.setTitle("Input Test");
		primaryStage.setScene(new Scene(hbox));
		primaryStage.show();
		
	}
	public static void main(String[] args) {
		
		launch(args);

	}

}
