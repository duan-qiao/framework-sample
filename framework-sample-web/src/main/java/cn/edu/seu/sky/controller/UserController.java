package cn.edu.seu.sky.controller;

import cn.edu.seu.sky.dto.UserDTO;
import cn.edu.seu.sky.service.UserService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xiaotian on 2022/7/14
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @DubboReference
    private UserService userService;

    @GetMapping("/{id}")
    public UserDTO queryById(@PathVariable Long id) {
        return userService.queryById(id);
    }
}
