public class Main{

public static void main(String[] args){

    // address----------------------------

    Address add = new Address("342 Main St", "N/A", "Bothell", State.WA, "92012");

    // Student 1----------------------------------
    Student Ash = new Student("Ashmita", "Longia", 37893, add);
    Ash.addClasses("Art");
    Ash.addClasses("Chemistry");
    Ash.addClasses("PE");
    Ash.addClasses("English");

    // Student 2----------------------------
    Student eshuu = new Student(Ash);

    eshuu.setFirstName("Eshaal");
    eshuu.setStudentID(47389);
    
    try{
        eshuu.removeClasses("Art");

    } catch(ClassNotFoundException CNE){
        System.out.println(CNE.getMessage());
    }

    eshuu.addClasses("Band");

    // print students-------------------------

    System.out.println("Student 1: ");
    System.out.println(Ash);

    System.out.println();

    System.out.println("Student 2: ");
    System.out.println(eshuu);





}









}