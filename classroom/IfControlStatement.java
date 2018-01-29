/********************************
IfControlStatement.java

Luis alberto Cordova osorio
This program checks for period at the end of line.
*********************************/
import javax.swing.JOptionPane;

public class IfControlStatement{
  public static void main(String[] args) {
    String sentence;
    int lastCharPosition;

    sentence = JOptionPane.showInputDialog("Enter your sentence");
    //hello world.

    lastCharPosition = sentence.length() - 1;

    JOptionPane.showMessageDialog(null,sentence.charAt(lastCharPosition));

    if (sentence.charAt(lastCharPosition) != '.') {
      JOptionPane.showMessageDialog(null, "Invalid Entry - Your sentence needs a period");
     }//end if
  }// end main
} // end class
