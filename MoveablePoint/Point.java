public class Point {
    private float x = 0.0f;
    private float y = 0.0f;

    // Constructor không tham số
    public Point() {
    }

    // Constructor khởi tạo tọa độ x và y
    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    // Cập nhật giá trị đồng thời cho cả x và y
    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    // Trả về một mảng gồm 2 phần tử chứa tọa độ {x, y}
    public float[] getXY() {
        return new float[] { this.x, this.y };
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}