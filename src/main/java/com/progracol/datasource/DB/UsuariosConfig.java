package com.progracol.datasource.DB;

import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(
		entityManagerFactoryRef = "usuarioEntity",
		transactionManagerRef = "usuarioTransaction",
		basePackages = { "com.progracol.usuarios.dao" }
)
public class UsuariosConfig {

	@Autowired
	private Environment env;
	
	@Primary
	@Bean(name = "usuariosDataSource")
	public DataSource usuariosDataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setUrl(env.getProperty("spring.datasource.url"));
		dataSource.setUsername(env.getProperty("spring.datasource.username"));
		dataSource.setPassword(env.getProperty("spring.datasource.password"));
		dataSource.setDriverClassName(env.getProperty("spring.datasource.driverClassName"));
		
		return dataSource;
	}
	
	@Primary
	@Bean(name = "usuarioEntity")
	public LocalContainerEntityManagerFactoryBean entityManagerFactory() {
		LocalContainerEntityManagerFactoryBean local = new LocalContainerEntityManagerFactoryBean();
		
		local.setDataSource(usuariosDataSource());
		local.setPackagesToScan("com.progracol.usuarios.model");
		
		HibernateJpaVendorAdapter adapter = new HibernateJpaVendorAdapter();
		local.setJpaVendorAdapter(adapter);
		
		Map<String, Object> properties = new HashMap<>();
		properties.put("hibernate.show-sql", env.getProperty("spring.jpa.show-sql"));
		properties.put("hibernate.dialect", env.getProperty("spring.jpa.properties.hibernate.dialect"));
		
		local.setJpaPropertyMap(properties);
		
		return local;
	}
	
	
	@Primary
	@Bean(name = "usuarioTransaction")
	public PlatformTransactionManager transactionManager() {
		JpaTransactionManager transa = new JpaTransactionManager();
		transa.setEntityManagerFactory(entityManagerFactory().getObject());
		
		return transa;
	}
	
	
	
}
