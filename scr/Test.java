public class Test {
    public static void main(String[] args) {
        Circle c1 = new Circle(5.0,"yellow");
        System.out.println(c1.getArea());
        System.out.println(c1);
        Cylinder c2 = new Cylinder(7.9, "green", 10.6);
        System.out.println(c2.getArea());
        System.out.println(c2.getVolume());
        System.out.println(c2);
    }
}
