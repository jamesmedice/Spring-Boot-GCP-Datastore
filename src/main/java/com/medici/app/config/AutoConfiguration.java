package com.medici.app.config;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.gcp.autoconfigure.datastore.DatastoreProvider;
import org.springframework.cloud.gcp.data.datastore.core.DatastoreTransactionManager;
import org.springframework.cloud.gcp.data.datastore.repository.config.EnableDatastoreAuditing;
import org.springframework.cloud.gcp.data.datastore.repository.config.EnableDatastoreRepositories;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.medici.app.entity.Book;
import com.medici.app.entity.Expense;
import com.medici.app.repository.BookRepository;
import com.medici.app.repository.ExpensesRepository;

@Configuration
@EntityScan(basePackageClasses = { Expense.class, Book.class })
@EnableAutoConfiguration
@EnableTransactionManagement
@EnableDatastoreAuditing
@EnableDatastoreRepositories(basePackageClasses = { ExpensesRepository.class, BookRepository.class })
public class AutoConfiguration {

	@Bean
	DatastoreTransactionManager datastoreTransactionManager(DatastoreProvider datastore) {
		return new DatastoreTransactionManager(datastore);
	}

}
