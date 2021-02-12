package com.fiatwise;

import java.util.TimeZone;

import javax.annotation.PostConstruct;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.fiatwise.interceptor.LoggingInterceptor;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
public class WebConfiguration implements WebMvcConfigurer {

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(new LoggingInterceptor()).addPathPatterns("/**");
	}

	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder restTemplateBuilder) {
		return restTemplateBuilder.build();
	}

	@Bean
	public Docket docket() {

		return new Docket(DocumentationType.SWAGGER_2).select()
				.apis(RequestHandlerSelectors.basePackage(getClass().getPackage().getName())).paths(PathSelectors.any())
				.build().apiInfo(generateApiInfo());
	}

	private ApiInfo generateApiInfo() {

		return new ApiInfoBuilder().title("Fiatwise - Coding challenge").version("Version 1.0").description(
				"This service is to check the technology knowledge of a applicant for Java Developer position at Fiatwise.")
				.licenseUrl("http://www.apache.org/licenses/LICENSE-2.0").build();
	}

	@PostConstruct
	private void setTimeZone() {
		TimeZone.setDefault(TimeZone.getTimeZone("EST"));
	}
}
