package com.example.In.Abdul.Entity;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "Excel")
public class PDF {

    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private Integer age;
    private Long mobile;

}
