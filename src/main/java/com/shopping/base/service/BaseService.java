package com.shopping.base.service;

import com.shopping.base.entity.BaseEntity;
import com.shopping.base.repository.BaseRepository;
import jakarta.persistence.MappedSuperclass;
import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.Optional;

@MappedSuperclass
@RequiredArgsConstructor
public abstract class BaseService<T extends BaseEntity<ID>, ID extends Number> {
    private final BaseRepository<T,ID> baseRepository;

    public List<T> findAll(){
        return baseRepository.findAll();
    }

    public Optional<T> findById(ID id){
        return baseRepository.findById(id);
    }

    //Search local first , if not existed, search remote
    public T getOne(ID id){
        return baseRepository.getById(id);
    }

    public T update(T entity){
        return baseRepository.save(entity);
    }

    public T insert(T entity){
        return baseRepository.save(entity);
    }

    public void deleteById(ID id){
        baseRepository.deleteById(id);
    }
}
