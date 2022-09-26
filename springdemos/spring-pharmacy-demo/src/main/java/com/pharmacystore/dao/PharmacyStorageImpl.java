package com.pharmacystore.dao;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.pharmacystore.exceptions.DrugIdNotFoundException;
import com.pharmacystore.exceptions.DrugNotFoundException;
import com.pharmacystore.model.Drugs;
@Component
public class PharmacyStorageImpl implements IPharmacyStorage{

	@Override
	public List<Drugs> findall() {
		
		return showAll();
	}
	@Override
	public List<Drugs> findByCategory(String category) throws DrugNotFoundException {
		
		return showAll().stream().filter(p->p.getCategory().equals(category)).collect(Collectors.toList());
	}

	@Override
	public Drugs findById(int drugID) throws DrugIdNotFoundException {
		
		return showAll().stream().filter(p->p.getDrugId()==drugID).findFirst().get();
	}
        private List<Drugs> showAll()
        {
        	return Arrays.asList(new Drugs("B12","health",1001,"Vitamins"),new Drugs("Cynryze","Health",1002,"Immunomodulators"),
        			new Drugs("Rivital","Weight management",1004,"suppliments"),new Drugs("Paula hoice","Skincare",1007,"exofoliant"),
        			new Drugs("Mighty Patch","Skincare",2002,"spot treatment"));
        }
}
