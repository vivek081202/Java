class student
{
    String name;
    int age;

    public void print_info()
    {
        System.out.println(this.name);
        System.out.println(this.age);
    }
//    student()
//    {
//        System.out.println("Constructor called");
//    }
    student(String name,int age)
    {
        this.name = name;
        this.age = age;
    }
}

public class constructors {
    public static void main(String[] args) {
        student s1 = new student("vivek",19);
//        s1.name = "Vivek Singh";
//        s1.age = 19;

        s1.print_info();
    }
}
