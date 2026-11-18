package ie.atu.oop.week1;
import java.util.HashSet;
//this is the main class for workshop with private fields
public class Workshop {
    private String name;
    private int capacity;
    private HashSet<String>regids;//created a private HashSet string

//constructor for the class
public Workshop(String name, int capacity){
    this.name = name;
    this.capacity =capacity;
    this.regids = new HashSet<>();
}
    // using the getter method to get the name, and capacity from the private fields in class
    public String getname(){
    return name;
    }
    public int getcapacity(){
        return capacity;
    }
}
