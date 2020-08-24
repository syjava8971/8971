package javareview;

import javax.jws.soap.SOAPMessageHandlers;

public class Student {
    //---access specifier/access modifier---
    //---ตัวระบุการเข้าถึงตัวแปและเมทอล มี 4 ระดับ
    // private,public,package (default,protected)


    //--1.field,attribute,instance vairable---
    private int id;
    private String name;
    private double midtermScore;
    private double finalScore;

    //--2.constructor---
    // ถูกเรียกตอนสร้าง object ช่วยกำหนดค่าเริ่มต้นให้ field
    public Student(int id, String name){
        this.id =id;
        this.name =name;
    }

    //--3.method (คล้ายฟังก์ชัน)----
    double getTotalScore() {
        double total = midtermScore+finalScore;
        return total;
    }
    // getters
    public int getId(){
        return id;
            }
    public String getName(){
        return name;
    }
    // setters
    public void SetMidtermScore(double midtermScore){
        this.midtermScore = midtermScore;
    }
    public void SetFinalScore(double finalScore){
        this.finalScore = finalScore;
    }
}
