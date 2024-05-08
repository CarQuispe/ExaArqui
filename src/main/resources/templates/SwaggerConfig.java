@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket api() {
        return new Docket(Swagger2Config.DEFAULT)
                .apiInfo(new ApiInfo("Mi API", "Descripción de mi API", "1.0", "Términos de servicio",
                        new Contact("Nombre", "URL", "email@ejemplo.com"), "Apache 2.0"))
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.tuempresa.proyecto.controladores"))
                .paths(PathSelectors.any())
                .build();
    }
}