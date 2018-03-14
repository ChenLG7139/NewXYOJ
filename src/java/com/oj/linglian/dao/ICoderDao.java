package com.oj.linglian.dao;

import java.util.List;

import com.oj.linglian.entity.Coder;

public interface ICoderDao {
    public int update(Coder coder, Coder keyCoder);
    public int updateOfCoderId(Coder coder, String coderId);
    public int updateOfCode(Coder coder, String code);
    public int updateOfTime(Coder coder, String time);
    public int updateOfStartTime(Coder coder, String startTime);
    public int updateOfEndTime(Coder coder, String endTime);
    public int updateOfResult(Coder coder, String result);
    public int updateOfStatus(Coder coder, String status);
    public int updateOfUserId(Coder coder, String userId);
    public int updateOfQuestionId(Coder coder, String questionId);
    public int updateOfIp(Coder coder, String ip);
    public int updateOfCoderIdAndCode(Coder coder, String coderId, String code);
    public int updateOfCoderIdAndTime(Coder coder, String coderId, String time);
    public int updateOfCoderIdAndStartTime(Coder coder, String coderId, String startTime);
    public int updateOfCoderIdAndEndTime(Coder coder, String coderId, String endTime);
    public int updateOfCoderIdAndResult(Coder coder, String coderId, String result);
    public int updateOfCoderIdAndStatus(Coder coder, String coderId, String status);
    public int updateOfCoderIdAndUserId(Coder coder, String coderId, String userId);
    public int updateOfCoderIdAndQuestionId(Coder coder, String coderId, String questionId);
    public int updateOfCoderIdAndIp(Coder coder, String coderId, String ip);
    public int updateOfCodeAndTime(Coder coder, String code, String time);
    public int updateOfCodeAndStartTime(Coder coder, String code, String startTime);
    public int updateOfCodeAndEndTime(Coder coder, String code, String endTime);
    public int updateOfCodeAndResult(Coder coder, String code, String result);
    public int updateOfCodeAndStatus(Coder coder, String code, String status);
    public int updateOfCodeAndUserId(Coder coder, String code, String userId);
    public int updateOfCodeAndQuestionId(Coder coder, String code, String questionId);
    public int updateOfCodeAndIp(Coder coder, String code, String ip);
    public int updateOfTimeAndStartTime(Coder coder, String time, String startTime);
    public int updateOfTimeAndEndTime(Coder coder, String time, String endTime);
    public int updateOfTimeAndResult(Coder coder, String time, String result);
    public int updateOfTimeAndStatus(Coder coder, String time, String status);
    public int updateOfTimeAndUserId(Coder coder, String time, String userId);
    public int updateOfTimeAndQuestionId(Coder coder, String time, String questionId);
    public int updateOfTimeAndIp(Coder coder, String time, String ip);
    public int updateOfStartTimeAndEndTime(Coder coder, String startTime, String endTime);
    public int updateOfStartTimeAndResult(Coder coder, String startTime, String result);
    public int updateOfStartTimeAndStatus(Coder coder, String startTime, String status);
    public int updateOfStartTimeAndUserId(Coder coder, String startTime, String userId);
    public int updateOfStartTimeAndQuestionId(Coder coder, String startTime, String questionId);
    public int updateOfStartTimeAndIp(Coder coder, String startTime, String ip);
    public int updateOfEndTimeAndResult(Coder coder, String endTime, String result);
    public int updateOfEndTimeAndStatus(Coder coder, String endTime, String status);
    public int updateOfEndTimeAndUserId(Coder coder, String endTime, String userId);
    public int updateOfEndTimeAndQuestionId(Coder coder, String endTime, String questionId);
    public int updateOfEndTimeAndIp(Coder coder, String endTime, String ip);
    public int updateOfResultAndStatus(Coder coder, String result, String status);
    public int updateOfResultAndUserId(Coder coder, String result, String userId);
    public int updateOfResultAndQuestionId(Coder coder, String result, String questionId);
    public int updateOfResultAndIp(Coder coder, String result, String ip);
    public int updateOfStatusAndUserId(Coder coder, String status, String userId);
    public int updateOfStatusAndQuestionId(Coder coder, String status, String questionId);
    public int updateOfStatusAndIp(Coder coder, String status, String ip);
    public int updateOfUserIdAndQuestionId(Coder coder, String userId, String questionId);
    public int updateOfUserIdAndIp(Coder coder, String userId, String ip);
    public int updateOfQuestionIdAndIp(Coder coder, String questionId, String ip);
    public int remove(Coder coder);
    public int removeOfCoderId(String coderId);
    public int removeOfCode(String code);
    public int removeOfTime(String time);
    public int removeOfStartTime(String startTime);
    public int removeOfEndTime(String endTime);
    public int removeOfResult(String result);
    public int removeOfStatus(String status);
    public int removeOfUserId(String userId);
    public int removeOfQuestionId(String questionId);
    public int removeOfIp(String ip);
    public int removeOfCoderIdAndCode(String coderId, String code);
    public int removeOfCoderIdAndTime(String coderId, String time);
    public int removeOfCoderIdAndStartTime(String coderId, String startTime);
    public int removeOfCoderIdAndEndTime(String coderId, String endTime);
    public int removeOfCoderIdAndResult(String coderId, String result);
    public int removeOfCoderIdAndStatus(String coderId, String status);
    public int removeOfCoderIdAndUserId(String coderId, String userId);
    public int removeOfCoderIdAndQuestionId(String coderId, String questionId);
    public int removeOfCoderIdAndIp(String coderId, String ip);
    public int removeOfCodeAndTime(String code, String time);
    public int removeOfCodeAndStartTime(String code, String startTime);
    public int removeOfCodeAndEndTime(String code, String endTime);
    public int removeOfCodeAndResult(String code, String result);
    public int removeOfCodeAndStatus(String code, String status);
    public int removeOfCodeAndUserId(String code, String userId);
    public int removeOfCodeAndQuestionId(String code, String questionId);
    public int removeOfCodeAndIp(String code, String ip);
    public int removeOfTimeAndStartTime(String time, String startTime);
    public int removeOfTimeAndEndTime(String time, String endTime);
    public int removeOfTimeAndResult(String time, String result);
    public int removeOfTimeAndStatus(String time, String status);
    public int removeOfTimeAndUserId(String time, String userId);
    public int removeOfTimeAndQuestionId(String time, String questionId);
    public int removeOfTimeAndIp(String time, String ip);
    public int removeOfStartTimeAndEndTime(String startTime, String endTime);
    public int removeOfStartTimeAndResult(String startTime, String result);
    public int removeOfStartTimeAndStatus(String startTime, String status);
    public int removeOfStartTimeAndUserId(String startTime, String userId);
    public int removeOfStartTimeAndQuestionId(String startTime, String questionId);
    public int removeOfStartTimeAndIp(String startTime, String ip);
    public int removeOfEndTimeAndResult(String endTime, String result);
    public int removeOfEndTimeAndStatus(String endTime, String status);
    public int removeOfEndTimeAndUserId(String endTime, String userId);
    public int removeOfEndTimeAndQuestionId(String endTime, String questionId);
    public int removeOfEndTimeAndIp(String endTime, String ip);
    public int removeOfResultAndStatus(String result, String status);
    public int removeOfResultAndUserId(String result, String userId);
    public int removeOfResultAndQuestionId(String result, String questionId);
    public int removeOfResultAndIp(String result, String ip);
    public int removeOfStatusAndUserId(String status, String userId);
    public int removeOfStatusAndQuestionId(String status, String questionId);
    public int removeOfStatusAndIp(String status, String ip);
    public int removeOfUserIdAndQuestionId(String userId, String questionId);
    public int removeOfUserIdAndIp(String userId, String ip);
    public int removeOfQuestionIdAndIp(String questionId, String ip);
    public int insert(Coder coder);
    public int insertOfCoderId(String coderId);
    public int insertOfCode(String code);
    public int insertOfTime(String time);
    public int insertOfStartTime(String startTime);
    public int insertOfEndTime(String endTime);
    public int insertOfResult(String result);
    public int insertOfStatus(String status);
    public int insertOfUserId(String userId);
    public int insertOfQuestionId(String questionId);
    public int insertOfIp(String ip);
    public int insertOfCoderIdAndCode(String coderId, String code);
    public int insertOfCoderIdAndTime(String coderId, String time);
    public int insertOfCoderIdAndStartTime(String coderId, String startTime);
    public int insertOfCoderIdAndEndTime(String coderId, String endTime);
    public int insertOfCoderIdAndResult(String coderId, String result);
    public int insertOfCoderIdAndStatus(String coderId, String status);
    public int insertOfCoderIdAndUserId(String coderId, String userId);
    public int insertOfCoderIdAndQuestionId(String coderId, String questionId);
    public int insertOfCoderIdAndIp(String coderId, String ip);
    public int insertOfCodeAndTime(String code, String time);
    public int insertOfCodeAndStartTime(String code, String startTime);
    public int insertOfCodeAndEndTime(String code, String endTime);
    public int insertOfCodeAndResult(String code, String result);
    public int insertOfCodeAndStatus(String code, String status);
    public int insertOfCodeAndUserId(String code, String userId);
    public int insertOfCodeAndQuestionId(String code, String questionId);
    public int insertOfCodeAndIp(String code, String ip);
    public int insertOfTimeAndStartTime(String time, String startTime);
    public int insertOfTimeAndEndTime(String time, String endTime);
    public int insertOfTimeAndResult(String time, String result);
    public int insertOfTimeAndStatus(String time, String status);
    public int insertOfTimeAndUserId(String time, String userId);
    public int insertOfTimeAndQuestionId(String time, String questionId);
    public int insertOfTimeAndIp(String time, String ip);
    public int insertOfStartTimeAndEndTime(String startTime, String endTime);
    public int insertOfStartTimeAndResult(String startTime, String result);
    public int insertOfStartTimeAndStatus(String startTime, String status);
    public int insertOfStartTimeAndUserId(String startTime, String userId);
    public int insertOfStartTimeAndQuestionId(String startTime, String questionId);
    public int insertOfStartTimeAndIp(String startTime, String ip);
    public int insertOfEndTimeAndResult(String endTime, String result);
    public int insertOfEndTimeAndStatus(String endTime, String status);
    public int insertOfEndTimeAndUserId(String endTime, String userId);
    public int insertOfEndTimeAndQuestionId(String endTime, String questionId);
    public int insertOfEndTimeAndIp(String endTime, String ip);
    public int insertOfResultAndStatus(String result, String status);
    public int insertOfResultAndUserId(String result, String userId);
    public int insertOfResultAndQuestionId(String result, String questionId);
    public int insertOfResultAndIp(String result, String ip);
    public int insertOfStatusAndUserId(String status, String userId);
    public int insertOfStatusAndQuestionId(String status, String questionId);
    public int insertOfStatusAndIp(String status, String ip);
    public int insertOfUserIdAndQuestionId(String userId, String questionId);
    public int insertOfUserIdAndIp(String userId, String ip);
    public int insertOfQuestionIdAndIp(String questionId, String ip);
    public Coder getCoder(Coder coder);
    public Coder getCoderOfCoderId(String coderId);
    public Coder getCoderOfCode(String code);
    public Coder getCoderOfTime(String time);
    public Coder getCoderOfStartTime(String startTime);
    public Coder getCoderOfEndTime(String endTime);
    public Coder getCoderOfResult(String result);
    public Coder getCoderOfStatus(String status);
    public Coder getCoderOfUserId(String userId);
    public Coder getCoderOfQuestionId(String questionId);
    public Coder getCoderOfIp(String ip);
    public Coder getCoderOfCoderIdAndCode(String coderId, String code);
    public Coder getCoderOfCoderIdAndTime(String coderId, String time);
    public Coder getCoderOfCoderIdAndStartTime(String coderId, String startTime);
    public Coder getCoderOfCoderIdAndEndTime(String coderId, String endTime);
    public Coder getCoderOfCoderIdAndResult(String coderId, String result);
    public Coder getCoderOfCoderIdAndStatus(String coderId, String status);
    public Coder getCoderOfCoderIdAndUserId(String coderId, String userId);
    public Coder getCoderOfCoderIdAndQuestionId(String coderId, String questionId);
    public Coder getCoderOfCoderIdAndIp(String coderId, String ip);
    public Coder getCoderOfCodeAndTime(String code, String time);
    public Coder getCoderOfCodeAndStartTime(String code, String startTime);
    public Coder getCoderOfCodeAndEndTime(String code, String endTime);
    public Coder getCoderOfCodeAndResult(String code, String result);
    public Coder getCoderOfCodeAndStatus(String code, String status);
    public Coder getCoderOfCodeAndUserId(String code, String userId);
    public Coder getCoderOfCodeAndQuestionId(String code, String questionId);
    public Coder getCoderOfCodeAndIp(String code, String ip);
    public Coder getCoderOfTimeAndStartTime(String time, String startTime);
    public Coder getCoderOfTimeAndEndTime(String time, String endTime);
    public Coder getCoderOfTimeAndResult(String time, String result);
    public Coder getCoderOfTimeAndStatus(String time, String status);
    public Coder getCoderOfTimeAndUserId(String time, String userId);
    public Coder getCoderOfTimeAndQuestionId(String time, String questionId);
    public Coder getCoderOfTimeAndIp(String time, String ip);
    public Coder getCoderOfStartTimeAndEndTime(String startTime, String endTime);
    public Coder getCoderOfStartTimeAndResult(String startTime, String result);
    public Coder getCoderOfStartTimeAndStatus(String startTime, String status);
    public Coder getCoderOfStartTimeAndUserId(String startTime, String userId);
    public Coder getCoderOfStartTimeAndQuestionId(String startTime, String questionId);
    public Coder getCoderOfStartTimeAndIp(String startTime, String ip);
    public Coder getCoderOfEndTimeAndResult(String endTime, String result);
    public Coder getCoderOfEndTimeAndStatus(String endTime, String status);
    public Coder getCoderOfEndTimeAndUserId(String endTime, String userId);
    public Coder getCoderOfEndTimeAndQuestionId(String endTime, String questionId);
    public Coder getCoderOfEndTimeAndIp(String endTime, String ip);
    public Coder getCoderOfResultAndStatus(String result, String status);
    public Coder getCoderOfResultAndUserId(String result, String userId);
    public Coder getCoderOfResultAndQuestionId(String result, String questionId);
    public Coder getCoderOfResultAndIp(String result, String ip);
    public Coder getCoderOfStatusAndUserId(String status, String userId);
    public Coder getCoderOfStatusAndQuestionId(String status, String questionId);
    public Coder getCoderOfStatusAndIp(String status, String ip);
    public Coder getCoderOfUserIdAndQuestionId(String userId, String questionId);
    public Coder getCoderOfUserIdAndIp(String userId, String ip);
    public Coder getCoderOfQuestionIdAndIp(String questionId, String ip);
    public List<Coder> getCoders(Coder coder);
    public List<Coder> getCodersOfCoderId(String coderId);
    public List<Coder> getCodersOfCode(String code);
    public List<Coder> getCodersOfTime(String time);
    public List<Coder> getCodersOfStartTime(String startTime);
    public List<Coder> getCodersOfEndTime(String endTime);
    public List<Coder> getCodersOfResult(String result);
    public List<Coder> getCodersOfStatus(String status);
    public List<Coder> getCodersOfUserId(String userId);
    public List<Coder> getCodersOfQuestionId(String questionId);
    public List<Coder> getCodersOfIp(String ip);
    public List<Coder> getCodersOfCoderIdAndCode(String coderId, String code);
    public List<Coder> getCodersOfCoderIdAndTime(String coderId, String time);
    public List<Coder> getCodersOfCoderIdAndStartTime(String coderId, String startTime);
    public List<Coder> getCodersOfCoderIdAndEndTime(String coderId, String endTime);
    public List<Coder> getCodersOfCoderIdAndResult(String coderId, String result);
    public List<Coder> getCodersOfCoderIdAndStatus(String coderId, String status);
    public List<Coder> getCodersOfCoderIdAndUserId(String coderId, String userId);
    public List<Coder> getCodersOfCoderIdAndQuestionId(String coderId, String questionId);
    public List<Coder> getCodersOfCoderIdAndIp(String coderId, String ip);
    public List<Coder> getCodersOfCodeAndTime(String code, String time);
    public List<Coder> getCodersOfCodeAndStartTime(String code, String startTime);
    public List<Coder> getCodersOfCodeAndEndTime(String code, String endTime);
    public List<Coder> getCodersOfCodeAndResult(String code, String result);
    public List<Coder> getCodersOfCodeAndStatus(String code, String status);
    public List<Coder> getCodersOfCodeAndUserId(String code, String userId);
    public List<Coder> getCodersOfCodeAndQuestionId(String code, String questionId);
    public List<Coder> getCodersOfCodeAndIp(String code, String ip);
    public List<Coder> getCodersOfTimeAndStartTime(String time, String startTime);
    public List<Coder> getCodersOfTimeAndEndTime(String time, String endTime);
    public List<Coder> getCodersOfTimeAndResult(String time, String result);
    public List<Coder> getCodersOfTimeAndStatus(String time, String status);
    public List<Coder> getCodersOfTimeAndUserId(String time, String userId);
    public List<Coder> getCodersOfTimeAndQuestionId(String time, String questionId);
    public List<Coder> getCodersOfTimeAndIp(String time, String ip);
    public List<Coder> getCodersOfStartTimeAndEndTime(String startTime, String endTime);
    public List<Coder> getCodersOfStartTimeAndResult(String startTime, String result);
    public List<Coder> getCodersOfStartTimeAndStatus(String startTime, String status);
    public List<Coder> getCodersOfStartTimeAndUserId(String startTime, String userId);
    public List<Coder> getCodersOfStartTimeAndQuestionId(String startTime, String questionId);
    public List<Coder> getCodersOfStartTimeAndIp(String startTime, String ip);
    public List<Coder> getCodersOfEndTimeAndResult(String endTime, String result);
    public List<Coder> getCodersOfEndTimeAndStatus(String endTime, String status);
    public List<Coder> getCodersOfEndTimeAndUserId(String endTime, String userId);
    public List<Coder> getCodersOfEndTimeAndQuestionId(String endTime, String questionId);
    public List<Coder> getCodersOfEndTimeAndIp(String endTime, String ip);
    public List<Coder> getCodersOfResultAndStatus(String result, String status);
    public List<Coder> getCodersOfResultAndUserId(String result, String userId);
    public List<Coder> getCodersOfResultAndQuestionId(String result, String questionId);
    public List<Coder> getCodersOfResultAndIp(String result, String ip);
    public List<Coder> getCodersOfStatusAndUserId(String status, String userId);
    public List<Coder> getCodersOfStatusAndQuestionId(String status, String questionId);
    public List<Coder> getCodersOfStatusAndIp(String status, String ip);
    public List<Coder> getCodersOfUserIdAndQuestionId(String userId, String questionId);
    public List<Coder> getCodersOfUserIdAndIp(String userId, String ip);
    public List<Coder> getCodersOfQuestionIdAndIp(String questionId, String ip);
}
