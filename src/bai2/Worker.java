package bai2;

import java.time.LocalDate;
import java.util.Scanner;

public class Worker extends Personel {
    private String codeFactory;
    private String workName;
    private float workDays;

    public Worker(String code, String name, String birthday, String gender, String codeFactory, String workName, float workDays) {
        super(code, name, birthday, gender);
        this.codeFactory = codeFactory;
        this.workName = workName;
        this.workDays = workDays;
    }

    public Worker() {
        super();
    }

    @Override
    public long salary() {
        long reult = 0;
        if (workDays >= 23) {
            reult += (long) workDays * 250000 + 500000;
        } else if (workDays >= 20) {
            reult += (long) workDays * 200000 + 300000;
        } else if (workDays >= 18) {
            reult += workDays * 250000;
        } else {
            reult += workDays * 250000 - 200000;
        }
        return reult;
    }

    public Personel create(Scanner scanner) {
        super.create(scanner);
        System.out.print("Mã xưởng: ");
        codeFactory = scanner.nextLine();
        System.out.print("Tên công việc: ");
        workName = scanner.nextLine();
        System.out.print("Số ngày công: ");
        workDays = Float.parseFloat(scanner.nextLine());
        return this;
    }

    public String getcodeFactory() {
        return codeFactory;
    }

    public void setcodeFactory(String codeFactory) {
        this.codeFactory = codeFactory;
    }

    public String getworkName() {
        return workName;
    }

    public void setworkName(String workName) {
        this.workName = workName;
    }

    public float getWorkDays() {
        return workDays;
    }

    public void setWorkDays(float workDays) {
        this.workDays = workDays;
    }


}
