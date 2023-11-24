package io.lithosurfer.client;

public class LithoArguments {

	protected final String endpoint;
	protected final String username;
	protected final String password;


	public LithoArguments(String[] args) throws Exception{
		
		if(args.length<3) {
			throw new Exception("First three command line arguments: <endpoint[0]> <username[1]> <password[2]>");
		}
		
		this.endpoint = args[0];
		this.username = args[1];
		this.password = args[2];
		
	}

	


	public String getEndpoint() {
		return endpoint;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

}