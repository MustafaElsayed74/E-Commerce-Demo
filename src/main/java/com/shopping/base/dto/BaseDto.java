package com.shopping.base.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BaseDto<ID extends Number> {
    private ID id;
    private Integer statusCode;
}
