/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.bai4;

/**
 *
 * @author VICTUS
 */
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
public class CalculatorController {
    @FXML
    private TextField txtDisplay; 

    private double num1 = 0;
    private String operator = "";
    private boolean isStart = true;
    @FXML
    private void handleNumber(ActionEvent event) {
        
        String value = ((Button) event.getSource()).getText();
        
        if (isStart) {
            txtDisplay.setText(value);
            isStart = false;
        } else {
            txtDisplay.appendText(value);
        }
    }

    @FXML
    private void handleOperator(ActionEvent event) {
        String value = ((Button) event.getSource()).getText();

        if (!"=".equals(value)) {
            
            if (!operator.isEmpty()) return; 
           
            num1 = Double.parseDouble(txtDisplay.getText());
            operator = value;
            isStart = true;
        } else {
            // Nếu người dùng bấm dấu "="
            if (operator.isEmpty()) return;
            
            double num2 = Double.parseDouble(txtDisplay.getText());
            calculate(num1, num2, operator);
            operator = "";
            isStart = true;
        }
    }

    @FXML
    private void handleClear(ActionEvent event) {
        txtDisplay.setText("0");
        num1 = 0;
        operator = "";
        isStart = true;
    }

    private void calculate(double n1, double n2, String op) {
        double result = 0;
        switch (op) {
            case "+": result = n1 + n2; break;
            case "-": result = n1 - n2; break;
            case "x": result = n1 * n2; break; 
            case "*": result = n1 * n2; break; 
            case "/": 
                if (n2 == 0) {
                    txtDisplay.setText("Error");
                    return;
                }
                result = n1 / n2; 
                break;
        }
        txtDisplay.setText(String.valueOf(result));
    }
    
    @FXML
    private void handleDel(ActionEvent event) {
        String current = txtDisplay.getText();
        if (current.length() > 0) {
            txtDisplay.setText(current.substring(0, current.length() - 1));
        }
    }
}

