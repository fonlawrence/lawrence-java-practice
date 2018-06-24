
package employeetest;

public class Employee {
       private static String firstName;
     private static String lastName;
      private static double salary;
double Ysalary;
    public Employee(String firstName, String lastName, double salary) {
        Employee.firstName=firstName;
        Employee.lastName=lastName;
        Employee.salary=salary;
    }
    public double yearlySalary(){
        Ysalary=salary*12;
       return Ysalary;
    }
    public double yearlySalaryWithRaise(){
        double YsalaryWithR=(Ysalary/10)+Ysalary;
        return YsalaryWithR;
    }
    

    public static String getFirstName() {
        return firstName;
    }

    public static void setFirstName(String firstName) {
        Employee.firstName = firstName;
    }

    public static String getLastName() {
        return lastName;
    }

    public static void setLastName(String lastName) {
        Employee.lastName = lastName;
    }

    public static double getSalary() {
        return salary;
    }

    public static void setSalary(double salary) {
        Employee.salary = salary;
    }
    
      
      
    
}
