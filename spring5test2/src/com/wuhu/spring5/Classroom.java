package com.wuhu.spring5;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Classroom {
    private Integer cid;
    private String cname;
    private Teacher teacher;
    private List<String> classList;
    private Set<Student> studentSet;

    @Override
    public String toString() {
        return "Classroom{" +
                "cid=" + cid +
                ", cname='" + cname + '\'' +
                ", teacher=" + teacher +
                ", classList=" + classList +
                ", studentSet=" + studentSet +
                '}';
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public void setClassList(List<String> classList) {
        this.classList = classList;
    }

    public void setStudentSet(Set<Student> studentSet) {
        this.studentSet = studentSet;
    }
}
