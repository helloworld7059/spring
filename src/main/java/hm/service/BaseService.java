package hm.service;

import hm.repository.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class BaseService<T> {

    @Autowired
    protected BaseRepository<T> repository;

    public void save(T t) {
        System.out.println("service: save an instance of " + t.getClass().getName());
        System.out.println(repository.getClass().getName());
        repository.save(t);
    }
}