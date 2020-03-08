package com.medici.app.repository;

import org.springframework.cloud.gcp.data.datastore.repository.DatastoreRepository;
import org.springframework.cloud.gcp.data.datastore.repository.query.Query;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.medici.app.entity.Singer;

@RepositoryRestResource(collectionResourceRel = "singers", path = "singer")
public interface SingerRepository extends DatastoreRepository<Singer, String> {

	@Query("select * from  |com.medici.app.entity.Singer| where last_name = @name")
	Slice<Singer> findSingersByLastName(@Param("name") String name, Pageable pageable);

}
