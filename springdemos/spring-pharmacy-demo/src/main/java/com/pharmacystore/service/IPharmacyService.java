package com.pharmacystore.service;

import java.util.List;

import com.pharmacystore.exceptions.DrugIdNotFoundException;
import com.pharmacystore.exceptions.DrugNotFoundException;
import com.pharmacystore.model.Drugs;

public interface IPharmacyService {
	public List<Drugs> getall();
	public List<Drugs> getByCategory(String category)throws DrugNotFoundException;
	public Drugs getById(int drugID)throws DrugIdNotFoundException;
}
