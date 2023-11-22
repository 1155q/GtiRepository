package com.itheima.domain;
public class Brand {
    private int id;
    private String uname;
    private String paw;
    private String sex;
    private String email;

    public Brand(){

    }

    public Brand(int id, String uname, String paw, String sex, String email) {
        this.id = id;
        this.uname = uname;
        this.paw = paw;
        this.sex = sex;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getPaw() {
        return paw;
    }

    public void setPaw(String paw) {
        this.paw = paw;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public void save(){
        System.out.println("hello");
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", uname='" + uname + '\'' +
                ", paw='" + paw + '\'' +
                ", sex='" + sex + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}

