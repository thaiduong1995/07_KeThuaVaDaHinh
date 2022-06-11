package bai1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        WorkerList workerList = new WorkerList();

        workerList.getWorkersList().add(
                new Worker("CN01", "Nguyễn Văn Quỳnh", "13/01/1991", "CV003", 2.45F, 28));
        workerList.getWorkersList().add(
                new Worker("CN02", "Nguyễn Văn Hải", "13/11/1991", "CV001", 2.5F, 0));
        workerList.getWorkersList().add(
                new Worker("CN03", "Nguyễn Thị Mai", "14/10/1995", "CV005",  2.55F, 20));
        workerList.getWorkersList().add(
                new Worker("CN04", "Trần Văn Bình", "10/01/1992", "CV004", 2.50F, 25));
        workerList.getWorkersList().add(
                new Worker("CN05", "Nguyễn Thị Hằng", "24/05/2000", "CV001", 4.55F, 0));
        workerList.getWorkersList().add(
                new Worker("CN06", "Trần Thị Thảo", "24/02/2001", "CV003", 3.00F, 23));
        workerList.getWorkersList().add(
                new Worker("CN07", "Trần Văn Sơn", "19/12/1993", "CV001", 20.0F, 0));

        Scanner scanner = new Scanner(System.in);
        int opt;
        do {
            System.out.println("Chương trình:");
            System.out.println("1. Tạo danh sách công nhân");
            System.out.println("2. Hiển thị danh sách công nhân");
            System.out.println("3. Danh sách công nhân có lương thấp hơn 5.000.000");
            System.out.println("4. Thêm 1 công nhân vào vị trí xác dịnh");
            System.out.println("5. Tổng lương của tất cả công nhân");
            System.out.println("6. Danh sách công nhân đi làm và không đi làm");
            System.out.println("7. Danh sách công nhân");
            System.out.println("0. Thoát");
            System.out.print("Nhập lựa chọn: ");
            opt = Integer.parseInt(scanner.nextLine());
            switch (opt) {
                case 1:
                    System.out.println("1. Tạo danh sách công nhân");
                    workerList.create();
                    break;
                case 2:
                    System.out.println("2. Hiển thị danh sách công nhân");
                    System.out.println(workerList);
                    break;
                case 3:
                    System.out.println("3. Danh sách công nhân có lương thấp hơn 5.000.000");
                    workerList.salaryWorkerLessFiveMillion();
                    break;
                case 4:
                    System.out.println("4. Thêm 1 công nhân vào vị trí xác dịnh");
                    System.out.print("Nhập vị trí muốn thêm: ");
                    workerList.add(Integer.parseInt(scanner.nextLine()));
                    break;
                case 5:
                    System.out.printf("4. Tổng lương của tất cả công nhân: %,d\n", workerList.totalSalary());
                    break;
                case 6:
                    System.out.println("6. Danh sách công nhân đi làm và không đi làm");
                    ArrayList<Worker> sort = workerList.sortDotWork();
                    workerList.setWorkersList(sort);
                    System.out.println(workerList);
                    break;
                case 7:
                    System.out.println("7. Danh sách công nhân");
                    System.out.println(workerList.sortName());
            }
        } while (opt != 0);

    }

}
