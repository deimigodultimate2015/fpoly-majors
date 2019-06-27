package com.sol.dght003.dto.response;

import java.util.ArrayList;
import java.util.List;

import com.sol.dght003.entities.Candidate;
import com.sol.dght003.entities.Major;

public class CandidateDto {
	
	private String name;
	private String phone;
	private String school;
	private String province;
	
	private List<List<TestResult>> testResults;
	
	public CandidateDto() {}

	public CandidateDto(String name, String phone, String school, String province) {
		super();
		this.name = name;
		this.phone = phone;
		this.school = school;
		this.province = province;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public List<List<TestResult>> getTestResults() {
		return testResults;
	}

	public void setTestResults(List<List<TestResult>> testResults) {
		this.testResults = testResults;
	}

	public void createResult(Candidate candidate, List<Major> majors) {
		this.testResults = new ArrayList<>();
		
		candidate.getResult().forEach(result -> {
			List<TestResult> testResults = new ArrayList<>();
			
			majors.forEach(major -> {
				testResults.add(new TestResult(major.getName(), 0));
			});
			
			result.getResultDetails().forEach(resultDetails -> {
				resultDetails.getAnswer().getAppropriations().forEach(appropriation -> {
					testResults.forEach(testResult -> {
						appropriation.getMajor().getName();
						if(testResult.getMajor().equals(appropriation.getMajor().getName())) {
							testResult.addScore(appropriation.getPercent());
						}
					});
				});
			});
			
			this.testResults.add(testResults);
		});
		
	}
	
}
