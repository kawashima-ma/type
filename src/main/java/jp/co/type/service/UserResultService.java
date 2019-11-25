package jp.co.type.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jp.co.type.dto.UserResultDto;
import jp.co.type.dto.factory.UserResultDtoFactory;
import jp.co.type.mapper.UserResultMapper;

@Service
public class UserResultService {
	@Autowired
	private UserResultMapper userResultMapper;
//	@Autowired
//	private BranchesMapper branchesMapper;
//	@Autowired
//	private PositionsMapper positionsMapper;
	@Autowired
	private UserResultDtoFactory userResultDtoFactory;
//	@Autowired
//	private BranchDtoFactory branchDtoFactory;
//	@Autowired
//	private PositionDtoFactory positionDtoFactory;
//	@Autowired
//	private UserFactory userFactory;

	public UserResultDto getUserResult(Integer id) {
		return userResultDtoFactory.create(userResultMapper.getUserResultById(id));
	}


	public List<UserResultDto> getUserResultAll(Integer num){
		List<UserResultDto> lists = new ArrayList<UserResultDto>();
		lists = userResultDtoFactory.create(userResultMapper.getUserResultAll(num));
		return lists;
	}


}