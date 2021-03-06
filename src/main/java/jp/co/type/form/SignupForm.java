package jp.co.type.form;

import javax.validation.GroupSequence;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

import jp.co.type.form.validator.ConfirmPassword;
@ConfirmPassword(password = "password", confirmPassword = "confirmPassword")

public class SignupForm {
	public interface Group1 {}
	public interface Group2 {}
	public interface Group3 {}

	@GroupSequence({Group1.class,Group2.class,Group3.class})
	public interface All {}

	@NotEmpty(message = "ログインIDを入力してください",groups = Group1.class)
	@Size(min = 6, max = 20,message = "ログインIDを、6~20文字以下で入力して下さい",groups = Group2.class)
	@Pattern(regexp = "[a-zA-Z0-9]+",message = "ログインIDを半角英数字で入力して下さい",groups = Group3.class)
	private String login_id;

	@NotEmpty(message = "名前を入力してください",groups = Group1.class)
	@Size(max = 20,message = "名前を、20文字以下で入力して下さい",groups = Group2.class)
	private String name;

	@NotEmpty(message = "パスワードを入力してください",groups = Group1.class)
	@Size(min = 6, max = 20,message = "パスワードを、6~20文字以下で入力して下さい",groups = Group2.class)
	private String password;


	@NotEmpty(message = "確認用パスワードを入力してください")
	private String confirmPassword;

	public String getLogin_id() {
		return login_id;
	}
	public void setLogin_id(String login_id) {
		this.login_id = login_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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


}