package com.example.demo2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        BorderPane borderPane = new BorderPane();
        Button button = new Button("الاعدادات");
        button.setOnAction(e ->{
            Stage stage1 = new Stage();
            BorderPane borderPane1 = new BorderPane();
            Label label = new Label("تم تسجيل الدخول باسم ");
            Button profile = new Button("ملفك الشخصي");
            Button help = new Button("مساعدة");
            Button settings = new Button("اعدادات");
            Button sign_out = new Button("تسجيل الخروج");

            VBox vBox= new VBox();
            vBox.setSpacing(10);
            vBox.getChildren().addAll(label,profile,settings,sign_out);
            borderPane1.setCenter(vBox);

            borderPane1.setPadding(new Insets(0,0,10,20));
            Scene scene1 = new Scene(borderPane1, 150, 140);
            stage1.setResizable(false);
            stage1.setTitle("Hello!");
            stage1.setScene(scene1);
            stage1.show();

        });
        borderPane.setCenter(button);
        Scene scene = new Scene(borderPane, 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}