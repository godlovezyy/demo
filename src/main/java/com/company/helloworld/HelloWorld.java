package com.company.helloworld;

import com.company.bean.Stu;
import com.company.utils.FileHelper;
import com.google.gson.Gson;

import java.util.List;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("xxxxxxx");
        Stu stu = new Stu();
        stu.setAge(10);
        stu.setName("xxx");

        Stu li = new Stu("li", 10);

        System.out.println(stu);

        //打印对象的json字符串
        System.out.println(stu.toJsonStr());

        String jsonStr = stu.toJsonStr();

        FileHelper.writeFile(jsonStr,"/Users/leebin/b.txt");

        //解析json字符串
        Gson gson = new Gson();
        Stu stu1 = gson.fromJson(jsonStr, Stu.class);
        System.out.println(stu1.getAge());

        List<String> lines = FileHelper.readFiles("/Users/leebin/a.txt");
        System.out.println(lines);



    }
}
