import java.util.*;
public class String_functions {
    public static void main(String[] args) {
        //concatenation
        String F_name = "Vivek";
        String L_name = "Singh";
        String sentence = "My name is vivek singh";
        String FULL_name = F_name +" "+ L_name;
        System.out.println(FULL_name);

        // Length()
        System.out.println(FULL_name.length());

        //char At print all single characters from string
        for(int i=0;i<FULL_name.length();i++)
        {
            System.out.println(FULL_name.charAt(i));
        }

        //comparison of two strings
        if(F_name.compareTo(L_name)==0)
        {
            System.out.println("String are Equal");
        }
        else {
            System.out.println("Strings are not equal");
        }
        // substrings
        // substring(beg index, end index);
        String output = sentence.substring(11,sentence.length());
        String output1 = sentence.substring(16);
        System.out.println(output);
        System.out.println(output1);
    }
}
