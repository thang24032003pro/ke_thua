package Triangle;

public class Triangle extends Shape {
    private double side1 = 1.0;
    private double side2 = 1.0;
    private double side3 = 1.0;

    // Constructor không tham số tạo tam giác mặc định
    public Triangle() {
        super();
    }

    // Constructor khởi tạo 3 cạnh cho trước
    public Triangle(double side1, double side2, double side3) {
        super();
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    // Tính chu vi tam giác
    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    // Tính diện tích tam giác sử dụng công thức Heron
    public double getArea() {
        double p = getPerimeter() / 2; // Nửa chu vi
        return Math.sqrt(p * (p - side1) * (p - side2) * (p - side3));
    }

    @Override
    public String toString() {
        return "Triangle: side1 = " + side1 + ", side2 = " + side2 + ", side3 = " + side3
                + ", " + super.toString();
    }
}
