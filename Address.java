public class Address implements Cloneable{


// ----------- PARAMETERS -------------------

private String add1;
private String add2;
private String city;
private State state;
private String zipCode;

// --------------- CONSTRUCTOR --------------------

public Address(String add1, String add2, String city, State state, String zipCode){
    this.add1 = add1;
    this.add2 = add2;
    this.city = city;
    this.state = state;
    this.zipCode = zipCode;

}

// ------------------ CLONE -----------------------
 
public Address(Address other){
    this.add1 = other.add1;
    this.add2 = other.add2;
    this.city = other.city;
    this.state = other.state;
    this.zipCode = other.zipCode;

}

//@Override;
public Address clone(){
   return new Address(this);
}

// ----------------- GETTERS -----------------

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


//@Override;
public String toString(){
    return add1 + ", " + ", "+ add2 + ", " + city + ", " + state.getAbbr() + ", " + zipCode;
}














}