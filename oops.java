class pen
{
    String color;
    String type;
    public void write()
    {
        System.out.println("Written");
    }
    public void print_color()
    {
        System.out.println(this.color);
    }
}

class Student
{
    String name;
    int age;

    public void print_info()
    {
        System.out.println(this.name);
        System.out.println(this.age);
    }
}

public class oops {
    public static void main(String[] args) {
        pen pen1 = new pen();
        pen1.color = "Blue";
        pen1.type = "gel";
        pen1.write();

        pen pen2 = new pen();
        pen2.color= "black";
        pen2.type = "ballpoint";

        pen1.print_color();
        pen2.print_color();

        Student s1 = new Student();
        s1.name = "Vivek Singh";
        s1.age = 19;

        s1.print_info();
    }
}
