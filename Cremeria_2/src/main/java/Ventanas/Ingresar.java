/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ventanas;


public class Ingresar {
    private double queso;
    private double chorizo;
    private double crema;
    private double salchichap;
    private double salchichasa;
    private double salchichar;
    private double jamon;
    private double tqueso;
    private double tchorizo;
    private double tcrema;
    private double tsalchichap;
    private double tsalchichasa;
    private double tsalchichar;
    private double tjamon;
    private double rqueso;
    private double rchorizo;
    private double rcrema;
    private double rsalchichap;
    private double rsalchichasa;
    private double rsalchichar;
    private double rjamon;
    
    public void setQueso(double queso){
        this.queso = queso;}
    public void setCrema(double crema){
        this.crema = crema;}
    public void setChorizo(double chorizo){
        this.chorizo = chorizo;}
    public void setSalchichaP(double salchichap){
        this.salchichap = salchichap;}
    public void setSalchichaSA(double salchichasa){
        this.salchichasa = salchichasa;}
    public void setSalchichaR(double salchichar){
        this.salchichar = salchichar;}
    public void setJamon(double jamon){
        this.jamon = jamon;}
    
    public void setTqueso(double tqueso){
        this.tqueso = tqueso;}
    public void setTcrema(double tcrema){
        this.tcrema = tcrema;}
    public void setTchorizo(double tchorizo){
        this.tchorizo = tchorizo;}
    public void setTsalchichaP(double tsalchichap){
        this.tsalchichap = tsalchichap;}
    public void setTsalchichaSA(double tsalchichasa){
        this.tsalchichasa = tsalchichasa;}
    public void setTsalchichaR(double tsalchichar){
        this.tsalchichar = tsalchichar;}
    public void setTjamon(double tjamon){
        this.tjamon = tjamon;}
    
    public void setRqueso(double rqueso){
        this.rqueso = rqueso;}
    public void setRcrema(double rcrema){
        this.rcrema = rcrema;}
    public void setRchorizo(double rchorizo){
        this.rchorizo = rchorizo;}
    public void setRsalchichaP(double rsalchichap){
        this.rsalchichap = rsalchichap;}
    public void setRsalchichaSA(double rsalchichasa){
        this.rsalchichasa = rsalchichasa;}
    public void setRsalchichaR(double rsalchichar){
        this.rsalchichar = rsalchichar;}
    public void setRjamon(double rjamon){
        this.rjamon = rjamon;}
    
    public double getQueso(){
        return queso;}
    public double getCrema(){
        return crema;}
    public double getChorizo(){
        return chorizo;}
    public double getSalchichaP(){
        return salchichap;}
    public double getSalchichaSA(){
        return salchichasa;}
    public double getSalchichaR(){
        return salchichar;}
    public double getJamon(){
        return jamon;}
    
    public double getTqueso(){
        return tqueso;}
    public double getTcrema(){
        return tcrema;}
    public double getTchorizo(){
        return tchorizo;}
    public double getTsalchichaP(){
        return tsalchichap;}
    public double getTsalchichaSA(){
        return tsalchichasa;}
    public double getTsalchichaR(){
        return tsalchichar;}
    public double getTjamon(){
        return tjamon;}
        
    public double getRqueso(){
        return rqueso;}
    public double getRcrema(){
        return rcrema;}
    public double getRchorizo(){
        return rchorizo;}
    public double getRsalchichaP(){
        return rsalchichap;}
    public double getRsalchichaSA(){
        return rsalchichasa;}
    public double getRsalchichaR(){
        return rsalchichar;}
    public double getRjamon(){
        return rjamon;}
        
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
        this.rjamon = (60 - this.tjamon);}
}
