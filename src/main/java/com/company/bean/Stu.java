package com.company.bean;

import com.google.gson.Gson;

public class Stu {
    private String name;
    private int age;

    public Stu(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Stu{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    /**
     * 把对象序列化成json字符串
     * @return
     */
    public String toJsonStr(){
        Gson gson = new Gson();
        return gson.toJson(this);
    }

    public Stu() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
