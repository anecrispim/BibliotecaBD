package classes;

public class Connection {
	private String url;
	private int port;
	private String user;
	private String password;
	private String sgbd;

	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public int getPort() {
		return port;
	}
	public void setPort(int port) {
		this.port = port;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getSgbd() {
		return sgbd;
	}
	public void setSgbd(String sgbd) {
		this.sgbd = sgbd;
	}
}
