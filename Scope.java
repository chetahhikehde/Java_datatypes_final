package Functions.java;

public class Scope {
    public static void main(String[] args) {
        int a = 10;
        int b = 30;
//        int i = 0;  this will abrupt the working of FOR-LOOP because initializing it 'here' makes the scoping of for-loop wrong as variables with same name cant be initialized again in loops and blocks...
        String name = "jhaji";

        {
            //int a = 20...you cant initialize a variable already initialized outside the block...
            a = 20; //but we definitely can change/update the value
            System.out.println(a); //will print updated value of 'a'...
            int c = 100;
            System.out.println(c);
            //value initialized in the "block" remains in the block, you cant use it outside this...
            name = "mayjha";
            System.out.println(name); // CAN YOU SEE WHAT HAPPENED HERE ORIGINAL REFERENCE VARIABLE HAD ITS OBJECT CHANGED

        }
        System.out.println(a);
        System.out.println(name);
        //System.out.println(c); ....need to make a variable 'c' before using it...

        //scoping for loop
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
            int num = 90;
//            int a = 10;
        }
//        System.out.println("this is main function's 'i'" + i);  again wont work because theres no 'i' in the main function's scope to print...initialize it first before using it...
    }
}

//In the main function scope and outside the BLOCK OR FOR LOOP, anything that is initialized can't be initialized again inside the BLOCK/FOR scope...
//we can use it, update it no problem with that but initializing variables with the same name is not allowed...

//When it comes to the scoping of BLOCK/FOR-LOOP anything that is initialized inside it ,can again be initialized outside in the main function's scope no problem with that...
//but we cant use it in the main function besides the BLOCK/FOR-LOOP...
// this should sound natural because if variables initialized in the BLOCK/FOR-loop are restrained from being used in the main function then why cant they be created in the
// main function, therefore we can make a variable with the same name in the main function absolutely no problem with that..while

