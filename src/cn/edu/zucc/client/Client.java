package cn.edu.zucc.client;

import cn.edu.zucc.excel.ReadExcel;
import cn.edu.zucc.excel.WriteExcel;
import cn.edu.zucc.model.Student;

import java.io.IOException;
import java.util.List;

/**
 * Created by zxy on 6/1/2016.
 */
public class Client {
    private static final String path = "E:\\test\\";
    public static void main(String[] args) throws IOException {
        String xls = path+ "test.xls";
        String xlsx = path + "test.xlsx";
        // read the 2003-2007 excel
        List<Student> list = new ReadExcel().readExcel(xls);
        if (list != null) {
            for (Student student : list) {
                System.out.println("No: " + student.getNo() + ", name : " + student.getName());
            }
        }
        System.out.println("======================================");
        // read the 2010 excel
        List<Student> list1 = new ReadExcel().readExcel(xlsx);
        if (list1 != null) {
            for (Student student : list1) {
                System.out.println("No: " + student.getNo() + ", name : " + student.getName());
            }
        }
        WriteExcel writeExcel = new WriteExcel();
        Student student = new Student();
        writeExcel.createExcel(student.getStudents());
    }
}
