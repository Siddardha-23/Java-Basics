class Student{

    //static variable which gets only allocated once in the heap memory and used by the object everytime
    static String college = "JNTUK";
    static String subject = "ECE";
    int id;
    String name;

    Student(int id,String name){
        this.id = id;
        this.name = name;
    }

    static void change(){
        subject = "CSE";
    }
    void display(){
        System.out.println(id + " " + name + " " + subject + " " + college);

    }
}

public class Static {

    //This static block everytime the main class is run
    static{
        System.out.println("Static block example which runs every time");
    }
    public static void main(String[] args) {

        // static method which belongs more to the class rather than the instance of the class
        //This static method can change the static variable too
        Student.change();
        Student s1 = new Student(1,"Harshith");
        Student s2 = new Student(2,"Siddu");
        s1.display();
        s2.display();

    }
}
