class StaticDemo{
    static int count;

    static{
        System.out.println("Static block executed");
        count=100;
    }

    static void dispalycount(){
        System.out.println("Count :"+count);
    }

    void inccount(){
        count++;
    }
}

public class Seven-one_Static  {
    public static void main(String[] args) {
        StaticDemo.dispalycount();
        
        StaticDemo o1 = new StaticDemo();
        StaticDemo o2 = new StaticDemo();

        o1.inccount();
        o2.inccount();

        StaticDemo.dispalycount();
    }
}
