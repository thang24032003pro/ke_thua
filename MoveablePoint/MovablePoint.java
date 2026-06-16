public class MovablePoint extends Point {
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    // Constructor không tham số
    public MovablePoint() {
        super();
    }

    // Constructor khởi tạo vận tốc di chuyển
    public MovablePoint(float xSpeed, float ySpeed) {
        super();
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    // Constructor đầy đủ tham số: tọa độ gốc và vận tốc
    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y); // Đẩy tọa độ x, y lên lớp cha xử lý
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    // Cập nhật giá trị đồng thời cho cả xSpeed và ySpeed
    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    // Trả về một mảng chứa cả 2 giá trị vận tốc {xSpeed, ySpeed}
    public float[] getSpeed() {
        return new float[] { this.xSpeed, this.ySpeed };
    }

    // Tịnh tiến tọa độ điểm: x = x + xSpeed và y = y + ySpeed
    public MovablePoint move() {
        // Lấy tọa độ hiện tại ở lớp cha, cộng thêm vận tốc và cập nhật lại
        setX(getX() + xSpeed);
        setY(getY() + ySpeed);SS
        return this; // Trả về chính đối tượng hiện tại sau khi di chuyển
    }

    @Override
    public String toString() {
        // Kết hợp chuỗi tọa độ của lớp cha với thông tin vận tốc riêng biệt
        return super.toString() + ", speed = (" + xSpeed + ", " + ySpeed + ")";
    }
}