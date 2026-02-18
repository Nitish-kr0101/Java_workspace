package com.example.lambdaExpression;

public class Test {
    public static void main(String[] args) {

        //person p = new person();
        //p.greet();
        // Anonymous class
        Greeting g= new Greeting() {
            @Override
            public void greet() {
                System.out.println("Hello from Anonymous class");
            }
        };
        Greeting g1=()-> System.out.println("Hello from Lambda Expression");
        g.greet();
        g1.greet();

        Notable n=(String x)-> System.out.println(x);
        n.note("Physics");

        Washable w=(String b)-> "Washing "+b;
        System.out.println(w.wash("shirt"));
    }
}
