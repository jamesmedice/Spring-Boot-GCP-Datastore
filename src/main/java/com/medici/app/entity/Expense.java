package com.medici.app.entity;

import org.springframework.cloud.gcp.data.datastore.core.mapping.Entity;

import io.github.classgraph.json.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "expenses")
public class Expense {

	@Id
	private Long id;

	private String partnumber;

	private String partdescription;

	private int quantity;

	private double priceperitem;

	private double amount;
}