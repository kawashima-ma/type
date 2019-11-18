package jp.co.type.entity.factory;

import org.springframework.stereotype.Component;

import jp.co.type.Utils.CipherUtil;
import jp.co.type.dto.UserDto;
import jp.co.type.entity.User;

@Component
public class UserFactory {

	public User createEncrypt(UserDto dto) {
		return new User(
				null,
				dto.getLogin_id(),
				dto.getName(),
				CipherUtil.encrypt(dto.getPassword()),
				null
				);
	}

	public User create(UserDto dto) {
		return new User(
				dto.getId(),
				dto.getLogin_id(),
				dto.getName(),
				CipherUtil.encrypt(dto.getPassword()),
				null
				);
	}
}