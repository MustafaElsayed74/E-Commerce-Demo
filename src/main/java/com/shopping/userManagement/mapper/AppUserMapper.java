package com.shopping.userManagement.mapper;

import com.shopping.base.mapper.BaseMapper;
import com.shopping.userManagement.dto.AppUserDto;
import com.shopping.userManagement.entity.AppUser;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface AppUserMapper extends BaseMapper<AppUser, AppUserDto> {


}
