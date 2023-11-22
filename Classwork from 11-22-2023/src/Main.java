public class Main {
    private double length;
    private double width;
    private double height;

    public Main(double length, double width, double height) {
        setLength(length);
        setWidth(width);
        setHeight(height);
    }

    private void setLength(double length) {
        if (length > 0) {
            this.length = length;
        } else {
            this.length = 1;
        }
    }

    private void setWidth(double width) {
        if (width > 0) {
            this.width = width;
        } else {
            this.width = 1;
        }
    }

    private void setHeight(double height) {
        if (height > 0) {
            this.height = height;
        } else {
            this.height = 1;
        }
    }

    public double calculateSurfaceArea() {
        return 2 * (length * width + length * height + width * height);
    }

    public double calculateLateralSurfaceArea() {
        return 2 * (length * height + width * height);
    }

    public double calculateVolume() {
        return length * width * height;
    }

    public static void main(String[] args) {
        // Example usage
        Main myBox = new Main(2, 3, 4);

        // Print the surface area, lateral surface area, and volume of the box
        System.out.println("Surface Area: " + myBox.calculateSurfaceArea());
        System.out.println("Lateral Surface Area: " + myBox.calculateLateralSurfaceArea());
        System.out.println("Volume: " + myBox.calculateVolume());
    }
}
