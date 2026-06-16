public class Point3D extends Point2D {
    private float z = 0.0f;

    // Constructor không tham số
    public Point3D() {
        super(); // Gọi constructor mặc định của Point2D
    }

    // Constructor đầy đủ tham số x, y, z
    public Point3D(float x, float y, float z) {
        super(x, y); // Đẩy x, y lên lớp cha Point2D xử lý
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    // Cập nhật đồng thời cả 3 tọa độ x, y, z
    public void setXYZ(float x, float y, float z) {
        setXY(x, y); // Gọi phương thức của lớp cha để cập nhật x, y
        this.z = z;
    }

    // Trả về một mảng chứa cả 3 tọa độ {x, y, z}
    public float[] getXYZ() {
        return new float[] { getX(), getY(), this.z };
    }

    @Override
    public String toString() {
        return "(" + getX() + ", " + getY() + ", " + z + ")";
    }
}