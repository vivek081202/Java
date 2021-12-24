public class sum_function {
    public static int hi(int a,int b)
    {
        return a+b;
    }
    public static int mul(int a,int b)
    {
        return a*b;
    }
    public static void main(String[] args) {

        int x=6,y=7;
        System.out.println("Sum of two numbers is: "+ hi(x,y));
        System.out.println("Multiplication of two numbers is: " + mul(x,y));

    }
}
