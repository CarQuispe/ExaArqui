package com.carmen.demo;

@ApiModel(description = "Modelo de solicitud de login")
public class LoginRequest {

    @ApiModelProperty(value = "Correo electrónico del usuario", required = true)
    private String email;

    @ApiModelProperty(value = "Contraseña del usuario", required = true)
    private String password;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

   
}