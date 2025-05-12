package Functions.java;

public class subtleties {
    int[] arr;
//    arr = new int[5];   //Error

    public static void main(String[] args) {
        int[] arr;
        arr = new int[5]; //Correct works fine why??!!
    }

// 1. Java classes are like blueprints — not machines
//    When you write:

//    public class Robot {
//        int wheels;
//        wheels = 4; // ❌ ERROR here
//    }
//    Java says: “Hold on! You’re not running a machine right now — you’re just describing what a Robot is!”
//
//    The line wheels = 4; is an action.
//
//    But you're still just designing the Robot, not building or using it yet.
//
//    Java doesn't allow actions (like assigning wheels = 4;) to just float around in the blueprint.


// 2. So where can actions happen?
//    Only inside methods, constructors, or special initializer blocks.
//
//    Why?
//
//    Because those are places where the machine “comes to life”.
//    That’s when Java says:
//
//            "Okay! Now you’re doing something. You can assign values, loop, calculate — go for it!"


// 3. When you write:
//
//    int[] arr = new int[5];
//    It means:
//
//            "Aisa hona chahiye."
//            (This is how things should be set up when the object is created — it’s part of the design.)
//
//    Java allows this because you're saying:
//
//            “This class comes with a drawer (arr) already filled with 5 boxes when it's built.”
//
//    It’s a passive description, not an instruction to do something right now.
//
//    But when you write:
//
//            arr = new int[5];
//    It means:
//
//            "Aisa karo."
//            (Do this action now — assign this array.)
//
//    Java says:
//
//            “Wait! You’re giving me a command in the middle of the class blueprint. That’s not allowed.”
//
//    Commands must go inside a method, constructor, or block — places where Java actually runs instructions.


// 4.  When you write:
//
//    int[] arr = new int[5];
//    At class level, this is okay because:
//
//    You're not giving an instruction, you're declaring a variable and telling the JVM:
//
//            “Hey, when this object is created, make sure it gets a 5-slot array.”
//
//    The javac compiler is totally chill with this. It’s like:
//
//            “No worries, I’ll just record this as a setup to be done later at runtime.”
//
//    This line creates metadata in the bytecode saying:
//
//            "This object has a field arr, and it should be initialized with a new array of size 5 when an object is created."
//
//            ✅ No actual memory is allocated yet — just a plan is recorded.
//
//😬 But when you write:
//
//            arr = new int[5];
//    At class level (not inside a method), the compiler freaks out because:
//
//    That’s a command (an action), and Java only allows actions inside methods or constructors.
//
//    javac is like:
//
//            “Hey! I don’t run code! I only check and prepare. I don’t allocate memory — that’s the JVM’s job. And this line looks like you’re trying to run something right now!”
//
//            🚫 So it throws an error: “You can't put executable statements here!”
//
//            ✅ But when the same line is inside a method:
//
//    public static void main(String[] args) {
//        arr = new int[5];  // ✅ Now it’s totally fine
//    }
//    Now javac says:
//
//            “Cool, this is inside a method. I’ll compile it into bytecode. JVM will take care of the memory stuff at runtime when this method is actually called.”
//



}
