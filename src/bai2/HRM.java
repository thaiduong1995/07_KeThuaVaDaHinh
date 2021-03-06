package bai2;

import bai1.Work;
import bai1.WorkerList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class HRM {
    private ArrayList<Personel> personelList = new ArrayList<>();

    public HRM sortName() {
        Collections.sort(personelList, ((o1, o2) -> {
            String fullName1 = o1.getName().trim();
            String fullName2 = o2.getName().trim();
            String name1 = fullName1.substring(fullName1.lastIndexOf(" "), fullName1.length());
            String name2 = fullName2.substring(fullName2.lastIndexOf(" "), fullName2.length());
            return name1.compareToIgnoreCase(name2);
        }));
        return this;
    }

    public HRM sortWorkersEnd() {
        HRM clone = new HRM();
        for (int i = 0; i < personelList.size(); i++) {
            if (!(personelList.get(i) instanceof Worker)) {
                clone.getPersonelList().add(personelList.get(i));
            }
        }
        for (int i = 0; i < personelList.size(); i++) {
            if (personelList.get(i) instanceof Worker) {
                clone.getPersonelList().add(personelList.get(i));
            }
        }
        return clone;
    }

    public long totalWorkersSalary() {
        long total = 0;
        for (Personel personel :
                personelList) {
            if (personel instanceof Worker) {
                total += (personel).salary();
            }
        }
        return total;
    }

    public long totalCadresSalary() {
        long total = 0;
        for (Personel personel :
                personelList) {
            if (personel instanceof Cadres) {
                total += (personel).salary();
            }
        }
        return total;
    }

    public void lowestPaidWorkers() {
        long min = this.totalWorkersSalary();
        for (int i = 0; i < getPersonelList().size(); i++) {
            if (personelList.get(i) instanceof Worker) {
                if (min > (personelList.get(i)).salary()) {
                    min = (personelList.get(i)).salary();
                }
            }
        }
        System.out.println("Danh s??ch c??ng nh??n c?? l????ng th???p nh???t");
        System.out.println("STT    M?? nh??n s???    H??? t??n                            N??m sinh      Gi???i t??nh    " +
                "C??ng vi???c               V??? tr??                  L????ng");
        int index = 1;
        for (Personel personel :
                personelList) {
            if (personel instanceof Worker && ((Worker) personel).salary() == min) {
                System.out.printf("%3d    %s    ", index, personel);
                Worker worker = (Worker) personel;
                System.out.printf("%-20s    ", worker.getworkName());
                for (Factory factory :
                        Factory.factoryList) {
                    if (factory.getCode().equalsIgnoreCase(worker.getcodeFactory())) {
                        System.out.printf("%-20s    %,d\n", factory.getName(), worker.salary());
                        break;
                    }
                }
                index++;
            }
        }
    }

    public void highestPaidCadres() {
        long max = 0;
        for (int i = 0; i < getPersonelList().size(); i++) {
            if (personelList.get(i) instanceof Cadres) {
                if (max < (personelList.get(i)).salary()) {
                    max = (personelList.get(i)).salary();
                }
            }
        }
        System.out.println("Danh s??ch c??n b??? c?? l????ng cao nh???t");
        System.out.println("STT    M?? nh??n s???    H??? t??n                            N??m sinh      Gi???i t??nh    " +
                "C??ng vi???c               V??? tr??                  L????ng");
        int index = 1;
        for (Personel personel :
                personelList) {
            if (personel instanceof Cadres && ((Cadres) personel).salary() == max) {
                System.out.printf("%3d    %s    ", index, personel);
                Cadres cadres = (Cadres) personel;
                System.out.printf("%-20s    ", cadres.getPosition());
                for (Department department :
                        Department.departmentList) {
                    if (department.getCode().equalsIgnoreCase(cadres.getdepartmentCode())) {
                        System.out.printf("%-20s    %,d\n", department.getName(), cadres.salary());
                        break;
                    }
                }
                index++;
            }
        }
    }

    public void femaleOfficers() {
        System.out.println("Danh s??ch c??n b??? n???");
        System.out.println("STT    M?? nh??n s???    H??? t??n                            N??m sinh      Gi???i t??nh    " +
                "C??ng vi???c               V??? tr??                  L????ng");
        int index = 1;
        for (Personel personel :
                personelList) {
            if (personel instanceof Cadres && personel.getGender().equalsIgnoreCase("N???")) {
                System.out.printf("%3d    %s    ", index, personel);
                Cadres cadres = (Cadres) personel;
                System.out.printf("%-20s    ", cadres.getPosition());
                for (Department department :
                        Department.departmentList) {
                    if (department.getCode().equalsIgnoreCase(cadres.getdepartmentCode())) {
                        System.out.printf("%-20s    %,d\n", department.getName(), cadres.salary());
                        break;
                    }
                }
                index++;
            }
        }
    }

    public void maleWorkers() {
        System.out.println("Danh s??ch c??ng nh??n nam");
        System.out.println("STT    M?? nh??n s???    H??? t??n                            N??m sinh      Gi???i t??nh    " +
                "C??ng vi???c               V??? tr??                  L????ng");
        int index = 1;
        for (Personel personel :
                personelList) {
            if (personel instanceof Worker && personel.getGender().equalsIgnoreCase("Nam")) {
                System.out.printf("%3d    %s    ", index, personel);
                Worker worker = (Worker) personel;
                System.out.printf("%-20s    ", worker.getworkName());
                for (Factory factory :
                        Factory.factoryList) {
                    if (factory.getCode().equalsIgnoreCase(worker.getcodeFactory())) {
                        System.out.printf("%-20s    %,d\n", factory.getName(), worker.salary());
                        break;
                    }
                }
                index++;
            }
        }
    }

    @Override
    public String toString() {
        String result = "Danh s??ch nh??n s???\n";
        result += "STT    M?? nh??n s???    H??? t??n                            N??m sinh      Gi???i t??nh    C??ng vi???c" +
                "               V??? tr??                  L????ng\n";
        for (int i = 0; i < personelList.size(); i++) {
            result += String.format("%3d    %s    ", i + 1, personelList.get(i));
            if (personelList.get(i) instanceof Worker) {
                Worker worker = (Worker) personelList.get(i);
                result += String.format("%-20s    ", worker.getworkName());
                for (Factory factory :
                        Factory.factoryList) {
                    if (factory.getCode().equalsIgnoreCase(worker.getcodeFactory())) {
                        result += String.format("%-20s    %,d\n", factory.getName(), worker.salary());
                        break;
                    }
                }
            }
            if (personelList.get(i) instanceof Cadres) {
                Cadres cadres = (Cadres) personelList.get(i);
                result += String.format("%-20s    ", cadres.getPosition());
                for (Department department :
                        Department.departmentList) {
                    if (department.getCode().equalsIgnoreCase(cadres.getdepartmentCode())) {
                        result += String.format("%-20s    %,d\n", department.getName(), cadres.salary());
                        break;
                    }
                }
            }
        }
        return result;
    }

    public ArrayList<Personel> create(Scanner scanner) {
        for (int i = 0; i < 5; i++) {
            System.out.println("Nh???p th???ng tin cho nh??n vi??n th??? " + (i + 1));
            System.out.print("Lo???i nh??n vi??n: ");
            String typeEmployee = scanner.nextLine();
            if (typeEmployee.equalsIgnoreCase("c??n b???")) {
                personelList.add(new Cadres().create(scanner));
            }
            if (typeEmployee.equalsIgnoreCase("c??ng nh??n")) {
                personelList.add(new Worker().create(scanner));
            }
        }
        return personelList;
    }

    public ArrayList<Personel> getPersonelList() {
        return personelList;
    }

    public void setPersonelList(ArrayList<Personel> personelList) {
        this.personelList = personelList;
    }
}
