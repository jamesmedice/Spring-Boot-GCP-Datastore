package com.medici.app.entity;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;

import org.springframework.cloud.gcp.data.datastore.core.mapping.Descendants;
import org.springframework.cloud.gcp.data.datastore.core.mapping.Entity;
import org.springframework.cloud.gcp.data.datastore.core.mapping.Field;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.annotation.Reference;

import io.github.classgraph.json.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
 

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "singers")
public class Singer {

	@Id
	@Field(name = "singer_id")
	private String singerId;

	@Field(name = "first_name")
	private String firstName;

	@Field(name = "last_name")
	private String lastName;

	@Reference
	private Band firstBand;

	@Reference
	private List<Band> bands;

	@Descendants
	private Set<Instrument> personalInstruments;

	@LastModifiedDate
	private LocalDateTime lastModifiedTime;

	private Set<Album> albums;

}
