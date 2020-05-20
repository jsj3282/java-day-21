package day21;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Test11 extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		HBox hbox = new HBox(10);
		hbox.setPadding(new Insets(10));
		
		Pane pane1 = new Pane();
		Label lbl1 = new Label("Search", new ImageView("/img/search.png"));
		lbl1.setTextFill(Color.web("#0054FF"));
		lbl1.setOnMouseEntered(a->{lbl1.setScaleX(1.5); lbl1.setScaleY(1.5);});
		lbl1.setOnMouseExited(b->{lbl1.setScaleX(1); lbl1.setScaleY(1);}); 
		pane1.getChildren().addAll(lbl1);
		
		Pane pane2 = new Pane();
		Label lbl2 = new Label("Values");
		lbl2.setFont(new Font("Cambria", 32));
		lbl2.setRotate(270);
		//lbl2.setTranslateX(20);
		lbl2.setTranslateY(20);
		pane2.getChildren().addAll(lbl2);
		
		Pane pane3 = new Pane();
		Label lbl3 = new Label("A label that needs to be wrapped");
		lbl3.setPrefSize(60, 80);
		lbl3.setWrapText(true);
		lbl3.setFont(new Font("Cambira", 10));
		pane3.getChildren().addAll(lbl3);
		
		lbl3.setFont(new Font("Cambira", 10));
		
		hbox.getChildren().addAll(pane1, pane2, pane3);
		
		hbox.setPrefSize(300, 100);

		primaryStage.setTitle("quiz");
		primaryStage.setScene(new Scene(hbox));
		primaryStage.show();
	}
	public static void main(String[] args) {
		
		launch(args);

	}


}
