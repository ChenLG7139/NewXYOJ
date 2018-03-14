package com.oj.linglian.serviceImpl;

import java.util.List;

import com.oj.linglian.entity.Comment;

import com.oj.linglian.dao.ICommentDao;
import com.oj.linglian.daoImpl.ICommentDaoImpl;
import com.oj.linglian.service.ICommentService;

public class ICommentServiceImpl implements ICommentService {
	ICommentDao dao = null;

	public ICommentServiceImpl() {
		dao = new ICommentDaoImpl();
	}
    public int update(Comment comment, Comment keyComment) {
        return dao.update(comment, keyComment);
    }
    public int updateOfCommentId(Comment comment, String commentId) {
        return dao.updateOfCommentId(comment, commentId);
    }
    public int updateOfQuestionId(Comment comment, String questionId) {
        return dao.updateOfQuestionId(comment, questionId);
    }
    public int updateOfCoderId(Comment comment, String coderId) {
        return dao.updateOfCoderId(comment, coderId);
    }
    public int updateOfBody(Comment comment, String body) {
        return dao.updateOfBody(comment, body);
    }
    public int updateOfTime(Comment comment, String time) {
        return dao.updateOfTime(comment, time);
    }
    public int updateOfUserId(Comment comment, String userId) {
        return dao.updateOfUserId(comment, userId);
    }
    public int updateOfCommentIdAndQuestionId(Comment comment, String commentId, String questionId) {
        return dao.updateOfCommentIdAndQuestionId(comment, commentId, questionId);
    }
    public int updateOfCommentIdAndCoderId(Comment comment, String commentId, String coderId) {
        return dao.updateOfCommentIdAndCoderId(comment, commentId, coderId);
    }
    public int updateOfCommentIdAndBody(Comment comment, String commentId, String body) {
        return dao.updateOfCommentIdAndBody(comment, commentId, body);
    }
    public int updateOfCommentIdAndTime(Comment comment, String commentId, String time) {
        return dao.updateOfCommentIdAndTime(comment, commentId, time);
    }
    public int updateOfCommentIdAndUserId(Comment comment, String commentId, String userId) {
        return dao.updateOfCommentIdAndUserId(comment, commentId, userId);
    }
    public int updateOfQuestionIdAndCoderId(Comment comment, String questionId, String coderId) {
        return dao.updateOfQuestionIdAndCoderId(comment, questionId, coderId);
    }
    public int updateOfQuestionIdAndBody(Comment comment, String questionId, String body) {
        return dao.updateOfQuestionIdAndBody(comment, questionId, body);
    }
    public int updateOfQuestionIdAndTime(Comment comment, String questionId, String time) {
        return dao.updateOfQuestionIdAndTime(comment, questionId, time);
    }
    public int updateOfQuestionIdAndUserId(Comment comment, String questionId, String userId) {
        return dao.updateOfQuestionIdAndUserId(comment, questionId, userId);
    }
    public int updateOfCoderIdAndBody(Comment comment, String coderId, String body) {
        return dao.updateOfCoderIdAndBody(comment, coderId, body);
    }
    public int updateOfCoderIdAndTime(Comment comment, String coderId, String time) {
        return dao.updateOfCoderIdAndTime(comment, coderId, time);
    }
    public int updateOfCoderIdAndUserId(Comment comment, String coderId, String userId) {
        return dao.updateOfCoderIdAndUserId(comment, coderId, userId);
    }
    public int updateOfBodyAndTime(Comment comment, String body, String time) {
        return dao.updateOfBodyAndTime(comment, body, time);
    }
    public int updateOfBodyAndUserId(Comment comment, String body, String userId) {
        return dao.updateOfBodyAndUserId(comment, body, userId);
    }
    public int updateOfTimeAndUserId(Comment comment, String time, String userId) {
        return dao.updateOfTimeAndUserId(comment, time, userId);
    }
    public int remove(Comment comment) {
        return dao.remove(comment);
    }
    public int removeOfCommentId(String commentId) {
        return dao.removeOfCommentId(commentId);
    }
    public int removeOfQuestionId(String questionId) {
        return dao.removeOfQuestionId(questionId);
    }
    public int removeOfCoderId(String coderId) {
        return dao.removeOfCoderId(coderId);
    }
    public int removeOfBody(String body) {
        return dao.removeOfBody(body);
    }
    public int removeOfTime(String time) {
        return dao.removeOfTime(time);
    }
    public int removeOfUserId(String userId) {
        return dao.removeOfUserId(userId);
    }
    public int removeOfCommentIdAndQuestionId(String commentId, String questionId) {
        return dao.removeOfCommentIdAndQuestionId(commentId, questionId);
    }
    public int removeOfCommentIdAndCoderId(String commentId, String coderId) {
        return dao.removeOfCommentIdAndCoderId(commentId, coderId);
    }
    public int removeOfCommentIdAndBody(String commentId, String body) {
        return dao.removeOfCommentIdAndBody(commentId, body);
    }
    public int removeOfCommentIdAndTime(String commentId, String time) {
        return dao.removeOfCommentIdAndTime(commentId, time);
    }
    public int removeOfCommentIdAndUserId(String commentId, String userId) {
        return dao.removeOfCommentIdAndUserId(commentId, userId);
    }
    public int removeOfQuestionIdAndCoderId(String questionId, String coderId) {
        return dao.removeOfQuestionIdAndCoderId(questionId, coderId);
    }
    public int removeOfQuestionIdAndBody(String questionId, String body) {
        return dao.removeOfQuestionIdAndBody(questionId, body);
    }
    public int removeOfQuestionIdAndTime(String questionId, String time) {
        return dao.removeOfQuestionIdAndTime(questionId, time);
    }
    public int removeOfQuestionIdAndUserId(String questionId, String userId) {
        return dao.removeOfQuestionIdAndUserId(questionId, userId);
    }
    public int removeOfCoderIdAndBody(String coderId, String body) {
        return dao.removeOfCoderIdAndBody(coderId, body);
    }
    public int removeOfCoderIdAndTime(String coderId, String time) {
        return dao.removeOfCoderIdAndTime(coderId, time);
    }
    public int removeOfCoderIdAndUserId(String coderId, String userId) {
        return dao.removeOfCoderIdAndUserId(coderId, userId);
    }
    public int removeOfBodyAndTime(String body, String time) {
        return dao.removeOfBodyAndTime(body, time);
    }
    public int removeOfBodyAndUserId(String body, String userId) {
        return dao.removeOfBodyAndUserId(body, userId);
    }
    public int removeOfTimeAndUserId(String time, String userId) {
        return dao.removeOfTimeAndUserId(time, userId);
    }
    public int insert(Comment comment) {
        return dao.insert(comment);
    }
    public int insertOfCommentId(String commentId) {
        return dao.insertOfCommentId(commentId);
    }
    public int insertOfQuestionId(String questionId) {
        return dao.insertOfQuestionId(questionId);
    }
    public int insertOfCoderId(String coderId) {
        return dao.insertOfCoderId(coderId);
    }
    public int insertOfBody(String body) {
        return dao.insertOfBody(body);
    }
    public int insertOfTime(String time) {
        return dao.insertOfTime(time);
    }
    public int insertOfUserId(String userId) {
        return dao.insertOfUserId(userId);
    }
    public int insertOfCommentIdAndQuestionId(String commentId, String questionId) {
        return dao.insertOfCommentIdAndQuestionId(commentId, questionId);
    }
    public int insertOfCommentIdAndCoderId(String commentId, String coderId) {
        return dao.insertOfCommentIdAndCoderId(commentId, coderId);
    }
    public int insertOfCommentIdAndBody(String commentId, String body) {
        return dao.insertOfCommentIdAndBody(commentId, body);
    }
    public int insertOfCommentIdAndTime(String commentId, String time) {
        return dao.insertOfCommentIdAndTime(commentId, time);
    }
    public int insertOfCommentIdAndUserId(String commentId, String userId) {
        return dao.insertOfCommentIdAndUserId(commentId, userId);
    }
    public int insertOfQuestionIdAndCoderId(String questionId, String coderId) {
        return dao.insertOfQuestionIdAndCoderId(questionId, coderId);
    }
    public int insertOfQuestionIdAndBody(String questionId, String body) {
        return dao.insertOfQuestionIdAndBody(questionId, body);
    }
    public int insertOfQuestionIdAndTime(String questionId, String time) {
        return dao.insertOfQuestionIdAndTime(questionId, time);
    }
    public int insertOfQuestionIdAndUserId(String questionId, String userId) {
        return dao.insertOfQuestionIdAndUserId(questionId, userId);
    }
    public int insertOfCoderIdAndBody(String coderId, String body) {
        return dao.insertOfCoderIdAndBody(coderId, body);
    }
    public int insertOfCoderIdAndTime(String coderId, String time) {
        return dao.insertOfCoderIdAndTime(coderId, time);
    }
    public int insertOfCoderIdAndUserId(String coderId, String userId) {
        return dao.insertOfCoderIdAndUserId(coderId, userId);
    }
    public int insertOfBodyAndTime(String body, String time) {
        return dao.insertOfBodyAndTime(body, time);
    }
    public int insertOfBodyAndUserId(String body, String userId) {
        return dao.insertOfBodyAndUserId(body, userId);
    }
    public int insertOfTimeAndUserId(String time, String userId) {
        return dao.insertOfTimeAndUserId(time, userId);
    }
    public Comment getComment(Comment comment) {
        return dao.getComment(comment);
    }
    public Comment getCommentOfCommentId(String commentId) {
        return dao.getCommentOfCommentId(commentId);
    }
    public Comment getCommentOfQuestionId(String questionId) {
        return dao.getCommentOfQuestionId(questionId);
    }
    public Comment getCommentOfCoderId(String coderId) {
        return dao.getCommentOfCoderId(coderId);
    }
    public Comment getCommentOfBody(String body) {
        return dao.getCommentOfBody(body);
    }
    public Comment getCommentOfTime(String time) {
        return dao.getCommentOfTime(time);
    }
    public Comment getCommentOfUserId(String userId) {
        return dao.getCommentOfUserId(userId);
    }
    public Comment getCommentOfCommentIdAndQuestionId(String commentId, String questionId) {
        return dao.getCommentOfCommentIdAndQuestionId(commentId, questionId);
    }
    public Comment getCommentOfCommentIdAndCoderId(String commentId, String coderId) {
        return dao.getCommentOfCommentIdAndCoderId(commentId, coderId);
    }
    public Comment getCommentOfCommentIdAndBody(String commentId, String body) {
        return dao.getCommentOfCommentIdAndBody(commentId, body);
    }
    public Comment getCommentOfCommentIdAndTime(String commentId, String time) {
        return dao.getCommentOfCommentIdAndTime(commentId, time);
    }
    public Comment getCommentOfCommentIdAndUserId(String commentId, String userId) {
        return dao.getCommentOfCommentIdAndUserId(commentId, userId);
    }
    public Comment getCommentOfQuestionIdAndCoderId(String questionId, String coderId) {
        return dao.getCommentOfQuestionIdAndCoderId(questionId, coderId);
    }
    public Comment getCommentOfQuestionIdAndBody(String questionId, String body) {
        return dao.getCommentOfQuestionIdAndBody(questionId, body);
    }
    public Comment getCommentOfQuestionIdAndTime(String questionId, String time) {
        return dao.getCommentOfQuestionIdAndTime(questionId, time);
    }
    public Comment getCommentOfQuestionIdAndUserId(String questionId, String userId) {
        return dao.getCommentOfQuestionIdAndUserId(questionId, userId);
    }
    public Comment getCommentOfCoderIdAndBody(String coderId, String body) {
        return dao.getCommentOfCoderIdAndBody(coderId, body);
    }
    public Comment getCommentOfCoderIdAndTime(String coderId, String time) {
        return dao.getCommentOfCoderIdAndTime(coderId, time);
    }
    public Comment getCommentOfCoderIdAndUserId(String coderId, String userId) {
        return dao.getCommentOfCoderIdAndUserId(coderId, userId);
    }
    public Comment getCommentOfBodyAndTime(String body, String time) {
        return dao.getCommentOfBodyAndTime(body, time);
    }
    public Comment getCommentOfBodyAndUserId(String body, String userId) {
        return dao.getCommentOfBodyAndUserId(body, userId);
    }
    public Comment getCommentOfTimeAndUserId(String time, String userId) {
        return dao.getCommentOfTimeAndUserId(time, userId);
    }
    public List<Comment> getComments(Comment comment) {
        return dao.getComments(comment);
    }
    public List<Comment> getCommentsOfCommentId(String commentId) {
        return dao.getCommentsOfCommentId(commentId);
    }
    public List<Comment> getCommentsOfQuestionId(String questionId) {
        return dao.getCommentsOfQuestionId(questionId);
    }
    public List<Comment> getCommentsOfCoderId(String coderId) {
        return dao.getCommentsOfCoderId(coderId);
    }
    public List<Comment> getCommentsOfBody(String body) {
        return dao.getCommentsOfBody(body);
    }
    public List<Comment> getCommentsOfTime(String time) {
        return dao.getCommentsOfTime(time);
    }
    public List<Comment> getCommentsOfUserId(String userId) {
        return dao.getCommentsOfUserId(userId);
    }
    public List<Comment> getCommentsOfCommentIdAndQuestionId(String commentId, String questionId) {
        return dao.getCommentsOfCommentIdAndQuestionId(commentId, questionId);
    }
    public List<Comment> getCommentsOfCommentIdAndCoderId(String commentId, String coderId) {
        return dao.getCommentsOfCommentIdAndCoderId(commentId, coderId);
    }
    public List<Comment> getCommentsOfCommentIdAndBody(String commentId, String body) {
        return dao.getCommentsOfCommentIdAndBody(commentId, body);
    }
    public List<Comment> getCommentsOfCommentIdAndTime(String commentId, String time) {
        return dao.getCommentsOfCommentIdAndTime(commentId, time);
    }
    public List<Comment> getCommentsOfCommentIdAndUserId(String commentId, String userId) {
        return dao.getCommentsOfCommentIdAndUserId(commentId, userId);
    }
    public List<Comment> getCommentsOfQuestionIdAndCoderId(String questionId, String coderId) {
        return dao.getCommentsOfQuestionIdAndCoderId(questionId, coderId);
    }
    public List<Comment> getCommentsOfQuestionIdAndBody(String questionId, String body) {
        return dao.getCommentsOfQuestionIdAndBody(questionId, body);
    }
    public List<Comment> getCommentsOfQuestionIdAndTime(String questionId, String time) {
        return dao.getCommentsOfQuestionIdAndTime(questionId, time);
    }
    public List<Comment> getCommentsOfQuestionIdAndUserId(String questionId, String userId) {
        return dao.getCommentsOfQuestionIdAndUserId(questionId, userId);
    }
    public List<Comment> getCommentsOfCoderIdAndBody(String coderId, String body) {
        return dao.getCommentsOfCoderIdAndBody(coderId, body);
    }
    public List<Comment> getCommentsOfCoderIdAndTime(String coderId, String time) {
        return dao.getCommentsOfCoderIdAndTime(coderId, time);
    }
    public List<Comment> getCommentsOfCoderIdAndUserId(String coderId, String userId) {
        return dao.getCommentsOfCoderIdAndUserId(coderId, userId);
    }
    public List<Comment> getCommentsOfBodyAndTime(String body, String time) {
        return dao.getCommentsOfBodyAndTime(body, time);
    }
    public List<Comment> getCommentsOfBodyAndUserId(String body, String userId) {
        return dao.getCommentsOfBodyAndUserId(body, userId);
    }
    public List<Comment> getCommentsOfTimeAndUserId(String time, String userId) {
        return dao.getCommentsOfTimeAndUserId(time, userId);
    }
}
