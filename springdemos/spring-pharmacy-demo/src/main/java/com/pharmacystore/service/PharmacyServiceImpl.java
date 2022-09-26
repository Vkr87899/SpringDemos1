package com.pharmacystore.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pharmacystore.dao.IPharmacyStorage;
import com.pharmacystore.exceptions.DrugIdNotFoundException;
import com.pharmacystore.exceptions.DrugNotFoundException;
import com.pharmacystore.model.Drugs;
@Service
public class PharmacyServiceImpl implements IPharmacyService {
	@Autowired
	IPharmacyStorage istorage;

	@Override
	public List<Drugs> getall() {
		
		return istorage.findall().stream().sorted((p1,p2)->p1.getName().compareTo(p2.getName())).collect(Collectors.toList());
	}

	@Override
	public List<Drugs> getByCategory(String category) throws DrugNotFoundException {
		List<Drugs> drugs=istorage.findall().stream().sorted((p1,p2)->p1.getName()
				.compareTo(p2.getName())).collect(Collectors.toList());
		if(drugs.isEmpty())
			throw  new DrugIdNotFoundException("Drug is not available");
		return drugs;
	}

	@Override
	public Drugs getById(int drugID) throws DrugIdNotFoundException {
		Drugs drugById=istorage.findById(drugID);
		if(drugById==null)
			throw new DrugIdNotFoundException("Drug ID not found");
		return drugById;
	}

}
