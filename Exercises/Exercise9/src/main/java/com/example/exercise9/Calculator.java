package com.example.exercise9;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.geometry.Pos;
import javafx.geometry.Insets;
import javafx.event.ActionEvent;


public class Calculator extends Application {

    private TextField display;
    private double firstNumber = 0;
    private String operator = "";
    private boolean start = true;

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Calculator");

        display = new TextField();
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setVgap(10);
        grid.setHgap(10);
        grid.setPadding(new Insets(10, 10, 10, 10));

        String[] buttonLabels = {
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "0", "C", "=", "+"
        };

        int row = 1;
        for (int i = 0; i < buttonLabels.length; i++) {
            Button button = new Button(buttonLabels[i]);
            button.setOnAction(this::processInput);
            grid.add(button, i % 4, row + (i / 4));
        }

        grid.add(display, 0, 0, 4, 1);

        Scene scene = new Scene(grid, 250, 250);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void processInput(ActionEvent event) {
        String value = ((Button)event.getSource()).getText();

        if ("1234567890".contains(value)) {
            if (start) {
                display.setText(value);
                start = false;
            } else {
                display.setText(display.getText() + value);
            }
        } else if ("/*-+".contains(value)) {
            firstNumber = Double.parseDouble(display.getText());
            operator = value;
            start = true;
        } else if ("=".equals(value)) {
            double secondNumber = Double.parseDouble(display.getText());
            switch (operator) {
                case "+":
                    display.setText(String.valueOf(firstNumber + secondNumber));
                    break;
                case "-":
                    display.setText(String.valueOf(firstNumber - secondNumber));
                    break;
                case "*":
                    display.setText(String.valueOf(firstNumber * secondNumber));
                    break;
                case "/":
                    if (secondNumber == 0) {
                        display.setText("Error");
                    } else {
                        display.setText(String.valueOf(firstNumber / secondNumber));
                    }
                    break;
            }
            start = true;
        } else if ("C".equals(value)) {
            display.clear();
            start = true;
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
