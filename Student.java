import java.util.ArrayList;

public class Student implements Cloneable {

    // -------------- PARAMTERS --------------

    private String firstName;
    private String lastName;
    private long studentID;
    Address address;
   private ArrayList<String> classes = new ArrayList<>();

// ------------------ CONSTRUCTOR------------------
    public Student(String firstName, String lastName, long studentID, Address address){
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentID = studentID;
        this.address = address;
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

public static void addClasses(ArrayList<String> list, String items){

}



}
