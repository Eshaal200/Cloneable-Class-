public class Address implements Cloneable{

// ----------- PARAMETERS -------------------

// these are the parameters used for the cloneable class address
// the address class takes in a enum as a parameter. It takes in the enum States.

private String add1;
private String add2;
private String city;
private State state;
private String zipCode;

// --------------- CONSTRUCTOR --------------------

// constructor for the class address (its like a parent constructor)

public Address(String add1, String add2, String city, State state, String zipCode){
    this.add1 = add1;
    this.add2 = add2;
    this.city = city;
    this.state = state;
    this.zipCode = zipCode;

}

// ------------------ CLONE -----------------------
 
// this is a clone of the constructor address
// the use for this is that we can pass this as a paramter in a
// student object. 
public Address(Address other){
    this.add1 = other.add1;
    this.add2 = other.add2;
    this.city = other.city;
    this.state = other.state;
    this.zipCode = other.zipCode;

}

//@Override; - for some reason Override is not working would
// like feedback on that

// returns a clone of address
// basically makes it easier to use in main imagine having 
// to pass every single parameter address has into student 
// that would be a long object
// also when you want to make a copy of that student object this 
// makes it easier to copy over to the second student object
public Address clone() throws CloneNotSupportedException{
   return new Address(this);
}

// ----------------- GETTERS -----------------

// these are used to get spesific paramters in main

public String getAdd1(){
    return add1;
}

public String getAdd2(){
    return add2;
}

public String getCity(){
    return city;
}

public State getState(){
    return state;
}

public String getZipCode(){
    return zipCode;
}


// ------------------SETTERS-----------------

// these are used to set spesific parameters in main
// change the object value 

public void setAdd1(String add1){
    this.add1 = add1;
}

public void setAdd2(String add2){
    this.add2 = add2;
}

public void setCity(String city){
    this.city = city;
}

public void setState(State state){
    this.state = state;
}

public void setZipCode(String zipCode){
    this.zipCode = zipCode;
}


// --------------TOSTRING---------------


// string printed in terminal 
// formats the object into a coherent sentance.
//@Override;
// okay override for some reason just doesnt work here

public String toString(){
    return add1 + ", " + add2 + ", " + city + ", " + state + ", " + zipCode;
}














}