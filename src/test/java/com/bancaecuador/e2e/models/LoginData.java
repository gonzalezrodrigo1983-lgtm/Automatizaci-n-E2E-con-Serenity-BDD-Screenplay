package com.bancaecuador.e2e.models;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

public final class LoginData {
    private static final String DATA_FILE = "/data/login-users.json";
    private static final Map<String, LoginUser> USERS = loadUsers();
    private LoginData() {}
    public static LoginUser profile(String profileName) {
        LoginUser user = USERS.get(profileName);
        if (user == null) throw new IllegalArgumentException("No existe el perfil de prueba: " + profileName);
        return user;
    }
    private static Map<String, LoginUser> loadUsers() {
        try (InputStream stream = LoginData.class.getResourceAsStream(DATA_FILE)) {
            if (stream == null) throw new IllegalStateException("No se encontró el archivo de datos: " + DATA_FILE);
            return new ObjectMapper().readValue(stream, new TypeReference<Map<String, LoginUser>>() {});
        } catch (IOException e) { throw new IllegalStateException("No fue posible cargar los datos de login", e); }
    }
}
