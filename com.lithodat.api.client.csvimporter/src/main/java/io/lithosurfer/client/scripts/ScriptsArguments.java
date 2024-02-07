package io.lithosurfer.client.scripts;

import java.util.Arrays;

import io.lithosurfer.client.LithoArguments;

public class ScriptsArguments extends LithoArguments {

	public enum MODE {merge, report, script1, script2}
	
	private MODE mode;
	
	public ScriptsArguments(String[] args) throws Exception {
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
