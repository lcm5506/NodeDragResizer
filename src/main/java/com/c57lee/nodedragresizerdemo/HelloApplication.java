package com.c57lee.nodedragresizerdemo;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        Group root = new Group();

        Label title = new Label("Title");

        Pane pane = new Pane();
        pane.setPrefSize(500,500);
        pane.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID,null, BorderStroke.MEDIUM)));

        Rectangle rect1 = new Rectangle(110,110,200,200);
        rect1.setFill(Color.RED);



        Rectangle rect2 = new Rectangle(10,400,20,40);
        rect2.setFill(Color.BLUE);


//        Circle circle = new Circle();
//        circle.setCenterX(300);
//        circle.setCenterY(300);
//        circle.setRadius(30);
//        circle.setOnMouseClicked(new EventHandler<MouseEvent>() {
//            @Override
//            public void handle(MouseEvent event) {
//                System.out.println("Before: "+circle.getRadius());
//                circle.resize(50,50);
//                System.out.println("After: "+circle.getRadius());
//            }
//        });




        pane.getChildren().addAll(rect1,rect2);

        NodeDragResizer.makeDragResizable(rect1);
        NodeDragResizer.makeDragResizable(rect2);

        VBox vBox = new VBox();
        vBox.getChildren().addAll(title,pane);
        root.getChildren().add(vBox);

        Scene scene = new Scene(root);
        stage.setTitle("Node Drag & Resizer Demo");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}