class Geometry {
    
    // Method to calculate area of a square 
    public double calculateArea(double side) {
        return side * side;
    }

    // Method to calculate area of a circle
    public double calculateArea(double radius, boolean isCircle) {
        return Math.PI * radius * radius;
    }

    // Method to calculate area of a rectangle
    public double calculateArea(double length, double width) {
        return length * width;
    }

    public static void main(String[] args) {
        Geometry geometry = new Geometry();

        // Calculate area of a square
        double squareArea = geometry.calculateArea(5);
        System.out.println("Area of square: " + squareArea);

        // Calculate area of a circle
        double circleArea = geometry.calculateArea(7, true);
        System.out.println("Area of circle: " + circleArea);

        // Calculate area of a rectangle
        double rectangleArea = geometry.calculateArea(4, 6);
        System.out.println("Area of rectangle: " + rectangleArea);
    }
}