package cn.joes.service;

import cn.joes.dao.User;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.AbstractSingleBeanDefinitionParser;
import org.springframework.util.StringUtils;
import org.w3c.dom.Element;

/**
 * Created by myijoes on 2019/8/2.
 *
 * @author wanqiao
 */
public class UserBeanDefinitionParser extends AbstractSingleBeanDefinitionParser {

    @Override
    protected Class<?> getBeanClass(Element element) {
        return User.class;
    }

    @Override
    protected void doParse(Element element, BeanDefinitionBuilder builder) {
        String name = element.getAttribute("name");
        String age = element.getAttribute("age");
        String sex = element.getAttribute("sex");
        String address = element.getAttribute("address");
        if (StringUtils.hasText(name)) {
            builder.addPropertyValue("name", name);
        }
        if (StringUtils.hasText(age)) {
            builder.addPropertyValue("age", age);
        }
        if (StringUtils.hasText(sex)) {
            builder.addPropertyValue("sex", sex);
        }
        if (StringUtils.hasText(address)) {
            builder.addPropertyValue("address", address);
        }
    }
}
