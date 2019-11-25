package jp.co.type.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jp.co.type.dto.UserDto;
import jp.co.type.entity.factory.UserFactory;
import jp.co.type.mapper.UsersMapper;

@Service
public class SignupService {
	@Autowired
	private UsersMapper usersMapper;
	@Autowired
	private UserFactory userFactory;


	public void registUser(UserDto userDto) {

		//dtoからentityに移しなおし
		userFactory.createEncrypt(userDto);
		usersMapper.signs(userFactory.createEncrypt(userDto));
	}
}