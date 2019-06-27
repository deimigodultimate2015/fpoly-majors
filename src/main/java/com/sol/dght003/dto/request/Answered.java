package com.sol.dght003.dto.request;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Answered {
	
	private CandidateRegister candidate;
	
	private Map<Integer, Integer> answers = new HashMap<Integer, Integer>();
	
	public Answered () {}

	public CandidateRegister getCandidate() {
		return candidate;
	}

	public void setCandidate(CandidateRegister candidate) {
		this.candidate = candidate;
	}

	public Map<Integer, Integer> getAnswers() {
		return answers;
	}

	public void setAnswers(Map<Integer, Integer> answers) {
		this.answers = answers;
	}

	public ArrayList<Integer> getArrInt() {
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		answers.keySet().forEach(key -> {
			if(answers.get(key) != null) {
				list.add(answers.get(key));
			}
		});
		
		return list;
	}
		
}
