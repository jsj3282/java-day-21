package day21;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Test01 extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		HBox hbox = new HBox(10);
		hbox.setPadding(new Insets(10));
		
		TextField tf = new TextField("aaaa");
		tf.setText("test");
		
		PasswordField fp = new PasswordField();
		fp.setText("12345");
		fp.setPrefSize(200, 500);
		
		hbox.getChildren().addAll(tf, fp);
		hbox.setPrefSize(300, 200);
		
		primaryStage.setTitle("Input Test");
		primaryStage.setScene(new Scene(hbox));
		primaryStage.show();
		
	}
	public static void main(String[] args) {
		
		launch(args);

	}


}
