public abstract class Accessories{

    String name;
    int Cost;
    public abstract void color();
   

    // this is for the properties of the accessorries
    public void cost(){
        System.out.println("Most of the accessories are expensive.");
    }
    // overload one of the method
    public void cost(Integer AccessoriesCost){
        Cost = AccessoriesCost;
        System.out.println(AccessoriesCost);
    }
    public void importance(){
        System.out.println("Accessories give more importance to your personal style, taste, and preferences.");

    }

    public void getname(String AccessoryName){ // getter of the class
        name = AccessoryName;
        System.out.println(AccessoryName);
    }
    


}


