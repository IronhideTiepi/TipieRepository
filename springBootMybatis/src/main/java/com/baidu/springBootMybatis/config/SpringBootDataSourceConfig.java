package com.baidu.springBootMybatis.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.alibaba.druid.pool.DruidDataSource;

@Configuration
public class SpringBootDataSourceConfig {

	@Value("${spring.datasource.url}")
	private String url;
	@Value("${spring.datasource.username}")
	private String username;
	@Value("${spring.datasource.password}")
	private String password;
	@Value("${spring.datasource.driver-class-name}")
	private String className;
	
	//destroy-method="close"的作用是当数据库连接不使用的时候,就把该连接重新放到数据池中,方便下次使用调用.
		@Bean(destroyMethod =  "close")
		public DataSource dataSource() {
			System.out.println("创建数据库连接池");
			DruidDataSource dataSource = new DruidDataSource();
			dataSource.setUrl(url);
			dataSource.setUsername(username);//用户名
			dataSource.setPassword(password);//密码
			dataSource.setDriverClassName(className);
			dataSource.setInitialSize(2);//初始化时建立物理连接的个数
			dataSource.setMaxActive(20);//最大连接池数量
			dataSource.setMinIdle(0);//最小连接池数量
			dataSource.setMaxWait(60000);//获取连接时最大等待时间，单位毫秒。
			dataSource.setValidationQuery("SELECT 1");//用来检测连接是否有效的sql
			dataSource.setTestOnBorrow(false);//申请连接时执行validationQuery检测连接是否有效
			dataSource.setTestWhileIdle(true);//建议配置为true，不影响性能，并且保证安全性。
			dataSource.setPoolPreparedStatements(false);//是否缓存preparedStatement，也就是PSCache
			return dataSource;
		}

}
