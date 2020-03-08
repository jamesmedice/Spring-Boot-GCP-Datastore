package com.medici.app.config;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.gcp.autoconfigure.datastore.DatastoreProvider;
import org.springframework.cloud.gcp.data.datastore.core.DatastoreTransactionManager;
import org.springframework.cloud.gcp.data.datastore.repository.config.EnableDatastoreAuditing;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.medici.app.repository.TransactionalRepositoryService;

@Configuration
@EnableAutoConfiguration
@EnableTransactionManagement
@EnableDatastoreAuditing
public class AutoConfiguration {

	@Bean
	DatastoreTransactionManager datastoreTransactionManager(DatastoreProvider datastore) {
		return new DatastoreTransactionManager(datastore);
	}

	@Bean
	public TransactionalRepositoryService transactionalRepositoryService() {
		return new TransactionalRepositoryService();
	}

}
