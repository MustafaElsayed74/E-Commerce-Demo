package com.shopping.base.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@MappedSuperclass
public class BaseEntity<ID extends Number> {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private ID id;

    private Integer statusCode;

    @Column(updatable = false)
    private LocalDate createdDate;

    @Column(updatable = false)
    private String createdUser;

    private LocalDate modifiedDate;

    private String modifiedUser;
}
