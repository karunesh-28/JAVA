class Box {
    double w, h, d;

    // Default constructor
    Box() {
        w = h = d = 0;
    }

    // Constructor with one parameter
    Box(double a) {
        w = h = d = a;
    }

    // Constructor with three parameters
    Box(double w, double h, double d) {
        this.w = w;
        this.h = h;
        this.d = d;
    }

    // Copy constructor
    Box(Box obj) {
        w = obj.w;
        h = obj.h;
        d = obj.d;
    }

    // Method to calculate volume
    double volume() {
        return w * h * d;
    }

    public static void main(String[] args) {
        // Creating six box objects using different constructors
        Box box1 = new Box();              // Using default constructor
        Box box2 = new Box(5);             // Using one-parameter constructor
        Box box3 = new Box(2, 3, 4);       // Using three-parameter constructor
        Box box4 = new Box(box3);          // Using copy constructor
        Box box5 = new Box(7, 8, 9);       // Using three-parameter constructor
        Box box6 = new Box(box2);          // Using copy constructor

        // Calculating and printing volumes of each box
        System.out.println("Volume of box1: " + box1.volume());
        System.out.println("Volume of box2: " + box2.volume());
        System.out.println("Volume of box3: " + box3.volume());
        System.out.println("Volume of box4: " + box4.volume());
        System.out.println("Volume of box5: " + box5.volume());
        System.out.println("Volume of box6: " + box6.volume());
    }
}