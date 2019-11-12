package jp.co.type.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jp.co.type.dto.TypeNameDto;
import jp.co.type.dto.UserDto;
import jp.co.type.dto.factory.TypeNameDtoFactory;
import jp.co.type.dto.factory.UserDtoFactory;
import jp.co.type.mapper.TypeNamesMapper;
import jp.co.type.mapper.UsersMapper;

@Service
public class TotalCatalogService {
	@Autowired
	private UsersMapper usersMapper;
	@Autowired
	private UserDtoFactory userDtoFactory;
	@Autowired
	private TypeNameDtoFactory typeNameDtoFactory;
	@Autowired
	private TypeNamesMapper typeNamesMapper;

	public List<UserDto> getAllNew(){
		List<UserDto> list = new ArrayList<UserDto>();
		list = userDtoFactory.create(usersMapper.getAll());
		return list;
	}

	public List<TypeNameDto> getTypeName() {
		List<TypeNameDto> list = new ArrayList<TypeNameDto>();
		list = typeNameDtoFactory.create(typeNamesMapper.getAll());
		return list;
	}
}
