import java.util.ArrayList;

public class Student implements Cloneable {

    // -------------- PARAMTERS --------------

    private String firstName;
    private String lastName;
    private long studentID;
    Address address;
   private ArrayList<String> classes = new ArrayList<>();

// ------------------ CONSTRUCTOR------------------
    public Student(String f, String l, long ID, Address add){
        this.firstName = f;
        this.lastName = l;
        this.studentID = ID;
        this.address = add;
        
       
    }

    // -----------------COPY--------------------


public Student(Student other){
    this.firstName = other.firstName;
    this.lastName = other.lastName;
    this.studentID = other.studentID;
    this.address = other.address.clone();
    this.classes = new ArrayList<>(other.classes);
    
}





    
    // ---------------GETTERS ------------------

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


public void setFirstName(){
    this.firstName = firstName;
}

public void setLastName(){
    this.lastName = lastName;
}

public void setStudentID(){
    this.studentID = studentID;
}


public void setAddress(){
    this.address = address;
}


// ------------ METHODS ---------------

public void addClasses(String classNames){
    classes.add(classNames);

}

public void removeClasses(String classNames) throws ClassNotFoundException{

    if(!classes.remove(classNames)){
        throw new ClassNotFoundException("class not found " + classNames);
    }


    }


    //@Override

    public Student clone(){
        return new Student(this);
    }

// make this toString actually look nice later
    public String toString(){
        return "first name: " +  firstName + "last name: " + lastName + "address: " + address + "Student ID: " +  studentID + "Students classes: " + classes;
    }


}
