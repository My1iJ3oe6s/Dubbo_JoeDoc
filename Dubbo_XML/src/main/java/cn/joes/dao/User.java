package cn.joes.dao;

import lombok.Data;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.List;

/**
 * Created by myijoes on 2019/8/2.
 *
 * @author wanqiao
 */
@Data
@Service
public class User implements Serializable {

    private String name;

    private Integer age;

    private String sex;

    private String address;

    private List<AN> ans;

}
