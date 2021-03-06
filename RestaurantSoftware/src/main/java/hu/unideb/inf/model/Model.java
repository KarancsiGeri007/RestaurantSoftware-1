/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hu.unideb.inf.model;

/**
 *
 * @author KRONESIT
 */
public class Model {
   private Food husleves;
    private Food bableves;
    private Food gyumileves;
    private Food parileves;
    

    public Model() {
        husleves = new Food("Húsleves", 799);
        bableves = new Food("Bableves", 699);
        gyumileves = new Food("Gyümölcsleves", 599);
        parileves = new Food("Paradicsomleves", 499);
    }

    public Food getHusleves() {
        return husleves;
    }

    public void setHusleves(Food husleves) {
        this.husleves = husleves;
    }

    public Food getBableves() {
        return bableves;
    }

    public void setBableves(Food bableves) {
        this.bableves = bableves;
    }

    public Food getGyumileves() {
        return gyumileves;
    }

    public void setGyumileves(Food gyumileves) {
        this.gyumileves = gyumileves;
    }

    public Food getParileves() {
        return parileves;
    }

    public void setParileves(Food parileves) {
        this.parileves = parileves;
    } 
}
