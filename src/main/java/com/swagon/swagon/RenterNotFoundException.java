package com.swagon.swagon;

public class RenterNotFoundException extends RuntimeException {

	RenterNotFoundException(String id) {
		super("Could not find employee " + id);
	}
}
