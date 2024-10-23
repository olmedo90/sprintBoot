package com.api_sis.crud.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.NoArgsConstructor;

@Document(collection = "Users")  // Define la colección en MongoDB
@NoArgsConstructor  // Genera un constructor vacío con Lombok
public class UserModel {

    @Id
    private String id;  // Campo ID de usuario
    private String name;
    private String email;

    // Getters y Setters manuales (temporalmente)
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
