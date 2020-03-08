package com.medici.app.repository;

import java.util.List;

import org.springframework.cloud.gcp.data.datastore.repository.DatastoreRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.medici.app.entity.Books;

@RepositoryRestResource(collectionResourceRel = "books", path = "book")
public interface BooksRepository extends DatastoreRepository<Books, String> {

	List<Books> findByAuthor(String author);

	List<Books> findByYearGreaterThan(int year);

	List<Books> findByAuthorAndYear(String author, int year);
}
