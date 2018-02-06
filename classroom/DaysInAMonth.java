/**********************************
DaysInAMonth.java

Luis Aberto Cordova Osorio
This program finds the number of days in a month
**********************************/
import javax.swing.JOptionPane;

public class DaysInAMonth{
  public static void main(String[] args) {
    int numberOfDaysInAMonth = 0;
    String monthOfYear;

    monthOfYear = JOptionPane.showInputDialog("Enter your month");

    switch(monthOfYear){
      case "January":
        numberOfDaysInAMonth = 31;
        break;
      case "February":
        numberOfDaysInAMonth = 28;
        break;
    } //end switch



  }
}
