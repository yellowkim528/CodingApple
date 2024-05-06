package com.example.CodingApple;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
public class Test {
  private String name;
  private Integer age;
  public void 한살더하기(){
    this.age = this.age + 1;
  }
  public void 나이설정(Integer a){
    if (a > 0 && a < 100) {
      this.age = a;
    }
  }
}
