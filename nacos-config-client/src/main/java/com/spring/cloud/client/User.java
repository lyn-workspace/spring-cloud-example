package com.spring.cloud.client;

import com.sun.org.apache.xpath.internal.operations.Or;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

/**
 * 用户
 *
 * @author luyanan
 * @since 2020/8/11
 **/
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class User {

    /**
     * id
     *
     * @author luyanan
     * @since 2020/8/11
     */
    private Integer id;
    /**
     * 名称
     *
     * @author luyanan
     * @since 2020/8/11
     */
    @NotBlank(message = "不能为空")
    private String name;

}
