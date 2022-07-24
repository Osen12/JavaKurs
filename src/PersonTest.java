public class PersonTest {
    public static void main(String[] args) {

        MathTeacher teacher = new MathTeacher("Tom",29, "University");
        teacher.walk();
        teacher.eat();
        teacher.teachMath();
        teacher.sayHello();

        System.out.println("");

        Footballer footballer = new Footballer("Mike", 21, "Wawerkowo");
        footballer.walk();
        footballer.eat();
        footballer.playFootball();

    }



}
