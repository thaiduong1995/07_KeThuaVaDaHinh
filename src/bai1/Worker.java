package bai1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Worker extends Personel{
    private String jobCode;
    private float wage;
    private int workDays;

    @Override
    public String toString() {
        String result = super.toString();
        String jobName = "";
        for (Work work :
                Work.workList) {
            if (jobCode.equalsIgnoreCase(work.getJobCode())) {
                jobName += work.getJobName();
                break;
            }
        }
        result += String.format("%-20s    %9.2f    %12d    %,d", jobName, wage, workDays, salary());
        return result;
    }

    public long salary() {
        return (long) workDays * 60000 + (long) wage * 3500000 ;
    }

    public Worker create(Scanner scanner) {
        super.create(scanner);
        System.out.print("Mã công việc: ");
        jobCode = scanner.nextLine();
        System.out.print("Bậc lương: ");
        wage = Float.parseFloat(scanner.nextLine());
        System.out.print("Số ngày công: ");
        workDays = Integer.parseInt(scanner.nextLine());
        return this;
    }

    public String getJobCode() {
        return jobCode;
    }

    public void setJobCode(String jobCode) {
        this.jobCode = jobCode;
    }

    public float getWage() {
        return wage;
    }

    public void setWage(float wage) {
        this.wage = wage;
    }

    public int getWorkDays() {
        return workDays;
    }

    public void setWorkDays(int workDays) {
        this.workDays = workDays;
    }

    public Worker() {
    }

    public Worker(String personelCode, String fullName, String birthday, String jobCode, float wage, int workDays) {
        super(personelCode, fullName, birthday);
        this.jobCode = jobCode;
        this.wage = wage;
        this.workDays = workDays;
    }
}
