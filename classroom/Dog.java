/*********************************
Dog.java

Luis Alberto Cordova Osorio
This class sets(establecer) the dog's properties and methods
*********************************/
import javax.swing.*;
public class Dog{

    //Dog's properties - Variables
    private String color;
    private String eyeColor;
    private double height;
    private double length;
    private double weight;

    /*Metodo tipo de dato GET = obtener
    metodo void SET = establecer*/

    //sets the dog's color
    public void setColor(String dogColor){
      color = dogColor;
    }
    //gets the dog's color
    public String getColor(){
      return color;
    }

    //sets dog's eyecolor
    public void setEyeColor(String dogEyeColor){
      eyeColor = dogEyeColor;
    }
    //gets dog's eyecolor
    public String getEyeColor(){
      return eyeColor;
    }


    //Dog's Methods - actions
    //Sit method
    public void sit(){
      JOptionPane.showMessageDialog(null, "The dog is sat");
    }

    //Bark Method
    public void bark(){
      JOptionPane.showMessageDialog(null, "The dog is barking");
    }

    //Lay Down Method
    public void layDown(){
      JOptionPane.showMessageDialog(null,"The dog is laid down");
    }

    public void eat(){
      JOptionPane.showMessageDialog(null,"The dog is eating");
    }

    public void sleep(){
      JOptionPane.showMessageDialog(null,"The dog is sleeping");
    }



}
