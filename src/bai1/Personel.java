package bai1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Personel {
    public String personelCode;
    public String fullName;
    public LocalDate birthday;

    @Override
    public String toString() {
        return String.format("%-12s    %-30s    %-10s    ", personelCode, fullName,
                birthday.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
    }

    public Personel create(Scanner scanner) {
        System.out.print("Mã nhân sự: ");
        personelCode = scanner.nextLine();
        System.out.print("Họ tên: ");
        fullName = scanner.nextLine();
        System.out.print("Ngày sinh: ");
        birthday = LocalDate.parse(scanner.nextLine(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        return this;
    }

    public String getPersonelCode() {
        return personelCode;
    }

    public void setPersonelCode(String personelCode) {
        this.personelCode = personelCode;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public Personel() {
    }

    public Personel(String personelCode, String fullName, String birthday) {
        this.personelCode = personelCode;
        this.fullName = fullName;
        this.birthday = LocalDate.parse(birthday, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }
}

