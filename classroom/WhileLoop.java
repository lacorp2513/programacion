/**************************
WhileLoop.java
while = mientras
Luis Alberto Cordova OSorio
This program makes entries in a bridal registry
****************************/
import javax.swing.JOptionPane;

public class WhileLoop{
  public static void main(String[] args) {
    String registry = "";
    char more;

    more = JOptionPane.showInputDialog("Do you want to create a bridal registry? (y/n)").charAt(0);

    while(more == 'y' || more == 'Y'){
      registry += JOptionPane.showInputDialog("Enter item: ");
      registry += " - ";
      registry += JOptionPane.showInputDialog("Enter store ");
      registry += "\n";
      more = JOptionPane.showInputDialog("any more items? (y/n)").charAt(0);
    } //end while
    if (!registry.equals("")) {
      JOptionPane.showMessageDialog(null, "\nBridal registry\n "+ registry);
    }

  }
}
