import java.util.ArrayList;
// yay arraylists!!!!

public class Student implements Cloneable {

    // -------------- PARAMTERS --------------
    // paramters used for student
    // does take in the arrayList classes to add the classes
    // student objects needs
    private String firstName;
    private String lastName;
    private long studentID;
    Address address;
   private ArrayList<String> classes = new ArrayList<>();

// ------------------ CONSTRUCTOR------------------
// default constructor or parent constructor
    public Student(String f, String l, long ID, Address add){
        this.firstName = f;
        this.lastName = l;
        this.studentID = ID;
        this.address = add;
        
       
    }

    // -----------------COPY--------------------

// this is a copy constructor
// if I want another student with same information then
// this makes it easier to make that object
public Student(Student other){
    this.firstName = other.firstName;
    this.lastName = other.lastName;
    this.studentID = other.studentID;
    // makes a clone of address for student object
    try {
        this.address = other.address.clone();
    } catch (CloneNotSupportedException e) {
        System.out.println(e.getMessage());
        //e.printStackTrace();
        // VS did auto-gernerate this
        
    }
    this.classes = new ArrayList<>(other.classes);
    
}


    
    // ---------------GETTERS ------------------
    // just gets spesific information
    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public long getStudentID(){
        return studentID;
    }

    public Address getAddress(){
        return address;

    }

// ------------------ SETTERS ---------------------

// operator can set different values

public void setFirstName(String firstName){
    this.firstName = firstName;
}

public void setLastName(String lastName){
    this.lastName = lastName;
}

public void setStudentID(long studentID){
    this.studentID = studentID;
}


public void setAddress(Address address){
    this.address = address;
}


// ------------ METHODS ---------------

// the add classes method adds a class to the arraylist
public void addClasses (String classNames){
    classes.add(classNames);

}

// this removes any classes we dont need in a spesific student
// object in an arraylist
// although, it throws an exception if when traversing through the
// arraylist, if class not found, throws exception
public void removeClasses(String classNames) throws ClassNotFoundException{

    if(!classes.remove(classNames)){
        throw new ClassNotFoundException("class not found " + classNames);
    }


    }


    @Override 
  // override works here
    public Student clone () throws CloneNotSupportedException{
        return new Student(this);
    }

    @Override
// string printed into the terminal
    public String toString(){
        return " first name: " +  firstName + " last name: " + lastName + " address: " + address + " Student ID: " +  studentID + " Students classes: " + classes;
    }


}
