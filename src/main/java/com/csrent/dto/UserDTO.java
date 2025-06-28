package com.csrent.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

//NO FUNCIONA COMO ENTIDAD PORQUE ES EL QUE SIRVE SOLO PARA
//HACER LA CAPA INTERMEDIA ENTRE LOS DATOS QUE ENVIAN Y LO QUE SE
//MANDA DE REGRESO
public class UserDTO {
    private String name;
    @Email(message = "  El correo no es valido")
    @NotBlank (message = "El correo no puede qudar vacio")
    private String email;
    @Pattern(regexp = "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[!@#$%^&*()]).{8,}$",message = "Esta contrasena necesita ")
    private String password;
    private String rol;


    public UserDTO() {
    }


    public UserDTO(String name, String email, String password, String rol) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.rol = rol;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public @Email(message = "  El correo no es valido") @NotBlank(message = "El correo no puede qudar vacio") String getEmail() {
        return email;
    }

    public void setEmail(@Email(message = "  El correo no es valido") @NotBlank(message = "El correo no puede qudar vacio") String email) {
        this.email = email;
    }

    public @Pattern(regexp = "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[!@#$%^&*()]).{8,}$",
            message = "Esta contrasena necesita ") String getPassword() {
        return password;
    }

    public void setPassword(@Pattern(regexp = "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[!@#$%^&*()]).{8,}$",
            message = "Esta contrasena necesita ") String password) {
        this.password = password;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
}
