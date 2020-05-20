package day21;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Test02 extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		HBox hbox = new HBox(10);
		hbox.setPadding(new Insets(10));
		ComboBox<String> cb = new ComboBox<String>();
		cb.getItems().addAll("크라이밍", "서핑", "산악자전거");
		cb.setValue("서핑");
		
		hbox.getChildren().addAll(cb);
		hbox.setPrefSize(300, 200);
		
		primaryStage.setTitle("Input Test");
		primaryStage.setScene(new Scene(hbox));
		primaryStage.show();
	}
	public static void main(String[] args) {
		launch(args);

	}


}
