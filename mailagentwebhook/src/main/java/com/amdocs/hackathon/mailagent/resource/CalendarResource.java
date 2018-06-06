package com.amdocs.hackathon.mailagent.resource;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.amdocs.hackathon.mailagent.dto.CalendarDto;

@RestController
@RequestMapping(value = "/calendar")
public class CalendarResource {
	@RequestMapping(value = "/meeting/add", method = RequestMethod.POST)
	public ResponseEntity<String> addMeeting(@RequestBody CalendarDto calendarDTO) {
		return new ResponseEntity<String>("meeting created", HttpStatus.OK);
	}

	@RequestMapping(value = "/meeting/read", method = RequestMethod.GET)
	public ResponseEntity<String> readMeeting() {
		return new ResponseEntity<String>("get meeting.", HttpStatus.OK);
	}
}
