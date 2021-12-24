import java.util.Scanner;
public class HackerRank_TImeConversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String T = input.next();
        String spread_time[] = T.split(":"); // list used for spreading & splitting with (:)
        String H = spread_time[0];
        String M = spread_time[1];
        String S = spread_time[2].substring(0, 2);
        String test = spread_time[2].substring(2, 4);
        if(test.equals("AM"))
        {
            if(H.equals("12"))
                H="00";
            System.out.println(H+":"+M+":"+S);
        }
        else{
            if(!H.equals("12"))
            {
                int h = Integer.parseInt(H);
                h = h +12;
                H =""+h;
            }
            System.out.println(H+":"+M+":"+S);
        }
    }
}
