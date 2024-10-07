public class Car {
    private String color;
    private double price;
    private char size;

    public static void main(String[] args) {
        Car car1 = new Car("red", 19999.85, 'M');
        Car car2 = new Car("blue", 50000.00, 'L');

        System.out.println(car1);
        System.out.println(car2);
    }

    public Car(String color, double price, char size) {
        this.color = color;
        this.price = price;
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public double getPrice() {
        return price;
    }

    public char getSize() {
        return size;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setSize(char size) {
        char upperSize = Character.toUpperCase(size);

        if (upperSize == 'S' || upperSize == 'M' || upperSize == 'L') {
            this.size = upperSize;
        } else {
            throw new IllegalArgumentException("Size must be 'S', 'M', or 'L'");
        }
    }

    public String toString() {
        String sizeDescriptor = switch (size) {
            case 'S' -> "small";
            case 'M' -> "medium";
            case 'L' -> "large";
            default -> "unknown";
        };

        return "Car (" + color + ") - P" + String.format("%.2f", price) + " - " + sizeDescriptor;
    }


}

