/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.cremeria_2;

/**
 *
 * @author Brand
 */
public class Cremeria_2 {
    private int queso;
    private int chorizo;
    private int crema;
    private int salchichap;
    private int salchichasa;
    private int salchichar;
    private int jamon;
    private int tqueso;
    private int tchorizo;
    private int tcrema;
    private int tsalchichap;
    private int tsalchichasa;
    private int tsalchichar;
    private int tjamon;
    
    public void setQueso(int ValorQ){
        this.queso = ValorQ;}
    public void setCrema(int ValorC){
        this.crema = ValorC;}
    public void setChorizo(int ValorCh){
        this.chorizo = ValorCh;}
    public void setSalchichaP(int ValorSP){
        this.salchichap = ValorSP;}
    public void setSalchichaSA(int ValorSSA){
        this.salchichasa = ValorSSA;}
    public void setSalchichaR(int ValorSR){
        this.salchichar = ValorSR;}
    public void setJamon(int ValorJ){
        this.jamon = ValorJ;}
    
    public void setTqueso(int TotalQ){
        this.queso = TotalQ;}
    public void setTcrema(int TotalC){
        this.crema = TotalC;}
    public void setTchorizo(int TotalCh){
        this.chorizo = TotalCh;}
    public void setTsalchichaP(int TotalSP){
        this.salchichap = TotalSP;}
    public void setTsalchichaSA(int TotalSSA){
        this.salchichasa = TotalSSA;}
    public void setTsalchichaR(int TotalSR){
        this.salchichar = TotalSR;}
    public void setTjamon(int TotalJ){
        this.jamon = TotalJ;}
    
    public int getQueso(){
        return this.queso;}
    public int getCrema(){
        return this.crema;}
    public int getChorizo(){
        return this.chorizo;}
    public int getSalchichaP(){
        return this.salchichap;}
    public int getSalchichaSA(){
        return this.salchichasa;}
    public int getSalchichaR(){
        return this.salchichar;}
    public int getJamon(){
        return this.jamon;}
    
    public int getTqueso(){
        return this.tqueso;}
    public int getTcrema(){
        return this.tcrema;}
    public int getTchorizo(){
        return this.tchorizo;}
    public int getTsalchichaP(){
        return this.tsalchichap;}
    public int getTsalchichaSA(){
        return this.tsalchichasa;}
    public int getTsalchichaR(){
        return this.tsalchichar;}
    public int getTjamon(){
        return this.tjamon;}
        
        
    public void SumarQ(){
        this.tqueso = (this.tqueso + this.queso);}
    public void SumarC(){
        this.tcrema = (this.tcrema + this.crema);}
    public void SumarCh(){
        this.tchorizo = (this.tchorizo + this.chorizo);}
    public void SumarSP(){
        this.tsalchichap = (this.tsalchichap + this.salchichap);}
    public void SumarSSA(){
        this.tsalchichasa = (this.tsalchichasa + this.salchichasa);}
    public void SumarSR(){
        this.tsalchichar = (this.tsalchichar + this.salchichar);}
    public void SumarJ(){
        this.tjamon = (this.tjamon + this.jamon);}

    public void RestaQ(){
        this.rqueso = (80 - this.tqueso);}
    public void RestaC(){
        this.rcrema = (100 - this.tcrema );}
    public void RestaCh(){
        this.rchorizo = (56 - this.tchorizo);}
    public void RestaSP(){
        this.rsalchichap = (40 - this.tsalchichap);}
    public void RestaSSA(){
        this.rsalchichasa = (34 - this.tsalchichasa);}
    public void RestaSR(){
        this.rsalchichar = (24 - this.tsalchichar);}
    public void RestaJ(){
        this.rjamon = (this.tjamon);}
    }
}
