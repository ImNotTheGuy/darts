package com.ludo.darts.api;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
public interface ControllerInterface<T> {

    //TODO: Controls on everything !
    
    // Create
    // public void create(@RequestBody T entity);

    // Read - all
    public List<T> findAll();

    // Read - one
    public T findById(@PathVariable("id") long id);

    // Update
    public void update(@RequestBody T entity, @PathVariable("id") long id);

    // Delete
    public void deleteById(@PathVariable("id") long id);

}
