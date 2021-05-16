package com.jxl.security.extend;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;

/**
 * @author jixiaoliang
 * @since 2021/05/16
 **/
public interface WebSecurityConfigurer {

    void configure(HttpSecurity http) throws Exception;
}
