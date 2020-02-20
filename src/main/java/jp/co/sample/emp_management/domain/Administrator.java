package jp.co.sample.emp_management.domain;


/**
 * 管理者情報を表すドメイン.
 * 
 * @author igamasayuki
 * 
 */
public class Administrator {
	/** id(主キー) */
	private Integer id;
	/** 名前 */
	private String name;
	/** メールアドレス */
	private String mailAddress;
	/** パスワード */
	private String password;
	/** 確認用パスワード */
	private String confirmPassword;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMailAddress() {
		return mailAddress;
	}
	public void setMailAddress(String mailAddress) {
		this.mailAddress = mailAddress;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getConfirmPassword() {
		return confirmPassword;
	}
	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}
	public Administrator(Integer id, String name, String mailAddress, String password, String confirmPassword) {
		super();
		this.id = id;
		this.name = name;
		this.mailAddress = mailAddress;
		this.password = password;
		this.confirmPassword = confirmPassword;
	}

	public Administrator() {}
}
