package com.gl.aop.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

	@Bean
	public Docket libraryApi() {
		return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo()).groupName("Spring-AOP API").select()
				.apis(RequestHandlerSelectors.basePackage("com.gl.aop.controller")).build();
	}

	// the below is not mandatory, but for info purpose only
	private ApiInfo apiInfo() {
		return new ApiInfoBuilder().title("Spring-AOP API")
				.description("Learning Spring AOP")
				.termsOfServiceUrl("http://aspire.com")
				.contact(new Contact("Spring-AOP API", "http://aspire.com", "shain@aspire.com"))
				.license("Spring License")
				.licenseUrl("http://aspire.com/license")
				.version("2.0")
				.build();
	}
}
