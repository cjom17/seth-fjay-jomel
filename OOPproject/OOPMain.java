
public class OOPMain {
    public static void main(String[] args) throws Exception {
        

        System.out.println("This is a program that showcase polymorphism, abstraction, inheritance and encapsulation");
        // instantiation
        

        Jewelries j = new Jewelries();     // instantiating sub class and accessing the methods from the super classs using this sub class
        
        
        
        j.cost(); // not overloaded
        j.cost(5000);
        j.importance();
        System.out.println("");
        j.getname("Diamond");

        j.setSpecificName("The Hope Diamond");
   
        System.out.println("This is the highest price jewelry is the " + j.getSpecificName());
        j.color();

        

      

        // getting the name of the certain accessory
        


    }
}
