package bai2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public abstract class Personel {
    private String code;
    private String name;
    private LocalDate birthday;
    private String gender;

    @Override
    public String toString() {
        return String.format("%-10s    %-30s    %-10s    %-9s", code, name,
                birthday.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")), gender);
    }

    public abstract long salary();

    public Personel create(Scanner scanner) {
        System.out.print("Mã nhân sự: ");
        code = scanner.nextLine();
        System.out.print("Họ tên: ");
        name = scanner.nextLine();
        System.out.print("Ngày sinh: ");
        birthday = LocalDate.parse(scanner.nextLine(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        System.out.print("Giới tính: ");
        gender = scanner.nextLine();
        return null;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Personel(String code, String name, String birthday, String gender) {
        this.code = code;
        this.name = name;
        this.birthday = LocalDate.parse(birthday, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        this.gender = gender;
    }

    public Personel() {
    }
}
