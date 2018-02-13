/**********************************
AverageWhile.java

Luis Alberto Cordova Osorio
This program calculates the average of ten grades
************************************/
import javax.swing.JOptionPane;

public class AverageWhile{
  public static void main(String[] args) {
    int counter = 1, totalStudents;
    double score, totalScore = 0, averageScore = 0;
    //10
    totalStudents = Integer.parseInt(JOptionPane.showInputDialog("Enter number of students"));
    while(counter <= totalStudents){
      score = Double.parseDouble(JOptionPane.showInputDialog("Enter the score "+ counter));
      //5
      //10
      totalScore = totalScore + score;
      counter ++;
    }
    averageScore = totalScore / totalStudents;
    JOptionPane.showMessageDialog(null, "The average is " + averageScore);
  }
}
