package jp.co.type.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jp.co.type.mapper.ResultAnswerMapper;

@Service
public class ResultAnswerService {

	@Autowired
	private ResultAnswerMapper resultAnswerMapper;

	public void resultAnswerService(int user_id, int driveScore, int analyzeScore, int createScore, int volunteerScore) {
		resultAnswerMapper.insert(user_id, driveScore,analyzeScore,createScore,volunteerScore);
	}
	public void registerUserType(int user_id, int result_num) {
		resultAnswerMapper.update(user_id,result_num);
	}
}
