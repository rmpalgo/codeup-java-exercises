public class HelloWorld {

    public static void main (String[] args) {
        System.out.print("Hello, World!\n");
        System.out.print("Hello, World!\n");

// Step 1: create an int variable and assign favorite number
        int myFavoriteNumber = 1000000;
        System.out.println(myFavoriteNumber);
//  Step 2: create a string variable named myString
        String myString = "This is a new string Java style.";
        System.out.println(myString);
//  Step 3: Change your code to assign the value 3.14159 to myString
        myString = "New Stuff";
        System.out.println(myString);
//  Step 4: Change your code to assign the value 3.14159 to myString
       /* myString = 3.1459;  This produces an error*/

//  Step 5: Declare a long variable named myNumber, but do not assign anything to it. Next print out myNumber.
         long myNumber = 123L;
        System.out.println(myNumber);
        // Causes an error, variable myNumber might not be initialized.
    }

    // Step 6, 7, 8: Change you code to assign the value 3.14 to myNumber.
        /* sends and error stating incompatible types, 3.14 is non-integer value and requires double for initializing type */
}
