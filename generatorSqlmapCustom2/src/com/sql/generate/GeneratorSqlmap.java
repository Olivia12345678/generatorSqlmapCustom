package com.sql.generate;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.exception.XMLParserException;
import org.mybatis.generator.internal.DefaultShellCallback;

public class GeneratorSqlmap {

    public void generator() throws Exception {

        List<String> warnings = new ArrayList<String>();
        boolean overwrite = true;
        //指定 逆向工程配置文件
        File configFile = new File("resource/generatorConfig.xml");
        ConfigurationParser cp = new ConfigurationParser(warnings);
        Configuration config = cp.parseConfiguration(configFile);
        DefaultShellCallback callback = new DefaultShellCallback(overwrite);
        MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config,
                callback, warnings);
        myBatisGenerator.generate(null);

    }
    public  boolean deleteFile(File dirFile) {
        // ���dir��Ӧ���ļ������ڣ����˳�
        if (!dirFile.exists()) {
            return false;
        }

        if (dirFile.isFile()) {
            return dirFile.delete();
        } else {

            for (File file : dirFile.listFiles()) {
                deleteFile(file);
            }
        }

        return dirFile.delete();
    }

    public static void main(String[] args) throws Exception {
        try {
        	GeneratorSqlmap generatorSqlmap = new GeneratorSqlmap();
         	File configFile = new File("./out");
        	if(configFile.exists()){
        		generatorSqlmap.deleteFile(configFile);
        	}
         	configFile.mkdirs();
            generatorSqlmap.generator();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
