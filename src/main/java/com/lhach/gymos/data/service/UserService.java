package com.lhach.gymos.data.service;

import com.lhach.gymos.data.entity.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.vaadin.artur.helpers.CrudService;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Set;
import javax.persistence.ElementCollection;
import javax.persistence.FetchType;
import com.lhach.gymos.data.Role;
import javax.persistence.Lob;

@Service
public class UserService extends CrudService<User, Integer> {

    private UserRepository repository;

    public UserService(@Autowired UserRepository repository) {
        this.repository = repository;
    }

    @Override
    protected UserRepository getRepository() {
        return repository;
    }

}
