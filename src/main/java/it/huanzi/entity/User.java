package it.huanzi.entity;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.io.Serializable;

/**
 * @author 吴启欢
 * @version 1.0
 * @date 19-7-19 下午9:30
 */
@Data
@Slf4j
public class User implements Serializable {

    private Integer id;
    private String userName;
    private String password;
    private String email;

    public User() {
    }

    public User(Integer id, String userName, String password, String email) {
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.email = email;
    }
}


