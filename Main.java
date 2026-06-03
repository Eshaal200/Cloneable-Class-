public class Main{

public static void main(String[] args){

    // address----------------------------
    // new address object, going to be used in student objects
    Address add = new Address("342 Main St", "N/A", "Bothell", State.WA, "92012");

    // this is a new student object. you can see add is passed
    // as a paramter of student
    // Student 1----------------------------------
    Student Ash = new Student("Ashmita", "Longia", 37893, add);
    // adding classes to arraylist
    Ash.addClasses("Art");
    Ash.addClasses("Chemistry");
    Ash.addClasses("PE");
    Ash.addClasses("English");
 
    // Student 2----------------------------
    // another student object with the same info as the first one
    Student eshaal = new Student(Ash);

    // except you change name and ID
    eshaal.setFirstName("Eshaal");
    eshaal.setStudentID(47389);
    
    // now eshaal does not take art she takes band
    // so we are using the removeClasses method to remove a class
    try{
        eshaal.removeClasses("Art");

        // but if the class is not found in eshaals class list
        // it throws the exception ClassNotFoundException
    } catch(ClassNotFoundException CNE){
        System.out.println(CNE.getMessage());
    }

    // we use the addClasses method to add a class to eshaals class list
    eshaal.addClasses("Band");

    // print students-------------------------

    // now printing objects to terminal

    System.out.println("Student 1: ");
    System.out.println(Ash);

    System.out.println();

    System.out.println("Student 2: ");
    System.out.println(eshaal);





}









}