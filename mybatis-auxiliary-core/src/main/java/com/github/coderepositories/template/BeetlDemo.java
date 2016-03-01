package com.github.coderepositories.template;

import org.beetl.core.Configuration;
import org.beetl.core.GroupTemplate;
import org.beetl.core.Template;
import org.beetl.core.resource.FileResourceLoader;
import org.beetl.core.resource.StringTemplateResourceLoader;
import sun.security.krb5.Config;

import java.io.IOException;
import java.net.URL;
import java.nio.charset.Charset;

/**
 * Beetl模板例子
 * Created by zhangguangyong on 2016/2/29.
 */
public class BeetlDemo {
    // 当前路径
    static String currentPath = BeetlDemo.class.getResource("").getPath();

    private static void testFileResource() throws IOException {
        FileResourceLoader fileResourceLoader = new FileResourceLoader();
        fileResourceLoader.setRoot("E:\\Workspace\\github\\coderepositories\\mybatis-auxiliary\\mybatis-auxiliary-core\\src\\main\\java\\com\\github\\coderepositories\\template");
        fileResourceLoader.setCharset(Charset.defaultCharset().name());

        Configuration cfg = Configuration.defaultConfiguration();
        GroupTemplate groupTemplate = new GroupTemplate(fileResourceLoader, cfg);

        Template template = groupTemplate.getTemplate("/hello.txt");
        template.binding("name", "zhangsan");
        String val = template.render();
        System.out.println(val);

    }

    static void testStringResource() throws IOException {
        StringTemplateResourceLoader resourceLoader = new StringTemplateResourceLoader();
        Configuration cfg = Configuration.defaultConfiguration();
        GroupTemplate gt = new GroupTemplate(resourceLoader, cfg);
        Template t = gt.getTemplate("hello,${name}");
        t.binding("name", "beetl");
        String str = t.render();
        System.out.println(str);
    }

    public static void main(String[] args) throws IOException{
//        testStringResource();
        testFileResource();
    }

}
