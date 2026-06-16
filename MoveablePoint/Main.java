package MoveablePoint; // Dòng 1: Khai báo package tương ứng với thư mục

public class Main {
    public static void main(String[] args) { // Dòng 2 (Hàm main)
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

        // Khởi tạo một điểm di động tùy biến
        MovablePoint mp2 = new MovablePoint(1.5f, 2.5f, 0.5f, 1.5f);
        System.out.println("Điểm mp2 trước khi di chuyển: " + mp2);

        // Thực hiện tịnh tiến điểm
        mp2.move();
        System.out.println("Điểm mp2 sau khi move(): " + mp2);
    }
}