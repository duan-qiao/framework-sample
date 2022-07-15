package cn.edu.seu.sky.service;

import cn.edu.seu.sky.dto.UserDTO;

/**
 * @author xiaotian on 2022/5/7
 */
public interface UserService {
    /**
     * 用户查询
     * @param id 用户ID
     * @return 用户信息
     */
    UserDTO queryById(Long id);
}
