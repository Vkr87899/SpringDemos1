package com.policyapp.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.policyapp.dao.IPolicyDao;
import com.policyapp.dao.PolicyDaoImpl;
import com.policyapp.exceptions.IdNotFoundException;
import com.policyapp.exceptions.PolicyNotFoundException;
import com.policyapp.model.Policy;
@Service
public class PolicyServiceImpl implements IPolicyService {
    @Autowired
	IPolicyDao policyDao ;

	@Override
	public List<Policy> getAll() {

	  return policyDao.findAll().stream().sorted((p1, p2) -> p1.getPolicyName().compareTo(p2.getPolicyName()))
				.collect(Collectors.toList());
		
	}

	@Override
	public List<Policy> getByType(String type) throws PolicyNotFoundException {

		List<Policy> policiesByType = policyDao.findByType(type).stream()
				.sorted((p1, p2) -> p1.getPolicyName().compareTo(p2.getPolicyName())).collect(Collectors.toList());
		if (policiesByType.isEmpty()) {
			throw new PolicyNotFoundException("Policy not found Exception");
		}
		return policiesByType;
	}

	@Override
	public List<Policy> getByCategory(String category) throws PolicyNotFoundException {

		List<Policy> policiesByCategory = policyDao.findByCategory(category).stream()
				.sorted((p1, p2) -> p1.getPolicyName().compareTo(p2.getPolicyName())).collect(Collectors.toList());
		if (policiesByCategory.isEmpty()) {
			throw new PolicyNotFoundException("Policy not found Exception");
		}
		return policiesByCategory;
	}

	@Override
	public List<Policy> getByCoverage(String coverage) throws PolicyNotFoundException {
		List<Policy> policiesByCoverage = policyDao.findByCoverage(coverage).stream()
				.sorted((p1, p2) -> p1.getPolicyName().compareTo(p2.getPolicyName())).collect(Collectors.toList());
		if (policiesByCoverage.isEmpty()) {
			throw new PolicyNotFoundException("Policy not found Exception");
		}
		return policiesByCoverage;
	}

	@Override
	public List<Policy> getByHighSumAssured(double SumAssured) throws PolicyNotFoundException {
		List<Policy> policiesBySumAssured = policyDao.findByHighSumAssured(SumAssured);
		List<Policy> policyListBySumAssured = policiesBySumAssured.stream()
				.sorted((p1, p2) -> p1.getPolicyName().compareTo(p2.getPolicyName())).collect(Collectors.toList());
		if (policyListBySumAssured.isEmpty()) {
			throw new PolicyNotFoundException();
		}
		return policyListBySumAssured;
	}

	@Override
	public List<Policy> getByLessPremium(double premium) throws PolicyNotFoundException {
		List<Policy> policiesByPremium = policyDao.findByLessPremium(premium).stream()
				.sorted((p1, p2) -> p1.getPolicyName().compareTo(p2.getPolicyName())).collect(Collectors.toList());
		if (policiesByPremium.isEmpty()) {
			throw new PolicyNotFoundException("Policy not found Exception");
		}
		return policiesByPremium;
	}

	public Policy getById(int policyId) throws IdNotFoundException {

		Policy policyById = policyDao.findById(policyId);
		if (policyById != null) {
			return policyById;
		}

		throw new IdNotFoundException("Id not found Exception");

	}

}
