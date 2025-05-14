import java.util.Scanner;

class Employee{
    String fname;
    String lname;
    double msal,ysal,inc;

    //constructor
    Employee(){
        fname="";
        lname="";
        msal=0;
    }

    void getinfo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name :");
        fname = sc.nextLine();
        System.out.println("Enter last name :");
        lname = sc.nextLine();
        System.out.println("Enter your monthly salary :");
        msal = sc.nextInt();
    }

    void setinfo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("First name is "+fname);
        System.out.println("Last name is "+lname);
        System.out.println("Monthly Salary :"+msal);
        ysal=msal*12;
        System.out.println("Yearly salary :"+ysal);
    }

    void raise(){
        inc=ysal * 0.1;
        ysal=ysal+inc;
        System.out.println("Incremented sal :"+ysal);
    }
}

public class EmployeeTest{
    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee();

        System.out.println("Employee 1");
        e1.getinfo();
        e1.setinfo();
        e1.raise();

        System.out.println("Employee 2");
        e2.getinfo();
        e2.setinfo();
        e2.raise();
    }
}