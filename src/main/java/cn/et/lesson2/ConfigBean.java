package cn.et.lesson2;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.alibaba.druid.support.http.StatViewServlet;

@Configuration
public class ConfigBean {
	
	/**
	 * 相当于<bean id="druidStatView" class="org.springframework.boot.web.servlet.ServletRegistrationBean"></bean>
	 * @return
	 */
	@Bean
	public ServletRegistrationBean druidStatView(){
		ServletRegistrationBean srb = new ServletRegistrationBean();
		
		srb.setName("DruidStatView");
		StatViewServlet svs=new StatViewServlet();
		srb.setServlet(svs);
		
		LinkedHashMap<String, String> initParameters = new LinkedHashMap<String, String>();
		initParameters.put("loginUsername", "admin");
		initParameters.put("loginPassword", "123456");
		srb.setInitParameters(initParameters);
		
		String url="/druid/*";
		List<String> urls=new ArrayList<String>();
		urls.add(url);
		srb.setUrlMappings(urls);
		
		return srb;
	}
	
}
