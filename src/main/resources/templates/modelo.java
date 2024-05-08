@ApiModel(description = "Modelo de solicitud de login")
public class LoginRequest {

    @ApiModelProperty(value = "Correo electrónico del usuario", required = true)
    private String email;

    @ApiModelProperty(value = "Contraseña del usuario", required = true)
    private String password;

    // Getters y setters
}
