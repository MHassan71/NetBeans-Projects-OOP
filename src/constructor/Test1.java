
package constructor;

        
public class Test1 {
    
    public static void main(String[] args) {
        
        //Teacher teacher1;   // declare object 
        //teacher1 = new Teacher();   // create object
        
        Teacher1 teacher1 = new Teacher1("Ashok Das","Male", 917353203);
        System.out.println("Teacher1's info");
        teacher1.displayInformation();
        
        Teacher1 teacher2 = new Teacher1("Hema Malini", "Female", 91235303);
        System.out.println("Teacher2's info");
        teacher2.displayInformation();
    }
}
