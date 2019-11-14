package jp.co.type.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jp.co.type.mapper.ResultAnswerMapper;

@Service
public class ResultAnswerService {

	@Autowired
	private ResultAnswerMapper resultAnswerMapper;

	public void resultAnswerService(int driveScore, int analyzeScore, int createScore, int volunteerScore) {
		resultAnswerMapper.insert(driveScore,analyzeScore,createScore,volunteerScore);
	}
}
