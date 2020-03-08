package com.medici.app.repository;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.medici.app.entity.Band;
import com.medici.app.entity.Instrument;
import com.medici.app.entity.Singer;

public class TransactionalRepositoryService {

	@Autowired
	private SingerRepository singerRepository;

	@Transactional
	public void createAndSaveSingerRelationshipsInTransaction(Singer singer, Band firstBand, List<Band> bands, Set<Instrument> instruments) {

		singer.setFirstBand(firstBand);
		singer.setBands(bands);
		singer.setPersonalInstruments(instruments);

		this.singerRepository.save(singer);
	}

}
