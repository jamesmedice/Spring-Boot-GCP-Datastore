package com.medici.app.resource;

import java.util.logging.Logger;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * @author a73s
 *
 */
@RestController
public class DataStoreController {

	protected Logger logger = Logger.getLogger(DataStoreController.class.getName());

	@RequestMapping(value = "/get", method = RequestMethod.GET)
	public ResponseEntity<?> getEntity() {

		try {

			return new ResponseEntity(null, new HttpHeaders(), HttpStatus.OK);

		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}

	}

}
