abstract class Order {
    private String id;

    public Order(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    // Phương thức abstract bắt buộc các lớp con phải ghi đè (Overriding)
    public abstract double calculateFee();

    // Overloading phiên bản 1: Chỉ nhận mã giảm giá
    public double applyVoucher(String code) {
        return 2000; 
    }

    // Overloading phiên bản 2: Nhận thêm phần trăm ưu đãi đặc quyền
    public double applyVoucher(String code, double extraDiscountPercentage) {
        return 2000 + (calculateFee() * (extraDiscountPercentage / 100));
    }
}

class StandardOrder extends Order {
    public StandardOrder(String id) {
        super(id);
    }

    @Override
    public double calculateFee() {
        return 15000; 
    }
}

class ExpressOrder extends Order {
    public ExpressOrder(String id) {
        super(id);
    }

    @Override
    public double calculateFee() {
        return 30000; 
    }
}

class InternationalOrder extends Order {
    public InternationalOrder(String id) {
        super(id);
    }

    @Override
    public double calculateFee() {
        return 150000; 
    }
}

public class FastDeliverySystem {
    public static void main(String[] args) {
        System.out.println("=== HỆ THỐNG MỚI: KIỂM TRA ĐA HÌNH ĐỘNG ===");

        Order[] orders = {
            new StandardOrder("STD_001"),
            new ExpressOrder("EXP_002"),
            new InternationalOrder("INT_003")
        };

        // Kích hoạt Dynamic Binding tại Runtime để gọi đúng hàm của lớp con
        for (Order o : orders) {
            System.out.println("Đơn hàng " + o.getId() + " | Cước phí: " + o.calculateFee() + " VND");
        }

        System.out.println("\n=== KIỂM TRA TÍNH NĂNG NẠP CHỒNG (OVERLOADING) ===");
        Order testOrder = new ExpressOrder("EXP_VIP");
        
        System.out.println("Voucher 1 tham số: " + testOrder.applyVoucher("FREESHIP") + " VND");
        System.out.println("Voucher 2 tham số: " + testOrder.applyVoucher("XMAS2026", 10) + " VND");
    }
}