package com.superbug.moi.cquptlife.model.bean;


import android.graphics.Bitmap;

import java.io.Serializable;

public class Student implements Serializable {
    private String studentId;
    private String studentName;
    private String studentSex;
    private String studentClass;
    private String studentMajor;
    private String studentGrade;
    private String studentFaculty;
    private Bitmap pic;

    public Student() {}

    public Student(String studentId, String studentName, String studentClass, String studentGrade,
                   String studentMajor, String studentSex, String studentFaculty) {
        this(studentId, studentName, studentClass, studentGrade, studentMajor, studentSex, studentFaculty, null);
    }

    public Student(String studentId, String studentName, String studentClass, String studentGrade,
                   String studentMajor, String studentSex, String studentFaculty, Bitmap pic) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentSex = studentSex;
        this.studentClass = studentClass;
        this.studentMajor = studentMajor;
        this.studentGrade = studentGrade;
        this.studentFaculty = studentFaculty;
        this.pic = pic;
    }

    public Bitmap getPic() {
        return pic;
    }

    public void setPic(Bitmap pic) {
        this.pic = pic;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentSex() {
        return studentSex;
    }

    public void setStudentSex(String studentSex) {
        this.studentSex = studentSex;
    }

    public String getStudentClass() {
        return studentClass;
    }

    public void setStudentClass(String studentClass) {
        this.studentClass = studentClass;
    }

    public String getStudentMajor() {
        return studentMajor;
    }

    public void setStudentMajor(String studentMajor) {
        this.studentMajor = studentMajor;
    }

    public String getStudentGrade() {
        return studentGrade;
    }

    public void setStudentGrade(String studentGrade) {
        this.studentGrade = studentGrade;
    }

    public String getStudentFaculty() {
        return studentFaculty;
    }

    public void setStudentFaculty(String studentFaculty) {
        this.studentFaculty = studentFaculty;
    }
}