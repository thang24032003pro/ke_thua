public class Main {
    public static void main(String[] args) {
        System.out.println("=== TEST LỚP CHA: POINT ===");
        Point p1 = new Point();
        System.out.println("Điểm mặc định p1: " + p1);

        Point p2 = new Point(4.5f, 7.2f);
        System.out.println("Điểm tùy biến p2: " + p2);

        p2.setXY(10.0f, 20.0f);
        System.out.println("Điểm p2 sau khi setXY: " + p2);

        System.out.println("\n=== TEST LỚP CON: MOVABLEPOINT ===");
        MovablePoint mp1 = new MovablePoint();
        System.out.println("Điểm di động mặc định mp1: " + mp1);

        // Tạo điểm di động tại gốc (1.5, 2.5) với vận tốc di chuyển là (0.5, 1.5)
        MovablePoint mp2 = new MovablePoint(1.5f, 2.5f, 0.5f, 1.5f);
        System.out.println("Điểm mp2 trước khi di chuyển: " + mp2);

        // Kích hoạt di chuyển lần 1
        mp2.move();
        System.out.println("Điểm mp2 sau khi move() lần 1: " + mp2);

        // Thay đổi vận tốc và kích hoạt di chuyển lần 2
        mp2.setSpeed(2.0f, 3.0f);
        mp2.move();
        System.out.println("Điểm mp2 sau khi tăng tốc và move() lần 2: " + mp2);
    }
}