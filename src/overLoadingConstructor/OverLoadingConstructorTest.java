
package overLoadingConstructor;

public class OverLoadingConstructorTest {
    
    public static void main(String[] args) {
        
        Teacher teacher1 = new Teacher();
        System.out.println("-----------------");
        Teacher teacher2 = new Teacher("David", "male");
        teacher2.displayInformation();
        
        System.out.println("-----------------");
        Teacher teacher3 = new Teacher("Jennifer","female",7154527);
        teacher3.displayInformation();
    }   
}
