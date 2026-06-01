import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        final int MAX_SIZE = 100;
        Product[] listProduct = new Product[MAX_SIZE];
        int count = 0; // biến đếm số lượng sản phẩm hiện tại đang có trong mảng

        Scanner scanner = new Scanner(System.in);
        int choice;

        do {

            printMenu();
            System.out.print("\nNhập lựa chọn của bạn: ");
            choice = Integer.parseInt(scanner.nextLine());

            switch (choice){
                case 1:
                    Product p = new Product();
                    p.input();
                    listProduct[count] = p;
                    count++;
                    break;

                case 2:
                    for (int i = 0; i < count; i++){
                        listProduct[i].print();
                        System.out.println();
                    }
                    break;


                case 3:
                    System.out.print("Nhập giá tối thiểu: ");
                    double min = Double.parseDouble(scanner.nextLine());
                    System.out.print("Nhập giá tối đa: ");
                    double max = Double.parseDouble(scanner.nextLine());

                    for (int i = 0; i < count; i++){
                        if (listProduct[i].getPrice() >= min && listProduct[i].getPrice() <= max){
                            listProduct[i].print();
                        }
                    }
                    break;


                case 4:
                    System.out.println(" Tổng số sản phẩm hiện có trong kho: " + count);
                    break;


                case 0:
                    System.out.println("Thoát chương trình!");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Lựa chọn không hợp lệ, vui lòng chọn từ 0 đến 4!");

            }
        } while (choice != 0);


    }

    public static void printMenu(){
        System.out.println("\n==== MENU ====");
        System.out.println("1. Thêm sản phẩm mới");
        System.out.println("2. In danh sách sản phẩm");
        System.out.println("3. Tìm sản phẩm theo khoảng giá");
        System.out.println("4. Thống kê số sản phẩm đã tạo");
        System.out.println("0. Thoát");
    }

}
