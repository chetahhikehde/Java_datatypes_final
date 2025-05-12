package Functions.java;

public class Shadowing {
    static int x = 90;  //will be shadowed as soon as
    public static void main(String[] args) {
        System.out.println(x);  //90
        int x = 40;
        System.out.println(x);  //40
        fun();
    }
    //we can see that x is being initialized 2 times: outside the main function and then inside it, therefore the first time it was initialized it had only 1 scope which
    // was the class named shadowing but the second time it got initialized guess what, now it has 2 scopes overlapping the class(outer scope) and the function where its
    // again initialized psvm(inner scope) this is exactly where shadowing comes, now after i have already initialized the variable with the same name for the second time,
    // if i attempt to use/print the variable it will print the value from the second initialization (inner scope) since the inner scope 'SHADOWS' the first initialization
    // of 'x'

    static void fun() {
        System.out.println(x);
    }

    //But when fun() was called the scope got switched to the outer one and it printed 90...
    // concept of inner scope is valid only inside the psvm as soon as the control gets out of it, there is only one variable left to consider which is the class variable...


    //x=90 ...outer scope
    //x=40 ...inner scope
    //System.out.println(x); //40 ...since 90 is shadowed by the inner class...
    //fun(); //90 ...since fun is not inside the scope of the main function...
}
