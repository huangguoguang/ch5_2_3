package com.wisely.ch5_2_2.com.wisely.ch5_2_2.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Administrator
 * Date: 2017-11-16
 * Time: 下午 9:14
 */
@Component
@ConfigurationProperties(prefix = "book", locations = "classpath:config/application-config.yml")
//通过prefix属性指定配置文件的前缀，通过locations指定配置文件的位置
public class AuthorSettings {
    private String author;
    private String name;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
