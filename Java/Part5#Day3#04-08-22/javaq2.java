// Q- Multi of Two Number input From User

import java.util.Scanner; // import the Scanner class 

public class javaq2 {

    public static void main(String args[]){
    Scanner myObj = new Scanner(System.in);


    System.out.println("Enter First Number ");
    int num1 = myObj.nextInt(); // num1 input

    System.out.println("Enter Secount Number ");
    int num2 = myObj.nextInt(); // num2 input

    double multi = num1 * num2; // multi: multi of a and b
    System.out.println(multi); 

    System.out.println("Thanks");

    }
    
}

