package bai2;

import bai1.WorkerList;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HRM personelList = new HRM();

        personelList.getPersonelList().add(
                new Worker("CN01", "Nguyễn Văn Quỳnh", "13/01/1991", "Nam", "X003", "Sửa chữa mày", 24.5F));
        personelList.getPersonelList().add(
                new Cadres("CB01", "Nguyễn Văn Hải", "13/11/1991", "Nam", "P001", "Nhân viên", 2.5F, "D"));
        personelList.getPersonelList().add(
                new Cadres("CB02", "Nguyễn Thị Mai", "14/10/1995", "Nữ", "P005", "Thư ký", 2.55F, "B"));
        personelList.getPersonelList().add(
                new Worker("CN03", "Trần Văn Bình", "10/01/1992", "Nam", "X004", "Thợ gia công", 25.0F));
        personelList.getPersonelList().add(
                new Cadres("CB03", "Nguyễn Thị Hằng", "24/05/2000", "Nữ", "P001", "Trưởng phòng", 4.55F, "C"));
        personelList.getPersonelList().add(
                new Cadres("CB04", "Trần Thị Thảo", "24/02/2001", "Nữ", "P003", "Kế toán", 3.0F, "A"));
        personelList.getPersonelList().add(
                new Worker("CN05", "Trần Văn Sơn", "19/12/1993", "Nam", "X001", "Kỹ sư", 20.0F));

        Scanner scanner = new Scanner(System.in);
        int opt;
        do {
            System.out.println("Chương trình:");
            System.out.println("1. Tạo danh sách nhân sự");
            System.out.println("2. Hiển thị danh sách nhân sự");
            System.out.println("3. Danh sách công nhân nam");
            System.out.println("4. Danh sách cán bộ nữ");
            System.out.println("5. Danh sách cán bộ có lương cao nhất");
            System.out.println("6. Danh sách công nhân có lương thấp nhất");
            System.out.println("7. Tổng lương của tất cả cán bộ");
            System.out.println("8. Tổng lương của tất cả công nhân");
            System.out.println("9. Danh sách cán bộ và công nhân");
            System.out.println("10. Danh sách nhân sự");
            System.out.println("0. Thoát");
            System.out.print("Nhập lựa chọn: ");
            opt = Integer.parseInt(scanner.nextLine());
            switch (opt) {
                case 1:
                    System.out.println("1. Tạo danh sách nhân sự");
                    personelList.create(scanner);
                    break;
                case 2:
                    System.out.println("2. Hiển thị danh sách nhân sự");
                    System.out.println(personelList);
                    break;
                case 3:
                    System.out.println("3. Danh sách công nhân nam");
                    personelList.maleWorkers();
                    break;
                case 4:
                    System.out.println("4. Danh sách cán bộ nữ");
                    personelList.femaleOfficers();
                    break;
                case 5:
                    System.out.println("5. Danh sách cán bộ có lương cao nhất");
                    personelList.highestPaidCadres();
                    break;
                case 6:
                    System.out.println("6. Danh sách công nhân có lương thấp nhất");
                    personelList.lowestPaidWorkers();
                    break;
                case 7:
                    System.out.printf("7. Tổng lương của tất cả cán bộ: %,d\n", personelList.totalCadresSalary());
                    break;
                case 8:
                    System.out.printf("8. Tổng lương của tất cả công nhân: %,d\n", personelList.totalWorkersSalary());
                    break;
                case 9:
                    System.out.println("9. Danh sách cán bộ và công nhân");
                    System.out.println(personelList.sortWorkersEnd());
                    break;
                case 10:
                    System.out.println("10. Danh sách nhân sự");
                    System.out.println(personelList.sortName());
            }
        } while (opt != 0);

    }

}
