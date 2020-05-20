package day21;

import java.util.ArrayList;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Test04 extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		BorderPane borderPane = new BorderPane();
		
		HBox hboxTop = new HBox(20);			//�߰� ������ �е� 20
		hboxTop.setPadding(new Insets(10, 10, 10, 280));
		ArrayList<Label> lb = new ArrayList<>();
		lb.add(new Label("Ȩ"));
		lb.add(new Label("��ȸ"));
		lb.add(new Label("����"));
		lb.add(new Label("����"));
		lb.add(new Label("��ȭ"));
		hboxTop.getChildren().addAll(lb);
		
		GridPane grid = new GridPane();
		grid.setPadding(new Insets(20));
		TextField tf01 = new TextField();
		tf01.setPrefSize(100, 20);
		TextField tf02 = new TextField();
		tf02.setPrefSize(100, 20);
		Button bt03 = new Button("�α���");
		bt03.setPrefSize(60, 50);
		FlowPane flowBt03 = new FlowPane(bt03);
		flowBt03.setMaxSize(0, 0);
		flowBt03.setAlignment(Pos.CENTER);
		grid.getChildren().addAll(tf01, tf02);
		grid.setConstraints(tf01,  0,  0);		//���̵�
		grid.setConstraints(tf02,  0,  1);		//��й�ȣ
		grid.add(flowBt03, 1, 0, 1, 2);			//�α���
		
		VBox vboxLeft = new VBox(10);
		vboxLeft.setPadding(new Insets(10,10,10,10));
		ArrayList<Label> lb01 = new ArrayList<Label>();
		lb01.add(new Label("ī�װ�"));
		lb01.add(new Label("��Ʈ��/pc"));
		lb01.add(new Label("�ڵ�����ǰ"));
		lb01.add(new Label("�޴���"));
		lb01.add(new Label("ķ��/����"));
		vboxLeft.getChildren().addAll(lb01);
		
		VBox vboxCenter = new VBox(10);
		vboxCenter.setMaxSize(500, 220);
		ArrayList<FlowPane> flowList = new ArrayList<>();
		flowList.add(new FlowPane(new Label("ID"), new TextField()));
		flowList.add(new FlowPane(new Label("PW"), new TextField()));
		
		RadioButton rb1 = new RadioButton("��\t");
		RadioButton rb2 = new RadioButton("��");
		ToggleGroup tg = new ToggleGroup();
		rb1.setToggleGroup(tg);
		rb2.setToggleGroup(tg);
		rb1.setSelected(true);
		
		flowList.add(new FlowPane(rb1, rb2));
		
		CheckBox chk1 = new CheckBox("����");
		CheckBox chk2 = new CheckBox("����");
		CheckBox chk3 = new CheckBox("��鼭 ������");
		
		HBox h = new HBox(10);
		h.getChildren().addAll(chk1, chk2, chk3);
		
		flowList.add(new FlowPane(h));
		flowList.add(new FlowPane(new Label("�ϰ� ���� ��")));
		
		TextArea ta = new TextArea();
		ta.setPrefSize(200, 50);
		flowList.add(new FlowPane(ta));
		
		vboxCenter.getChildren().addAll(flowList);
		
		borderPane.setTop(hboxTop);
		borderPane.setCenter(vboxCenter);
		borderPane.setLeft(vboxLeft);
		borderPane.setRight(grid);
		
		primaryStage.setTitle("Quiz");
		primaryStage.setScene(new Scene(borderPane, 500, 300));
		primaryStage.show();
	}
	public static void main(String[] args) {
		launch(args);

	}


}
