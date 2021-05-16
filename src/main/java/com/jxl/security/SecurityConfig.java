/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.jxl.security;

import com.jxl.security.extend.WebSecurityConfigurer;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * Spring Security 配置类
 *
 * @author <a href="mailto:mercyblitz@gmail.com">Mercy</a>
 * @since TODO
 * Date : 2021-04-24
 */
@Configuration
public class SecurityConfig implements WebSecurityConfigurer {

    @Override
    public void configure(HttpSecurity http) throws Exception {
        System.out.println("configure SecurityConfig... ");
        http.authorizeRequests().anyRequest().authenticated() //所有的request都需要认证
                .and()
                .formLogin()   // 缺省login界面认证
                .and()
                .httpBasic();  // Basic认证
    }
}
