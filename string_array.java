/*
* JAVA program to take an array of strings input from the user & find the cumulative(combined)
* length of all those strings*/
import java.util.*;
public class string_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i,len=0,size;
        String[] name = new String[5];
        System.out.println("Enter number of names to insert: ");
        size = sc.nextInt();
        System.out.println("Enter names: ");
        for (i=0;i<size;i++)
        {
            name[i] = sc.next();
           len = len + name[i].length();
        }
        System.out.println("Length is: "+len);
    }
}
