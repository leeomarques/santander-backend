package me.dio.santander_backend.service;


import me.dio.santander_backend.domain.model.User;

public interface UserService {

    User findById(Long id);

    User create(User userToCreate);
}
