package cn.joes.dao;

import lombok.Data;

import java.io.Serializable;

/**
 * Created by myijoes on 2019/8/2.
 *
 * @author wanqiao
 */
@Data
public class User implements Serializable {

    private String name;

    private Integer age;

    private String sex;

    private String address;

}
