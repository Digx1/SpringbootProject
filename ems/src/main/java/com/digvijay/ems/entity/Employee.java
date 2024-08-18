package com.digvijay.ems.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="employees")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name ="First_Name")
    private String firstName;
    @Column(name ="last_Name")
    private String lastname;
    @Column(name ="email_Id" ,nullable=false,unique = true)
    private String email;
}
