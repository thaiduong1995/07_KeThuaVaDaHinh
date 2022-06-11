package bai1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Work {
    private String jobCode;
    private String jobName;

    public static ArrayList<Work> workList = new ArrayList<>(Arrays.asList(new Work[] {
            new Work("CV001", "Tiện"),
            new Work("CV002", "Hàn"),
            new Work("CV003", "Gò"),
            new Work("CV004", "Hàn"),
            new Work("CV005", "Mài")
    }));

    public Work(String jobCode, String jobName) {
        this.jobCode = jobCode;
        this.jobName = jobName;
    }

    public String getJobCode() {
        return jobCode;
    }

    public void setJobCode(String jobCode) {
        this.jobCode = jobCode;
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }
}
