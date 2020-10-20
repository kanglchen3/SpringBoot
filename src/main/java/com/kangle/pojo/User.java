package com.kangle.pojo;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

import java.util.Date;

@Data  //在编译的阶段会根据注解自动生成方法； Data就可以生成 get/set/hashCode/equals/toString等方法
//@Getter
//@Setter
//@Slf4j  //slf4j的日志功能，能自动在bean中提供log变量
public class User {

    private Long id;
    private String userName;
    private String password;
    private String name;
    private Integer age;
    private Integer sex;
    private String note;
    private Date birthday;
    private Date created;
    private Date updated;
}
