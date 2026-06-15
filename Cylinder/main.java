public class Main {
    public static void main(String[] args) {
        System.out.println("=== KIỂM THỬ LỚP CIRCLE ===");
        Circle c1 = new Circle();
        System.out.println(c1);

        Circle c2 = new Circle(2.5, "blue");
        System.out.println(c2);
        System.out.println("Bán kính c2: " + c2.getRadius() + " | Diện tích c2: " + c2.getArea());

        System.out.println("\n=== KIỂM THỬ LỚP CYLINDER ===");
        Cylinder cy1 = new Cylinder();
        System.out.println(cy1);

        Cylinder cy2 = new Cylinder(3.0, 5.0, "yellow");
        System.out.println(cy2);
        System.out.println("Thể tích cy2: " + cy2.getVolume());
        
        // Thử nghiệm thay đổi thuộc tính qua Setter
        cy2.setRadius(2.0);
        cy2.setHeight(10.0);
        cy2.setColor("green");
        System.out.println("Sau khi cập nhật cy2: " + cy2);
    }
}
