
package constructor;

public class Teacher1 {
    
    String name, gender;
    int phone;
    
    Teacher1(String n, String g, int ph){ // This constractor
        name = n;
        gender = g;
        phone = ph;
    }
    
    void displayInformation (){
        
        System.out.println("Teacher's Name: " + name );
        System.out.println("Teacher's Gender: " + gender );
        System.out.println("Teacher's Phone Number: " + phone );
        
        System.out.println("\n");
    }
}
