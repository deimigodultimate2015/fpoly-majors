package com.sol.dght003.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sol.dght003.service.PreTasteService;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class PreTasteCourseAPI {

	@Autowired
	PreTasteService preTasteService;
	
	@GetMapping("/pre-taste-courses")
	public ResponseEntity<MappingJacksonValue> getAllPreTasteCourse() {
		return ResponseEntity.ok(preTasteService.getAllCourse());
	}

	@GetMapping("/pre-taste-courses/{code}")
	public ResponseEntity<MappingJacksonValue> getAllPreTasteCourseByMajorId(@PathVariable("code") String code) {
		Long id = 1L;
		if(code.equals("UDPM")) {
			id = 1L;
		} else if (code.equals("LTDD")) {
			id = 2L;
		} else if (code.equals("TKW")) {
			id = 3L;
		} else if (code.equals("TKDH")) {
			id = 4L;
		} else {
			id = 1L;
		}
		
		return ResponseEntity.ok(preTasteService.getCourseByMajorId(id));
	}
	
}
