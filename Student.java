package com.student.manage;

public class Student {
    private int studentId;
    private String studentFullName; // Change name to studentFullName
    private long studentPhoneNumber; // Change phone to use long data type
    private String studentResidenceCity; // Change city to studentResidenceCity

    public Student(int studentId, String studentFullName, long studentPhoneNumber, String studentResidenceCity) {
        super();
        this.studentId = studentId;
        this.studentFullName = studentFullName;
        this.studentPhoneNumber = studentPhoneNumber;
        this.studentResidenceCity = studentResidenceCity;
    }

    public Student(String studentFullName, long studentPhoneNumber, String studentResidenceCity) {
        super();
        this.studentFullName = studentFullName;
        this.studentPhoneNumber = studentPhoneNumber;
        this.studentResidenceCity = studentResidenceCity;
    }

    public Student() {
        super();
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentFullName() {
        return studentFullName;
    }

    public void setStudentFullName(String studentFullName) {
        this.studentFullName = studentFullName;
    }

    public long getStudentPhoneNumber() {
        return studentPhoneNumber;
    }

    public void setStudentPhoneNumber(long studentPhoneNumber) {
        this.studentPhoneNumber = studentPhoneNumber;
    }

    public String getStudentResidenceCity() {
        return studentResidenceCity;
    }

    public void setStudentResidenceCity(String studentResidenceCity) {
        this.studentResidenceCity = studentResidenceCity;
    }

    @Override
    public String toString() {
        return "Student [studentId=" + studentId + ", studentFullName=" + studentFullName + ", studentPhoneNumber="
                + studentPhoneNumber + ", studentResidenceCity=" + studentResidenceCity + "]";
    }
}
