package com.example.codedeploy;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CounterController {

	private final Counter counter = new Counter();

	@GetMapping("/count")
	public long greeting() {
		return counter.next();
	}
}
