package cn.joes.service;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

/**
 * Created by myijoes on 2019/8/2.
 *
 * @author wanqiao
 */
public class UserNameSpaceHandler extends NamespaceHandlerSupport {

    @Override
    public void init() {
        registerBeanDefinitionParser("user",new UserBeanDefinitionParser());
        //registerBeanDefinitionParser("an",new UserBeanDefinitionParser());
    }
}
