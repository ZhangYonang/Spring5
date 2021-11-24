package com.wuhu.spring5;

public class Teacher {
    private Integer tid;
    private String tname;

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "tid=" + tid +
                ", tname='" + tname + '\'' +
                '}';
    }
}
