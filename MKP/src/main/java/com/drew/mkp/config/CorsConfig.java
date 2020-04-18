package com.drew.mkp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

/**
 * cors 跨域处理
 * @author Liang
 * @Date 2020/3/29 22:50
 */
@Configuration
public class CorsConfig {

    /**
     * 设置跨域请求参数 , 处理跨域请求
     * @return
     */
    @Bean
    public CorsFilter corsFilter() {
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        source.registerCorsConfiguration("/**", buildConfig());
        return new CorsFilter(source);
    }


    private CorsConfiguration buildConfig() {
        CorsConfiguration configuration = new CorsConfiguration();

        // 允许跨域访问的域名
        configuration.addAllowedOrigin("*");
        // 请求头
        configuration.addAllowedHeader("*");
        // 请求方法
        configuration.addAllowedMethod(HttpMethod.DELETE);
        configuration.addAllowedMethod(HttpMethod.POST);
        configuration.addAllowedMethod(HttpMethod.GET);
        configuration.addAllowedMethod(HttpMethod.PUT);
        configuration.addAllowedMethod(HttpMethod.DELETE);
        configuration.addAllowedMethod(HttpMethod.OPTIONS);
        // 预检请求的有效期 , 单位为秒
        configuration.setMaxAge(3600L);
        // 是否支持安全证书
        configuration.setAllowCredentials(true);
        return configuration;
    }
}
