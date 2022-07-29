package com.dailycodebuffer.springrestapi.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(
        name = "tbl_students",
        uniqueConstraints = @UniqueConstraint(
                name = "email_unique",
                columnNames = "email_id"
        )
)
public class Student {

    @Id
    @SequenceGenerator(
            name = "student_sequence",
            sequenceName = "student_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "student_sequence"
    )
    private Long studentId;
    private String firstName;
    private String lastName;

    @Column(
            name = "email_id",
            nullable = false
    )
    private String emailId;

}
