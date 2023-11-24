package io.lithosurfer.client.deduplication;

import java.util.Arrays;

import io.lithosurfer.client.LithoArguments;

public class DeduplicationArguments extends LithoArguments {

	public enum MODE {merge, report}
	
	private MODE mode;
	
	public DeduplicationArguments(String[] args) throws Exception {
		super(args);
		try {
			mode = MODE.valueOf(args [3]);
		} catch (Exception e) {
			System.out.println("third arg has to be one of "+Arrays.asList(MODE.values()));
		}
	}

	public MODE getMode() {
		return mode;
	}


	
	

}
