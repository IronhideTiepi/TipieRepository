package com.baidu.springBootMybatis.config;
import java.nio.charset.Charset;
import java.util.Hashtable;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

import com.fasterxml.jackson.databind.ObjectMapper;

@Configuration //申明这是一个配置
public class MySrpingMVCConfig extends WebMvcConfigurationSupport{
    @Bean
    public ObjectMapper getObjectMapper() {
      return new ObjectMapper();
    }
  
    @Bean
    public MappingJackson2HttpMessageConverter messageConverter() {
      MappingJackson2HttpMessageConverter converter = new MappingJackson2HttpMessageConverter();
      converter.setObjectMapper(getObjectMapper());
      return converter;
    }
    @Override
    public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
      converters.add(messageConverter());
      addDefaultHttpMessageConverters(converters);
    }
    // 自定义拦截器
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        HandlerInterceptor handlerInterceptor = new HandlerInterceptor() {
            @Override
            public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
                    throws Exception {
                System.out.println("自定义拦截器............");
                return true;
            }
            
            @Override
            public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
                    ModelAndView modelAndView) throws Exception {
                
            }
            
            @Override
            public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler,
                    Exception ex) throws Exception {
            }
        };
        registry.addInterceptor(handlerInterceptor).addPathPatterns("/**");
    }

    // 自定义消息转化器的第二种方法
//    @Override
//    public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
//        StringHttpMessageConverter converter  = new StringHttpMessageConverter(Charset.forName("UTF-8"));
//        converters.add(converter);
//    }

}
