public class Main {
    public static void main(String[] args) {
        System.out.println("=== TEST LỚP POINT2D ===");
        Point2D p2a = new Point2D();
        System.out.println("Tọa độ mặc định p2a: " + p2a);

        Point2D p2b = new Point2D(5.5f, 10.2f);
        System.out.println("Tọa độ khởi tạo p2b: " + p2b);

        // Thay đổi tọa độ bằng setXY
        p2b.setXY(1.2f, 3.4f);
        System.out.println("Tọa độ p2b sau khi setXY: " + p2b);

        // Kiểm tra phương thức getXY()
        float[] coords2D = p2b.getXY();
        System.out.println("Mảng getXY của p2b: [" + coords2D[0] + ", " + coords2D[1] + "]");

        System.out.println("\n=== TEST LỚP CON POINT3D ===");
        Point3D p3a = new Point3D();
        System.out.println("Tọa độ mặc định p3a: " + p3a);

        Point3D p3b = new Point3D(1.0f, 2.0f, 3.0f);
        System.out.println("Tọa độ khởi tạo p3b: " + p3b);

        // Thay đổi tọa độ bằng setXYZ
        p3b.setXYZ(7.8f, 8.9f, 9.1f);
        System.out.println("Tọa độ p3b sau khi setXYZ: " + p3b);

        // Kiểm tra phương thức getXYZ()
        float[] coords3D = p3b.getXYZ();
        System.out.println("Mảng getXYZ của p3b: [" + coords3D[0] + ", " + coords3D[1] + ", " + coords3D[2] + "]");
    }
}