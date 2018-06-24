//3.13
package employeetest;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class EmployeeTest {


    public static void main(String[] args) {
      Scanner scan=new Scanner(System.in);
      //receiving input from user
      
      String fname=JOptionPane.showInputDialog("Enter your first name");
      String lname= JOptionPane.showInputDialog("Enter your last name");
       String sal=JOptionPane.showInputDialog("Enter your salary");
       //convert salary to double
     double salary=Double.parseDouble(sal);
     
       //calculating salary
        Employee employee= new Employee(fname,lname,salary);
        double Ysalary=employee.yearlySalary();
        double YsalaryWithR=employee.yearlySalaryWithRaise();
        
        String message=String.format("Mr %s %s has a monthly salary of %.1f, a yearly salary of %.1f, then with a raise %.1f", fname,lname,salary,Ysalary,YsalaryWithR);
    
    //presenting the info in a dialog box
    JOptionPane.showMessageDialog(null, message);
    }
    
    
    
}
