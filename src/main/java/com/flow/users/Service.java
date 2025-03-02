package com.flow.users;

import com.flow.users.entity.FlowUser;
import com.flow.users.entity.FlowUser;

import java.util.List;
import java.util.Optional;

@org.springframework.stereotype.Service
public class Service {

    private final UserRepository repository;

    public Service(UserRepository repository) {
        this.repository = repository;
    }

    public Optional<FlowUser> getUserById(Long userId) {
        return repository.findById(userId);
    }

    public FlowUser create(String userName) {
        var user = new FlowUser();
        user.setName(userName);
        return repository.save(user);
    }

    public List<FlowUser> getUsersByName(String name) {
        return repository.findByName(name);
    }

}
