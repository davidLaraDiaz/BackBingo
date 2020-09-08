package com.progracol.datasource.DB;

import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
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
		entityManagerFactoryRef = "juegoEntity",
		transactionManagerRef = "juegoTransaction",
		basePackages = { "com.progracol.juego.dao" }
)

public class JuegoConfig {

	
	
	@Autowired
	private Environment env;
	
	
	@Bean(name = "juegoDataSource")
	public DataSource usuariosDataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setUrl(env.getProperty("juego.datasource.url"));
		dataSource.setUsername(env.getProperty("juego.datasource.username"));
		dataSource.setPassword(env.getProperty("juego.datasource.password"));
		dataSource.setDriverClassName(env.getProperty("juego.datasource.driverClassName"));
		
		return dataSource;
	}
	
	
	@Bean(name = "juegoEntity")
	public LocalContainerEntityManagerFactoryBean entityManagerFactory() {
		LocalContainerEntityManagerFactoryBean local = new LocalContainerEntityManagerFactoryBean();
		
		local.setDataSource(usuariosDataSource());
		local.setPackagesToScan("com.progracol.juego.model");
		
		HibernateJpaVendorAdapter adapter = new HibernateJpaVendorAdapter();
		local.setJpaVendorAdapter(adapter);
		
		Map<String, Object> properties = new HashMap<>();
		properties.put("hibernate.show-sql", env.getProperty("juego.jpa.show-sql"));
		properties.put("hibernate.dialect", env.getProperty("juego.jpa.properties.hibernate.dialect"));
		
		local.setJpaPropertyMap(properties);
		
		return local;
	}
	
	
	
	@Bean(name = "juegoTransaction")
	public PlatformTransactionManager transactionManager() {
		JpaTransactionManager transa = new JpaTransactionManager();
		transa.setEntityManagerFactory(entityManagerFactory().getObject());
		
		return transa;
	}
	
	
	
}
