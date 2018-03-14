package com.oj.linglian.daoImpl;

import java.util.List;

import com.oj.linglian.entity.Answer;

import com.oj.linglian.dao.IAnswerDao;
import db.DBMan;

public class IAnswerDaoImpl implements IAnswerDao {
    public int update(Answer answer, Answer keyAnswer) {
        return DBMan.getInstance().updateNoSqlWithoutThrow(answer, keyAnswer, "answer");
    }
    public int updateOfAnswerId(Answer answer, String answerId) {
        Answer kAnswer = new Answer();
        kAnswer.setAnswerId(answerId);
        return update(answer, kAnswer);
    }
    public int updateOfUserId(Answer answer, String userId) {
        Answer kAnswer = new Answer();
        kAnswer.setUserId(userId);
        return update(answer, kAnswer);
    }
    public int updateOfQuestionId(Answer answer, String questionId) {
        Answer kAnswer = new Answer();
        kAnswer.setQuestionId(questionId);
        return update(answer, kAnswer);
    }
    public int updateOfBody(Answer answer, String body) {
        Answer kAnswer = new Answer();
        kAnswer.setBody(body);
        return update(answer, kAnswer);
    }
    public int updateOfTime(Answer answer, String time) {
        Answer kAnswer = new Answer();
        kAnswer.setTime(time);
        return update(answer, kAnswer);
    }
    public int updateOfAnswerIdAndUserId(Answer answer, String answerId, String userId) {
        Answer kAnswer = new Answer();
        kAnswer.setAnswerId(answerId);
        kAnswer.setUserId(userId);
        return update(answer, kAnswer);
    }
    public int updateOfAnswerIdAndQuestionId(Answer answer, String answerId, String questionId) {
        Answer kAnswer = new Answer();
        kAnswer.setAnswerId(answerId);
        kAnswer.setQuestionId(questionId);
        return update(answer, kAnswer);
    }
    public int updateOfAnswerIdAndBody(Answer answer, String answerId, String body) {
        Answer kAnswer = new Answer();
        kAnswer.setAnswerId(answerId);
        kAnswer.setBody(body);
        return update(answer, kAnswer);
    }
    public int updateOfAnswerIdAndTime(Answer answer, String answerId, String time) {
        Answer kAnswer = new Answer();
        kAnswer.setAnswerId(answerId);
        kAnswer.setTime(time);
        return update(answer, kAnswer);
    }
    public int updateOfUserIdAndQuestionId(Answer answer, String userId, String questionId) {
        Answer kAnswer = new Answer();
        kAnswer.setUserId(userId);
        kAnswer.setQuestionId(questionId);
        return update(answer, kAnswer);
    }
    public int updateOfUserIdAndBody(Answer answer, String userId, String body) {
        Answer kAnswer = new Answer();
        kAnswer.setUserId(userId);
        kAnswer.setBody(body);
        return update(answer, kAnswer);
    }
    public int updateOfUserIdAndTime(Answer answer, String userId, String time) {
        Answer kAnswer = new Answer();
        kAnswer.setUserId(userId);
        kAnswer.setTime(time);
        return update(answer, kAnswer);
    }
    public int updateOfQuestionIdAndBody(Answer answer, String questionId, String body) {
        Answer kAnswer = new Answer();
        kAnswer.setQuestionId(questionId);
        kAnswer.setBody(body);
        return update(answer, kAnswer);
    }
    public int updateOfQuestionIdAndTime(Answer answer, String questionId, String time) {
        Answer kAnswer = new Answer();
        kAnswer.setQuestionId(questionId);
        kAnswer.setTime(time);
        return update(answer, kAnswer);
    }
    public int updateOfBodyAndTime(Answer answer, String body, String time) {
        Answer kAnswer = new Answer();
        kAnswer.setBody(body);
        kAnswer.setTime(time);
        return update(answer, kAnswer);
    }
    public int remove(Answer answer) {
        return DBMan.getInstance().deleteNoSqlWithoutThrow(answer, "answer");
    }
    public int removeOfAnswerId(String answerId) {
        Answer answer = new Answer();
        answer.setAnswerId(answerId);
        return remove(answer);
    }
    public int removeOfUserId(String userId) {
        Answer answer = new Answer();
        answer.setUserId(userId);
        return remove(answer);
    }
    public int removeOfQuestionId(String questionId) {
        Answer answer = new Answer();
        answer.setQuestionId(questionId);
        return remove(answer);
    }
    public int removeOfBody(String body) {
        Answer answer = new Answer();
        answer.setBody(body);
        return remove(answer);
    }
    public int removeOfTime(String time) {
        Answer answer = new Answer();
        answer.setTime(time);
        return remove(answer);
    }
    public int removeOfAnswerIdAndUserId(String answerId, String userId) {
        Answer answer = new Answer();
        answer.setAnswerId(answerId);
        answer.setUserId(userId);
        return remove(answer);
    }
    public int removeOfAnswerIdAndQuestionId(String answerId, String questionId) {
        Answer answer = new Answer();
        answer.setAnswerId(answerId);
        answer.setQuestionId(questionId);
        return remove(answer);
    }
    public int removeOfAnswerIdAndBody(String answerId, String body) {
        Answer answer = new Answer();
        answer.setAnswerId(answerId);
        answer.setBody(body);
        return remove(answer);
    }
    public int removeOfAnswerIdAndTime(String answerId, String time) {
        Answer answer = new Answer();
        answer.setAnswerId(answerId);
        answer.setTime(time);
        return remove(answer);
    }
    public int removeOfUserIdAndQuestionId(String userId, String questionId) {
        Answer answer = new Answer();
        answer.setUserId(userId);
        answer.setQuestionId(questionId);
        return remove(answer);
    }
    public int removeOfUserIdAndBody(String userId, String body) {
        Answer answer = new Answer();
        answer.setUserId(userId);
        answer.setBody(body);
        return remove(answer);
    }
    public int removeOfUserIdAndTime(String userId, String time) {
        Answer answer = new Answer();
        answer.setUserId(userId);
        answer.setTime(time);
        return remove(answer);
    }
    public int removeOfQuestionIdAndBody(String questionId, String body) {
        Answer answer = new Answer();
        answer.setQuestionId(questionId);
        answer.setBody(body);
        return remove(answer);
    }
    public int removeOfQuestionIdAndTime(String questionId, String time) {
        Answer answer = new Answer();
        answer.setQuestionId(questionId);
        answer.setTime(time);
        return remove(answer);
    }
    public int removeOfBodyAndTime(String body, String time) {
        Answer answer = new Answer();
        answer.setBody(body);
        answer.setTime(time);
        return remove(answer);
    }
    public int insert(Answer answer) {
        return DBMan.getInstance().insertNoSqlWithoutThrow(answer, "answer");
    }
    public int insertOfAnswerId(String answerId) {
        Answer answer = new Answer();
        answer.setAnswerId(answerId);
        return insert(answer);
    }
    public int insertOfUserId(String userId) {
        Answer answer = new Answer();
        answer.setUserId(userId);
        return insert(answer);
    }
    public int insertOfQuestionId(String questionId) {
        Answer answer = new Answer();
        answer.setQuestionId(questionId);
        return insert(answer);
    }
    public int insertOfBody(String body) {
        Answer answer = new Answer();
        answer.setBody(body);
        return insert(answer);
    }
    public int insertOfTime(String time) {
        Answer answer = new Answer();
        answer.setTime(time);
        return insert(answer);
    }
    public int insertOfAnswerIdAndUserId(String answerId, String userId) {
        Answer answer = new Answer();
        answer.setAnswerId(answerId);
        answer.setUserId(userId);
        return insert(answer);
    }
    public int insertOfAnswerIdAndQuestionId(String answerId, String questionId) {
        Answer answer = new Answer();
        answer.setAnswerId(answerId);
        answer.setQuestionId(questionId);
        return insert(answer);
    }
    public int insertOfAnswerIdAndBody(String answerId, String body) {
        Answer answer = new Answer();
        answer.setAnswerId(answerId);
        answer.setBody(body);
        return insert(answer);
    }
    public int insertOfAnswerIdAndTime(String answerId, String time) {
        Answer answer = new Answer();
        answer.setAnswerId(answerId);
        answer.setTime(time);
        return insert(answer);
    }
    public int insertOfUserIdAndQuestionId(String userId, String questionId) {
        Answer answer = new Answer();
        answer.setUserId(userId);
        answer.setQuestionId(questionId);
        return insert(answer);
    }
    public int insertOfUserIdAndBody(String userId, String body) {
        Answer answer = new Answer();
        answer.setUserId(userId);
        answer.setBody(body);
        return insert(answer);
    }
    public int insertOfUserIdAndTime(String userId, String time) {
        Answer answer = new Answer();
        answer.setUserId(userId);
        answer.setTime(time);
        return insert(answer);
    }
    public int insertOfQuestionIdAndBody(String questionId, String body) {
        Answer answer = new Answer();
        answer.setQuestionId(questionId);
        answer.setBody(body);
        return insert(answer);
    }
    public int insertOfQuestionIdAndTime(String questionId, String time) {
        Answer answer = new Answer();
        answer.setQuestionId(questionId);
        answer.setTime(time);
        return insert(answer);
    }
    public int insertOfBodyAndTime(String body, String time) {
        Answer answer = new Answer();
        answer.setBody(body);
        answer.setTime(time);
        return insert(answer);
    }
    public Answer getAnswer(Answer answer) {
        return DBMan.getInstance().queryByIdNoSqlWithoutThrow(answer, "answer");
    }
    public Answer getAnswerOfAnswerId(String answerId) {
        Answer answer = new Answer();
        answer.setAnswerId(answerId);
        return getAnswer(answer);
    }
    public Answer getAnswerOfUserId(String userId) {
        Answer answer = new Answer();
        answer.setUserId(userId);
        return getAnswer(answer);
    }
    public Answer getAnswerOfQuestionId(String questionId) {
        Answer answer = new Answer();
        answer.setQuestionId(questionId);
        return getAnswer(answer);
    }
    public Answer getAnswerOfBody(String body) {
        Answer answer = new Answer();
        answer.setBody(body);
        return getAnswer(answer);
    }
    public Answer getAnswerOfTime(String time) {
        Answer answer = new Answer();
        answer.setTime(time);
        return getAnswer(answer);
    }
    public Answer getAnswerOfAnswerIdAndUserId(String answerId, String userId) {
        Answer answer = new Answer();
        answer.setAnswerId(answerId);
        answer.setUserId(userId);
        return getAnswer(answer);
    }
    public Answer getAnswerOfAnswerIdAndQuestionId(String answerId, String questionId) {
        Answer answer = new Answer();
        answer.setAnswerId(answerId);
        answer.setQuestionId(questionId);
        return getAnswer(answer);
    }
    public Answer getAnswerOfAnswerIdAndBody(String answerId, String body) {
        Answer answer = new Answer();
        answer.setAnswerId(answerId);
        answer.setBody(body);
        return getAnswer(answer);
    }
    public Answer getAnswerOfAnswerIdAndTime(String answerId, String time) {
        Answer answer = new Answer();
        answer.setAnswerId(answerId);
        answer.setTime(time);
        return getAnswer(answer);
    }
    public Answer getAnswerOfUserIdAndQuestionId(String userId, String questionId) {
        Answer answer = new Answer();
        answer.setUserId(userId);
        answer.setQuestionId(questionId);
        return getAnswer(answer);
    }
    public Answer getAnswerOfUserIdAndBody(String userId, String body) {
        Answer answer = new Answer();
        answer.setUserId(userId);
        answer.setBody(body);
        return getAnswer(answer);
    }
    public Answer getAnswerOfUserIdAndTime(String userId, String time) {
        Answer answer = new Answer();
        answer.setUserId(userId);
        answer.setTime(time);
        return getAnswer(answer);
    }
    public Answer getAnswerOfQuestionIdAndBody(String questionId, String body) {
        Answer answer = new Answer();
        answer.setQuestionId(questionId);
        answer.setBody(body);
        return getAnswer(answer);
    }
    public Answer getAnswerOfQuestionIdAndTime(String questionId, String time) {
        Answer answer = new Answer();
        answer.setQuestionId(questionId);
        answer.setTime(time);
        return getAnswer(answer);
    }
    public Answer getAnswerOfBodyAndTime(String body, String time) {
        Answer answer = new Answer();
        answer.setBody(body);
        answer.setTime(time);
        return getAnswer(answer);
    }
    public List<Answer> getAnswers(Answer answer) {
        return DBMan.getInstance().queryNoSqlWithoutThrow(answer, "answer");
    }
    public List<Answer> getAnswersOfAnswerId(String answerId) {
        Answer answer = new Answer();
        answer.setAnswerId(answerId);
        return getAnswers(answer);
    }
    public List<Answer> getAnswersOfUserId(String userId) {
        Answer answer = new Answer();
        answer.setUserId(userId);
        return getAnswers(answer);
    }
    public List<Answer> getAnswersOfQuestionId(String questionId) {
        Answer answer = new Answer();
        answer.setQuestionId(questionId);
        return getAnswers(answer);
    }
    public List<Answer> getAnswersOfBody(String body) {
        Answer answer = new Answer();
        answer.setBody(body);
        return getAnswers(answer);
    }
    public List<Answer> getAnswersOfTime(String time) {
        Answer answer = new Answer();
        answer.setTime(time);
        return getAnswers(answer);
    }
    public List<Answer> getAnswersOfAnswerIdAndUserId(String answerId, String userId) {
        Answer answer = new Answer();
        answer.setAnswerId(answerId);
        answer.setUserId(userId);
        return getAnswers(answer);
    }
    public List<Answer> getAnswersOfAnswerIdAndQuestionId(String answerId, String questionId) {
        Answer answer = new Answer();
        answer.setAnswerId(answerId);
        answer.setQuestionId(questionId);
        return getAnswers(answer);
    }
    public List<Answer> getAnswersOfAnswerIdAndBody(String answerId, String body) {
        Answer answer = new Answer();
        answer.setAnswerId(answerId);
        answer.setBody(body);
        return getAnswers(answer);
    }
    public List<Answer> getAnswersOfAnswerIdAndTime(String answerId, String time) {
        Answer answer = new Answer();
        answer.setAnswerId(answerId);
        answer.setTime(time);
        return getAnswers(answer);
    }
    public List<Answer> getAnswersOfUserIdAndQuestionId(String userId, String questionId) {
        Answer answer = new Answer();
        answer.setUserId(userId);
        answer.setQuestionId(questionId);
        return getAnswers(answer);
    }
    public List<Answer> getAnswersOfUserIdAndBody(String userId, String body) {
        Answer answer = new Answer();
        answer.setUserId(userId);
        answer.setBody(body);
        return getAnswers(answer);
    }
    public List<Answer> getAnswersOfUserIdAndTime(String userId, String time) {
        Answer answer = new Answer();
        answer.setUserId(userId);
        answer.setTime(time);
        return getAnswers(answer);
    }
    public List<Answer> getAnswersOfQuestionIdAndBody(String questionId, String body) {
        Answer answer = new Answer();
        answer.setQuestionId(questionId);
        answer.setBody(body);
        return getAnswers(answer);
    }
    public List<Answer> getAnswersOfQuestionIdAndTime(String questionId, String time) {
        Answer answer = new Answer();
        answer.setQuestionId(questionId);
        answer.setTime(time);
        return getAnswers(answer);
    }
    public List<Answer> getAnswersOfBodyAndTime(String body, String time) {
        Answer answer = new Answer();
        answer.setBody(body);
        answer.setTime(time);
        return getAnswers(answer);
    }
}
