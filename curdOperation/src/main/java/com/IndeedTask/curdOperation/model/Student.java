package com.IndeedTask.curdOperation.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="studentId")
    private Long id;
    @Column(name="studentName")
    private String name;
    @Column(name="studentCity")
    private String city;
    @Column(name="studentEmail")
    private String email;
    @Column(name="studentPhoneNumber")
    private String phone;

}
