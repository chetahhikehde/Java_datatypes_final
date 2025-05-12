package Functions.java;

import java.util.Arrays;

//Loose exam[l
public class Method_overloading {
    public static void main(String[] args) {
//        varargs(1,2,3);
        varargs("jhaji","mayjha","pompeii");

//        varargs();   wont work because of "AMBIGUITY"!!! No parameters at compile time system couldn't understand which of the varargs to run...
    }

    static void varargs(int ...v) {
        System.out.println(Arrays.toString(v));
    }

    //this one is running since the arguments in the main function corresponds to this function (String)!!!
    static void varargs(String ...v) {
        System.out.println(Arrays.toString(v));
    }
}
