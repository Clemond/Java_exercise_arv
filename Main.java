public class Main{
    public static void main(String[] args) {

         // Skapa en parent-class som heter Animal, eller något annat som till exempel Fruit, någon basklass / parent-klassen som kan överföras till andra typer som är av typ Animal, Fruit.
         // I parent-klassen lägg till instansvariabler och metoder som är vanliga för ex Animal eller Fruit.
         // Skapa en child-klass typ Dog, eller Apple och låt den ärva parent-klassen.

         Animal animal1 = new Animal("Zebra");
         Animal animal2 = new Animal("Shark");

         Dog dog1 = new Dog("Tax");
         Dog dog2 = new Dog("Labrador");


        //----KÖR KOD-----//

        animal1.runs();
        animal2.runs();
        System.out.println(animal2.getType());

        dog2.runs();

        


    }
}