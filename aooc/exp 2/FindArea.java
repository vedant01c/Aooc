/*

import java.util.Scanner;
class Area{
    double l;
    double b;

    Area(){
        l=0;
        b=0;
        
    }

    void setdim(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length");
        l=sc.nextInt();
        System.out.println("Enter breadth");
        b=sc.nextInt();
    }

    void getarea(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Area of rect :"+l*b);
    }
}

public class FindArea{
    public static void main(String[] args) {
    Area a = new Area();
    a.setdim();
    a.getarea();
    }
}

*/

import java.util.Scanner;
class Area{
    double l;
    double b;
    double area;

    Area(){
        l=0;
        b=0;
    }

    void setdim(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length");
        l=sc.nextDouble();
        System.out.println("Enter breadth");
        b=sc.nextDouble();
    }

    void getarea(){
        area=l*b;
        System.out.println("Area of rect :"+area);
    }
}

public class FindArea{
    public static void main(String[] args) {
    Area a = new Area();
    a.setdim();
    a.getarea();
    }
}