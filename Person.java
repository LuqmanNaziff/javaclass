public class Person {
    private String name;
    private int age;
    private int YearStudy;
    private double CGPA1;
    private double CGPA2;
    private double CGPA3;


    public Person(String name, int age, int YearStudy, double CGPA1, double CGPA2, double CGPA3){
        this.name = name;
        this.age = age;
        this.YearStudy = YearStudy;
        this.CGPA1 = CGPA1;
        this.CGPA2 = CGPA2;
        this.CGPA3 = CGPA3;
    }
    //contructor
    public void displayDetails(){
        System.out.println("name is: " + name);
        System.out.println("The age is: " + age);
        System.out.println("Year of study: " + YearStudy);
        System.out.println("My GPA is: " + CGPA1);
        System.out.println("My GPA is: " + CGPA2);
        System.out.println("My GPA is: " + CGPA3);
        //System.out.println("Cumulative CGPA is: " + ((CGPA1 + CGPA2 + CGPA3)/3));
        System.out.println("Cumulative CGPA is: " + getCumulativeCGPA());
    }

    public double getCumulativeCGPA(){
        return (CGPA1 + CGPA2 + CGPA3)/3;
    }

    //object has no static. when given static, we give them value. Static, the absolute, the end, the output.
    public static void main(String[] args){
        Person person = new Person("Atok", 19, 2018, 3.4, 3.7, 4.0);
        //Person person2 = new Person("Ali", 33, 2001, 5.4);
        person.displayDetails();
        //person2.displayDetails();
        //call from constructor
    }
}
