package com.company;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.stage.Stage;

public class Main extends Application {


    public void start(Stage primaryStage) {

        //LUCHT
        Rectangle lucht = new Rectangle(0,0,800,800);
        lucht.setFill(Color.LIGHTBLUE);

        //GRAS
        Rectangle gras = new Rectangle(0,600,800,400);
        gras.setFill(Color.GREEN);

        //HUIS
        Rectangle vierkant = new Rectangle(200,300,400,300);
        vierkant.setFill(Color.BLACK);

        //SCHOORSTEEN
        Rectangle schoorsteen = new Rectangle(250,170,40,100);
        schoorsteen.setFill(Color.BROWN);

        //DAK
        Polygon dak = new Polygon(200.0,300.0 ,400,120.0 ,600.0,300.0);
        dak.setFill(Color.RED);

        //DEUR
        Rectangle deur = new Rectangle(275,480,70,120);
        deur.setFill(Color.BROWN);

        //DEURKNOP
        Circle deurknop = new Circle(330,545,5);
        deurknop.setFill(Color.WHEAT);

        //RAAM
        Rectangle raam = new Rectangle(380,480,170,90);
        raam.setFill(Color.LIGHTGRAY);

        //SLAAPKAMERRAAM
        Rectangle slaapKamerRaam = new Rectangle(365,350,70,70);
        slaapKamerRaam.setFill(Color.LIGHTGRAY);

//        //Gezicht
//        Circle circle = new Circle(400,400,350);
//        circle.setFill(Color.rgb(255,255,204));
//        circle.setStroke(Color.BLACK);
//        circle.setStrokeWidth(2);
//
//
//        //Licker oog
//        Ellipse linkeroog = new Ellipse(300,300,100,50);
//        linkeroog.setFill(Color.WHITEz);
//        linkeroog.setStroke(Color.BLACK);
//        linkeroog.setStrokeWidth(2);
//        //Rechter oog
//        Ellipse rechteroog = new Ellipse(300,300,100,50);
//        rechteroog.setFill(Color.WHITE);
//        rechteroog.setStroke(Color.YELLOW);
//        rechteroog.setStrokeWidth(2);


        //Layout
        Group root= new Group();
        root.getChildren().addAll(lucht,vierkant,gras,schoorsteen,dak,deur,deurknop,raam,slaapKamerRaam);
        //Scene
        Scene scene = new Scene(root, 800, 800);
        //Stage
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
