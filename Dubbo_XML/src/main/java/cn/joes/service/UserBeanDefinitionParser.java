package cn.joes.service;

import cn.joes.dao.AN;
import cn.joes.dao.User;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.AbstractSingleBeanDefinitionParser;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;
import org.w3c.dom.Attr;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

import java.util.ArrayList;
import java.util.List;

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
        int length = element.getChildNodes().getLength();
        List<AN> ans = new ArrayList<AN>();
        for (int i = 0; i < length; i++) {
            Node item = element.getChildNodes().item(i);
            if(item == null || StringUtils.isEmpty(item.getNodeName()) || !"userMsg:an".equals(item.getNodeName())){
                continue;
            }
            String name1 = ((Element) item).getAttribute("name");
            AN an =new AN();
            an.setName(name1);
            ans.add(an);
        }
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

        if (!CollectionUtils.isEmpty(ans)) {
            builder.addPropertyValue("ans", ans);
        }
    }
}
