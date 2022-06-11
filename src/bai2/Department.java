package bai2;

import java.util.ArrayList;
import java.util.Arrays;

public class Department {
    private String code;
    private String name;
    private String headName;

    public static ArrayList<Department> departmentList = new ArrayList<>(Arrays.asList(new Department[] {
            new Department("P001", "Phòng dịch vụ", "Anh Mạnh"),
            new Department("P002", "Phòng truyền thông", "Anh Toàn"),
            new Department("P003", "Phòng nhân sự", "Chị Ngoan"),
            new Department("P004", "Phòng quảnh cáo", "Bác Dường"),
            new Department("P005", "Phòng chiến dịch", "Chị Hằng")
    }));

    public Department(String code, String name, String headName) {
        this.code = code;
        this.name = name;
        this.headName = headName;
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

    public String getHeadName() {
        return headName;
    }

    public void setHeadName(String headName) {
        this.headName = headName;
    }
}
