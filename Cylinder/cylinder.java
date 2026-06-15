public class Cylinder extends Circle {
    private double height = 1.0;

    public Cylinder() {
        super(); // Gọi constructor mặc định của lớp cha
    }

    public Cylinder(double height) {
        super();
        this.height = height;
    }

    public Cylinder(double radius, double height) {
        super(radius); // Gọi constructor 1 tham số của lớp cha
    }

    public Cylinder(double radius, double height, String color) {
        super(radius, color); // Gọi constructor 2 tham số của lớp cha
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    // Tính thể tích hình trụ: Diện tích đáy * Chiều cao
    public double getVolume() {
        return getArea() * height; 
    }

    @Override
    public String toString() {
        // Tái sử dụng toString của lớp cha bằng từ khóa super
        return "Cylinder[" + super.toString() + ", height=" + height + ", volume=" + getVolume() + "]";
    }
}