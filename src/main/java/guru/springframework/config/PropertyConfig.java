package guru.springframework.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

import guru.springframework.examplebeans.FakeDataSource;
import guru.springframework.examplebeans.FakeJmxBroker;

@Configuration
//@PropertySource("classpath:datasource.properties")
@PropertySources({
	@PropertySource("classpath:datasource.properties"),
	@PropertySource("classpath:jmx.properties")
})
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
	
	@Value("${jmx.url}")
	String jmxUrl;
	
	@Value("${jmx.passwd}")
	String jmxpasswd;
	
	@Value("${jmx.user}")
	String jmxuser;
	
	
	@Bean
	public FakeJmxBroker FakeJmxBroker() {
		
		FakeJmxBroker fakeJmxBroker = new FakeJmxBroker();
		fakeJmxBroker.setDbUrl(jmxUrl);
		fakeJmxBroker.setPasswd(jmxpasswd);
		fakeJmxBroker.setUser(jmxuser);
		
		return fakeJmxBroker;
		
	}
	
	
	@Bean
	public static PropertySourcesPlaceholderConfigurer properties () {
		
		PropertySourcesPlaceholderConfigurer placeholderConfigurer = new PropertySourcesPlaceholderConfigurer();
		return placeholderConfigurer;
		
	}

}
