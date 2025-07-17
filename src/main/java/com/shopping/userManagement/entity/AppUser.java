package com.shopping.userManagement.entity;

import com.shopping.base.entity.BaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "sec_users")
public class AppUser extends BaseEntity<Long> {

    private String firstName;
    private String lastName;

}
