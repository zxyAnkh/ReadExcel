package cn.edu.zucc.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by zxy on 6/1/2016.
 */
public class Student {
    private String no;
    private String name;
    private Date startTime;
    private long time;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public List<Student> getStudents() {
        List<Student> list = new ArrayList<Student>();
        for (int i = 0; i < 4; i++) {
            Student student = new Student();
            student.setNo("3140000" + i);
            student.setName("Student" + i);
            student.setStartTime(new Date());
            student.setTime(900L + i);
            list.add(student);
        }
        return list;
    }
}
