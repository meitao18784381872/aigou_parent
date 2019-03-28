package cn.itsource.aigou.swagger;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * 主要用于生成接口文档
 */
@Configuration
@EnableSwagger2
public class Swagger2 {
 
    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("cn.itsource.aigou.web.controller"))
                //包：自己需要生成接口文档的包，每个需要的controller都要扫描
                .paths(PathSelectors.any())
                .build();
    }


    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("爱购商城系统api")//名字
                .description("爱购商城系统文档说明")//额外藐视
                .contact(new Contact("mt", "", "mt@itsource.cn"))
                .version("1.0")// 版本
                .build();
    }

}