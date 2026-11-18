package ie.atu.oop.week1;
import java.util.HashSet;
import java.util.Scanner;
// using Scanner to read the inputs
public class Main {
    public static void main(String[] args) {


        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the workshsop name");
        String name1= scanner.nextLine();
        System.out.println("Enter the  workshop capacity");
        int capacity1= scanner.nextInt();
        System.out.println("Workshop Created");
        Workshop workshop1= new Workshop(name1, capacity1);// creatted and object
        System.out.println(workshop1.getname()+ " - Capacity: " + workshop1.getcapacity());// printinng out the created object
        scanner.close();
    }
}