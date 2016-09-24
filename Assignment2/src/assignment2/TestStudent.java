/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author DIEM NGUYEN HOANG
 */
public class TestStudent {

    /**
     * @param args the command line arguments
     */
    private static List<Student> lst;
    private static List<TAStudent> taLst;
    private static List<PhDStudent> phdLst;

    
    
    public static void main(String[] args) {
        // TODO code application logic here
        lst = new ArrayList();
        taLst = new ArrayList();
        phdLst = new ArrayList();
        
        /*
        Question 15: Create some pre-stored objects for using in the function
        */
        
        TAStudent taStd1 = new TAStudent("Simon", "66", 4, 22543133, "Male");
        TAStudent taStd2 = new TAStudent("Kelvin", "99", 4, 22543133, "Male");
        TAStudent taStd3 = new TAStudent("Emma", "34", 5, 12345678, "Female");
        TAStudent taStd4 = new TAStudent("Luke", "32", 3, 99006654, "Male");
        TAStudent taStd5 = new TAStudent("Gatsby", "40", 2, 32145734, "Male");
        taLst.add(taStd1);
        taLst.add(taStd2);
        taLst.add(taStd3);
        taLst.add(taStd4);
        taLst.add(taStd5);
        
        PhDStudent phdStd1 = new PhDStudent("Gatsby", "01", 2, 32145734, "Male");
        PhDStudent phdStd2 = new PhDStudent("Shasa", "02", 5, 32145734, "Female");
        PhDStudent phdStd3 = new PhDStudent("Harry", "03", 3, 32145756, "Male");
        PhDStudent phdStd4 = new PhDStudent("Mike", "04", 4, 32145778, "Male");
        PhDStudent phdStd5 = new PhDStudent("Eva", "04", 5, 32145334, "Female");
        PhDStudent phdStd6 = new PhDStudent("Tom", "03", 1, 32145794, "Male");
        PhDStudent phdStd7 = new PhDStudent("Fila", "02", 4, 32145789, "Male");
        PhDStudent phdStd8 = new PhDStudent("Peter", "10", 2, 32145713, "Male");
        phdLst.add(phdStd1);
        phdLst.add(phdStd2);
        phdLst.add(phdStd3);
        phdLst.add(phdStd4);
        phdLst.add(phdStd5);
        phdLst.add(phdStd6);
        phdLst.add(phdStd7);
        phdLst.add(phdStd8);
        
        
        printStudentList(args);
        
        
        Student std1 = new Student();
        Student std2 = new Student("Simon", "66", 4, 22543133, "Male");
        Student std3 = new Student("Laura", 2345, "Female");
        Student std4 = new Student();
        Student std5 = new Student("Natasha", "2", 1, 32539879, "Female");

        Student std6 = new Student("Natasha", "2", 1, 32539879, "Female");

        lst.add(std1);
        lst.add(std2);
        lst.add(std3);
        lst.add(std4);
        lst.add(std5);
        lst.add(std6);

        std1.setName("Jacob");
        std1.setGender("Male");
        std1.setGroup("1");
        std1.setProficiencyInJava(5);
        std1.setCprNumber(11255233);

        std3.setGroup("99");
        std3.setProficiencyInJava(4);

        std4.setName("Sean");
        std4.setGender("Male");
        std4.setGroup("88");
        std4.setProficiencyInJava(5);
        std4.setCprNumber(34232112);

        System.out.println(std1.getName() + "-" + std1.getGroup() + "-"
                + std1.getGender() + "-" + std1.getCprNumber() + "-"
                + std1.getproficiencyInJava());

        System.out.println(std2.getName() + "-" + std2.getGroup() + "-"
                + std2.getGender() + "-" + std2.getCprNumber() + "-"
                + std2.getproficiencyInJava());

        System.out.println(std3.getName() + "-" + std3.getGroup() + "-"
                + std3.getGender() + "-" + std3.getCprNumber() + "-"
                + std3.getproficiencyInJava());

        System.out.println(std4.getName() + "-" + std4.getGroup() + "-"
                + std4.getGender() + "-" + std4.getCprNumber() + "-"
                + std4.getproficiencyInJava());

        System.out.println(std5.getName() + "-" + std5.getGroup() + "-"
                + std5.getGender() + "-" + std5.getCprNumber() + "-"
                + std5.getproficiencyInJava());

        System.out.println("Test JavaProficiency std2 vs std3 "
                + std3.hasSameFluencyInJavaAs(std2));

        System.out.println("Test JavaProficiency std1 vs std3 "
                + std1.hasSameFluencyInJavaAs(std3));

        System.out.println("Test compareStudent std1 std2 "
                + std5.equals(std6));

        std1.storeGrade("a", 8.8f);
        std1.storeGrade("c", 8f);
        std1.storeGrade("b", 8.9f);
        std1.averageNote();

        Student ss = (Student) std1.clone();
        //Student ss = std1;
        //ss.setCprNumber(9999);
        System.out.println(ss.getName() + "-" + ss.getGroup() + "-"
                + ss.getGender() + "-" + ss.getCprNumber() + "-"
                + ss.getproficiencyInJava() + std1 + "-" + ss);

        System.out.println(std1.getName() + "-" + std1.getGroup() + "-"
                + std1.getGender() + "-" + std1.getCprNumber() + "-"
                + std1.getproficiencyInJava());

        Student std7 = new Student("ddd");
        System.out.println(std7.getName());
        studentsWithProficiency(5);//Test function studentsWithProficiency

    }

    /*
    Question 6: The method studentsWithProficiency should place outside the 
    class Student, for example here we can place it in TestStudent class. The 
    method will check on the List of Students.
     */
    public static void studentsWithProficiency(int proficiency) {
        for (int i = 0; i < lst.size(); i++) {
            if (lst.get(i).getproficiencyInJava() == proficiency) {
                System.out.println(lst.get(i).getName() + "-"
                        + lst.get(i).getGroup() + "-"
                        + lst.get(i).getGender() + "-"
                        + lst.get(i).getCprNumber() + "-"
                        + lst.get(i).getproficiencyInJava());
            }
        }
    }

    public static Student[] studentsWithProficiency1(int proficiency) {
        Student[] arrStd = new Student[lst.size()];
        int count = 0;

        for (int i = 0; i < lst.size(); i++) {
            if (lst.get(i).getproficiencyInJava() == proficiency) {
                arrStd[count++] = new Student(lst.get(i).getName(),
                        lst.get(i).getGroup(),
                        lst.get(i).getproficiencyInJava(),
                        lst.get(i).getCprNumber(),
                        lst.get(i).getGender());
            }
        }
        return arrStd;
    }
    
    /*
    Question 15
    I have assumed that the String argument will be passed when executing the
    program like: java TestStudent TA1 ST3 TA4 PHD6. So these argument will be
    stored in args array of method main(). We just read these arguments out from
    the String array args.
    */
    
    public static void printStudentList(String [] args){
        int position = 0;
        for(String s : args){
            if(s.contains("TA")){
                //Access ArraList which store TAStudents
                position = Integer.parseInt(s.substring(2));
                if(position > taLst.size() - 1){
                    System.out.println("Cannot find the TAStudent at position" +
                            position
                    );
                }
                System.out.println(taLst.get(position));
            }else if(s.contains("PHD")){
                //Access ArraList which store PHDStudents
                position = Integer.parseInt(s.substring(2));
                if(position > phdLst.size() - 1){
                    System.out.println("Cannot find the PHDStudent at position" +
                            position
                    );
                }
                System.out.println(phdLst.get(position));
            }else if (s.contains("ST")){
                //Access ArraList which store normal Students
                position = Integer.parseInt(s.substring(2));
                if(position > lst.size() - 1){
                    System.out.println("Cannot find the Student at position" +
                            position
                    );
                }
                System.out.println(lst.get(position));
            }else {
                System.out.println("Invalid argument !");
                break;
            }            
        }
    }

}

class Student implements Cloneable {

    private String name;
    private String group;
    private int proficiencyInJava;
    private int cprNumber;
    private String gender;

    private HashMap courseGrade;
    private static int studentCount = 0;

    public Student() {
        this.name = "";
        this.group = "";
        this.proficiencyInJava = 0;
        this.cprNumber = 0;
        this.gender = "";
        studentCount++;

        System.out.println("New Student added! There are a total of "
                + studentCount + " students");
    }

    public Student(String name) {
        name = name;
    }

    public Student(String name, int cprNumber,
            String gender) {
        this.name = name;
        this.cprNumber = cprNumber;
        this.gender = gender;
        studentCount++;
        System.out.println("New Student added! There are a total of "
                + studentCount + " students");
    }

    public Student(String name, String group, int proficiencyInJava,
            int cprNumber, String gender) {
        this.name = name;
        this.group = group;
        this.proficiencyInJava = proficiencyInJava;
        this.cprNumber = cprNumber;
        this.gender = gender;
        studentCount++;
        System.out.println("New Student added! There are a total of "
                + studentCount + " students");
    }

    public Object clone() {
        Student cloned = null;
        try {
            cloned = (Student) super.clone();
            cloned.courseGrade = new HashMap(courseGrade);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return cloned;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public void setProficiencyInJava(int proficiencyInJava) {
        this.proficiencyInJava = proficiencyInJava;
    }

    public void setCprNumber(int cprNumber) {
        this.cprNumber = cprNumber;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return this.name;
    }

    public String getGroup() {
        return this.group;
    }

    public int getCprNumber() {
        return this.cprNumber;
    }

    public int getproficiencyInJava() {
        return this.proficiencyInJava;
    }

    public String getGender() {
        return this.gender;
    }

    @Override
    public String toString() {
        return  name + " "
                + group + " "
                + cprNumber + " "
                + proficiencyInJava + " "
                + gender;
    }

    public boolean hasSameFluencyInJavaAs(Student anotherStudent) {
        return this.proficiencyInJava == anotherStudent.proficiencyInJava;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + Objects.hashCode(this.name);
        hash = 17 * hash + Objects.hashCode(this.group);
        hash = 17 * hash + this.proficiencyInJava;
        hash = 17 * hash + this.cprNumber;
        hash = 17 * hash + Objects.hashCode(this.gender);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Student)) {
            return false;
        }

        Student other = (Student) obj;
        return (this.name.compareTo(other.name) == 0)
                && (this.cprNumber == other.cprNumber)
                && (this.group.compareTo(other.group) == 0)
                && (this.gender.compareTo(other.gender) == 0)
                && (this.proficiencyInJava == other.proficiencyInJava);

    }

    public void storeGrade(String courseName, float courseGrade) {
        if (this.courseGrade == null) {
            this.courseGrade = new HashMap<String, Float>();
        }

        this.courseGrade.put(courseName, courseGrade);
    }

    public float averageNote() {
        float avg = 0.0f;
        for (Object obj : this.courseGrade.values()) {

            avg = avg + (float) obj;
        }
        float noOfCourse = (float) this.courseGrade.size();
        System.out.println(avg / noOfCourse);

        return 0;
    }

}

class PhDStudent extends Student { //class PhDStudent inherits from Student
    public PhDStudent(String name, String group, int proficiencyInJava,
            int cprNumber, String gender) {
        super(name, group, proficiencyInJava, cprNumber, gender);
    }
}

class TAStudent extends Student { //class TAStudent inherits from Student
    public TAStudent(String name, String group, int proficiencyInJava,
            int cprNumber, String gender) {
        super(name, group, proficiencyInJava, cprNumber, gender);
    }
}