//package com.lsu.lkrf.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import springfox.documentation.builders.ApiInfoBuilder;
//import springfox.documentation.builders.PathSelectors;
//import springfox.documentation.builders.RequestHandlerSelectors;
//import springfox.documentation.service.Contact;
//import springfox.documentation.spi.DocumentationType;
//import springfox.documentation.spring.web.plugins.Docket;
//import springfox.documentation.swagger2.annotations.EnableSwagger2;
//
///**
// * @author Jasmine-drs
// * @date 2022/11/2 21:30
// */
//@Configuration
//@EnableSwagger2
//public class Knife4jConfiguration {
//
//    @Bean(value = "dockerBean")
//    public Docket dockerBean() {
//        //指定使用Swagger2规范
//        return new Docket(DocumentationType.SWAGGER_2)
//                .apiInfo(new ApiInfoBuilder()
//                        //描述字段支持Markdown语法
//                        .description("# 产值系统接口文档")
//                        .termsOfServiceUrl("https://doc.xiaominfo.com/")
//                        .contact(new Contact("后端二组","http://localhost:8080/xxxx","xxxxxx@xx.com"))
//                        .version("1.0")
//                        .build())
//                //分组名称
//                .groupName("用户服务")
//                .select()
//                //这里指定Controller扫描包路径
//                .apis(RequestHandlerSelectors.basePackage("com.shangxuan.outputvalue.controller"))
//                .paths(PathSelectors.any())
//                .build();
//    }
//}
