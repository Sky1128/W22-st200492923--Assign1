package com.example.w22st200492923assign1;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

import java.io.IOException;
import java.util.Scanner;

public class HelloApplication  {
   // @Override
    /*public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }*/

    public static void main(String[] args) {

        Student firstStudent = new Student("Pruthvish","Patel", 200492923);

        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter First Name : ");
        firstStudent.setFirstName(userInput.nextLine());
        System.out.println("Enter Last Name: ");
        firstStudent.setLastName(userInput.nextLine());
        System.out.println("Enter Student Number: ");
        firstStudent.setStudentNumber(userInput.nextInt());

        if (firstStudent.dataValidator() == true)
        {
            System.out.println("Frist Name : " +firstStudent.getFirstName());
            System.out.println("Last Name : " +firstStudent.getLastName());
            System.out.println("Student Number: " +firstStudent.getStudentNumber());
        }
        else
        {
            System.out.println("Invalid User input, please enter valid data");
        }
    }
}