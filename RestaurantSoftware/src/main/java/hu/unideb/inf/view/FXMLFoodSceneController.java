/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hu.unideb.inf.view;

import hu.unideb.inf.model.Model;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

/**
 *
 * @author KRONESIT
 */

public class FXMLFoodSceneController implements Initializable {
    
    private Model model;
    
    public void setModel(Model model){
        this.model = model;
    }
    
    @FXML
    private Label label;
    
    @FXML
    private Label label1;
    
    @FXML
    private Label label2;
     
    //husleves
    @FXML
    public void handleButton00Action(ActionEvent event) {
        label.setText(model.getHusleves().getName());
        label2.setText("" + model.getHusleves().getPrice());
        
    }
    
    //bableves
    @FXML
    private void handleButton01Action(ActionEvent event) {
        System.out.println("Bableves");
        label.setText("Bableves");
    }
    
    //gyumolcsleves
    @FXML
    private void handleButton02Action(ActionEvent event) {
        System.out.println("Gyümölcsleves");
        label.setText("Gyümölcsleves");
    }
    
    
    //paradicsomleves
    @FXML
    private void handleButton03Action(ActionEvent event) {
        System.out.println("Paradicsomleves");
        label.setText("Paradicsomleves");
    }
    
    //marhaporkolt
    @FXML
    void handleButton10Action(ActionEvent event) {
        System.out.println("Marhapörkölt");
        label.setText("Marhapörkölt");
    }
    
    //turosteszta
    @FXML
    void handleButton11Action(ActionEvent event) {
        System.out.println("Túróstészta");
        label.setText("Túróstészta");
    }
    
    //toltottkaposzta
    @FXML
    void handleButton12Action(ActionEvent event) {
        System.out.println("Töltöttkáposzta");
        label.setText("Töltöttkáposzta");
    }
    
    //rantotthus
    @FXML
    void handleButton13Action(ActionEvent event) {
        System.out.println("Rántotthús");
        label.setText("Rántotthús");
    }
    
    //palacsinta
    @FXML
    void handleButton20Action(ActionEvent event) {
        System.out.println("Palacsinta");
        label.setText("Palacsinta");
    }
    
    //makosguba
    @FXML
    void handleButton21Action(ActionEvent event) {
        System.out.println("Mákosguba");
        label.setText("Mákosguba");
    }
    
    //aranygaluska
    @FXML
    void handleButton22Action(ActionEvent event) {
        System.out.println("Aranygaluska");
        label.setText("Aranygaluska");
    }
    
    //csokitorta
    @FXML
    void handleButton23Action(ActionEvent event) {
        System.out.println("Csokitorta");
        label.setText("Csokitorta");
    }
    
    //coca-cola
    @FXML
    void handleButton30Action(ActionEvent event) {
        System.out.println("Coca-cola");
        label.setText("Coca-cola");
    }
    
    //pepsi
    @FXML
    void handleButton31Action(ActionEvent event) {
        System.out.println("Pepsi");
        label.setText("Pepsi");
    }
    
    //asvanyviz
    @FXML
    void handleButton32Action(ActionEvent event) {
        System.out.println("Ásványvíz");
        label.setText("Ásványvíz");
    }
    
    //zoldtea
    @FXML
    void handleButton33Action(ActionEvent event) {
        System.out.println("Zöldetea");
        label.setText("Zöldetea");
    }
    
    //1
    @FXML
    void handleButtonNuber1Action(ActionEvent event) {
        System.out.println("1");
        label1.setText("1");
    }
    
    //2
    @FXML
    void handleButtonNuber2Action(ActionEvent event) {
        System.out.println("2");
        label1.setText("2");
    }
    
    //3
    @FXML
    void handleButtonNuber3Action(ActionEvent event) {
        System.out.println("3");
        label1.setText("3");
    }
    
    //4
    @FXML
    void handleButtonNuber4Action(ActionEvent event) {
        System.out.println("4");
        label1.setText("4");
    }
    
    //5
    @FXML
    void handleButtonNuber5Action(ActionEvent event) {
        System.out.println("5");
        label1.setText("5");
    }
    
    //6
    @FXML
    void handleButtonNuber6Action(ActionEvent event) {
        System.out.println("6");
        label1.setText("6");
    }
    
    //7
    @FXML
    void handleButtonNuber7Action(ActionEvent event) {
        System.out.println("7");
        label1.setText("7");
    }
    
    //8
    @FXML
    void handleButtonNuber8Action(ActionEvent event) {
        System.out.println("8");
        label1.setText("8");
    }
    
    //9
    @FXML
    void handleButtonNuber9Action(ActionEvent event) {
        System.out.println("9");
        label1.setText("9");
    }
    
    //0
    @FXML
    void handleButtonNuber0Action(ActionEvent event) {
        System.out.println("0");
        label1.setText("0");
    }
    
    //fizet
    @FXML
    void handleButtonPayAction(ActionEvent event) {
        System.out.println("Fizetés");
        label2.setText("Fizetés");
    }
    
    //torol
    @FXML
    void handleButtonDeleteAction(ActionEvent event) {
        System.out.println("0");
        label.setText("");
        label1.setText("");
        label2.setText("0");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
}

