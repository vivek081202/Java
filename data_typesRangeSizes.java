import java.sql.SQLOutput;

public class data_typesRangeSizes {
    public static void main(String[] args) {
        int i,i2;
        short s,s2;
        byte b,b2;
        long l,l2;
        double d,d2;
        float f,f2;
        i = Integer.MIN_VALUE;
        i2 = Integer.MAX_VALUE;
        s = Short.MIN_VALUE;
        s2 = Short.MAX_VALUE;
        b = Byte.MIN_VALUE;
        b2 = Byte.MAX_VALUE;
        l = Long.MIN_VALUE;
        l2 = Long.MAX_VALUE;
        d = Double.MIN_VALUE;
        d2 = Double.MAX_VALUE;
        f = Float.MIN_VALUE;
        f2 = Float.MAX_VALUE;

        System.out.println("--------Range of Data Types---------");
        System.out.println("Integer: "+i+" "+"to"+" "+i2);
        System.out.println("Short: "+s+" "+"to"+" "+s2);
        System.out.println("Byte: "+b+" "+"to"+" "+b2);
        System.out.println("Long: "+l+" "+"to"+" "+l2);
        System.out.println("Double: "+d+" "+"to"+" "+d2);
        System.out.println("Float: "+f+" "+"to"+" "+f2);
        System.out.println();

        i = Integer.SIZE/8;
        s = Short.SIZE/8;
        b = Byte.SIZE/8;
        l = Long.SIZE/8;
        d = Double.SIZE/8.0;
        f = Float.SIZE/8;

        System.out.println("--------Size of Data Types---------");
        System.out.println("Integer: "+i+" Bytes");
        System.out.println("Short: "+s+" Bytes");
        System.out.println("Byte: "+b+" Bytes");
        System.out.println("Long: "+l+" Bytes");
        System.out.println("Double: "+d+" Bytes");
        System.out.println("Float: "+f+" Bytes");
    }
}
