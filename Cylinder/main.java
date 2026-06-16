public class main {

}

public class Main {
    public static void main(String[] args) {
        System.out.println("=== KIỂM THỬ LỚP CHA: CIRCLE ===");
        Circle c1 = new Circle();
        System.out.println("Mặc định: " + c1);

        Circle c2 = new Circle(3.5, "blue");
        System.out.println("Tùy biến: " + c2);
        System.out.println("Diện tích c2 thực tế: " + c2.getArea());

        System.out.println("\n=== KIỂM THỬ LỚP CON: CYLINDER ===");
        Cylinder cy1 = new Cylinder();
        System.out.println("Mặc định: " + cy1);

        Cylinder cy2 = new Cylinder(2.5, 6.0, "green");
        System.out.println("Tùy biến: " + cy2);
        System.out.println("Thể tích cy2 thực tế: " + cy2.getVolume());

        System.out.println("\n=== KIỂM TRA THAY ĐỔI THUỘC TÍNH (SETTER) ===");
        cy2.setRadius(4.0);
        cy2.setHeight(10.0);
        cy2.setColor("purple");
        System.out.println("Sau khi cập nhật lại dữ liệu cy2: " + cy2);
    }
}