package com.medici.app.entity;

import org.springframework.cloud.gcp.data.datastore.core.mapping.Entity;
import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "expenses")
public class Expense {

	@Id
	Long id;

	String partnumber;

	String partdescription;

	int quantity;

	double priceperitem;

	double amount;
}