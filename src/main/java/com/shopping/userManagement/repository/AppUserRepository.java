package com.shopping.userManagement.repository;

import com.shopping.base.repository.BaseRepository;
import com.shopping.userManagement.entity.AppUser;
import org.springframework.stereotype.Repository;

@Repository
public interface AppUserRepository extends BaseRepository<AppUser, Long> {

}
