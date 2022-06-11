package bai2;

import java.time.LocalDate;
import java.util.Scanner;

public class Cadres extends Personel {
    private String departmentCode;
    private String position;
    private float coefficientsSalary;
    private String classification;

    public Cadres(String code, String name, String birthday, String gender, String departmentCode, String position, float coefficientsSalary, String classification) {
        super(code, name, birthday, gender);
        this.departmentCode = departmentCode;
        this.position = position;
        this.coefficientsSalary = coefficientsSalary;
        this.classification = classification;
    }

    public Cadres() {
        super();
    }

    @Override
    public long salary() {
        long reult = 0;
        if (classification.equalsIgnoreCase("A")) {
            reult += coefficientsSalary * 1150000 + 1000000;
        } else if (classification.equalsIgnoreCase("B")) {
            reult += coefficientsSalary * 1150000;
        } else if (classification.equalsIgnoreCase("C")) {
            reult += coefficientsSalary * 1150000 - 400000;
        } else {
            reult += coefficientsSalary * 1150000 - 1000000;
        }
        return reult;
    }

    public Personel create(Scanner scanner) {
        super.create(scanner);
        System.out.print("Mã phòng: ");
        departmentCode = scanner.nextLine();
        System.out.print("Chức vụ: ");
        position = scanner.nextLine();
        System.out.print("Hệ số lương: ");
        coefficientsSalary = Float.parseFloat(scanner.nextLine());
        System.out.print("Xếp loại: ");
        classification = scanner.nextLine();
        return this;
    }

    public String getdepartmentCode() {
        return departmentCode;
    }

    public void setdepartmentCode(String departmentCode) {
        this.departmentCode = departmentCode;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public float getCoefficientsSalary() {
        return coefficientsSalary;
    }

    public void setCoefficientsSalary(float coefficientsSalary) {
        this.coefficientsSalary = coefficientsSalary;
    }

    public String getClassification() {
        return classification;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }
}
