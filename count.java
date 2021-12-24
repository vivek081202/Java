import java.util.Scanner;
public class count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num=0,p=0,n=0,z=0;
            for(int i=0;i<10;i++)
            {
                System.out.println("Enter numbers: ");
                num = sc.nextInt();
            }
            if(num>0)
            {
                p++;
            }
            else if(num<0)
            {
                n++;
            }
            else if(num==0)
            {
                z++;
            }
        System.out.println("Positive: "+p);
        System.out.println("Negative: "+n);
        System.out.println("Zeros"+z);
        }
    }

