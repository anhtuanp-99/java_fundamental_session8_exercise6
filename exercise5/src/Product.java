import java.util.Scanner;
public class Product {

    private int id;
    private String name;
    private double price;

    public static int AUTO_ID = 1;
    private final String WAREHOUSE_CODE = "KHO-01";

    public Product(){
        this.id = AUTO_ID;
        AUTO_ID++;
        this.name = "Chưa đặt tên";
        this.price = 0.0;
    }

    public Product(String name, double price){
        this.id = AUTO_ID;
        AUTO_ID++;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public static int getAutoId() {
        return AUTO_ID;
    }


    public String getWAREHOUSE_CODE() {
        return WAREHOUSE_CODE;
    }

    public void input(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Vui lòng nhập sản phẩm mới: ");
        this.name = scanner.nextLine();

        do {
            System.out.print("Nhập giá sản phẩm: ");
            this.price = scanner.nextDouble();
            if (this.price <= 0){
                System.out.println("Giá sản phẩm phải lớn hơn 0. Vui lòng nhập lại!");
            }
        } while (this.price <= 0);

    }

    public void print(){
        System.out.printf("ID: %d | Name: %s | Price: %.2f | Code: %s", this.id, this.name, this.price, this.WAREHOUSE_CODE);
    }

}
