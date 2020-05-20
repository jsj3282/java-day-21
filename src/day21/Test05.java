package day21;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Test05 extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		HBox hbox = new HBox(10);
		hbox.setPadding(new Insets(10));
		Label lbl = new Label("lbl test");
		
		lbl.setText("setText test");
		lbl.setPrefSize(200, 30);
		lbl.setAlignment(Pos.CENTER_RIGHT);
		lbl.setStyle("-fx-background-color:yellow;");
		
		hbox.setStyle("-fx-background-color:green;");
		hbox.getChildren().addAll(lbl);
		hbox.setPrefSize(300, 200);
		
		primaryStage.setTitle("Input Test");
		primaryStage.setScene(new Scene(hbox));
		primaryStage.show();
		
	}
	public static void main(String[] args) {
		
		launch(args);

	}


}
