package cn.edu.seu.sky.service.impl;

import cn.edu.seu.sky.dto.UserDTO;
import cn.edu.seu.sky.service.UserService;
import org.apache.dubbo.config.annotation.DubboService;

import java.time.LocalDateTime;

/**
 * @author xiaotian on 2022/7/15
 */
@DubboService
public class UserServiceImpl implements UserService {

    @Override
    public UserDTO queryById(Long id) {
        return UserDTO.builder()
                .id(1L)
                .account("zhang.san")
                .nickName("张三")
                .age(21)
                .email("zhang.san@163.com")
                .status(1)
                .telephone("13300001111")
                .createTime(LocalDateTime.now())
                .updateTime(LocalDateTime.now())
                .build();
    }
}
