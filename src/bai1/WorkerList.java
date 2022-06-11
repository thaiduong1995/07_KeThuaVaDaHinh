package bai1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WorkerList {
    private ArrayList<Worker> workersList = new ArrayList<>();

    public WorkerList sortName() {
        Collections.sort(workersList, (o1, o2) -> {
            String fullName1 = o1.getFullName().trim();
            String fullName2 = o2.getFullName().trim();
            String name1 = fullName1.substring(fullName1.lastIndexOf(" "), fullName1.length());
            String name2 = fullName2.substring(fullName2.lastIndexOf(" "), fullName2.length());
            return name1.compareToIgnoreCase(name2);
        });
        return this;
    }

    public ArrayList<Worker> sortDotWork() {
        ArrayList<Worker> clone = new ArrayList<>(Collections.nCopies(workersList.size(), null));
        int indexStart = 0;
        int indexEnd = workersList.size() - 1;
        for (int i = 0; i < workersList.size(); i++) {
            if (workersList.get(i).getWorkDays() > 0) {
                clone.set(indexStart, workersList.get(i));
                indexStart++;
            } else  {
                clone.set(indexEnd, workersList.get(i));
                indexEnd--;
            }
        }
        return clone;
    }

    public long totalSalary() {
        long result = 0;
        for (Worker worker :
                workersList) {
            result += worker.salary();
        }
        return result;
    }

    public void add(int index) {
        if (index < 0 || index > workersList.size()) {
            System.out.println("Không thêm được");
        } else {
            System.out.println("Thêm thành công");
            workersList.add(index, new Worker().create(new Scanner(System.in)));
        }
    }

    public void salaryWorkerLessFiveMillion() {
        System.out.println("Danh sách công nhân có lương thấp hơn 5 triệu: ");
        System.out.println("STT    Mã công nhân    Họ tên                            Ngày sinh     Tên công việc" +
                "           Bậc lương    Số ngày công    Lương");
        for (int i = 0; i < workersList.size(); i++) {
            if (workersList.get(i).salary() < 5000000) {
                System.out.printf("%3d    %s\n", i + 1, workersList.get(i));
            }
        }
    }

    @Override
    public String toString() {
        String result = "Danh sách công nhân\n";
        result += "STT    Mã công nhân    Họ tên                            Ngày sinh     Tên công việc           " +
                "Bậc lương    Số ngày công    Lương\n";
        for (int i = 0; i < workersList.size(); i++) {
            result += String.format("%3d    %s\n",i + 1, workersList.get(i));
        }
        result += String.format("Tổng lương theo danh sách: %,d", this.totalSalary());
        return result;
    }

    public ArrayList<Worker> create() {
        for (int i = 0; i < 4; i++) {
            System.out.println("Nhập thông tin công nhân thứ " + (i + 1));
            workersList.add(new Worker().create(new Scanner(System.in)));
        }
        return workersList;
    }

    public ArrayList<Worker> getWorkersList() {
        return workersList;
    }

    public void setWorkersList(ArrayList<Worker> workersList) {
        this.workersList = workersList;
    }
}
