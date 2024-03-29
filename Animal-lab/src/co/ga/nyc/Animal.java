package co.ga.nyc;

public class Animal {
    private int numLegs;
    private int topSpeed;
    private boolean isEndangered;
    private String name;

    public int getNumLegs() {
        return numLegs;
    }

    public void setNumLegs(int numLegs) {
        this.numLegs = numLegs;
        return;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    public boolean isEndangered() {
        return isEndangered;
    }

    public void setEndangered(boolean endangered) {
        isEndangered = endangered;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        System.out.println("Method Sys Print: " + this.name + " can travel at a top speed of " + this.topSpeed + "mph.");
        return "Method Sys Print: " + this.name + " can travel at a top speed of " + this.topSpeed + "mph.";
    }

    public Animal(int numLegs, int topSpeed, boolean isEndangered, String name) {
        this.numLegs = numLegs;
        this.topSpeed = topSpeed;
        this.isEndangered = isEndangered;
        this.name = name;
    }
}
