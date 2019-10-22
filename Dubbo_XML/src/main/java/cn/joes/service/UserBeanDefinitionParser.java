package cn.joes.service;

import cn.joes.dao.User;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.AbstractSingleBeanDefinitionParser;
import org.w3c.dom.Attr;
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
        Attr an = element.getAttributeNode("an");

    }
}
