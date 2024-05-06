package com.example.CodingApple;

public class Test1 {
  public static void main(String[] args) {
    var object = new Test();
    object.setAge(30);
    object.setName("홍길동");
    System.out.println(object.getAge());
    System.out.println(object.getName());

    object.한살더하기();
    object.나이설정(12);
  }
}
