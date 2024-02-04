package com.variables;

public class Main {

  public static void main(String[] args) {
    //sys out clear
    System.out.println("\033[H\033[2J"); //method to clear the terminal dynamically.
    System.out.println("Hello world!");

    //datatype variableName = someValue

    //SECTION[Data-Types] Data Types
    System.out.println("\nData Types:");
    int myAge = 35; //int - integer
    System.out.println("I'm old af:" + myAge);

    long myLongInt = 1234567890; //long - large number
    System.out.println("Longest numbers ever:" + myLongInt);

    double myDouble = 3.14; //double - decimal
    System.out.println("I'm a double:" + myDouble);

    float myFloat = 3.14f; //float - decimal
    System.out.println("I'm floating:" + myFloat);

    byte myByte = 127; //byte - small number
    System.out.println("This bytes:" + myByte);

    char myChar = 'A'; //char - character
    System.out.println("Char Char:" + myChar);

    boolean myBool = true; //boolean - true or false
    System.out.println("I'm a boolean:" + myBool);

    String myName = "Sir Fredrickson"; //String (Object Data Type) - sequence of characters
    System.out.println("I'm a string:" + myName);
    //!SECTION[Data-Types]

    //SECTION[Operators] Operators
    System.out.println("\nOperators:");

    int x = 5;
    int y = 3;
    int sum = x + y; //addition
    System.out.println("Sum:" + sum);

    int diff = x - y; //subtraction
    System.out.println("Difference:" + diff);

    int product = x * y; //multiplication
    System.out.println("Product:" + product);

    int quotient = x / y; //division
    System.out.println("Quotient:" + quotient);

    int remainder = x % y; //modulus
    System.out.println("Remainder:" + remainder);

    x++; //increment
    System.out.println("Increment:" + x);

    y--; //decrement
    System.out.println("Decrement:" + y);

    int z = 5;
    z += 3; //addition assignment
    System.out.println("Addition Assignment:" + z);

    int a = 5;
    a -= 3; //subtraction assignment
    System.out.println("Subtraction Assignment:" + a);

    int b = 5;
    b *= 3; //multiplication assignment
    System.out.println("Multiplication Assignment:" + b);

    int c = 5;
    c /= 3; //division assignment
    System.out.println("Division Assignment:" + c);

    int d = 5;
    d %= 3; //modulus assignment
    System.out.println("Modulus Assignment:" + d);
    //!SECTION[Operators]

    //SECTION[Bitwise-Operators] Bitwise Operators
    System.out.println("\nBitwise Operators:");

    int e = 5;
    e &= 3; //bitwise AND assignment
    System.out.println("Bitwise AND Assignment:" + e);

    int f = 5;
    f |= 3; //bitwise OR assignment
    System.out.println("Bitwise OR Assignment:" + f);

    int g = 5;
    g ^= 3; //bitwise XOR assignment
    System.out.println("Bitwise XOR Assignment:" + g);

    int h = 5;
    h >>= 3; //bitwise right shift assignment
    System.out.println("Bitwise Right Shift Assignment:" + h);

    int i = 5;
    i <<= 3; //bitwise left shift assignment
    System.out.println("Bitwise Left Shift Assignment:" + i);

    int j = 5;
    j >>>= 3; //bitwise right shift zero fill assignment
    System.out.println("Bitwise Right Shift Zero Fill Assignment:" + j);
    //!SECTION[Bitwise-Operators]

    //SECTION[Comparison-Operators] Comparison Operators
    System.out.println("\nComparison Operators:");
    int k = 5;
    int l = 3;
    System.out.println("Is k equal to l? " + (k == l)); //equal to
    System.out.println("Is k not equal to l? " + (k != l)); //not equal to
    //!SECTION[Comparison-Operators]

    //REVIEW - Coding Challenge
    System.out.println("\nCoding Challenge:");
    /*
    https://www.javatpoint.com/java-string-format

    Research: Using String.format
    within the above System.out.println statements to be able to
    print out a variable of type double with two decimal places.
    For example:  The balance in your account is:  $29.00
    */

    double savingsAccountBalance = 29.00;
    double depositAmount = 100.00;
    double withdrawalAmount = 50.00;
    double newSavingsAccountBalance = 0.00;

    newSavingsAccountBalance =
      newSavingsAccountBalance + depositAmount - withdrawalAmount;

    String myNewSavingsBalance = String.format(
      "This is my new balance: %s", //q. %s is the placeholder for a string
      newSavingsAccountBalance
    );

    System.out.println(myNewSavingsBalance);
    System.out.println(
      "Your current savings balance is: $" + savingsAccountBalance
    );
  }
}
