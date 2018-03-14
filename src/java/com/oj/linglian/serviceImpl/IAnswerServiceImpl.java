package com.oj.linglian.serviceImpl;

import java.util.List;

import com.oj.linglian.entity.Answer;

import com.oj.linglian.dao.IAnswerDao;
import com.oj.linglian.daoImpl.IAnswerDaoImpl;
import com.oj.linglian.service.IAnswerService;

public class IAnswerServiceImpl implements IAnswerService {
	IAnswerDao dao = null;

	public IAnswerServiceImpl() {
		dao = new IAnswerDaoImpl();
	}
    public int update(Answer answer, Answer keyAnswer) {
        return dao.update(answer, keyAnswer);
    }
    public int updateOfAnswerId(Answer answer, String answerId) {
        return dao.updateOfAnswerId(answer, answerId);
    }
    public int updateOfUserId(Answer answer, String userId) {
        return dao.updateOfUserId(answer, userId);
    }
    public int updateOfQuestionId(Answer answer, String questionId) {
        return dao.updateOfQuestionId(answer, questionId);
    }
    public int updateOfBody(Answer answer, String body) {
        return dao.updateOfBody(answer, body);
    }
    public int updateOfTime(Answer answer, String time) {
        return dao.updateOfTime(answer, time);
    }
    public int updateOfAnswerIdAndUserId(Answer answer, String answerId, String userId) {
        return dao.updateOfAnswerIdAndUserId(answer, answerId, userId);
    }
    public int updateOfAnswerIdAndQuestionId(Answer answer, String answerId, String questionId) {
        return dao.updateOfAnswerIdAndQuestionId(answer, answerId, questionId);
    }
    public int updateOfAnswerIdAndBody(Answer answer, String answerId, String body) {
        return dao.updateOfAnswerIdAndBody(answer, answerId, body);
    }
    public int updateOfAnswerIdAndTime(Answer answer, String answerId, String time) {
        return dao.updateOfAnswerIdAndTime(answer, answerId, time);
    }
    public int updateOfUserIdAndQuestionId(Answer answer, String userId, String questionId) {
        return dao.updateOfUserIdAndQuestionId(answer, userId, questionId);
    }
    public int updateOfUserIdAndBody(Answer answer, String userId, String body) {
        return dao.updateOfUserIdAndBody(answer, userId, body);
    }
    public int updateOfUserIdAndTime(Answer answer, String userId, String time) {
        return dao.updateOfUserIdAndTime(answer, userId, time);
    }
    public int updateOfQuestionIdAndBody(Answer answer, String questionId, String body) {
        return dao.updateOfQuestionIdAndBody(answer, questionId, body);
    }
    public int updateOfQuestionIdAndTime(Answer answer, String questionId, String time) {
        return dao.updateOfQuestionIdAndTime(answer, questionId, time);
    }
    public int updateOfBodyAndTime(Answer answer, String body, String time) {
        return dao.updateOfBodyAndTime(answer, body, time);
    }
    public int remove(Answer answer) {
        return dao.remove(answer);
    }
    public int removeOfAnswerId(String answerId) {
        return dao.removeOfAnswerId(answerId);
    }
    public int removeOfUserId(String userId) {
        return dao.removeOfUserId(userId);
    }
    public int removeOfQuestionId(String questionId) {
        return dao.removeOfQuestionId(questionId);
    }
    public int removeOfBody(String body) {
        return dao.removeOfBody(body);
    }
    public int removeOfTime(String time) {
        return dao.removeOfTime(time);
    }
    public int removeOfAnswerIdAndUserId(String answerId, String userId) {
        return dao.removeOfAnswerIdAndUserId(answerId, userId);
    }
    public int removeOfAnswerIdAndQuestionId(String answerId, String questionId) {
        return dao.removeOfAnswerIdAndQuestionId(answerId, questionId);
    }
    public int removeOfAnswerIdAndBody(String answerId, String body) {
        return dao.removeOfAnswerIdAndBody(answerId, body);
    }
    public int removeOfAnswerIdAndTime(String answerId, String time) {
        return dao.removeOfAnswerIdAndTime(answerId, time);
    }
    public int removeOfUserIdAndQuestionId(String userId, String questionId) {
        return dao.removeOfUserIdAndQuestionId(userId, questionId);
    }
    public int removeOfUserIdAndBody(String userId, String body) {
        return dao.removeOfUserIdAndBody(userId, body);
    }
    public int removeOfUserIdAndTime(String userId, String time) {
        return dao.removeOfUserIdAndTime(userId, time);
    }
    public int removeOfQuestionIdAndBody(String questionId, String body) {
        return dao.removeOfQuestionIdAndBody(questionId, body);
    }
    public int removeOfQuestionIdAndTime(String questionId, String time) {
        return dao.removeOfQuestionIdAndTime(questionId, time);
    }
    public int removeOfBodyAndTime(String body, String time) {
        return dao.removeOfBodyAndTime(body, time);
    }
    public int insert(Answer answer) {
        return dao.insert(answer);
    }
    public int insertOfAnswerId(String answerId) {
        return dao.insertOfAnswerId(answerId);
    }
    public int insertOfUserId(String userId) {
        return dao.insertOfUserId(userId);
    }
    public int insertOfQuestionId(String questionId) {
        return dao.insertOfQuestionId(questionId);
    }
    public int insertOfBody(String body) {
        return dao.insertOfBody(body);
    }
    public int insertOfTime(String time) {
        return dao.insertOfTime(time);
    }
    public int insertOfAnswerIdAndUserId(String answerId, String userId) {
        return dao.insertOfAnswerIdAndUserId(answerId, userId);
    }
    public int insertOfAnswerIdAndQuestionId(String answerId, String questionId) {
        return dao.insertOfAnswerIdAndQuestionId(answerId, questionId);
    }
    public int insertOfAnswerIdAndBody(String answerId, String body) {
        return dao.insertOfAnswerIdAndBody(answerId, body);
    }
    public int insertOfAnswerIdAndTime(String answerId, String time) {
        return dao.insertOfAnswerIdAndTime(answerId, time);
    }
    public int insertOfUserIdAndQuestionId(String userId, String questionId) {
        return dao.insertOfUserIdAndQuestionId(userId, questionId);
    }
    public int insertOfUserIdAndBody(String userId, String body) {
        return dao.insertOfUserIdAndBody(userId, body);
    }
    public int insertOfUserIdAndTime(String userId, String time) {
        return dao.insertOfUserIdAndTime(userId, time);
    }
    public int insertOfQuestionIdAndBody(String questionId, String body) {
        return dao.insertOfQuestionIdAndBody(questionId, body);
    }
    public int insertOfQuestionIdAndTime(String questionId, String time) {
        return dao.insertOfQuestionIdAndTime(questionId, time);
    }
    public int insertOfBodyAndTime(String body, String time) {
        return dao.insertOfBodyAndTime(body, time);
    }
    public Answer getAnswer(Answer answer) {
        return dao.getAnswer(answer);
    }
    public Answer getAnswerOfAnswerId(String answerId) {
        return dao.getAnswerOfAnswerId(answerId);
    }
    public Answer getAnswerOfUserId(String userId) {
        return dao.getAnswerOfUserId(userId);
    }
    public Answer getAnswerOfQuestionId(String questionId) {
        return dao.getAnswerOfQuestionId(questionId);
    }
    public Answer getAnswerOfBody(String body) {
        return dao.getAnswerOfBody(body);
    }
    public Answer getAnswerOfTime(String time) {
        return dao.getAnswerOfTime(time);
    }
    public Answer getAnswerOfAnswerIdAndUserId(String answerId, String userId) {
        return dao.getAnswerOfAnswerIdAndUserId(answerId, userId);
    }
    public Answer getAnswerOfAnswerIdAndQuestionId(String answerId, String questionId) {
        return dao.getAnswerOfAnswerIdAndQuestionId(answerId, questionId);
    }
    public Answer getAnswerOfAnswerIdAndBody(String answerId, String body) {
        return dao.getAnswerOfAnswerIdAndBody(answerId, body);
    }
    public Answer getAnswerOfAnswerIdAndTime(String answerId, String time) {
        return dao.getAnswerOfAnswerIdAndTime(answerId, time);
    }
    public Answer getAnswerOfUserIdAndQuestionId(String userId, String questionId) {
        return dao.getAnswerOfUserIdAndQuestionId(userId, questionId);
    }
    public Answer getAnswerOfUserIdAndBody(String userId, String body) {
        return dao.getAnswerOfUserIdAndBody(userId, body);
    }
    public Answer getAnswerOfUserIdAndTime(String userId, String time) {
        return dao.getAnswerOfUserIdAndTime(userId, time);
    }
    public Answer getAnswerOfQuestionIdAndBody(String questionId, String body) {
        return dao.getAnswerOfQuestionIdAndBody(questionId, body);
    }
    public Answer getAnswerOfQuestionIdAndTime(String questionId, String time) {
        return dao.getAnswerOfQuestionIdAndTime(questionId, time);
    }
    public Answer getAnswerOfBodyAndTime(String body, String time) {
        return dao.getAnswerOfBodyAndTime(body, time);
    }
    public List<Answer> getAnswers(Answer answer) {
        return dao.getAnswers(answer);
    }
    public List<Answer> getAnswersOfAnswerId(String answerId) {
        return dao.getAnswersOfAnswerId(answerId);
    }
    public List<Answer> getAnswersOfUserId(String userId) {
        return dao.getAnswersOfUserId(userId);
    }
    public List<Answer> getAnswersOfQuestionId(String questionId) {
        return dao.getAnswersOfQuestionId(questionId);
    }
    public List<Answer> getAnswersOfBody(String body) {
        return dao.getAnswersOfBody(body);
    }
    public List<Answer> getAnswersOfTime(String time) {
        return dao.getAnswersOfTime(time);
    }
    public List<Answer> getAnswersOfAnswerIdAndUserId(String answerId, String userId) {
        return dao.getAnswersOfAnswerIdAndUserId(answerId, userId);
    }
    public List<Answer> getAnswersOfAnswerIdAndQuestionId(String answerId, String questionId) {
        return dao.getAnswersOfAnswerIdAndQuestionId(answerId, questionId);
    }
    public List<Answer> getAnswersOfAnswerIdAndBody(String answerId, String body) {
        return dao.getAnswersOfAnswerIdAndBody(answerId, body);
    }
    public List<Answer> getAnswersOfAnswerIdAndTime(String answerId, String time) {
        return dao.getAnswersOfAnswerIdAndTime(answerId, time);
    }
    public List<Answer> getAnswersOfUserIdAndQuestionId(String userId, String questionId) {
        return dao.getAnswersOfUserIdAndQuestionId(userId, questionId);
    }
    public List<Answer> getAnswersOfUserIdAndBody(String userId, String body) {
        return dao.getAnswersOfUserIdAndBody(userId, body);
    }
    public List<Answer> getAnswersOfUserIdAndTime(String userId, String time) {
        return dao.getAnswersOfUserIdAndTime(userId, time);
    }
    public List<Answer> getAnswersOfQuestionIdAndBody(String questionId, String body) {
        return dao.getAnswersOfQuestionIdAndBody(questionId, body);
    }
    public List<Answer> getAnswersOfQuestionIdAndTime(String questionId, String time) {
        return dao.getAnswersOfQuestionIdAndTime(questionId, time);
    }
    public List<Answer> getAnswersOfBodyAndTime(String body, String time) {
        return dao.getAnswersOfBodyAndTime(body, time);
    }
}
