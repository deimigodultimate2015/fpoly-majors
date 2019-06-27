package com.sol.dght003.dto.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TestResult {

	private String major;
	private double totalPercent;
	private int time = 0;
	
	public TestResult() {}

	public TestResult(String major, double score) {
		super();
		this.major = major;
	}

	@JsonProperty("majorId")
	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	@JsonProperty("percent")
	public int getScore() throws Exception {
		if(time == 0) {
			return 0;
		}
		return (int)totalPercent/time;
	}

	public void addScore(double totalPercent) {
		this.time += 1;
		this.totalPercent += totalPercent;
	}
}
