package com.medici.app.entity;

import org.springframework.cloud.gcp.data.datastore.core.mapping.Entity;
import org.springframework.data.annotation.Id;

import com.google.cloud.datastore.Key;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 
 * @author a73s
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Instrument {

	@Id
	Key instrumentId;

	private String type;
}