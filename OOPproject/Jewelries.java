

public class Jewelries extends Accessories{ 
    private String name;
 

    public void commonComponents(){
        System.out.println("The metal types commonly used to make jewelry include Gold, Platinum, Palladium, Titanium, Silver, Tungsten and Stainless Steel.");
    }


    public  void cost(){ //overide the cost method from the super class
        System.out.println("The jewelries is gonna be one of the most expensive accessories");

    }
    public void setSpecificName(String jewelryName){ // setter
        name = jewelryName;
    }
    public String getSpecificName(){ // getter
        return name;
    }


    @Override
    public void color() { // implementing abstract method
        System.out.println("The color of The Hope diamond is Dark Greyish Blue");
        
    }
    
    
}


