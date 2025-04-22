class Person {
    String name;
    public Person(String name) {
        this.name = name;
    }
    public void introduce() {
        System.out.println("Hi, my name is " + name + ".");
    }
}


class Student extends Person {
    public Student(String name) {
        super(name);  
    }

    public void study() {
        System.out.println(name + " is studying in BCA.");
    }
}

public class student {
    public static void main(String[] args) {
        Student student = new Student("ABCD");
        student.introduce();  
        student.study();     
    }
}

