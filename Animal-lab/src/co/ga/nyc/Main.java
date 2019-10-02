package co.ga.nyc;

public class Main {

    public static void main(String[] args) {

        //Instantiate new Animal
        Animal animal = new Animal(4, 37, false, "Chester" );

        String name;
        int topSpeed;

        //get name and speed values using getters
        name = animal.getName();
        topSpeed = animal.getTopSpeed();

        //Print some output

        System.out.println("Using getters: " + animal.getName() + " can travel at a top speed of " + animal.getTopSpeed() + "mph.");
        System.out.println("Using variables: " + name + " can travel at a top speed of " + topSpeed + "mph.");

        //Set new name, speed, and endangered properties values using setters

        animal.setName("Whoopi");
        animal.setTopSpeed(27);                 // under achiever
        animal.setEndangered(true);


        //get new values using getters
        name = animal.getName();
        topSpeed = animal.getTopSpeed();

        //Print some output

        System.out.println("Using getters: " + animal.getName() + " can travel at a top speed of " + animal.getTopSpeed() + "mph.");
        System.out.println("Using variables: " + name + " can travel at a top speed of " + topSpeed + "mph.");


    }
}
