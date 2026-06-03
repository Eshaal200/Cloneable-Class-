public class ClassNotFoundException extends Exception {

   // this class is used to throw an exception if a class
   // is not found in a array list. 
   // it just prints the default message exception gives you (class)
    public ClassNotFoundException(String message){
        super(message);
    }
}
