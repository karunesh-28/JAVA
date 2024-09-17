public class Animal {
    // Instance variables
    private boolean vegetarian;
    private String food;
    private int numOfLegs;

    // Constructor
    public Animal(boolean vegetarian, String food, int numOfLegs) {
        this.vegetarian = vegetarian;
        this.food = food;
        this.numOfLegs = numOfLegs;
    }

    // Getter and Setter methods
    public boolean isVegetarian() {
        return vegetarian;
    }

    public void setVegetarian(boolean vegetarian) {
        this.vegetarian = vegetarian;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public int getNumOfLegs() {
        return numOfLegs;
    }

    public void setNumOfLegs(int numOfLegs) {
        this.numOfLegs = numOfLegs;
    }

    // A method to display information about the animal
    public void displayInfo() {
        System.out.println("Is vegetarian: " + vegetarian);
        System.out.println("Favorite food: " + food);
        System.out.println("Number of legs: " + numOfLegs);
    }

    // Main method for testing
    public static void main(String[] args) {
        Animal dog = new Animal(false, "Meat", 4);
        dog.displayInfo();
        
        Animal cow = new Animal(true, "Grass", 4);
        cow.displayInfo();
    }
}
