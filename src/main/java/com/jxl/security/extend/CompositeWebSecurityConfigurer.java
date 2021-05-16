package com.jxl.security.extend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

import java.util.List;

/**
 * @author jixiaoliang
 * @since 2021/05/16
 **/
@Configuration
public class CompositeWebSecurityConfigurer extends WebSecurityConfigurerAdapter {

    private List<WebSecurityConfigurer> webSecurityConfigurers;


    @Autowired(required = false)
    public void setWebSecurityConfigurers(List<WebSecurityConfigurer> webSecurityConfigurers) {
        this.webSecurityConfigurers = webSecurityConfigurers;
    }


    public void configure(HttpSecurity http) throws Exception {
        http.csrf();
        for (WebSecurityConfigurer configurer : webSecurityConfigurers) {
            configurer.configure(http);
        }
    }

}
