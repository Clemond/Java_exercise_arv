public class Animal {


    //instansvariabler
    private String type;
    String color;
    int weight;
    
    //Setter för type
    public Animal(String type){
        this.type = type;
    }
    //Getter fr type
    public String getType(){
        return this.type;
    }
    //Metod för att skriva ut att djur-typen springer
    public void runs(){
        System.out.println("the " + type + " is running" );
    }
}
