package com.api_sis.crud.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.api_sis.crud.models.UserModel;  // Import correcto
import com.api_sis.crud.repositories.IUserRepositorie;

@Service
public class UserService {

    private final IUserRepositorie userRepositorie;

    public UserService(IUserRepositorie userRepositorie) {
        this.userRepositorie = userRepositorie;
    }

    // Obtener todos los usuarios
    public List<UserModel> getAllUsers() {
        return userRepositorie.findAll(); // List<UserModel>
    }

    // Guardar un usuario
    public UserModel saveUser(UserModel user) {
        return userRepositorie.save(user);
    }

    // Eliminar un usuario por ID
    public void deleteUser(String id) {
        userRepositorie.deleteById(id);
    }

    // Actualizar un usuario
    public UserModel updateUser(String id, UserModel user) {
        user.setId(id); // Establecer el ID del usuario
        return userRepositorie.save(user);
    }
}
