package com.example.pojo;

import lombok.Data;

import java.io.Serializable;

@Data
public class Person implements Serializable {
    private Integer id;
    private String name;
}
