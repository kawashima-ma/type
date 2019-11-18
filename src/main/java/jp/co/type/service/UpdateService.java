package jp.co.type.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jp.co.type.dto.UserDto;
import jp.co.type.entity.factory.UserFactory;
import jp.co.type.mapper.UsersMapper;

@Service
public class UpdateService {
	@Autowired
	private UsersMapper userMapper;
	@Autowired
	private UserFactory userFactory;

	public void updateUser(UserDto dto) {
		userMapper.update(userFactory.create(dto));
	}
}
