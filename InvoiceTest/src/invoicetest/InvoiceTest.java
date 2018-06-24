//chapter 3 exercises
//3.12
package invoicetest;

import java.util.Scanner;
import javax.swing.JOptionPane;


public class InvoiceTest {

   
String part, des;


    public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
//getting input from the user
String part=JOptionPane.showInputDialog("Enter the part name");
String des=JOptionPane.showInputDialog("Enter the part description");
String pe=JOptionPane.showInputDialog("Enter the price per item");
String qu=JOptionPane.showInputDialog("Enter the quantity");
//converting from strings

double per=Double.parseDouble(pe);
int quan=Integer.parseInt(qu);

//send info to invoice

Invoice item=new Invoice(part,des,quan,per);
//get total price
  double value=item.getInvoiceAmount();
  // place it in  a dialog
  String am=String.format("the final price of buying %d %s is %.1f",quan,part,value);
  JOptionPane.showMessageDialog(null, am);
  
  
  
    }
    
}
