package com.api_sis.crud;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoDatabase;

@SpringBootApplication
public class CrudApplication implements CommandLineRunner {

    private final MongoClient mongoClient;

    // Inyección del cliente MongoDB a través del constructor
    public CrudApplication(MongoClient mongoClient) {
        this.mongoClient = mongoClient;
    }

    public static void main(String[] args) {
        SpringApplication.run(CrudApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        try {
            // Intentar acceder a una base de datos para verificar la conexión
            MongoDatabase database = mongoClient.getDatabase("test_db");
            database.listCollectionNames().first();  // Comprobar si hay colecciones disponibles

            System.out.println("🚀 Aplicación iniciada correctamente.");
            System.out.println("✅ Conexión exitosa con MongoDB.");
            System.out.println("🌐 La API está corriendo en http://localhost:3000");
        } catch (Exception e) {
            System.err.println("❌ No se pudo conectar a MongoDB: " + e.getMessage());
            // Puedes detener la aplicación si la conexión falla
            // System.exit(1);
        }
    }
}
