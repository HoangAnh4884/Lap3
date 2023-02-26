/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lap3.Bai2on;

/**
 *
 * @author sonnlh
 */
public class Student {
    String stID;
    String stName;
    String stClass;

    public Student() {
    }
    
    public Student(String stID, String stName, String stClass) {
        this.stID = stID;
        this.stName = stName;
        this.stClass = stClass;
    }
    
    public Student(Student st) {
        this.stID = st.stID;
        this.stName = st.stName;
        this.stClass = st.stClass;
    }

    public String getStID() {
        return stID;
    }

    public void setStID(String stID) {
        this.stID = stID;
    }

    public String getStName() {
        return stName;
    }

    public void setStName(String stName) {
        this.stName = stName;
    }

    public String getStClass() {
        return stClass;
    }

    public void setStClass(String stClass) {
        this.stClass = stClass;
    }

    @Override
    public String toString() {
        return "Student{" + "stID=" + stID + ", stName=" + stName + ", stClass=" + stClass + '}';
    }
}
