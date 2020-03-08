package com.medici.app.entity;

import java.time.LocalDate;

import org.springframework.cloud.gcp.data.datastore.core.mapping.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Entity
public class Album implements Comparable<Album> {

	private final String albumName;

	private final LocalDate date;

	@Override
	public int compareTo(Album album) {
		return this.albumName.compareTo(album.albumName);
	}

}
