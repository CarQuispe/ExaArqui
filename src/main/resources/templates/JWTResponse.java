@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(description = "Modelo de respuesta de login")
public class JWTResponse {
    @ApiModelProperty(value = "Token JWT")
    private String accessToken;
}
