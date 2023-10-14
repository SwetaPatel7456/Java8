package Java8Features.Java8Features.Stream.Ref.cons;

public class consDemo {

    public static void main(String[] args) {
        consInterface consInterface = ()->{
            return new Student();
        };

        //but above implementation we can do with the help by referring constructor of student class
        consInterface consInterface1 = Student::new;

        Student student = consInterface1.getStudent();
        student.display();

    }
}
