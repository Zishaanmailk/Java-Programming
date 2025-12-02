public class Cylinder {
    private double radius;
    private double height;

   
    public void setRadius(double r) {
        radius = r;
    }

    public void setHeight(double h) {
        height = h;
    }

    
    public double getRadius() {
        return radius;
    }

    public double getHeight() {
        return height;
    }

    
    public double surfaceArea() {
        return 2 * Math.PI * radius * (radius + height);
    }

    public double volume() {
        return Math.PI * radius * radius * height;
    }

    public static void main(String[] args) {
        Cylinder c = new Cylinder();

        c.setRadius(5);
        c.setHeight(10);

        System.out.println("Surface Area = " + c.surfaceArea());
        System.out.println("Volume = " + c.volume());
    }
}
