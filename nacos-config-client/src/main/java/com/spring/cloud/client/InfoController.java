package com.spring.cloud.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>测试</p>
 *
 * @author luyanan
 * @since 2020/8/11
 **/
@RefreshScope
@RestController
public class InfoController {

    @Value("${info.project.version}")
    public String projectVersion;

    @Value("${info.project.author}")
    public String projectAuthor;

    /**
     * <p>查看详情</p>
     *
     * @param user 用户
     * @return {@link Map}
     * @author luyanan
     * @since 2020/8/11
     */
    @GetMapping("info")
    public User info(User user) {
//
//        HashMap info = new HashMap(2);
//
//        info.put("version", projectVersion);
//        info.put("author", projectAuthor);
//        return info;
        return User.builder().id(1).name("张三").build();
    }
}
