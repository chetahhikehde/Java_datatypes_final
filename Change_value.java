package Functions.java;

import java.util.Arrays;

public class Change_value {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        update(arr);
        System.out.println(Arrays.toString(arr));  //To string
    }

    //In java there's only call by value and when we pass an object's reference in a function it takes a copy of the reference
    //which points to the same object...

    static void update(int[] nums) {
        nums[0] = 99;
        //return;

    }
}
