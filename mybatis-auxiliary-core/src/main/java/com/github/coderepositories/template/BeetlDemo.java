package com.github.coderepositories.template;

import org.beetl.core.Configuration;
import org.beetl.core.GroupTemplate;
import org.beetl.core.Template;
import org.beetl.core.resource.StringTemplateResourceLoader;

import java.io.IOException;

/**
 * Beetl模板例子
 * Created by zhangguangyong on 2016/2/29.
 */
public class BeetlDemo {

    public static void main(String[] args) {
        try {
            StringTemplateResourceLoader resourceLoader = new StringTemplateResourceLoader();
            Configuration cfg = Configuration.defaultConfiguration();
            GroupTemplate gt = new GroupTemplate(resourceLoader, cfg);
            Template t = gt.getTemplate("hello,${name}");
            t.binding("name", "beetl");
            String str = t.render();
            System.out.println(str);

        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
