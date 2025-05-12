package Functions.java;

import java.util.Arrays;

public class Variable_length__arguments {
    public static void main(String[] args) {
        fun(1,2,3,5,8,9,10);
        fun2("jhaji","mayjha","DKMS");
        MIX(20,26,"JHAJI","MAYJHA");
    }

    static void fun(int ...v) {
        System.out.println(Arrays.toString(v));
    }

    static void fun2(String ...s) {
        System.out.println(Arrays.toString(s));
    }

    static  void MIX(int a , int b, String ...v) {
        System.out.println(v[0] + " age is: " + a);
        System.out.println(v[1] + " age is: " + b);
    }
}
