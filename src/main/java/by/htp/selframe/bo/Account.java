package by.htp.selframe.bo;

public class Account {
	private String login;
	private String password;
	private String domain;
	
public Account(String login, String password, String domain) {
		this.login = login;
		this.password = password;
		this.domain = domain;
	}
public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getDomain() {
		return domain;
	}
	public void setDomain(String domain) {
		this.domain = domain;
	}


}
