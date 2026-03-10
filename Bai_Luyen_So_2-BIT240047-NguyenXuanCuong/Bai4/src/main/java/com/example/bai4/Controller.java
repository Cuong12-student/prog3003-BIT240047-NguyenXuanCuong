/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.bai4;

/**
 *
 * @author VICTUS
 */
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
public class Controller {
    @FXML private TextField txtText;
    @FXML private Label ketqua;
    @FXML private void btn(){
        try{
            double c=Double.parseDouble(txtText.getText());
            double f=c*9/5+32;           
            ketqua.setText(String.format("Ket qua: %.2f",f));
        }catch (NumberFormatException e) {
            ketqua.setText("Loi.Vui long nhap lai");
        }
    }
}
