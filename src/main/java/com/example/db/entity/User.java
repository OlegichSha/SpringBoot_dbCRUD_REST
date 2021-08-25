package com.example.db.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "table_user")
public class User {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    private String name;

    private String email;
}
