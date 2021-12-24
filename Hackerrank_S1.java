/*
* Task
Given an integer, n, perform the following conditional actions:

If  is odd, print Weird
If  is even and in the inclusive range of  to , print Not Weird
If  is even and in the inclusive range of  to , print Weird
If  is even and greater than , print Not Weird
Complete the stub code provided in your editor to print whether n is weird.

Input Format

A single line containing a positive integer,n.

Constraints

Output Format

Print Weird if the number is weird; otherwise, print Not Weird.
*/
package programs_java;
import java.util.Scanner;
public class Hackerrank_S1 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    if(n%2!=0)
    {
        System.out.println("Weired");
    }
    else if(n%2==0 && (n>=2 && n<=5))
    {
        System.out.println("Not Weird");
    }
    else if(n%2==0 && (n>=6 && n<=20))
    {
        System.out.println("Weired");
    }
    else if(n%2==0 && n>20)
    {
        System.out.println("Not Weird");
    }
    }
}
