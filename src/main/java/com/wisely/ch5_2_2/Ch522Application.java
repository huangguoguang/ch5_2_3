package com.wisely.ch5_2_2;

import com.wisely.ch5_2_2.com.wisely.ch5_2_2.config.AuthorSettings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Administrator
 * Date: 2017-11-16
 * Time: 下午 8:38
 */
@RestController
@SpringBootApplication
public class Ch522Application {
    //@Value("${book.name}")
    //String name;
    //@Value("${book.author}")
    //String author;
    @Autowired
    private AuthorSettings authorSettings;
    @RequestMapping("/")
    String index() {
        //return "Hello Spring Boot";
        return "book name is :" + authorSettings.getName() + "  boo author is :" + authorSettings.getAuthor();
    }
    public static void main(String[] args) {
        SpringApplication.run(Ch522Application.class, args);
    }
}
