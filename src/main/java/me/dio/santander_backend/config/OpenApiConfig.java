package me.dio.santander_backend.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Santander Backend API")
                        .description("API RESTful criada para a Santander Dev Week 2025. " +
                                    "Esta API fornece endpoints para gerenciamento de usuários, contas, cartões e recursos bancários.")
                        .version("1.0.0")
                        .contact(new Contact()
                                .name("DIO - Digital Innovation One")
                                .url("https://dio.me")
                                .email("contato@dio.me"))
                        .license(new License()
                                .name("MIT License")
                                .url("https://opensource.org/licenses/MIT")));
    }
}
