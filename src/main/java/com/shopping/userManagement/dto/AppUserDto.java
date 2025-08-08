package com.shopping.userManagement.dto;

import com.shopping.base.dto.BaseDto;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AppUserDto extends BaseDto<Long> {
    private String firstName;
    private String lastName;
}
