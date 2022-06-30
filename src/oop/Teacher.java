
package oop;

public class Teacher {
    
    String name, gender;
    int phone;
    
    void setInformation(String n, String g, int ph){
        name = n;
        gender = g;
        phone = ph;
    }
    
    void displayInformation (){
        
        System.out.println("Teacher's Name: " + name );
        System.out.println("Teacher's Gender: " + gender );
        System.out.println("Teacher's Phone Number: " + phone );
        
    }
}
