public class Cylinder extends Circle {
    private double height = 1.0;

    // Constructor không tham số
    public Cylinder() {
        super();
    }

    // Constructor 1 tham số chiều cao
    public Cylinder(double height) {
        super();
        this.height = height;
    }

    // Constructor 2 tham số bán kính và chiều cao
    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    // Constructor 3 tham số bán kính, chiều cao và màu sắc
    public Cylinder(double radius, double height, String color) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    // Tính thể tích hình trụ dựa trên diện tích đáy kế thừa từ lớp cha
    public double getVolume() {
        return getArea() * height;
    }

    @Override
    public String toString() {
        return "Cylinder[" + super.toString() + ", height=" + height + ", volume=" + getVolume() + "]";
    }
}