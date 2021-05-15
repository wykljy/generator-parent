package com.wyk.generator;

import org.mybatis.generator.api.PluginAdapter;
import org.mybatis.generator.api.ShellRunner;

import java.util.List;

/**
 * @Description:
 * @Author: 775303056@qq.com
 * @Version: 1.0
 * @Date: 2021/5/15 18:20
 */
public class PaginationPlugin extends PluginAdapter {

    public boolean validate(List<String> warnings) {
        return true;
    }

    public  static void generate() {
        System.out.println("开始生成表结构...");
        String config = PaginationPlugin.class.getClassLoader().getResource("generator/generatorConfig-B.xml").getFile();
        String[] arg = {"-configfile", config, "-overwrite"};
        ShellRunner.main(arg);
        System.out.println("生成表结构成功...");
    }

    public static void main(String[] args) {
        generate();
    }

}
