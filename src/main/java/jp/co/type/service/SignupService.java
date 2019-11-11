package jp.co.type.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jp.co.type.dto.BranchDto;
import jp.co.type.dto.PositionDto;
import jp.co.type.dto.UserDto;
import jp.co.type.dto.factory.BranchDtoFactory;
import jp.co.type.dto.factory.PositionDtoFactory;
import jp.co.type.entity.factory.UserFactory;
import jp.co.type.mapper.BranchesMapper;
import jp.co.type.mapper.PositionsMapper;
import jp.co.type.mapper.UsersMapper;

@Service
public class SignupService {
	@Autowired
	private BranchesMapper branchesMapper;
	@Autowired
	private PositionsMapper positionsMapper;
	@Autowired
	private UsersMapper usersMapper;
	@Autowired
	private BranchDtoFactory branchDtoFactory;
	@Autowired
	private PositionDtoFactory positionDtoFactory;
	@Autowired
	private UserFactory userFactory;

	public void registUser(UserDto user) {
		usersMapper.regist(userFactory.createEncrypt(user));
	}

	public List<BranchDto> getBranchList() {
		return branchDtoFactory.create(branchesMapper.getAll());
	}

	public List<PositionDto> getPositionList() {
		return positionDtoFactory.create(positionsMapper.getAll());
	}

}