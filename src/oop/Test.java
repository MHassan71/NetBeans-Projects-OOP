
package oop;

public class Test {
    
    public static void main(String[] args) {
        
        //Teacher teacher1;   // declare object 
        //teacher1 = new Teacher();   // create object
        
        Teacher teacher1 = new Teacher();
        System.out.println("Teacher1's info");
        teacher1.setInformation("Ashok Das", "Male", 917353203);
        teacher1.displayInformation();
        
        System.out.println();
        
        Teacher teacher2 = new Teacher();
        System.out.println("Teacher2's info");
        teacher2.setInformation("Hema Malini", "Female", 91235303);
        teacher2.displayInformation();
    }
    
}
