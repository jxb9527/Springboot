package cn.et.lesson1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//必须添加SpringBootApplication 启用spring的自动配置功能
@SpringBootApplication
public class Test {
	/**
	 * just run springboot启动的方法
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(Test.class, args);
	}
}
