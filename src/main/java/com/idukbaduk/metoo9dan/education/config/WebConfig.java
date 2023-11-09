package com.idukbaduk.metoo9dan.education.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {
        @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        // /ckUpload/** 은 /resources/ckUpload/ 으로 시작하는 uri호출은 /resources/ckUpload/ 경로 하위에 있는 리소스 파일이다 라는 의미입니다.
        registry.addResourceHandler("/upload/education/**")
              //  .addResourceLocations("file:///Users/ryuahn/Desktop/baduk/education/");
                .addResourceLocations("file:///upload/education/");

        //다른 이미지 업로드를 위한 경로
        registry.addResourceHandler("resources/static/img/game/**")
               // .addResourceLocations("file:///Users/ryuahn/Desktop/baduk/");
                .addResourceLocations("classpath:resources/static/img/game/");
     /*   registry.addResourceHandler("/ckUpload/**")
                .addResourceLocations("/resources/ckUpload/");*/

    }
}
