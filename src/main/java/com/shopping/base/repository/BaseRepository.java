package com.shopping.base.repository;

import com.shopping.base.entity.BaseEntity;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.query.Param;
import org.yaml.snakeyaml.events.Event;

@NoRepositoryBean //Not scanned, spring will scan the inheriting repos
public interface BaseRepository<T extends BaseEntity<ID>, ID extends Number> extends JpaRepository<T, ID> {


    @Modifying
    @Transactional
    @Query("update #{#entityName} t SET t.statusCode = :statusCode where t.id= :id")
    void updateStatus(@Param("id") Long id, @Param("statusCode") Integer status);

}
