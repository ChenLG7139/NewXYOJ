package com.oj.linglian.daoImpl;

import java.util.List;

import com.oj.linglian.entity.Comment;

import com.oj.linglian.dao.ICommentDao;
import db.DBMan;

public class ICommentDaoImpl implements ICommentDao {
    public int update(Comment comment, Comment keyComment) {
        return DBMan.getInstance().updateNoSqlWithoutThrow(comment, keyComment, "comment");
    }
    public int updateOfCommentId(Comment comment, String commentId) {
        Comment kComment = new Comment();
        kComment.setCommentId(commentId);
        return update(comment, kComment);
    }
    public int updateOfQuestionId(Comment comment, String questionId) {
        Comment kComment = new Comment();
        kComment.setQuestionId(questionId);
        return update(comment, kComment);
    }
    public int updateOfCoderId(Comment comment, String coderId) {
        Comment kComment = new Comment();
        kComment.setCoderId(coderId);
        return update(comment, kComment);
    }
    public int updateOfBody(Comment comment, String body) {
        Comment kComment = new Comment();
        kComment.setBody(body);
        return update(comment, kComment);
    }
    public int updateOfTime(Comment comment, String time) {
        Comment kComment = new Comment();
        kComment.setTime(time);
        return update(comment, kComment);
    }
    public int updateOfUserId(Comment comment, String userId) {
        Comment kComment = new Comment();
        kComment.setUserId(userId);
        return update(comment, kComment);
    }
    public int updateOfCommentIdAndQuestionId(Comment comment, String commentId, String questionId) {
        Comment kComment = new Comment();
        kComment.setCommentId(commentId);
        kComment.setQuestionId(questionId);
        return update(comment, kComment);
    }
    public int updateOfCommentIdAndCoderId(Comment comment, String commentId, String coderId) {
        Comment kComment = new Comment();
        kComment.setCommentId(commentId);
        kComment.setCoderId(coderId);
        return update(comment, kComment);
    }
    public int updateOfCommentIdAndBody(Comment comment, String commentId, String body) {
        Comment kComment = new Comment();
        kComment.setCommentId(commentId);
        kComment.setBody(body);
        return update(comment, kComment);
    }
    public int updateOfCommentIdAndTime(Comment comment, String commentId, String time) {
        Comment kComment = new Comment();
        kComment.setCommentId(commentId);
        kComment.setTime(time);
        return update(comment, kComment);
    }
    public int updateOfCommentIdAndUserId(Comment comment, String commentId, String userId) {
        Comment kComment = new Comment();
        kComment.setCommentId(commentId);
        kComment.setUserId(userId);
        return update(comment, kComment);
    }
    public int updateOfQuestionIdAndCoderId(Comment comment, String questionId, String coderId) {
        Comment kComment = new Comment();
        kComment.setQuestionId(questionId);
        kComment.setCoderId(coderId);
        return update(comment, kComment);
    }
    public int updateOfQuestionIdAndBody(Comment comment, String questionId, String body) {
        Comment kComment = new Comment();
        kComment.setQuestionId(questionId);
        kComment.setBody(body);
        return update(comment, kComment);
    }
    public int updateOfQuestionIdAndTime(Comment comment, String questionId, String time) {
        Comment kComment = new Comment();
        kComment.setQuestionId(questionId);
        kComment.setTime(time);
        return update(comment, kComment);
    }
    public int updateOfQuestionIdAndUserId(Comment comment, String questionId, String userId) {
        Comment kComment = new Comment();
        kComment.setQuestionId(questionId);
        kComment.setUserId(userId);
        return update(comment, kComment);
    }
    public int updateOfCoderIdAndBody(Comment comment, String coderId, String body) {
        Comment kComment = new Comment();
        kComment.setCoderId(coderId);
        kComment.setBody(body);
        return update(comment, kComment);
    }
    public int updateOfCoderIdAndTime(Comment comment, String coderId, String time) {
        Comment kComment = new Comment();
        kComment.setCoderId(coderId);
        kComment.setTime(time);
        return update(comment, kComment);
    }
    public int updateOfCoderIdAndUserId(Comment comment, String coderId, String userId) {
        Comment kComment = new Comment();
        kComment.setCoderId(coderId);
        kComment.setUserId(userId);
        return update(comment, kComment);
    }
    public int updateOfBodyAndTime(Comment comment, String body, String time) {
        Comment kComment = new Comment();
        kComment.setBody(body);
        kComment.setTime(time);
        return update(comment, kComment);
    }
    public int updateOfBodyAndUserId(Comment comment, String body, String userId) {
        Comment kComment = new Comment();
        kComment.setBody(body);
        kComment.setUserId(userId);
        return update(comment, kComment);
    }
    public int updateOfTimeAndUserId(Comment comment, String time, String userId) {
        Comment kComment = new Comment();
        kComment.setTime(time);
        kComment.setUserId(userId);
        return update(comment, kComment);
    }
    public int remove(Comment comment) {
        return DBMan.getInstance().deleteNoSqlWithoutThrow(comment, "comment");
    }
    public int removeOfCommentId(String commentId) {
        Comment comment = new Comment();
        comment.setCommentId(commentId);
        return remove(comment);
    }
    public int removeOfQuestionId(String questionId) {
        Comment comment = new Comment();
        comment.setQuestionId(questionId);
        return remove(comment);
    }
    public int removeOfCoderId(String coderId) {
        Comment comment = new Comment();
        comment.setCoderId(coderId);
        return remove(comment);
    }
    public int removeOfBody(String body) {
        Comment comment = new Comment();
        comment.setBody(body);
        return remove(comment);
    }
    public int removeOfTime(String time) {
        Comment comment = new Comment();
        comment.setTime(time);
        return remove(comment);
    }
    public int removeOfUserId(String userId) {
        Comment comment = new Comment();
        comment.setUserId(userId);
        return remove(comment);
    }
    public int removeOfCommentIdAndQuestionId(String commentId, String questionId) {
        Comment comment = new Comment();
        comment.setCommentId(commentId);
        comment.setQuestionId(questionId);
        return remove(comment);
    }
    public int removeOfCommentIdAndCoderId(String commentId, String coderId) {
        Comment comment = new Comment();
        comment.setCommentId(commentId);
        comment.setCoderId(coderId);
        return remove(comment);
    }
    public int removeOfCommentIdAndBody(String commentId, String body) {
        Comment comment = new Comment();
        comment.setCommentId(commentId);
        comment.setBody(body);
        return remove(comment);
    }
    public int removeOfCommentIdAndTime(String commentId, String time) {
        Comment comment = new Comment();
        comment.setCommentId(commentId);
        comment.setTime(time);
        return remove(comment);
    }
    public int removeOfCommentIdAndUserId(String commentId, String userId) {
        Comment comment = new Comment();
        comment.setCommentId(commentId);
        comment.setUserId(userId);
        return remove(comment);
    }
    public int removeOfQuestionIdAndCoderId(String questionId, String coderId) {
        Comment comment = new Comment();
        comment.setQuestionId(questionId);
        comment.setCoderId(coderId);
        return remove(comment);
    }
    public int removeOfQuestionIdAndBody(String questionId, String body) {
        Comment comment = new Comment();
        comment.setQuestionId(questionId);
        comment.setBody(body);
        return remove(comment);
    }
    public int removeOfQuestionIdAndTime(String questionId, String time) {
        Comment comment = new Comment();
        comment.setQuestionId(questionId);
        comment.setTime(time);
        return remove(comment);
    }
    public int removeOfQuestionIdAndUserId(String questionId, String userId) {
        Comment comment = new Comment();
        comment.setQuestionId(questionId);
        comment.setUserId(userId);
        return remove(comment);
    }
    public int removeOfCoderIdAndBody(String coderId, String body) {
        Comment comment = new Comment();
        comment.setCoderId(coderId);
        comment.setBody(body);
        return remove(comment);
    }
    public int removeOfCoderIdAndTime(String coderId, String time) {
        Comment comment = new Comment();
        comment.setCoderId(coderId);
        comment.setTime(time);
        return remove(comment);
    }
    public int removeOfCoderIdAndUserId(String coderId, String userId) {
        Comment comment = new Comment();
        comment.setCoderId(coderId);
        comment.setUserId(userId);
        return remove(comment);
    }
    public int removeOfBodyAndTime(String body, String time) {
        Comment comment = new Comment();
        comment.setBody(body);
        comment.setTime(time);
        return remove(comment);
    }
    public int removeOfBodyAndUserId(String body, String userId) {
        Comment comment = new Comment();
        comment.setBody(body);
        comment.setUserId(userId);
        return remove(comment);
    }
    public int removeOfTimeAndUserId(String time, String userId) {
        Comment comment = new Comment();
        comment.setTime(time);
        comment.setUserId(userId);
        return remove(comment);
    }
    public int insert(Comment comment) {
        return DBMan.getInstance().insertNoSqlWithoutThrow(comment, "comment");
    }
    public int insertOfCommentId(String commentId) {
        Comment comment = new Comment();
        comment.setCommentId(commentId);
        return insert(comment);
    }
    public int insertOfQuestionId(String questionId) {
        Comment comment = new Comment();
        comment.setQuestionId(questionId);
        return insert(comment);
    }
    public int insertOfCoderId(String coderId) {
        Comment comment = new Comment();
        comment.setCoderId(coderId);
        return insert(comment);
    }
    public int insertOfBody(String body) {
        Comment comment = new Comment();
        comment.setBody(body);
        return insert(comment);
    }
    public int insertOfTime(String time) {
        Comment comment = new Comment();
        comment.setTime(time);
        return insert(comment);
    }
    public int insertOfUserId(String userId) {
        Comment comment = new Comment();
        comment.setUserId(userId);
        return insert(comment);
    }
    public int insertOfCommentIdAndQuestionId(String commentId, String questionId) {
        Comment comment = new Comment();
        comment.setCommentId(commentId);
        comment.setQuestionId(questionId);
        return insert(comment);
    }
    public int insertOfCommentIdAndCoderId(String commentId, String coderId) {
        Comment comment = new Comment();
        comment.setCommentId(commentId);
        comment.setCoderId(coderId);
        return insert(comment);
    }
    public int insertOfCommentIdAndBody(String commentId, String body) {
        Comment comment = new Comment();
        comment.setCommentId(commentId);
        comment.setBody(body);
        return insert(comment);
    }
    public int insertOfCommentIdAndTime(String commentId, String time) {
        Comment comment = new Comment();
        comment.setCommentId(commentId);
        comment.setTime(time);
        return insert(comment);
    }
    public int insertOfCommentIdAndUserId(String commentId, String userId) {
        Comment comment = new Comment();
        comment.setCommentId(commentId);
        comment.setUserId(userId);
        return insert(comment);
    }
    public int insertOfQuestionIdAndCoderId(String questionId, String coderId) {
        Comment comment = new Comment();
        comment.setQuestionId(questionId);
        comment.setCoderId(coderId);
        return insert(comment);
    }
    public int insertOfQuestionIdAndBody(String questionId, String body) {
        Comment comment = new Comment();
        comment.setQuestionId(questionId);
        comment.setBody(body);
        return insert(comment);
    }
    public int insertOfQuestionIdAndTime(String questionId, String time) {
        Comment comment = new Comment();
        comment.setQuestionId(questionId);
        comment.setTime(time);
        return insert(comment);
    }
    public int insertOfQuestionIdAndUserId(String questionId, String userId) {
        Comment comment = new Comment();
        comment.setQuestionId(questionId);
        comment.setUserId(userId);
        return insert(comment);
    }
    public int insertOfCoderIdAndBody(String coderId, String body) {
        Comment comment = new Comment();
        comment.setCoderId(coderId);
        comment.setBody(body);
        return insert(comment);
    }
    public int insertOfCoderIdAndTime(String coderId, String time) {
        Comment comment = new Comment();
        comment.setCoderId(coderId);
        comment.setTime(time);
        return insert(comment);
    }
    public int insertOfCoderIdAndUserId(String coderId, String userId) {
        Comment comment = new Comment();
        comment.setCoderId(coderId);
        comment.setUserId(userId);
        return insert(comment);
    }
    public int insertOfBodyAndTime(String body, String time) {
        Comment comment = new Comment();
        comment.setBody(body);
        comment.setTime(time);
        return insert(comment);
    }
    public int insertOfBodyAndUserId(String body, String userId) {
        Comment comment = new Comment();
        comment.setBody(body);
        comment.setUserId(userId);
        return insert(comment);
    }
    public int insertOfTimeAndUserId(String time, String userId) {
        Comment comment = new Comment();
        comment.setTime(time);
        comment.setUserId(userId);
        return insert(comment);
    }
    public Comment getComment(Comment comment) {
        return DBMan.getInstance().queryByIdNoSqlWithoutThrow(comment, "comment");
    }
    public Comment getCommentOfCommentId(String commentId) {
        Comment comment = new Comment();
        comment.setCommentId(commentId);
        return getComment(comment);
    }
    public Comment getCommentOfQuestionId(String questionId) {
        Comment comment = new Comment();
        comment.setQuestionId(questionId);
        return getComment(comment);
    }
    public Comment getCommentOfCoderId(String coderId) {
        Comment comment = new Comment();
        comment.setCoderId(coderId);
        return getComment(comment);
    }
    public Comment getCommentOfBody(String body) {
        Comment comment = new Comment();
        comment.setBody(body);
        return getComment(comment);
    }
    public Comment getCommentOfTime(String time) {
        Comment comment = new Comment();
        comment.setTime(time);
        return getComment(comment);
    }
    public Comment getCommentOfUserId(String userId) {
        Comment comment = new Comment();
        comment.setUserId(userId);
        return getComment(comment);
    }
    public Comment getCommentOfCommentIdAndQuestionId(String commentId, String questionId) {
        Comment comment = new Comment();
        comment.setCommentId(commentId);
        comment.setQuestionId(questionId);
        return getComment(comment);
    }
    public Comment getCommentOfCommentIdAndCoderId(String commentId, String coderId) {
        Comment comment = new Comment();
        comment.setCommentId(commentId);
        comment.setCoderId(coderId);
        return getComment(comment);
    }
    public Comment getCommentOfCommentIdAndBody(String commentId, String body) {
        Comment comment = new Comment();
        comment.setCommentId(commentId);
        comment.setBody(body);
        return getComment(comment);
    }
    public Comment getCommentOfCommentIdAndTime(String commentId, String time) {
        Comment comment = new Comment();
        comment.setCommentId(commentId);
        comment.setTime(time);
        return getComment(comment);
    }
    public Comment getCommentOfCommentIdAndUserId(String commentId, String userId) {
        Comment comment = new Comment();
        comment.setCommentId(commentId);
        comment.setUserId(userId);
        return getComment(comment);
    }
    public Comment getCommentOfQuestionIdAndCoderId(String questionId, String coderId) {
        Comment comment = new Comment();
        comment.setQuestionId(questionId);
        comment.setCoderId(coderId);
        return getComment(comment);
    }
    public Comment getCommentOfQuestionIdAndBody(String questionId, String body) {
        Comment comment = new Comment();
        comment.setQuestionId(questionId);
        comment.setBody(body);
        return getComment(comment);
    }
    public Comment getCommentOfQuestionIdAndTime(String questionId, String time) {
        Comment comment = new Comment();
        comment.setQuestionId(questionId);
        comment.setTime(time);
        return getComment(comment);
    }
    public Comment getCommentOfQuestionIdAndUserId(String questionId, String userId) {
        Comment comment = new Comment();
        comment.setQuestionId(questionId);
        comment.setUserId(userId);
        return getComment(comment);
    }
    public Comment getCommentOfCoderIdAndBody(String coderId, String body) {
        Comment comment = new Comment();
        comment.setCoderId(coderId);
        comment.setBody(body);
        return getComment(comment);
    }
    public Comment getCommentOfCoderIdAndTime(String coderId, String time) {
        Comment comment = new Comment();
        comment.setCoderId(coderId);
        comment.setTime(time);
        return getComment(comment);
    }
    public Comment getCommentOfCoderIdAndUserId(String coderId, String userId) {
        Comment comment = new Comment();
        comment.setCoderId(coderId);
        comment.setUserId(userId);
        return getComment(comment);
    }
    public Comment getCommentOfBodyAndTime(String body, String time) {
        Comment comment = new Comment();
        comment.setBody(body);
        comment.setTime(time);
        return getComment(comment);
    }
    public Comment getCommentOfBodyAndUserId(String body, String userId) {
        Comment comment = new Comment();
        comment.setBody(body);
        comment.setUserId(userId);
        return getComment(comment);
    }
    public Comment getCommentOfTimeAndUserId(String time, String userId) {
        Comment comment = new Comment();
        comment.setTime(time);
        comment.setUserId(userId);
        return getComment(comment);
    }
    public List<Comment> getComments(Comment comment) {
        return DBMan.getInstance().queryNoSqlWithoutThrow(comment, "comment");
    }
    public List<Comment> getCommentsOfCommentId(String commentId) {
        Comment comment = new Comment();
        comment.setCommentId(commentId);
        return getComments(comment);
    }
    public List<Comment> getCommentsOfQuestionId(String questionId) {
        Comment comment = new Comment();
        comment.setQuestionId(questionId);
        return getComments(comment);
    }
    public List<Comment> getCommentsOfCoderId(String coderId) {
        Comment comment = new Comment();
        comment.setCoderId(coderId);
        return getComments(comment);
    }
    public List<Comment> getCommentsOfBody(String body) {
        Comment comment = new Comment();
        comment.setBody(body);
        return getComments(comment);
    }
    public List<Comment> getCommentsOfTime(String time) {
        Comment comment = new Comment();
        comment.setTime(time);
        return getComments(comment);
    }
    public List<Comment> getCommentsOfUserId(String userId) {
        Comment comment = new Comment();
        comment.setUserId(userId);
        return getComments(comment);
    }
    public List<Comment> getCommentsOfCommentIdAndQuestionId(String commentId, String questionId) {
        Comment comment = new Comment();
        comment.setCommentId(commentId);
        comment.setQuestionId(questionId);
        return getComments(comment);
    }
    public List<Comment> getCommentsOfCommentIdAndCoderId(String commentId, String coderId) {
        Comment comment = new Comment();
        comment.setCommentId(commentId);
        comment.setCoderId(coderId);
        return getComments(comment);
    }
    public List<Comment> getCommentsOfCommentIdAndBody(String commentId, String body) {
        Comment comment = new Comment();
        comment.setCommentId(commentId);
        comment.setBody(body);
        return getComments(comment);
    }
    public List<Comment> getCommentsOfCommentIdAndTime(String commentId, String time) {
        Comment comment = new Comment();
        comment.setCommentId(commentId);
        comment.setTime(time);
        return getComments(comment);
    }
    public List<Comment> getCommentsOfCommentIdAndUserId(String commentId, String userId) {
        Comment comment = new Comment();
        comment.setCommentId(commentId);
        comment.setUserId(userId);
        return getComments(comment);
    }
    public List<Comment> getCommentsOfQuestionIdAndCoderId(String questionId, String coderId) {
        Comment comment = new Comment();
        comment.setQuestionId(questionId);
        comment.setCoderId(coderId);
        return getComments(comment);
    }
    public List<Comment> getCommentsOfQuestionIdAndBody(String questionId, String body) {
        Comment comment = new Comment();
        comment.setQuestionId(questionId);
        comment.setBody(body);
        return getComments(comment);
    }
    public List<Comment> getCommentsOfQuestionIdAndTime(String questionId, String time) {
        Comment comment = new Comment();
        comment.setQuestionId(questionId);
        comment.setTime(time);
        return getComments(comment);
    }
    public List<Comment> getCommentsOfQuestionIdAndUserId(String questionId, String userId) {
        Comment comment = new Comment();
        comment.setQuestionId(questionId);
        comment.setUserId(userId);
        return getComments(comment);
    }
    public List<Comment> getCommentsOfCoderIdAndBody(String coderId, String body) {
        Comment comment = new Comment();
        comment.setCoderId(coderId);
        comment.setBody(body);
        return getComments(comment);
    }
    public List<Comment> getCommentsOfCoderIdAndTime(String coderId, String time) {
        Comment comment = new Comment();
        comment.setCoderId(coderId);
        comment.setTime(time);
        return getComments(comment);
    }
    public List<Comment> getCommentsOfCoderIdAndUserId(String coderId, String userId) {
        Comment comment = new Comment();
        comment.setCoderId(coderId);
        comment.setUserId(userId);
        return getComments(comment);
    }
    public List<Comment> getCommentsOfBodyAndTime(String body, String time) {
        Comment comment = new Comment();
        comment.setBody(body);
        comment.setTime(time);
        return getComments(comment);
    }
    public List<Comment> getCommentsOfBodyAndUserId(String body, String userId) {
        Comment comment = new Comment();
        comment.setBody(body);
        comment.setUserId(userId);
        return getComments(comment);
    }
    public List<Comment> getCommentsOfTimeAndUserId(String time, String userId) {
        Comment comment = new Comment();
        comment.setTime(time);
        comment.setUserId(userId);
        return getComments(comment);
    }
}
