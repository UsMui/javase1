package mutipageS;

import java.time.LocalDate;

public class Student {
    public String name;
    public String code;
    public LocalDate birth;
    public Double mark;

    public Student() {
    }

    public Student(String name, String code, LocalDate birth, Double mark) {
        this.name = name;
        this.code = code;
        this.birth = birth;
        this.mark = mark;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public LocalDate getBirth() {
        return birth;
    }

    public void setBirth(LocalDate birth) {
        this.birth = birth;
    }

    public Double getMark() {
        return mark;
    }

    public void setMark(Double mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", code='" + code + '\'' +
                ", birth=" + birth +
                ", mark=" + mark +
                '}';
    }
    public String layTen(){
        String ten = name.trim();
        if(ten.indexOf(" ")>0){
            int vt = ten.lastIndexOf(" ");
            return ten.substring(vt+1);
        }
        return ten;
    }
}
