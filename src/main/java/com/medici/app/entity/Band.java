package com.medici.app.entity;

import org.springframework.cloud.gcp.data.datastore.core.mapping.DiscriminatorField;
import org.springframework.cloud.gcp.data.datastore.core.mapping.DiscriminatorValue;
import org.springframework.cloud.gcp.data.datastore.core.mapping.Entity;
import org.springframework.data.annotation.Id;

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
@DiscriminatorField(field = "band_type")
@DiscriminatorValue("generic_band")
public class Band {

	@Id
	protected String name;

}
