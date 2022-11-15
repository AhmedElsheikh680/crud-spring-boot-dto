package com.spring.service;

import com.spring.model.BaseEntity;
import com.spring.model.Player;
import com.spring.repo.BaseRepo;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.MappedSuperclass;
import java.util.List;
import java.util.Optional;

@MappedSuperclass
public class BaseService<T extends BaseEntity<ID>, ID extends Number> {

    @Autowired
    private BaseRepo<T, ID> baseRepo;

    public T findById(ID id) {
        return baseRepo.findById(id).orElseThrow(()->  new RuntimeException("this Player not found :- " + id ));
//        if (entity.isPresent()){
//            return entity.get();
//        } else {
//            throw new
//        }
    }

    public List<T> findAll(){
        return baseRepo.findAll();
    }

    public T save(T t){
//        if (t.getId() !=null){
//            throw new RuntimeException();
//        }
        return baseRepo.save(t);
    }

    public T update(T t)  {

        return baseRepo.save(t);
    }

    public void delete(ID id){
         baseRepo.deleteById(id);
    }
}
