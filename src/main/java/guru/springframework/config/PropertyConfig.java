package guru.springframework.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

import guru.springframework.examplebeans.FakeDataSource;

@Configuration
@PropertySource("classpath:datasource.properties")
public class PropertyConfig {
	
	@Value("${guru.user}")
	String user;
	
	@Value("${guru.passwd}")
	String passwd;
	
	@Value("${guru.dbUrl}")
	String dbUrl;
	
	@Bean
	public FakeDataSource fakeDataSource () {
		
		FakeDataSource fakeDataSource = new FakeDataSource();
		fakeDataSource.setDbUrl(dbUrl);
		fakeDataSource.setUser(user);
		fakeDataSource.setPasswd(passwd);
		
		return fakeDataSource;
	}
	
	@Bean
	public static PropertySourcesPlaceholderConfigurer properties () {
		
		PropertySourcesPlaceholderConfigurer placeholderConfigurer = new PropertySourcesPlaceholderConfigurer();
		return placeholderConfigurer;
		
	}

}
