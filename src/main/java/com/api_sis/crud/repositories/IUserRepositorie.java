package com.api_sis.crud.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.api_sis.crud.models.UserModel;

public interface IUserRepositorie extends MongoRepository<UserModel, String> {

}
