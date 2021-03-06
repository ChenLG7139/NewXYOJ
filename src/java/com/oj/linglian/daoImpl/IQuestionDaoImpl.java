package com.oj.linglian.daoImpl;

import java.util.List;

import com.oj.linglian.entity.Question;

import com.oj.linglian.dao.IQuestionDao;
import db.DBMan;

public class IQuestionDaoImpl implements IQuestionDao {
    public int update(Question question, Question keyQuestion) {
        return DBMan.getInstance().updateNoSqlWithoutThrow(question, keyQuestion, "question");
    }
    public int updateOfQuestionId(Question question, String questionId) {
        Question kQuestion = new Question();
        kQuestion.setQuestionId(questionId);
        return update(question, kQuestion);
    }
    public int updateOfTitle(Question question, String title) {
        Question kQuestion = new Question();
        kQuestion.setTitle(title);
        return update(question, kQuestion);
    }
    public int updateOfBody(Question question, String body) {
        Question kQuestion = new Question();
        kQuestion.setBody(body);
        return update(question, kQuestion);
    }
    public int updateOfScore(Question question, String score) {
        Question kQuestion = new Question();
        kQuestion.setScore(score);
        return update(question, kQuestion);
    }
    public int updateOfDemoCode(Question question, String demoCode) {
        Question kQuestion = new Question();
        kQuestion.setDemoCode(demoCode);
        return update(question, kQuestion);
    }
    public int updateOfRightPeople(Question question, String rightPeople) {
        Question kQuestion = new Question();
        kQuestion.setRightPeople(rightPeople);
        return update(question, kQuestion);
    }
    public int updateOfMainPeople(Question question, String mainPeople) {
        Question kQuestion = new Question();
        kQuestion.setMainPeople(mainPeople);
        return update(question, kQuestion);
    }
    public int updateOfStartTime(Question question, String startTime) {
        Question kQuestion = new Question();
        kQuestion.setStartTime(startTime);
        return update(question, kQuestion);
    }
    public int updateOfEndTime(Question question, String endTime) {
        Question kQuestion = new Question();
        kQuestion.setEndTime(endTime);
        return update(question, kQuestion);
    }
    public int updateOfInputFormat(Question question, String inputFormat) {
        Question kQuestion = new Question();
        kQuestion.setInputFormat(inputFormat);
        return update(question, kQuestion);
    }
    public int updateOfOutputFormat(Question question, String outputFormat) {
        Question kQuestion = new Question();
        kQuestion.setOutputFormat(outputFormat);
        return update(question, kQuestion);
    }
    public int updateOfInputTest(Question question, String inputTest) {
        Question kQuestion = new Question();
        kQuestion.setInputTest(inputTest);
        return update(question, kQuestion);
    }
    public int updateOfOutputTest(Question question, String outputTest) {
        Question kQuestion = new Question();
        kQuestion.setOutputTest(outputTest);
        return update(question, kQuestion);
    }
    public int updateOfContestId(Question question, String contestId) {
        Question kQuestion = new Question();
        kQuestion.setContestId(contestId);
        return update(question, kQuestion);
    }
    public int updateOfUserId(Question question, String userId) {
        Question kQuestion = new Question();
        kQuestion.setUserId(userId);
        return update(question, kQuestion);
    }
    public int updateOfDemoBody(Question question, String demoBody) {
        Question kQuestion = new Question();
        kQuestion.setDemoBody(demoBody);
        return update(question, kQuestion);
    }
    public int updateOfQuestionIdAndTitle(Question question, String questionId, String title) {
        Question kQuestion = new Question();
        kQuestion.setQuestionId(questionId);
        kQuestion.setTitle(title);
        return update(question, kQuestion);
    }
    public int updateOfQuestionIdAndBody(Question question, String questionId, String body) {
        Question kQuestion = new Question();
        kQuestion.setQuestionId(questionId);
        kQuestion.setBody(body);
        return update(question, kQuestion);
    }
    public int updateOfQuestionIdAndScore(Question question, String questionId, String score) {
        Question kQuestion = new Question();
        kQuestion.setQuestionId(questionId);
        kQuestion.setScore(score);
        return update(question, kQuestion);
    }
    public int updateOfQuestionIdAndDemoCode(Question question, String questionId, String demoCode) {
        Question kQuestion = new Question();
        kQuestion.setQuestionId(questionId);
        kQuestion.setDemoCode(demoCode);
        return update(question, kQuestion);
    }
    public int updateOfQuestionIdAndRightPeople(Question question, String questionId, String rightPeople) {
        Question kQuestion = new Question();
        kQuestion.setQuestionId(questionId);
        kQuestion.setRightPeople(rightPeople);
        return update(question, kQuestion);
    }
    public int updateOfQuestionIdAndMainPeople(Question question, String questionId, String mainPeople) {
        Question kQuestion = new Question();
        kQuestion.setQuestionId(questionId);
        kQuestion.setMainPeople(mainPeople);
        return update(question, kQuestion);
    }
    public int updateOfQuestionIdAndStartTime(Question question, String questionId, String startTime) {
        Question kQuestion = new Question();
        kQuestion.setQuestionId(questionId);
        kQuestion.setStartTime(startTime);
        return update(question, kQuestion);
    }
    public int updateOfQuestionIdAndEndTime(Question question, String questionId, String endTime) {
        Question kQuestion = new Question();
        kQuestion.setQuestionId(questionId);
        kQuestion.setEndTime(endTime);
        return update(question, kQuestion);
    }
    public int updateOfQuestionIdAndInputFormat(Question question, String questionId, String inputFormat) {
        Question kQuestion = new Question();
        kQuestion.setQuestionId(questionId);
        kQuestion.setInputFormat(inputFormat);
        return update(question, kQuestion);
    }
    public int updateOfQuestionIdAndOutputFormat(Question question, String questionId, String outputFormat) {
        Question kQuestion = new Question();
        kQuestion.setQuestionId(questionId);
        kQuestion.setOutputFormat(outputFormat);
        return update(question, kQuestion);
    }
    public int updateOfQuestionIdAndInputTest(Question question, String questionId, String inputTest) {
        Question kQuestion = new Question();
        kQuestion.setQuestionId(questionId);
        kQuestion.setInputTest(inputTest);
        return update(question, kQuestion);
    }
    public int updateOfQuestionIdAndOutputTest(Question question, String questionId, String outputTest) {
        Question kQuestion = new Question();
        kQuestion.setQuestionId(questionId);
        kQuestion.setOutputTest(outputTest);
        return update(question, kQuestion);
    }
    public int updateOfQuestionIdAndContestId(Question question, String questionId, String contestId) {
        Question kQuestion = new Question();
        kQuestion.setQuestionId(questionId);
        kQuestion.setContestId(contestId);
        return update(question, kQuestion);
    }
    public int updateOfQuestionIdAndUserId(Question question, String questionId, String userId) {
        Question kQuestion = new Question();
        kQuestion.setQuestionId(questionId);
        kQuestion.setUserId(userId);
        return update(question, kQuestion);
    }
    public int updateOfQuestionIdAndDemoBody(Question question, String questionId, String demoBody) {
        Question kQuestion = new Question();
        kQuestion.setQuestionId(questionId);
        kQuestion.setDemoBody(demoBody);
        return update(question, kQuestion);
    }
    public int updateOfTitleAndBody(Question question, String title, String body) {
        Question kQuestion = new Question();
        kQuestion.setTitle(title);
        kQuestion.setBody(body);
        return update(question, kQuestion);
    }
    public int updateOfTitleAndScore(Question question, String title, String score) {
        Question kQuestion = new Question();
        kQuestion.setTitle(title);
        kQuestion.setScore(score);
        return update(question, kQuestion);
    }
    public int updateOfTitleAndDemoCode(Question question, String title, String demoCode) {
        Question kQuestion = new Question();
        kQuestion.setTitle(title);
        kQuestion.setDemoCode(demoCode);
        return update(question, kQuestion);
    }
    public int updateOfTitleAndRightPeople(Question question, String title, String rightPeople) {
        Question kQuestion = new Question();
        kQuestion.setTitle(title);
        kQuestion.setRightPeople(rightPeople);
        return update(question, kQuestion);
    }
    public int updateOfTitleAndMainPeople(Question question, String title, String mainPeople) {
        Question kQuestion = new Question();
        kQuestion.setTitle(title);
        kQuestion.setMainPeople(mainPeople);
        return update(question, kQuestion);
    }
    public int updateOfTitleAndStartTime(Question question, String title, String startTime) {
        Question kQuestion = new Question();
        kQuestion.setTitle(title);
        kQuestion.setStartTime(startTime);
        return update(question, kQuestion);
    }
    public int updateOfTitleAndEndTime(Question question, String title, String endTime) {
        Question kQuestion = new Question();
        kQuestion.setTitle(title);
        kQuestion.setEndTime(endTime);
        return update(question, kQuestion);
    }
    public int updateOfTitleAndInputFormat(Question question, String title, String inputFormat) {
        Question kQuestion = new Question();
        kQuestion.setTitle(title);
        kQuestion.setInputFormat(inputFormat);
        return update(question, kQuestion);
    }
    public int updateOfTitleAndOutputFormat(Question question, String title, String outputFormat) {
        Question kQuestion = new Question();
        kQuestion.setTitle(title);
        kQuestion.setOutputFormat(outputFormat);
        return update(question, kQuestion);
    }
    public int updateOfTitleAndInputTest(Question question, String title, String inputTest) {
        Question kQuestion = new Question();
        kQuestion.setTitle(title);
        kQuestion.setInputTest(inputTest);
        return update(question, kQuestion);
    }
    public int updateOfTitleAndOutputTest(Question question, String title, String outputTest) {
        Question kQuestion = new Question();
        kQuestion.setTitle(title);
        kQuestion.setOutputTest(outputTest);
        return update(question, kQuestion);
    }
    public int updateOfTitleAndContestId(Question question, String title, String contestId) {
        Question kQuestion = new Question();
        kQuestion.setTitle(title);
        kQuestion.setContestId(contestId);
        return update(question, kQuestion);
    }
    public int updateOfTitleAndUserId(Question question, String title, String userId) {
        Question kQuestion = new Question();
        kQuestion.setTitle(title);
        kQuestion.setUserId(userId);
        return update(question, kQuestion);
    }
    public int updateOfTitleAndDemoBody(Question question, String title, String demoBody) {
        Question kQuestion = new Question();
        kQuestion.setTitle(title);
        kQuestion.setDemoBody(demoBody);
        return update(question, kQuestion);
    }
    public int updateOfBodyAndScore(Question question, String body, String score) {
        Question kQuestion = new Question();
        kQuestion.setBody(body);
        kQuestion.setScore(score);
        return update(question, kQuestion);
    }
    public int updateOfBodyAndDemoCode(Question question, String body, String demoCode) {
        Question kQuestion = new Question();
        kQuestion.setBody(body);
        kQuestion.setDemoCode(demoCode);
        return update(question, kQuestion);
    }
    public int updateOfBodyAndRightPeople(Question question, String body, String rightPeople) {
        Question kQuestion = new Question();
        kQuestion.setBody(body);
        kQuestion.setRightPeople(rightPeople);
        return update(question, kQuestion);
    }
    public int updateOfBodyAndMainPeople(Question question, String body, String mainPeople) {
        Question kQuestion = new Question();
        kQuestion.setBody(body);
        kQuestion.setMainPeople(mainPeople);
        return update(question, kQuestion);
    }
    public int updateOfBodyAndStartTime(Question question, String body, String startTime) {
        Question kQuestion = new Question();
        kQuestion.setBody(body);
        kQuestion.setStartTime(startTime);
        return update(question, kQuestion);
    }
    public int updateOfBodyAndEndTime(Question question, String body, String endTime) {
        Question kQuestion = new Question();
        kQuestion.setBody(body);
        kQuestion.setEndTime(endTime);
        return update(question, kQuestion);
    }
    public int updateOfBodyAndInputFormat(Question question, String body, String inputFormat) {
        Question kQuestion = new Question();
        kQuestion.setBody(body);
        kQuestion.setInputFormat(inputFormat);
        return update(question, kQuestion);
    }
    public int updateOfBodyAndOutputFormat(Question question, String body, String outputFormat) {
        Question kQuestion = new Question();
        kQuestion.setBody(body);
        kQuestion.setOutputFormat(outputFormat);
        return update(question, kQuestion);
    }
    public int updateOfBodyAndInputTest(Question question, String body, String inputTest) {
        Question kQuestion = new Question();
        kQuestion.setBody(body);
        kQuestion.setInputTest(inputTest);
        return update(question, kQuestion);
    }
    public int updateOfBodyAndOutputTest(Question question, String body, String outputTest) {
        Question kQuestion = new Question();
        kQuestion.setBody(body);
        kQuestion.setOutputTest(outputTest);
        return update(question, kQuestion);
    }
    public int updateOfBodyAndContestId(Question question, String body, String contestId) {
        Question kQuestion = new Question();
        kQuestion.setBody(body);
        kQuestion.setContestId(contestId);
        return update(question, kQuestion);
    }
    public int updateOfBodyAndUserId(Question question, String body, String userId) {
        Question kQuestion = new Question();
        kQuestion.setBody(body);
        kQuestion.setUserId(userId);
        return update(question, kQuestion);
    }
    public int updateOfBodyAndDemoBody(Question question, String body, String demoBody) {
        Question kQuestion = new Question();
        kQuestion.setBody(body);
        kQuestion.setDemoBody(demoBody);
        return update(question, kQuestion);
    }
    public int updateOfScoreAndDemoCode(Question question, String score, String demoCode) {
        Question kQuestion = new Question();
        kQuestion.setScore(score);
        kQuestion.setDemoCode(demoCode);
        return update(question, kQuestion);
    }
    public int updateOfScoreAndRightPeople(Question question, String score, String rightPeople) {
        Question kQuestion = new Question();
        kQuestion.setScore(score);
        kQuestion.setRightPeople(rightPeople);
        return update(question, kQuestion);
    }
    public int updateOfScoreAndMainPeople(Question question, String score, String mainPeople) {
        Question kQuestion = new Question();
        kQuestion.setScore(score);
        kQuestion.setMainPeople(mainPeople);
        return update(question, kQuestion);
    }
    public int updateOfScoreAndStartTime(Question question, String score, String startTime) {
        Question kQuestion = new Question();
        kQuestion.setScore(score);
        kQuestion.setStartTime(startTime);
        return update(question, kQuestion);
    }
    public int updateOfScoreAndEndTime(Question question, String score, String endTime) {
        Question kQuestion = new Question();
        kQuestion.setScore(score);
        kQuestion.setEndTime(endTime);
        return update(question, kQuestion);
    }
    public int updateOfScoreAndInputFormat(Question question, String score, String inputFormat) {
        Question kQuestion = new Question();
        kQuestion.setScore(score);
        kQuestion.setInputFormat(inputFormat);
        return update(question, kQuestion);
    }
    public int updateOfScoreAndOutputFormat(Question question, String score, String outputFormat) {
        Question kQuestion = new Question();
        kQuestion.setScore(score);
        kQuestion.setOutputFormat(outputFormat);
        return update(question, kQuestion);
    }
    public int updateOfScoreAndInputTest(Question question, String score, String inputTest) {
        Question kQuestion = new Question();
        kQuestion.setScore(score);
        kQuestion.setInputTest(inputTest);
        return update(question, kQuestion);
    }
    public int updateOfScoreAndOutputTest(Question question, String score, String outputTest) {
        Question kQuestion = new Question();
        kQuestion.setScore(score);
        kQuestion.setOutputTest(outputTest);
        return update(question, kQuestion);
    }
    public int updateOfScoreAndContestId(Question question, String score, String contestId) {
        Question kQuestion = new Question();
        kQuestion.setScore(score);
        kQuestion.setContestId(contestId);
        return update(question, kQuestion);
    }
    public int updateOfScoreAndUserId(Question question, String score, String userId) {
        Question kQuestion = new Question();
        kQuestion.setScore(score);
        kQuestion.setUserId(userId);
        return update(question, kQuestion);
    }
    public int updateOfScoreAndDemoBody(Question question, String score, String demoBody) {
        Question kQuestion = new Question();
        kQuestion.setScore(score);
        kQuestion.setDemoBody(demoBody);
        return update(question, kQuestion);
    }
    public int updateOfDemoCodeAndRightPeople(Question question, String demoCode, String rightPeople) {
        Question kQuestion = new Question();
        kQuestion.setDemoCode(demoCode);
        kQuestion.setRightPeople(rightPeople);
        return update(question, kQuestion);
    }
    public int updateOfDemoCodeAndMainPeople(Question question, String demoCode, String mainPeople) {
        Question kQuestion = new Question();
        kQuestion.setDemoCode(demoCode);
        kQuestion.setMainPeople(mainPeople);
        return update(question, kQuestion);
    }
    public int updateOfDemoCodeAndStartTime(Question question, String demoCode, String startTime) {
        Question kQuestion = new Question();
        kQuestion.setDemoCode(demoCode);
        kQuestion.setStartTime(startTime);
        return update(question, kQuestion);
    }
    public int updateOfDemoCodeAndEndTime(Question question, String demoCode, String endTime) {
        Question kQuestion = new Question();
        kQuestion.setDemoCode(demoCode);
        kQuestion.setEndTime(endTime);
        return update(question, kQuestion);
    }
    public int updateOfDemoCodeAndInputFormat(Question question, String demoCode, String inputFormat) {
        Question kQuestion = new Question();
        kQuestion.setDemoCode(demoCode);
        kQuestion.setInputFormat(inputFormat);
        return update(question, kQuestion);
    }
    public int updateOfDemoCodeAndOutputFormat(Question question, String demoCode, String outputFormat) {
        Question kQuestion = new Question();
        kQuestion.setDemoCode(demoCode);
        kQuestion.setOutputFormat(outputFormat);
        return update(question, kQuestion);
    }
    public int updateOfDemoCodeAndInputTest(Question question, String demoCode, String inputTest) {
        Question kQuestion = new Question();
        kQuestion.setDemoCode(demoCode);
        kQuestion.setInputTest(inputTest);
        return update(question, kQuestion);
    }
    public int updateOfDemoCodeAndOutputTest(Question question, String demoCode, String outputTest) {
        Question kQuestion = new Question();
        kQuestion.setDemoCode(demoCode);
        kQuestion.setOutputTest(outputTest);
        return update(question, kQuestion);
    }
    public int updateOfDemoCodeAndContestId(Question question, String demoCode, String contestId) {
        Question kQuestion = new Question();
        kQuestion.setDemoCode(demoCode);
        kQuestion.setContestId(contestId);
        return update(question, kQuestion);
    }
    public int updateOfDemoCodeAndUserId(Question question, String demoCode, String userId) {
        Question kQuestion = new Question();
        kQuestion.setDemoCode(demoCode);
        kQuestion.setUserId(userId);
        return update(question, kQuestion);
    }
    public int updateOfDemoCodeAndDemoBody(Question question, String demoCode, String demoBody) {
        Question kQuestion = new Question();
        kQuestion.setDemoCode(demoCode);
        kQuestion.setDemoBody(demoBody);
        return update(question, kQuestion);
    }
    public int updateOfRightPeopleAndMainPeople(Question question, String rightPeople, String mainPeople) {
        Question kQuestion = new Question();
        kQuestion.setRightPeople(rightPeople);
        kQuestion.setMainPeople(mainPeople);
        return update(question, kQuestion);
    }
    public int updateOfRightPeopleAndStartTime(Question question, String rightPeople, String startTime) {
        Question kQuestion = new Question();
        kQuestion.setRightPeople(rightPeople);
        kQuestion.setStartTime(startTime);
        return update(question, kQuestion);
    }
    public int updateOfRightPeopleAndEndTime(Question question, String rightPeople, String endTime) {
        Question kQuestion = new Question();
        kQuestion.setRightPeople(rightPeople);
        kQuestion.setEndTime(endTime);
        return update(question, kQuestion);
    }
    public int updateOfRightPeopleAndInputFormat(Question question, String rightPeople, String inputFormat) {
        Question kQuestion = new Question();
        kQuestion.setRightPeople(rightPeople);
        kQuestion.setInputFormat(inputFormat);
        return update(question, kQuestion);
    }
    public int updateOfRightPeopleAndOutputFormat(Question question, String rightPeople, String outputFormat) {
        Question kQuestion = new Question();
        kQuestion.setRightPeople(rightPeople);
        kQuestion.setOutputFormat(outputFormat);
        return update(question, kQuestion);
    }
    public int updateOfRightPeopleAndInputTest(Question question, String rightPeople, String inputTest) {
        Question kQuestion = new Question();
        kQuestion.setRightPeople(rightPeople);
        kQuestion.setInputTest(inputTest);
        return update(question, kQuestion);
    }
    public int updateOfRightPeopleAndOutputTest(Question question, String rightPeople, String outputTest) {
        Question kQuestion = new Question();
        kQuestion.setRightPeople(rightPeople);
        kQuestion.setOutputTest(outputTest);
        return update(question, kQuestion);
    }
    public int updateOfRightPeopleAndContestId(Question question, String rightPeople, String contestId) {
        Question kQuestion = new Question();
        kQuestion.setRightPeople(rightPeople);
        kQuestion.setContestId(contestId);
        return update(question, kQuestion);
    }
    public int updateOfRightPeopleAndUserId(Question question, String rightPeople, String userId) {
        Question kQuestion = new Question();
        kQuestion.setRightPeople(rightPeople);
        kQuestion.setUserId(userId);
        return update(question, kQuestion);
    }
    public int updateOfRightPeopleAndDemoBody(Question question, String rightPeople, String demoBody) {
        Question kQuestion = new Question();
        kQuestion.setRightPeople(rightPeople);
        kQuestion.setDemoBody(demoBody);
        return update(question, kQuestion);
    }
    public int updateOfMainPeopleAndStartTime(Question question, String mainPeople, String startTime) {
        Question kQuestion = new Question();
        kQuestion.setMainPeople(mainPeople);
        kQuestion.setStartTime(startTime);
        return update(question, kQuestion);
    }
    public int updateOfMainPeopleAndEndTime(Question question, String mainPeople, String endTime) {
        Question kQuestion = new Question();
        kQuestion.setMainPeople(mainPeople);
        kQuestion.setEndTime(endTime);
        return update(question, kQuestion);
    }
    public int updateOfMainPeopleAndInputFormat(Question question, String mainPeople, String inputFormat) {
        Question kQuestion = new Question();
        kQuestion.setMainPeople(mainPeople);
        kQuestion.setInputFormat(inputFormat);
        return update(question, kQuestion);
    }
    public int updateOfMainPeopleAndOutputFormat(Question question, String mainPeople, String outputFormat) {
        Question kQuestion = new Question();
        kQuestion.setMainPeople(mainPeople);
        kQuestion.setOutputFormat(outputFormat);
        return update(question, kQuestion);
    }
    public int updateOfMainPeopleAndInputTest(Question question, String mainPeople, String inputTest) {
        Question kQuestion = new Question();
        kQuestion.setMainPeople(mainPeople);
        kQuestion.setInputTest(inputTest);
        return update(question, kQuestion);
    }
    public int updateOfMainPeopleAndOutputTest(Question question, String mainPeople, String outputTest) {
        Question kQuestion = new Question();
        kQuestion.setMainPeople(mainPeople);
        kQuestion.setOutputTest(outputTest);
        return update(question, kQuestion);
    }
    public int updateOfMainPeopleAndContestId(Question question, String mainPeople, String contestId) {
        Question kQuestion = new Question();
        kQuestion.setMainPeople(mainPeople);
        kQuestion.setContestId(contestId);
        return update(question, kQuestion);
    }
    public int updateOfMainPeopleAndUserId(Question question, String mainPeople, String userId) {
        Question kQuestion = new Question();
        kQuestion.setMainPeople(mainPeople);
        kQuestion.setUserId(userId);
        return update(question, kQuestion);
    }
    public int updateOfMainPeopleAndDemoBody(Question question, String mainPeople, String demoBody) {
        Question kQuestion = new Question();
        kQuestion.setMainPeople(mainPeople);
        kQuestion.setDemoBody(demoBody);
        return update(question, kQuestion);
    }
    public int updateOfStartTimeAndEndTime(Question question, String startTime, String endTime) {
        Question kQuestion = new Question();
        kQuestion.setStartTime(startTime);
        kQuestion.setEndTime(endTime);
        return update(question, kQuestion);
    }
    public int updateOfStartTimeAndInputFormat(Question question, String startTime, String inputFormat) {
        Question kQuestion = new Question();
        kQuestion.setStartTime(startTime);
        kQuestion.setInputFormat(inputFormat);
        return update(question, kQuestion);
    }
    public int updateOfStartTimeAndOutputFormat(Question question, String startTime, String outputFormat) {
        Question kQuestion = new Question();
        kQuestion.setStartTime(startTime);
        kQuestion.setOutputFormat(outputFormat);
        return update(question, kQuestion);
    }
    public int updateOfStartTimeAndInputTest(Question question, String startTime, String inputTest) {
        Question kQuestion = new Question();
        kQuestion.setStartTime(startTime);
        kQuestion.setInputTest(inputTest);
        return update(question, kQuestion);
    }
    public int updateOfStartTimeAndOutputTest(Question question, String startTime, String outputTest) {
        Question kQuestion = new Question();
        kQuestion.setStartTime(startTime);
        kQuestion.setOutputTest(outputTest);
        return update(question, kQuestion);
    }
    public int updateOfStartTimeAndContestId(Question question, String startTime, String contestId) {
        Question kQuestion = new Question();
        kQuestion.setStartTime(startTime);
        kQuestion.setContestId(contestId);
        return update(question, kQuestion);
    }
    public int updateOfStartTimeAndUserId(Question question, String startTime, String userId) {
        Question kQuestion = new Question();
        kQuestion.setStartTime(startTime);
        kQuestion.setUserId(userId);
        return update(question, kQuestion);
    }
    public int updateOfStartTimeAndDemoBody(Question question, String startTime, String demoBody) {
        Question kQuestion = new Question();
        kQuestion.setStartTime(startTime);
        kQuestion.setDemoBody(demoBody);
        return update(question, kQuestion);
    }
    public int updateOfEndTimeAndInputFormat(Question question, String endTime, String inputFormat) {
        Question kQuestion = new Question();
        kQuestion.setEndTime(endTime);
        kQuestion.setInputFormat(inputFormat);
        return update(question, kQuestion);
    }
    public int updateOfEndTimeAndOutputFormat(Question question, String endTime, String outputFormat) {
        Question kQuestion = new Question();
        kQuestion.setEndTime(endTime);
        kQuestion.setOutputFormat(outputFormat);
        return update(question, kQuestion);
    }
    public int updateOfEndTimeAndInputTest(Question question, String endTime, String inputTest) {
        Question kQuestion = new Question();
        kQuestion.setEndTime(endTime);
        kQuestion.setInputTest(inputTest);
        return update(question, kQuestion);
    }
    public int updateOfEndTimeAndOutputTest(Question question, String endTime, String outputTest) {
        Question kQuestion = new Question();
        kQuestion.setEndTime(endTime);
        kQuestion.setOutputTest(outputTest);
        return update(question, kQuestion);
    }
    public int updateOfEndTimeAndContestId(Question question, String endTime, String contestId) {
        Question kQuestion = new Question();
        kQuestion.setEndTime(endTime);
        kQuestion.setContestId(contestId);
        return update(question, kQuestion);
    }
    public int updateOfEndTimeAndUserId(Question question, String endTime, String userId) {
        Question kQuestion = new Question();
        kQuestion.setEndTime(endTime);
        kQuestion.setUserId(userId);
        return update(question, kQuestion);
    }
    public int updateOfEndTimeAndDemoBody(Question question, String endTime, String demoBody) {
        Question kQuestion = new Question();
        kQuestion.setEndTime(endTime);
        kQuestion.setDemoBody(demoBody);
        return update(question, kQuestion);
    }
    public int updateOfInputFormatAndOutputFormat(Question question, String inputFormat, String outputFormat) {
        Question kQuestion = new Question();
        kQuestion.setInputFormat(inputFormat);
        kQuestion.setOutputFormat(outputFormat);
        return update(question, kQuestion);
    }
    public int updateOfInputFormatAndInputTest(Question question, String inputFormat, String inputTest) {
        Question kQuestion = new Question();
        kQuestion.setInputFormat(inputFormat);
        kQuestion.setInputTest(inputTest);
        return update(question, kQuestion);
    }
    public int updateOfInputFormatAndOutputTest(Question question, String inputFormat, String outputTest) {
        Question kQuestion = new Question();
        kQuestion.setInputFormat(inputFormat);
        kQuestion.setOutputTest(outputTest);
        return update(question, kQuestion);
    }
    public int updateOfInputFormatAndContestId(Question question, String inputFormat, String contestId) {
        Question kQuestion = new Question();
        kQuestion.setInputFormat(inputFormat);
        kQuestion.setContestId(contestId);
        return update(question, kQuestion);
    }
    public int updateOfInputFormatAndUserId(Question question, String inputFormat, String userId) {
        Question kQuestion = new Question();
        kQuestion.setInputFormat(inputFormat);
        kQuestion.setUserId(userId);
        return update(question, kQuestion);
    }
    public int updateOfInputFormatAndDemoBody(Question question, String inputFormat, String demoBody) {
        Question kQuestion = new Question();
        kQuestion.setInputFormat(inputFormat);
        kQuestion.setDemoBody(demoBody);
        return update(question, kQuestion);
    }
    public int updateOfOutputFormatAndInputTest(Question question, String outputFormat, String inputTest) {
        Question kQuestion = new Question();
        kQuestion.setOutputFormat(outputFormat);
        kQuestion.setInputTest(inputTest);
        return update(question, kQuestion);
    }
    public int updateOfOutputFormatAndOutputTest(Question question, String outputFormat, String outputTest) {
        Question kQuestion = new Question();
        kQuestion.setOutputFormat(outputFormat);
        kQuestion.setOutputTest(outputTest);
        return update(question, kQuestion);
    }
    public int updateOfOutputFormatAndContestId(Question question, String outputFormat, String contestId) {
        Question kQuestion = new Question();
        kQuestion.setOutputFormat(outputFormat);
        kQuestion.setContestId(contestId);
        return update(question, kQuestion);
    }
    public int updateOfOutputFormatAndUserId(Question question, String outputFormat, String userId) {
        Question kQuestion = new Question();
        kQuestion.setOutputFormat(outputFormat);
        kQuestion.setUserId(userId);
        return update(question, kQuestion);
    }
    public int updateOfOutputFormatAndDemoBody(Question question, String outputFormat, String demoBody) {
        Question kQuestion = new Question();
        kQuestion.setOutputFormat(outputFormat);
        kQuestion.setDemoBody(demoBody);
        return update(question, kQuestion);
    }
    public int updateOfInputTestAndOutputTest(Question question, String inputTest, String outputTest) {
        Question kQuestion = new Question();
        kQuestion.setInputTest(inputTest);
        kQuestion.setOutputTest(outputTest);
        return update(question, kQuestion);
    }
    public int updateOfInputTestAndContestId(Question question, String inputTest, String contestId) {
        Question kQuestion = new Question();
        kQuestion.setInputTest(inputTest);
        kQuestion.setContestId(contestId);
        return update(question, kQuestion);
    }
    public int updateOfInputTestAndUserId(Question question, String inputTest, String userId) {
        Question kQuestion = new Question();
        kQuestion.setInputTest(inputTest);
        kQuestion.setUserId(userId);
        return update(question, kQuestion);
    }
    public int updateOfInputTestAndDemoBody(Question question, String inputTest, String demoBody) {
        Question kQuestion = new Question();
        kQuestion.setInputTest(inputTest);
        kQuestion.setDemoBody(demoBody);
        return update(question, kQuestion);
    }
    public int updateOfOutputTestAndContestId(Question question, String outputTest, String contestId) {
        Question kQuestion = new Question();
        kQuestion.setOutputTest(outputTest);
        kQuestion.setContestId(contestId);
        return update(question, kQuestion);
    }
    public int updateOfOutputTestAndUserId(Question question, String outputTest, String userId) {
        Question kQuestion = new Question();
        kQuestion.setOutputTest(outputTest);
        kQuestion.setUserId(userId);
        return update(question, kQuestion);
    }
    public int updateOfOutputTestAndDemoBody(Question question, String outputTest, String demoBody) {
        Question kQuestion = new Question();
        kQuestion.setOutputTest(outputTest);
        kQuestion.setDemoBody(demoBody);
        return update(question, kQuestion);
    }
    public int updateOfContestIdAndUserId(Question question, String contestId, String userId) {
        Question kQuestion = new Question();
        kQuestion.setContestId(contestId);
        kQuestion.setUserId(userId);
        return update(question, kQuestion);
    }
    public int updateOfContestIdAndDemoBody(Question question, String contestId, String demoBody) {
        Question kQuestion = new Question();
        kQuestion.setContestId(contestId);
        kQuestion.setDemoBody(demoBody);
        return update(question, kQuestion);
    }
    public int updateOfUserIdAndDemoBody(Question question, String userId, String demoBody) {
        Question kQuestion = new Question();
        kQuestion.setUserId(userId);
        kQuestion.setDemoBody(demoBody);
        return update(question, kQuestion);
    }
    public int remove(Question question) {
        return DBMan.getInstance().deleteNoSqlWithoutThrow(question, "question");
    }
    public int removeOfQuestionId(String questionId) {
        Question question = new Question();
        question.setQuestionId(questionId);
        return remove(question);
    }
    public int removeOfTitle(String title) {
        Question question = new Question();
        question.setTitle(title);
        return remove(question);
    }
    public int removeOfBody(String body) {
        Question question = new Question();
        question.setBody(body);
        return remove(question);
    }
    public int removeOfScore(String score) {
        Question question = new Question();
        question.setScore(score);
        return remove(question);
    }
    public int removeOfDemoCode(String demoCode) {
        Question question = new Question();
        question.setDemoCode(demoCode);
        return remove(question);
    }
    public int removeOfRightPeople(String rightPeople) {
        Question question = new Question();
        question.setRightPeople(rightPeople);
        return remove(question);
    }
    public int removeOfMainPeople(String mainPeople) {
        Question question = new Question();
        question.setMainPeople(mainPeople);
        return remove(question);
    }
    public int removeOfStartTime(String startTime) {
        Question question = new Question();
        question.setStartTime(startTime);
        return remove(question);
    }
    public int removeOfEndTime(String endTime) {
        Question question = new Question();
        question.setEndTime(endTime);
        return remove(question);
    }
    public int removeOfInputFormat(String inputFormat) {
        Question question = new Question();
        question.setInputFormat(inputFormat);
        return remove(question);
    }
    public int removeOfOutputFormat(String outputFormat) {
        Question question = new Question();
        question.setOutputFormat(outputFormat);
        return remove(question);
    }
    public int removeOfInputTest(String inputTest) {
        Question question = new Question();
        question.setInputTest(inputTest);
        return remove(question);
    }
    public int removeOfOutputTest(String outputTest) {
        Question question = new Question();
        question.setOutputTest(outputTest);
        return remove(question);
    }
    public int removeOfContestId(String contestId) {
        Question question = new Question();
        question.setContestId(contestId);
        return remove(question);
    }
    public int removeOfUserId(String userId) {
        Question question = new Question();
        question.setUserId(userId);
        return remove(question);
    }
    public int removeOfDemoBody(String demoBody) {
        Question question = new Question();
        question.setDemoBody(demoBody);
        return remove(question);
    }
    public int removeOfQuestionIdAndTitle(String questionId, String title) {
        Question question = new Question();
        question.setQuestionId(questionId);
        question.setTitle(title);
        return remove(question);
    }
    public int removeOfQuestionIdAndBody(String questionId, String body) {
        Question question = new Question();
        question.setQuestionId(questionId);
        question.setBody(body);
        return remove(question);
    }
    public int removeOfQuestionIdAndScore(String questionId, String score) {
        Question question = new Question();
        question.setQuestionId(questionId);
        question.setScore(score);
        return remove(question);
    }
    public int removeOfQuestionIdAndDemoCode(String questionId, String demoCode) {
        Question question = new Question();
        question.setQuestionId(questionId);
        question.setDemoCode(demoCode);
        return remove(question);
    }
    public int removeOfQuestionIdAndRightPeople(String questionId, String rightPeople) {
        Question question = new Question();
        question.setQuestionId(questionId);
        question.setRightPeople(rightPeople);
        return remove(question);
    }
    public int removeOfQuestionIdAndMainPeople(String questionId, String mainPeople) {
        Question question = new Question();
        question.setQuestionId(questionId);
        question.setMainPeople(mainPeople);
        return remove(question);
    }
    public int removeOfQuestionIdAndStartTime(String questionId, String startTime) {
        Question question = new Question();
        question.setQuestionId(questionId);
        question.setStartTime(startTime);
        return remove(question);
    }
    public int removeOfQuestionIdAndEndTime(String questionId, String endTime) {
        Question question = new Question();
        question.setQuestionId(questionId);
        question.setEndTime(endTime);
        return remove(question);
    }
    public int removeOfQuestionIdAndInputFormat(String questionId, String inputFormat) {
        Question question = new Question();
        question.setQuestionId(questionId);
        question.setInputFormat(inputFormat);
        return remove(question);
    }
    public int removeOfQuestionIdAndOutputFormat(String questionId, String outputFormat) {
        Question question = new Question();
        question.setQuestionId(questionId);
        question.setOutputFormat(outputFormat);
        return remove(question);
    }
    public int removeOfQuestionIdAndInputTest(String questionId, String inputTest) {
        Question question = new Question();
        question.setQuestionId(questionId);
        question.setInputTest(inputTest);
        return remove(question);
    }
    public int removeOfQuestionIdAndOutputTest(String questionId, String outputTest) {
        Question question = new Question();
        question.setQuestionId(questionId);
        question.setOutputTest(outputTest);
        return remove(question);
    }
    public int removeOfQuestionIdAndContestId(String questionId, String contestId) {
        Question question = new Question();
        question.setQuestionId(questionId);
        question.setContestId(contestId);
        return remove(question);
    }
    public int removeOfQuestionIdAndUserId(String questionId, String userId) {
        Question question = new Question();
        question.setQuestionId(questionId);
        question.setUserId(userId);
        return remove(question);
    }
    public int removeOfQuestionIdAndDemoBody(String questionId, String demoBody) {
        Question question = new Question();
        question.setQuestionId(questionId);
        question.setDemoBody(demoBody);
        return remove(question);
    }
    public int removeOfTitleAndBody(String title, String body) {
        Question question = new Question();
        question.setTitle(title);
        question.setBody(body);
        return remove(question);
    }
    public int removeOfTitleAndScore(String title, String score) {
        Question question = new Question();
        question.setTitle(title);
        question.setScore(score);
        return remove(question);
    }
    public int removeOfTitleAndDemoCode(String title, String demoCode) {
        Question question = new Question();
        question.setTitle(title);
        question.setDemoCode(demoCode);
        return remove(question);
    }
    public int removeOfTitleAndRightPeople(String title, String rightPeople) {
        Question question = new Question();
        question.setTitle(title);
        question.setRightPeople(rightPeople);
        return remove(question);
    }
    public int removeOfTitleAndMainPeople(String title, String mainPeople) {
        Question question = new Question();
        question.setTitle(title);
        question.setMainPeople(mainPeople);
        return remove(question);
    }
    public int removeOfTitleAndStartTime(String title, String startTime) {
        Question question = new Question();
        question.setTitle(title);
        question.setStartTime(startTime);
        return remove(question);
    }
    public int removeOfTitleAndEndTime(String title, String endTime) {
        Question question = new Question();
        question.setTitle(title);
        question.setEndTime(endTime);
        return remove(question);
    }
    public int removeOfTitleAndInputFormat(String title, String inputFormat) {
        Question question = new Question();
        question.setTitle(title);
        question.setInputFormat(inputFormat);
        return remove(question);
    }
    public int removeOfTitleAndOutputFormat(String title, String outputFormat) {
        Question question = new Question();
        question.setTitle(title);
        question.setOutputFormat(outputFormat);
        return remove(question);
    }
    public int removeOfTitleAndInputTest(String title, String inputTest) {
        Question question = new Question();
        question.setTitle(title);
        question.setInputTest(inputTest);
        return remove(question);
    }
    public int removeOfTitleAndOutputTest(String title, String outputTest) {
        Question question = new Question();
        question.setTitle(title);
        question.setOutputTest(outputTest);
        return remove(question);
    }
    public int removeOfTitleAndContestId(String title, String contestId) {
        Question question = new Question();
        question.setTitle(title);
        question.setContestId(contestId);
        return remove(question);
    }
    public int removeOfTitleAndUserId(String title, String userId) {
        Question question = new Question();
        question.setTitle(title);
        question.setUserId(userId);
        return remove(question);
    }
    public int removeOfTitleAndDemoBody(String title, String demoBody) {
        Question question = new Question();
        question.setTitle(title);
        question.setDemoBody(demoBody);
        return remove(question);
    }
    public int removeOfBodyAndScore(String body, String score) {
        Question question = new Question();
        question.setBody(body);
        question.setScore(score);
        return remove(question);
    }
    public int removeOfBodyAndDemoCode(String body, String demoCode) {
        Question question = new Question();
        question.setBody(body);
        question.setDemoCode(demoCode);
        return remove(question);
    }
    public int removeOfBodyAndRightPeople(String body, String rightPeople) {
        Question question = new Question();
        question.setBody(body);
        question.setRightPeople(rightPeople);
        return remove(question);
    }
    public int removeOfBodyAndMainPeople(String body, String mainPeople) {
        Question question = new Question();
        question.setBody(body);
        question.setMainPeople(mainPeople);
        return remove(question);
    }
    public int removeOfBodyAndStartTime(String body, String startTime) {
        Question question = new Question();
        question.setBody(body);
        question.setStartTime(startTime);
        return remove(question);
    }
    public int removeOfBodyAndEndTime(String body, String endTime) {
        Question question = new Question();
        question.setBody(body);
        question.setEndTime(endTime);
        return remove(question);
    }
    public int removeOfBodyAndInputFormat(String body, String inputFormat) {
        Question question = new Question();
        question.setBody(body);
        question.setInputFormat(inputFormat);
        return remove(question);
    }
    public int removeOfBodyAndOutputFormat(String body, String outputFormat) {
        Question question = new Question();
        question.setBody(body);
        question.setOutputFormat(outputFormat);
        return remove(question);
    }
    public int removeOfBodyAndInputTest(String body, String inputTest) {
        Question question = new Question();
        question.setBody(body);
        question.setInputTest(inputTest);
        return remove(question);
    }
    public int removeOfBodyAndOutputTest(String body, String outputTest) {
        Question question = new Question();
        question.setBody(body);
        question.setOutputTest(outputTest);
        return remove(question);
    }
    public int removeOfBodyAndContestId(String body, String contestId) {
        Question question = new Question();
        question.setBody(body);
        question.setContestId(contestId);
        return remove(question);
    }
    public int removeOfBodyAndUserId(String body, String userId) {
        Question question = new Question();
        question.setBody(body);
        question.setUserId(userId);
        return remove(question);
    }
    public int removeOfBodyAndDemoBody(String body, String demoBody) {
        Question question = new Question();
        question.setBody(body);
        question.setDemoBody(demoBody);
        return remove(question);
    }
    public int removeOfScoreAndDemoCode(String score, String demoCode) {
        Question question = new Question();
        question.setScore(score);
        question.setDemoCode(demoCode);
        return remove(question);
    }
    public int removeOfScoreAndRightPeople(String score, String rightPeople) {
        Question question = new Question();
        question.setScore(score);
        question.setRightPeople(rightPeople);
        return remove(question);
    }
    public int removeOfScoreAndMainPeople(String score, String mainPeople) {
        Question question = new Question();
        question.setScore(score);
        question.setMainPeople(mainPeople);
        return remove(question);
    }
    public int removeOfScoreAndStartTime(String score, String startTime) {
        Question question = new Question();
        question.setScore(score);
        question.setStartTime(startTime);
        return remove(question);
    }
    public int removeOfScoreAndEndTime(String score, String endTime) {
        Question question = new Question();
        question.setScore(score);
        question.setEndTime(endTime);
        return remove(question);
    }
    public int removeOfScoreAndInputFormat(String score, String inputFormat) {
        Question question = new Question();
        question.setScore(score);
        question.setInputFormat(inputFormat);
        return remove(question);
    }
    public int removeOfScoreAndOutputFormat(String score, String outputFormat) {
        Question question = new Question();
        question.setScore(score);
        question.setOutputFormat(outputFormat);
        return remove(question);
    }
    public int removeOfScoreAndInputTest(String score, String inputTest) {
        Question question = new Question();
        question.setScore(score);
        question.setInputTest(inputTest);
        return remove(question);
    }
    public int removeOfScoreAndOutputTest(String score, String outputTest) {
        Question question = new Question();
        question.setScore(score);
        question.setOutputTest(outputTest);
        return remove(question);
    }
    public int removeOfScoreAndContestId(String score, String contestId) {
        Question question = new Question();
        question.setScore(score);
        question.setContestId(contestId);
        return remove(question);
    }
    public int removeOfScoreAndUserId(String score, String userId) {
        Question question = new Question();
        question.setScore(score);
        question.setUserId(userId);
        return remove(question);
    }
    public int removeOfScoreAndDemoBody(String score, String demoBody) {
        Question question = new Question();
        question.setScore(score);
        question.setDemoBody(demoBody);
        return remove(question);
    }
    public int removeOfDemoCodeAndRightPeople(String demoCode, String rightPeople) {
        Question question = new Question();
        question.setDemoCode(demoCode);
        question.setRightPeople(rightPeople);
        return remove(question);
    }
    public int removeOfDemoCodeAndMainPeople(String demoCode, String mainPeople) {
        Question question = new Question();
        question.setDemoCode(demoCode);
        question.setMainPeople(mainPeople);
        return remove(question);
    }
    public int removeOfDemoCodeAndStartTime(String demoCode, String startTime) {
        Question question = new Question();
        question.setDemoCode(demoCode);
        question.setStartTime(startTime);
        return remove(question);
    }
    public int removeOfDemoCodeAndEndTime(String demoCode, String endTime) {
        Question question = new Question();
        question.setDemoCode(demoCode);
        question.setEndTime(endTime);
        return remove(question);
    }
    public int removeOfDemoCodeAndInputFormat(String demoCode, String inputFormat) {
        Question question = new Question();
        question.setDemoCode(demoCode);
        question.setInputFormat(inputFormat);
        return remove(question);
    }
    public int removeOfDemoCodeAndOutputFormat(String demoCode, String outputFormat) {
        Question question = new Question();
        question.setDemoCode(demoCode);
        question.setOutputFormat(outputFormat);
        return remove(question);
    }
    public int removeOfDemoCodeAndInputTest(String demoCode, String inputTest) {
        Question question = new Question();
        question.setDemoCode(demoCode);
        question.setInputTest(inputTest);
        return remove(question);
    }
    public int removeOfDemoCodeAndOutputTest(String demoCode, String outputTest) {
        Question question = new Question();
        question.setDemoCode(demoCode);
        question.setOutputTest(outputTest);
        return remove(question);
    }
    public int removeOfDemoCodeAndContestId(String demoCode, String contestId) {
        Question question = new Question();
        question.setDemoCode(demoCode);
        question.setContestId(contestId);
        return remove(question);
    }
    public int removeOfDemoCodeAndUserId(String demoCode, String userId) {
        Question question = new Question();
        question.setDemoCode(demoCode);
        question.setUserId(userId);
        return remove(question);
    }
    public int removeOfDemoCodeAndDemoBody(String demoCode, String demoBody) {
        Question question = new Question();
        question.setDemoCode(demoCode);
        question.setDemoBody(demoBody);
        return remove(question);
    }
    public int removeOfRightPeopleAndMainPeople(String rightPeople, String mainPeople) {
        Question question = new Question();
        question.setRightPeople(rightPeople);
        question.setMainPeople(mainPeople);
        return remove(question);
    }
    public int removeOfRightPeopleAndStartTime(String rightPeople, String startTime) {
        Question question = new Question();
        question.setRightPeople(rightPeople);
        question.setStartTime(startTime);
        return remove(question);
    }
    public int removeOfRightPeopleAndEndTime(String rightPeople, String endTime) {
        Question question = new Question();
        question.setRightPeople(rightPeople);
        question.setEndTime(endTime);
        return remove(question);
    }
    public int removeOfRightPeopleAndInputFormat(String rightPeople, String inputFormat) {
        Question question = new Question();
        question.setRightPeople(rightPeople);
        question.setInputFormat(inputFormat);
        return remove(question);
    }
    public int removeOfRightPeopleAndOutputFormat(String rightPeople, String outputFormat) {
        Question question = new Question();
        question.setRightPeople(rightPeople);
        question.setOutputFormat(outputFormat);
        return remove(question);
    }
    public int removeOfRightPeopleAndInputTest(String rightPeople, String inputTest) {
        Question question = new Question();
        question.setRightPeople(rightPeople);
        question.setInputTest(inputTest);
        return remove(question);
    }
    public int removeOfRightPeopleAndOutputTest(String rightPeople, String outputTest) {
        Question question = new Question();
        question.setRightPeople(rightPeople);
        question.setOutputTest(outputTest);
        return remove(question);
    }
    public int removeOfRightPeopleAndContestId(String rightPeople, String contestId) {
        Question question = new Question();
        question.setRightPeople(rightPeople);
        question.setContestId(contestId);
        return remove(question);
    }
    public int removeOfRightPeopleAndUserId(String rightPeople, String userId) {
        Question question = new Question();
        question.setRightPeople(rightPeople);
        question.setUserId(userId);
        return remove(question);
    }
    public int removeOfRightPeopleAndDemoBody(String rightPeople, String demoBody) {
        Question question = new Question();
        question.setRightPeople(rightPeople);
        question.setDemoBody(demoBody);
        return remove(question);
    }
    public int removeOfMainPeopleAndStartTime(String mainPeople, String startTime) {
        Question question = new Question();
        question.setMainPeople(mainPeople);
        question.setStartTime(startTime);
        return remove(question);
    }
    public int removeOfMainPeopleAndEndTime(String mainPeople, String endTime) {
        Question question = new Question();
        question.setMainPeople(mainPeople);
        question.setEndTime(endTime);
        return remove(question);
    }
    public int removeOfMainPeopleAndInputFormat(String mainPeople, String inputFormat) {
        Question question = new Question();
        question.setMainPeople(mainPeople);
        question.setInputFormat(inputFormat);
        return remove(question);
    }
    public int removeOfMainPeopleAndOutputFormat(String mainPeople, String outputFormat) {
        Question question = new Question();
        question.setMainPeople(mainPeople);
        question.setOutputFormat(outputFormat);
        return remove(question);
    }
    public int removeOfMainPeopleAndInputTest(String mainPeople, String inputTest) {
        Question question = new Question();
        question.setMainPeople(mainPeople);
        question.setInputTest(inputTest);
        return remove(question);
    }
    public int removeOfMainPeopleAndOutputTest(String mainPeople, String outputTest) {
        Question question = new Question();
        question.setMainPeople(mainPeople);
        question.setOutputTest(outputTest);
        return remove(question);
    }
    public int removeOfMainPeopleAndContestId(String mainPeople, String contestId) {
        Question question = new Question();
        question.setMainPeople(mainPeople);
        question.setContestId(contestId);
        return remove(question);
    }
    public int removeOfMainPeopleAndUserId(String mainPeople, String userId) {
        Question question = new Question();
        question.setMainPeople(mainPeople);
        question.setUserId(userId);
        return remove(question);
    }
    public int removeOfMainPeopleAndDemoBody(String mainPeople, String demoBody) {
        Question question = new Question();
        question.setMainPeople(mainPeople);
        question.setDemoBody(demoBody);
        return remove(question);
    }
    public int removeOfStartTimeAndEndTime(String startTime, String endTime) {
        Question question = new Question();
        question.setStartTime(startTime);
        question.setEndTime(endTime);
        return remove(question);
    }
    public int removeOfStartTimeAndInputFormat(String startTime, String inputFormat) {
        Question question = new Question();
        question.setStartTime(startTime);
        question.setInputFormat(inputFormat);
        return remove(question);
    }
    public int removeOfStartTimeAndOutputFormat(String startTime, String outputFormat) {
        Question question = new Question();
        question.setStartTime(startTime);
        question.setOutputFormat(outputFormat);
        return remove(question);
    }
    public int removeOfStartTimeAndInputTest(String startTime, String inputTest) {
        Question question = new Question();
        question.setStartTime(startTime);
        question.setInputTest(inputTest);
        return remove(question);
    }
    public int removeOfStartTimeAndOutputTest(String startTime, String outputTest) {
        Question question = new Question();
        question.setStartTime(startTime);
        question.setOutputTest(outputTest);
        return remove(question);
    }
    public int removeOfStartTimeAndContestId(String startTime, String contestId) {
        Question question = new Question();
        question.setStartTime(startTime);
        question.setContestId(contestId);
        return remove(question);
    }
    public int removeOfStartTimeAndUserId(String startTime, String userId) {
        Question question = new Question();
        question.setStartTime(startTime);
        question.setUserId(userId);
        return remove(question);
    }
    public int removeOfStartTimeAndDemoBody(String startTime, String demoBody) {
        Question question = new Question();
        question.setStartTime(startTime);
        question.setDemoBody(demoBody);
        return remove(question);
    }
    public int removeOfEndTimeAndInputFormat(String endTime, String inputFormat) {
        Question question = new Question();
        question.setEndTime(endTime);
        question.setInputFormat(inputFormat);
        return remove(question);
    }
    public int removeOfEndTimeAndOutputFormat(String endTime, String outputFormat) {
        Question question = new Question();
        question.setEndTime(endTime);
        question.setOutputFormat(outputFormat);
        return remove(question);
    }
    public int removeOfEndTimeAndInputTest(String endTime, String inputTest) {
        Question question = new Question();
        question.setEndTime(endTime);
        question.setInputTest(inputTest);
        return remove(question);
    }
    public int removeOfEndTimeAndOutputTest(String endTime, String outputTest) {
        Question question = new Question();
        question.setEndTime(endTime);
        question.setOutputTest(outputTest);
        return remove(question);
    }
    public int removeOfEndTimeAndContestId(String endTime, String contestId) {
        Question question = new Question();
        question.setEndTime(endTime);
        question.setContestId(contestId);
        return remove(question);
    }
    public int removeOfEndTimeAndUserId(String endTime, String userId) {
        Question question = new Question();
        question.setEndTime(endTime);
        question.setUserId(userId);
        return remove(question);
    }
    public int removeOfEndTimeAndDemoBody(String endTime, String demoBody) {
        Question question = new Question();
        question.setEndTime(endTime);
        question.setDemoBody(demoBody);
        return remove(question);
    }
    public int removeOfInputFormatAndOutputFormat(String inputFormat, String outputFormat) {
        Question question = new Question();
        question.setInputFormat(inputFormat);
        question.setOutputFormat(outputFormat);
        return remove(question);
    }
    public int removeOfInputFormatAndInputTest(String inputFormat, String inputTest) {
        Question question = new Question();
        question.setInputFormat(inputFormat);
        question.setInputTest(inputTest);
        return remove(question);
    }
    public int removeOfInputFormatAndOutputTest(String inputFormat, String outputTest) {
        Question question = new Question();
        question.setInputFormat(inputFormat);
        question.setOutputTest(outputTest);
        return remove(question);
    }
    public int removeOfInputFormatAndContestId(String inputFormat, String contestId) {
        Question question = new Question();
        question.setInputFormat(inputFormat);
        question.setContestId(contestId);
        return remove(question);
    }
    public int removeOfInputFormatAndUserId(String inputFormat, String userId) {
        Question question = new Question();
        question.setInputFormat(inputFormat);
        question.setUserId(userId);
        return remove(question);
    }
    public int removeOfInputFormatAndDemoBody(String inputFormat, String demoBody) {
        Question question = new Question();
        question.setInputFormat(inputFormat);
        question.setDemoBody(demoBody);
        return remove(question);
    }
    public int removeOfOutputFormatAndInputTest(String outputFormat, String inputTest) {
        Question question = new Question();
        question.setOutputFormat(outputFormat);
        question.setInputTest(inputTest);
        return remove(question);
    }
    public int removeOfOutputFormatAndOutputTest(String outputFormat, String outputTest) {
        Question question = new Question();
        question.setOutputFormat(outputFormat);
        question.setOutputTest(outputTest);
        return remove(question);
    }
    public int removeOfOutputFormatAndContestId(String outputFormat, String contestId) {
        Question question = new Question();
        question.setOutputFormat(outputFormat);
        question.setContestId(contestId);
        return remove(question);
    }
    public int removeOfOutputFormatAndUserId(String outputFormat, String userId) {
        Question question = new Question();
        question.setOutputFormat(outputFormat);
        question.setUserId(userId);
        return remove(question);
    }
    public int removeOfOutputFormatAndDemoBody(String outputFormat, String demoBody) {
        Question question = new Question();
        question.setOutputFormat(outputFormat);
        question.setDemoBody(demoBody);
        return remove(question);
    }
    public int removeOfInputTestAndOutputTest(String inputTest, String outputTest) {
        Question question = new Question();
        question.setInputTest(inputTest);
        question.setOutputTest(outputTest);
        return remove(question);
    }
    public int removeOfInputTestAndContestId(String inputTest, String contestId) {
        Question question = new Question();
        question.setInputTest(inputTest);
        question.setContestId(contestId);
        return remove(question);
    }
    public int removeOfInputTestAndUserId(String inputTest, String userId) {
        Question question = new Question();
        question.setInputTest(inputTest);
        question.setUserId(userId);
        return remove(question);
    }
    public int removeOfInputTestAndDemoBody(String inputTest, String demoBody) {
        Question question = new Question();
        question.setInputTest(inputTest);
        question.setDemoBody(demoBody);
        return remove(question);
    }
    public int removeOfOutputTestAndContestId(String outputTest, String contestId) {
        Question question = new Question();
        question.setOutputTest(outputTest);
        question.setContestId(contestId);
        return remove(question);
    }
    public int removeOfOutputTestAndUserId(String outputTest, String userId) {
        Question question = new Question();
        question.setOutputTest(outputTest);
        question.setUserId(userId);
        return remove(question);
    }
    public int removeOfOutputTestAndDemoBody(String outputTest, String demoBody) {
        Question question = new Question();
        question.setOutputTest(outputTest);
        question.setDemoBody(demoBody);
        return remove(question);
    }
    public int removeOfContestIdAndUserId(String contestId, String userId) {
        Question question = new Question();
        question.setContestId(contestId);
        question.setUserId(userId);
        return remove(question);
    }
    public int removeOfContestIdAndDemoBody(String contestId, String demoBody) {
        Question question = new Question();
        question.setContestId(contestId);
        question.setDemoBody(demoBody);
        return remove(question);
    }
    public int removeOfUserIdAndDemoBody(String userId, String demoBody) {
        Question question = new Question();
        question.setUserId(userId);
        question.setDemoBody(demoBody);
        return remove(question);
    }
    public int insert(Question question) {
        return DBMan.getInstance().insertNoSqlWithoutThrow(question, "question");
    }
    public int insertOfQuestionId(String questionId) {
        Question question = new Question();
        question.setQuestionId(questionId);
        return insert(question);
    }
    public int insertOfTitle(String title) {
        Question question = new Question();
        question.setTitle(title);
        return insert(question);
    }
    public int insertOfBody(String body) {
        Question question = new Question();
        question.setBody(body);
        return insert(question);
    }
    public int insertOfScore(String score) {
        Question question = new Question();
        question.setScore(score);
        return insert(question);
    }
    public int insertOfDemoCode(String demoCode) {
        Question question = new Question();
        question.setDemoCode(demoCode);
        return insert(question);
    }
    public int insertOfRightPeople(String rightPeople) {
        Question question = new Question();
        question.setRightPeople(rightPeople);
        return insert(question);
    }
    public int insertOfMainPeople(String mainPeople) {
        Question question = new Question();
        question.setMainPeople(mainPeople);
        return insert(question);
    }
    public int insertOfStartTime(String startTime) {
        Question question = new Question();
        question.setStartTime(startTime);
        return insert(question);
    }
    public int insertOfEndTime(String endTime) {
        Question question = new Question();
        question.setEndTime(endTime);
        return insert(question);
    }
    public int insertOfInputFormat(String inputFormat) {
        Question question = new Question();
        question.setInputFormat(inputFormat);
        return insert(question);
    }
    public int insertOfOutputFormat(String outputFormat) {
        Question question = new Question();
        question.setOutputFormat(outputFormat);
        return insert(question);
    }
    public int insertOfInputTest(String inputTest) {
        Question question = new Question();
        question.setInputTest(inputTest);
        return insert(question);
    }
    public int insertOfOutputTest(String outputTest) {
        Question question = new Question();
        question.setOutputTest(outputTest);
        return insert(question);
    }
    public int insertOfContestId(String contestId) {
        Question question = new Question();
        question.setContestId(contestId);
        return insert(question);
    }
    public int insertOfUserId(String userId) {
        Question question = new Question();
        question.setUserId(userId);
        return insert(question);
    }
    public int insertOfDemoBody(String demoBody) {
        Question question = new Question();
        question.setDemoBody(demoBody);
        return insert(question);
    }
    public int insertOfQuestionIdAndTitle(String questionId, String title) {
        Question question = new Question();
        question.setQuestionId(questionId);
        question.setTitle(title);
        return insert(question);
    }
    public int insertOfQuestionIdAndBody(String questionId, String body) {
        Question question = new Question();
        question.setQuestionId(questionId);
        question.setBody(body);
        return insert(question);
    }
    public int insertOfQuestionIdAndScore(String questionId, String score) {
        Question question = new Question();
        question.setQuestionId(questionId);
        question.setScore(score);
        return insert(question);
    }
    public int insertOfQuestionIdAndDemoCode(String questionId, String demoCode) {
        Question question = new Question();
        question.setQuestionId(questionId);
        question.setDemoCode(demoCode);
        return insert(question);
    }
    public int insertOfQuestionIdAndRightPeople(String questionId, String rightPeople) {
        Question question = new Question();
        question.setQuestionId(questionId);
        question.setRightPeople(rightPeople);
        return insert(question);
    }
    public int insertOfQuestionIdAndMainPeople(String questionId, String mainPeople) {
        Question question = new Question();
        question.setQuestionId(questionId);
        question.setMainPeople(mainPeople);
        return insert(question);
    }
    public int insertOfQuestionIdAndStartTime(String questionId, String startTime) {
        Question question = new Question();
        question.setQuestionId(questionId);
        question.setStartTime(startTime);
        return insert(question);
    }
    public int insertOfQuestionIdAndEndTime(String questionId, String endTime) {
        Question question = new Question();
        question.setQuestionId(questionId);
        question.setEndTime(endTime);
        return insert(question);
    }
    public int insertOfQuestionIdAndInputFormat(String questionId, String inputFormat) {
        Question question = new Question();
        question.setQuestionId(questionId);
        question.setInputFormat(inputFormat);
        return insert(question);
    }
    public int insertOfQuestionIdAndOutputFormat(String questionId, String outputFormat) {
        Question question = new Question();
        question.setQuestionId(questionId);
        question.setOutputFormat(outputFormat);
        return insert(question);
    }
    public int insertOfQuestionIdAndInputTest(String questionId, String inputTest) {
        Question question = new Question();
        question.setQuestionId(questionId);
        question.setInputTest(inputTest);
        return insert(question);
    }
    public int insertOfQuestionIdAndOutputTest(String questionId, String outputTest) {
        Question question = new Question();
        question.setQuestionId(questionId);
        question.setOutputTest(outputTest);
        return insert(question);
    }
    public int insertOfQuestionIdAndContestId(String questionId, String contestId) {
        Question question = new Question();
        question.setQuestionId(questionId);
        question.setContestId(contestId);
        return insert(question);
    }
    public int insertOfQuestionIdAndUserId(String questionId, String userId) {
        Question question = new Question();
        question.setQuestionId(questionId);
        question.setUserId(userId);
        return insert(question);
    }
    public int insertOfQuestionIdAndDemoBody(String questionId, String demoBody) {
        Question question = new Question();
        question.setQuestionId(questionId);
        question.setDemoBody(demoBody);
        return insert(question);
    }
    public int insertOfTitleAndBody(String title, String body) {
        Question question = new Question();
        question.setTitle(title);
        question.setBody(body);
        return insert(question);
    }
    public int insertOfTitleAndScore(String title, String score) {
        Question question = new Question();
        question.setTitle(title);
        question.setScore(score);
        return insert(question);
    }
    public int insertOfTitleAndDemoCode(String title, String demoCode) {
        Question question = new Question();
        question.setTitle(title);
        question.setDemoCode(demoCode);
        return insert(question);
    }
    public int insertOfTitleAndRightPeople(String title, String rightPeople) {
        Question question = new Question();
        question.setTitle(title);
        question.setRightPeople(rightPeople);
        return insert(question);
    }
    public int insertOfTitleAndMainPeople(String title, String mainPeople) {
        Question question = new Question();
        question.setTitle(title);
        question.setMainPeople(mainPeople);
        return insert(question);
    }
    public int insertOfTitleAndStartTime(String title, String startTime) {
        Question question = new Question();
        question.setTitle(title);
        question.setStartTime(startTime);
        return insert(question);
    }
    public int insertOfTitleAndEndTime(String title, String endTime) {
        Question question = new Question();
        question.setTitle(title);
        question.setEndTime(endTime);
        return insert(question);
    }
    public int insertOfTitleAndInputFormat(String title, String inputFormat) {
        Question question = new Question();
        question.setTitle(title);
        question.setInputFormat(inputFormat);
        return insert(question);
    }
    public int insertOfTitleAndOutputFormat(String title, String outputFormat) {
        Question question = new Question();
        question.setTitle(title);
        question.setOutputFormat(outputFormat);
        return insert(question);
    }
    public int insertOfTitleAndInputTest(String title, String inputTest) {
        Question question = new Question();
        question.setTitle(title);
        question.setInputTest(inputTest);
        return insert(question);
    }
    public int insertOfTitleAndOutputTest(String title, String outputTest) {
        Question question = new Question();
        question.setTitle(title);
        question.setOutputTest(outputTest);
        return insert(question);
    }
    public int insertOfTitleAndContestId(String title, String contestId) {
        Question question = new Question();
        question.setTitle(title);
        question.setContestId(contestId);
        return insert(question);
    }
    public int insertOfTitleAndUserId(String title, String userId) {
        Question question = new Question();
        question.setTitle(title);
        question.setUserId(userId);
        return insert(question);
    }
    public int insertOfTitleAndDemoBody(String title, String demoBody) {
        Question question = new Question();
        question.setTitle(title);
        question.setDemoBody(demoBody);
        return insert(question);
    }
    public int insertOfBodyAndScore(String body, String score) {
        Question question = new Question();
        question.setBody(body);
        question.setScore(score);
        return insert(question);
    }
    public int insertOfBodyAndDemoCode(String body, String demoCode) {
        Question question = new Question();
        question.setBody(body);
        question.setDemoCode(demoCode);
        return insert(question);
    }
    public int insertOfBodyAndRightPeople(String body, String rightPeople) {
        Question question = new Question();
        question.setBody(body);
        question.setRightPeople(rightPeople);
        return insert(question);
    }
    public int insertOfBodyAndMainPeople(String body, String mainPeople) {
        Question question = new Question();
        question.setBody(body);
        question.setMainPeople(mainPeople);
        return insert(question);
    }
    public int insertOfBodyAndStartTime(String body, String startTime) {
        Question question = new Question();
        question.setBody(body);
        question.setStartTime(startTime);
        return insert(question);
    }
    public int insertOfBodyAndEndTime(String body, String endTime) {
        Question question = new Question();
        question.setBody(body);
        question.setEndTime(endTime);
        return insert(question);
    }
    public int insertOfBodyAndInputFormat(String body, String inputFormat) {
        Question question = new Question();
        question.setBody(body);
        question.setInputFormat(inputFormat);
        return insert(question);
    }
    public int insertOfBodyAndOutputFormat(String body, String outputFormat) {
        Question question = new Question();
        question.setBody(body);
        question.setOutputFormat(outputFormat);
        return insert(question);
    }
    public int insertOfBodyAndInputTest(String body, String inputTest) {
        Question question = new Question();
        question.setBody(body);
        question.setInputTest(inputTest);
        return insert(question);
    }
    public int insertOfBodyAndOutputTest(String body, String outputTest) {
        Question question = new Question();
        question.setBody(body);
        question.setOutputTest(outputTest);
        return insert(question);
    }
    public int insertOfBodyAndContestId(String body, String contestId) {
        Question question = new Question();
        question.setBody(body);
        question.setContestId(contestId);
        return insert(question);
    }
    public int insertOfBodyAndUserId(String body, String userId) {
        Question question = new Question();
        question.setBody(body);
        question.setUserId(userId);
        return insert(question);
    }
    public int insertOfBodyAndDemoBody(String body, String demoBody) {
        Question question = new Question();
        question.setBody(body);
        question.setDemoBody(demoBody);
        return insert(question);
    }
    public int insertOfScoreAndDemoCode(String score, String demoCode) {
        Question question = new Question();
        question.setScore(score);
        question.setDemoCode(demoCode);
        return insert(question);
    }
    public int insertOfScoreAndRightPeople(String score, String rightPeople) {
        Question question = new Question();
        question.setScore(score);
        question.setRightPeople(rightPeople);
        return insert(question);
    }
    public int insertOfScoreAndMainPeople(String score, String mainPeople) {
        Question question = new Question();
        question.setScore(score);
        question.setMainPeople(mainPeople);
        return insert(question);
    }
    public int insertOfScoreAndStartTime(String score, String startTime) {
        Question question = new Question();
        question.setScore(score);
        question.setStartTime(startTime);
        return insert(question);
    }
    public int insertOfScoreAndEndTime(String score, String endTime) {
        Question question = new Question();
        question.setScore(score);
        question.setEndTime(endTime);
        return insert(question);
    }
    public int insertOfScoreAndInputFormat(String score, String inputFormat) {
        Question question = new Question();
        question.setScore(score);
        question.setInputFormat(inputFormat);
        return insert(question);
    }
    public int insertOfScoreAndOutputFormat(String score, String outputFormat) {
        Question question = new Question();
        question.setScore(score);
        question.setOutputFormat(outputFormat);
        return insert(question);
    }
    public int insertOfScoreAndInputTest(String score, String inputTest) {
        Question question = new Question();
        question.setScore(score);
        question.setInputTest(inputTest);
        return insert(question);
    }
    public int insertOfScoreAndOutputTest(String score, String outputTest) {
        Question question = new Question();
        question.setScore(score);
        question.setOutputTest(outputTest);
        return insert(question);
    }
    public int insertOfScoreAndContestId(String score, String contestId) {
        Question question = new Question();
        question.setScore(score);
        question.setContestId(contestId);
        return insert(question);
    }
    public int insertOfScoreAndUserId(String score, String userId) {
        Question question = new Question();
        question.setScore(score);
        question.setUserId(userId);
        return insert(question);
    }
    public int insertOfScoreAndDemoBody(String score, String demoBody) {
        Question question = new Question();
        question.setScore(score);
        question.setDemoBody(demoBody);
        return insert(question);
    }
    public int insertOfDemoCodeAndRightPeople(String demoCode, String rightPeople) {
        Question question = new Question();
        question.setDemoCode(demoCode);
        question.setRightPeople(rightPeople);
        return insert(question);
    }
    public int insertOfDemoCodeAndMainPeople(String demoCode, String mainPeople) {
        Question question = new Question();
        question.setDemoCode(demoCode);
        question.setMainPeople(mainPeople);
        return insert(question);
    }
    public int insertOfDemoCodeAndStartTime(String demoCode, String startTime) {
        Question question = new Question();
        question.setDemoCode(demoCode);
        question.setStartTime(startTime);
        return insert(question);
    }
    public int insertOfDemoCodeAndEndTime(String demoCode, String endTime) {
        Question question = new Question();
        question.setDemoCode(demoCode);
        question.setEndTime(endTime);
        return insert(question);
    }
    public int insertOfDemoCodeAndInputFormat(String demoCode, String inputFormat) {
        Question question = new Question();
        question.setDemoCode(demoCode);
        question.setInputFormat(inputFormat);
        return insert(question);
    }
    public int insertOfDemoCodeAndOutputFormat(String demoCode, String outputFormat) {
        Question question = new Question();
        question.setDemoCode(demoCode);
        question.setOutputFormat(outputFormat);
        return insert(question);
    }
    public int insertOfDemoCodeAndInputTest(String demoCode, String inputTest) {
        Question question = new Question();
        question.setDemoCode(demoCode);
        question.setInputTest(inputTest);
        return insert(question);
    }
    public int insertOfDemoCodeAndOutputTest(String demoCode, String outputTest) {
        Question question = new Question();
        question.setDemoCode(demoCode);
        question.setOutputTest(outputTest);
        return insert(question);
    }
    public int insertOfDemoCodeAndContestId(String demoCode, String contestId) {
        Question question = new Question();
        question.setDemoCode(demoCode);
        question.setContestId(contestId);
        return insert(question);
    }
    public int insertOfDemoCodeAndUserId(String demoCode, String userId) {
        Question question = new Question();
        question.setDemoCode(demoCode);
        question.setUserId(userId);
        return insert(question);
    }
    public int insertOfDemoCodeAndDemoBody(String demoCode, String demoBody) {
        Question question = new Question();
        question.setDemoCode(demoCode);
        question.setDemoBody(demoBody);
        return insert(question);
    }
    public int insertOfRightPeopleAndMainPeople(String rightPeople, String mainPeople) {
        Question question = new Question();
        question.setRightPeople(rightPeople);
        question.setMainPeople(mainPeople);
        return insert(question);
    }
    public int insertOfRightPeopleAndStartTime(String rightPeople, String startTime) {
        Question question = new Question();
        question.setRightPeople(rightPeople);
        question.setStartTime(startTime);
        return insert(question);
    }
    public int insertOfRightPeopleAndEndTime(String rightPeople, String endTime) {
        Question question = new Question();
        question.setRightPeople(rightPeople);
        question.setEndTime(endTime);
        return insert(question);
    }
    public int insertOfRightPeopleAndInputFormat(String rightPeople, String inputFormat) {
        Question question = new Question();
        question.setRightPeople(rightPeople);
        question.setInputFormat(inputFormat);
        return insert(question);
    }
    public int insertOfRightPeopleAndOutputFormat(String rightPeople, String outputFormat) {
        Question question = new Question();
        question.setRightPeople(rightPeople);
        question.setOutputFormat(outputFormat);
        return insert(question);
    }
    public int insertOfRightPeopleAndInputTest(String rightPeople, String inputTest) {
        Question question = new Question();
        question.setRightPeople(rightPeople);
        question.setInputTest(inputTest);
        return insert(question);
    }
    public int insertOfRightPeopleAndOutputTest(String rightPeople, String outputTest) {
        Question question = new Question();
        question.setRightPeople(rightPeople);
        question.setOutputTest(outputTest);
        return insert(question);
    }
    public int insertOfRightPeopleAndContestId(String rightPeople, String contestId) {
        Question question = new Question();
        question.setRightPeople(rightPeople);
        question.setContestId(contestId);
        return insert(question);
    }
    public int insertOfRightPeopleAndUserId(String rightPeople, String userId) {
        Question question = new Question();
        question.setRightPeople(rightPeople);
        question.setUserId(userId);
        return insert(question);
    }
    public int insertOfRightPeopleAndDemoBody(String rightPeople, String demoBody) {
        Question question = new Question();
        question.setRightPeople(rightPeople);
        question.setDemoBody(demoBody);
        return insert(question);
    }
    public int insertOfMainPeopleAndStartTime(String mainPeople, String startTime) {
        Question question = new Question();
        question.setMainPeople(mainPeople);
        question.setStartTime(startTime);
        return insert(question);
    }
    public int insertOfMainPeopleAndEndTime(String mainPeople, String endTime) {
        Question question = new Question();
        question.setMainPeople(mainPeople);
        question.setEndTime(endTime);
        return insert(question);
    }
    public int insertOfMainPeopleAndInputFormat(String mainPeople, String inputFormat) {
        Question question = new Question();
        question.setMainPeople(mainPeople);
        question.setInputFormat(inputFormat);
        return insert(question);
    }
    public int insertOfMainPeopleAndOutputFormat(String mainPeople, String outputFormat) {
        Question question = new Question();
        question.setMainPeople(mainPeople);
        question.setOutputFormat(outputFormat);
        return insert(question);
    }
    public int insertOfMainPeopleAndInputTest(String mainPeople, String inputTest) {
        Question question = new Question();
        question.setMainPeople(mainPeople);
        question.setInputTest(inputTest);
        return insert(question);
    }
    public int insertOfMainPeopleAndOutputTest(String mainPeople, String outputTest) {
        Question question = new Question();
        question.setMainPeople(mainPeople);
        question.setOutputTest(outputTest);
        return insert(question);
    }
    public int insertOfMainPeopleAndContestId(String mainPeople, String contestId) {
        Question question = new Question();
        question.setMainPeople(mainPeople);
        question.setContestId(contestId);
        return insert(question);
    }
    public int insertOfMainPeopleAndUserId(String mainPeople, String userId) {
        Question question = new Question();
        question.setMainPeople(mainPeople);
        question.setUserId(userId);
        return insert(question);
    }
    public int insertOfMainPeopleAndDemoBody(String mainPeople, String demoBody) {
        Question question = new Question();
        question.setMainPeople(mainPeople);
        question.setDemoBody(demoBody);
        return insert(question);
    }
    public int insertOfStartTimeAndEndTime(String startTime, String endTime) {
        Question question = new Question();
        question.setStartTime(startTime);
        question.setEndTime(endTime);
        return insert(question);
    }
    public int insertOfStartTimeAndInputFormat(String startTime, String inputFormat) {
        Question question = new Question();
        question.setStartTime(startTime);
        question.setInputFormat(inputFormat);
        return insert(question);
    }
    public int insertOfStartTimeAndOutputFormat(String startTime, String outputFormat) {
        Question question = new Question();
        question.setStartTime(startTime);
        question.setOutputFormat(outputFormat);
        return insert(question);
    }
    public int insertOfStartTimeAndInputTest(String startTime, String inputTest) {
        Question question = new Question();
        question.setStartTime(startTime);
        question.setInputTest(inputTest);
        return insert(question);
    }
    public int insertOfStartTimeAndOutputTest(String startTime, String outputTest) {
        Question question = new Question();
        question.setStartTime(startTime);
        question.setOutputTest(outputTest);
        return insert(question);
    }
    public int insertOfStartTimeAndContestId(String startTime, String contestId) {
        Question question = new Question();
        question.setStartTime(startTime);
        question.setContestId(contestId);
        return insert(question);
    }
    public int insertOfStartTimeAndUserId(String startTime, String userId) {
        Question question = new Question();
        question.setStartTime(startTime);
        question.setUserId(userId);
        return insert(question);
    }
    public int insertOfStartTimeAndDemoBody(String startTime, String demoBody) {
        Question question = new Question();
        question.setStartTime(startTime);
        question.setDemoBody(demoBody);
        return insert(question);
    }
    public int insertOfEndTimeAndInputFormat(String endTime, String inputFormat) {
        Question question = new Question();
        question.setEndTime(endTime);
        question.setInputFormat(inputFormat);
        return insert(question);
    }
    public int insertOfEndTimeAndOutputFormat(String endTime, String outputFormat) {
        Question question = new Question();
        question.setEndTime(endTime);
        question.setOutputFormat(outputFormat);
        return insert(question);
    }
    public int insertOfEndTimeAndInputTest(String endTime, String inputTest) {
        Question question = new Question();
        question.setEndTime(endTime);
        question.setInputTest(inputTest);
        return insert(question);
    }
    public int insertOfEndTimeAndOutputTest(String endTime, String outputTest) {
        Question question = new Question();
        question.setEndTime(endTime);
        question.setOutputTest(outputTest);
        return insert(question);
    }
    public int insertOfEndTimeAndContestId(String endTime, String contestId) {
        Question question = new Question();
        question.setEndTime(endTime);
        question.setContestId(contestId);
        return insert(question);
    }
    public int insertOfEndTimeAndUserId(String endTime, String userId) {
        Question question = new Question();
        question.setEndTime(endTime);
        question.setUserId(userId);
        return insert(question);
    }
    public int insertOfEndTimeAndDemoBody(String endTime, String demoBody) {
        Question question = new Question();
        question.setEndTime(endTime);
        question.setDemoBody(demoBody);
        return insert(question);
    }
    public int insertOfInputFormatAndOutputFormat(String inputFormat, String outputFormat) {
        Question question = new Question();
        question.setInputFormat(inputFormat);
        question.setOutputFormat(outputFormat);
        return insert(question);
    }
    public int insertOfInputFormatAndInputTest(String inputFormat, String inputTest) {
        Question question = new Question();
        question.setInputFormat(inputFormat);
        question.setInputTest(inputTest);
        return insert(question);
    }
    public int insertOfInputFormatAndOutputTest(String inputFormat, String outputTest) {
        Question question = new Question();
        question.setInputFormat(inputFormat);
        question.setOutputTest(outputTest);
        return insert(question);
    }
    public int insertOfInputFormatAndContestId(String inputFormat, String contestId) {
        Question question = new Question();
        question.setInputFormat(inputFormat);
        question.setContestId(contestId);
        return insert(question);
    }
    public int insertOfInputFormatAndUserId(String inputFormat, String userId) {
        Question question = new Question();
        question.setInputFormat(inputFormat);
        question.setUserId(userId);
        return insert(question);
    }
    public int insertOfInputFormatAndDemoBody(String inputFormat, String demoBody) {
        Question question = new Question();
        question.setInputFormat(inputFormat);
        question.setDemoBody(demoBody);
        return insert(question);
    }
    public int insertOfOutputFormatAndInputTest(String outputFormat, String inputTest) {
        Question question = new Question();
        question.setOutputFormat(outputFormat);
        question.setInputTest(inputTest);
        return insert(question);
    }
    public int insertOfOutputFormatAndOutputTest(String outputFormat, String outputTest) {
        Question question = new Question();
        question.setOutputFormat(outputFormat);
        question.setOutputTest(outputTest);
        return insert(question);
    }
    public int insertOfOutputFormatAndContestId(String outputFormat, String contestId) {
        Question question = new Question();
        question.setOutputFormat(outputFormat);
        question.setContestId(contestId);
        return insert(question);
    }
    public int insertOfOutputFormatAndUserId(String outputFormat, String userId) {
        Question question = new Question();
        question.setOutputFormat(outputFormat);
        question.setUserId(userId);
        return insert(question);
    }
    public int insertOfOutputFormatAndDemoBody(String outputFormat, String demoBody) {
        Question question = new Question();
        question.setOutputFormat(outputFormat);
        question.setDemoBody(demoBody);
        return insert(question);
    }
    public int insertOfInputTestAndOutputTest(String inputTest, String outputTest) {
        Question question = new Question();
        question.setInputTest(inputTest);
        question.setOutputTest(outputTest);
        return insert(question);
    }
    public int insertOfInputTestAndContestId(String inputTest, String contestId) {
        Question question = new Question();
        question.setInputTest(inputTest);
        question.setContestId(contestId);
        return insert(question);
    }
    public int insertOfInputTestAndUserId(String inputTest, String userId) {
        Question question = new Question();
        question.setInputTest(inputTest);
        question.setUserId(userId);
        return insert(question);
    }
    public int insertOfInputTestAndDemoBody(String inputTest, String demoBody) {
        Question question = new Question();
        question.setInputTest(inputTest);
        question.setDemoBody(demoBody);
        return insert(question);
    }
    public int insertOfOutputTestAndContestId(String outputTest, String contestId) {
        Question question = new Question();
        question.setOutputTest(outputTest);
        question.setContestId(contestId);
        return insert(question);
    }
    public int insertOfOutputTestAndUserId(String outputTest, String userId) {
        Question question = new Question();
        question.setOutputTest(outputTest);
        question.setUserId(userId);
        return insert(question);
    }
    public int insertOfOutputTestAndDemoBody(String outputTest, String demoBody) {
        Question question = new Question();
        question.setOutputTest(outputTest);
        question.setDemoBody(demoBody);
        return insert(question);
    }
    public int insertOfContestIdAndUserId(String contestId, String userId) {
        Question question = new Question();
        question.setContestId(contestId);
        question.setUserId(userId);
        return insert(question);
    }
    public int insertOfContestIdAndDemoBody(String contestId, String demoBody) {
        Question question = new Question();
        question.setContestId(contestId);
        question.setDemoBody(demoBody);
        return insert(question);
    }
    public int insertOfUserIdAndDemoBody(String userId, String demoBody) {
        Question question = new Question();
        question.setUserId(userId);
        question.setDemoBody(demoBody);
        return insert(question);
    }
    public Question getQuestion(Question question) {
        return DBMan.getInstance().queryByIdNoSqlWithoutThrow(question, "question");
    }
    public Question getQuestionOfQuestionId(String questionId) {
        Question question = new Question();
        question.setQuestionId(questionId);
        return getQuestion(question);
    }
    public Question getQuestionOfTitle(String title) {
        Question question = new Question();
        question.setTitle(title);
        return getQuestion(question);
    }
    public Question getQuestionOfBody(String body) {
        Question question = new Question();
        question.setBody(body);
        return getQuestion(question);
    }
    public Question getQuestionOfScore(String score) {
        Question question = new Question();
        question.setScore(score);
        return getQuestion(question);
    }
    public Question getQuestionOfDemoCode(String demoCode) {
        Question question = new Question();
        question.setDemoCode(demoCode);
        return getQuestion(question);
    }
    public Question getQuestionOfRightPeople(String rightPeople) {
        Question question = new Question();
        question.setRightPeople(rightPeople);
        return getQuestion(question);
    }
    public Question getQuestionOfMainPeople(String mainPeople) {
        Question question = new Question();
        question.setMainPeople(mainPeople);
        return getQuestion(question);
    }
    public Question getQuestionOfStartTime(String startTime) {
        Question question = new Question();
        question.setStartTime(startTime);
        return getQuestion(question);
    }
    public Question getQuestionOfEndTime(String endTime) {
        Question question = new Question();
        question.setEndTime(endTime);
        return getQuestion(question);
    }
    public Question getQuestionOfInputFormat(String inputFormat) {
        Question question = new Question();
        question.setInputFormat(inputFormat);
        return getQuestion(question);
    }
    public Question getQuestionOfOutputFormat(String outputFormat) {
        Question question = new Question();
        question.setOutputFormat(outputFormat);
        return getQuestion(question);
    }
    public Question getQuestionOfInputTest(String inputTest) {
        Question question = new Question();
        question.setInputTest(inputTest);
        return getQuestion(question);
    }
    public Question getQuestionOfOutputTest(String outputTest) {
        Question question = new Question();
        question.setOutputTest(outputTest);
        return getQuestion(question);
    }
    public Question getQuestionOfContestId(String contestId) {
        Question question = new Question();
        question.setContestId(contestId);
        return getQuestion(question);
    }
    public Question getQuestionOfUserId(String userId) {
        Question question = new Question();
        question.setUserId(userId);
        return getQuestion(question);
    }
    public Question getQuestionOfDemoBody(String demoBody) {
        Question question = new Question();
        question.setDemoBody(demoBody);
        return getQuestion(question);
    }
    public Question getQuestionOfQuestionIdAndTitle(String questionId, String title) {
        Question question = new Question();
        question.setQuestionId(questionId);
        question.setTitle(title);
        return getQuestion(question);
    }
    public Question getQuestionOfQuestionIdAndBody(String questionId, String body) {
        Question question = new Question();
        question.setQuestionId(questionId);
        question.setBody(body);
        return getQuestion(question);
    }
    public Question getQuestionOfQuestionIdAndScore(String questionId, String score) {
        Question question = new Question();
        question.setQuestionId(questionId);
        question.setScore(score);
        return getQuestion(question);
    }
    public Question getQuestionOfQuestionIdAndDemoCode(String questionId, String demoCode) {
        Question question = new Question();
        question.setQuestionId(questionId);
        question.setDemoCode(demoCode);
        return getQuestion(question);
    }
    public Question getQuestionOfQuestionIdAndRightPeople(String questionId, String rightPeople) {
        Question question = new Question();
        question.setQuestionId(questionId);
        question.setRightPeople(rightPeople);
        return getQuestion(question);
    }
    public Question getQuestionOfQuestionIdAndMainPeople(String questionId, String mainPeople) {
        Question question = new Question();
        question.setQuestionId(questionId);
        question.setMainPeople(mainPeople);
        return getQuestion(question);
    }
    public Question getQuestionOfQuestionIdAndStartTime(String questionId, String startTime) {
        Question question = new Question();
        question.setQuestionId(questionId);
        question.setStartTime(startTime);
        return getQuestion(question);
    }
    public Question getQuestionOfQuestionIdAndEndTime(String questionId, String endTime) {
        Question question = new Question();
        question.setQuestionId(questionId);
        question.setEndTime(endTime);
        return getQuestion(question);
    }
    public Question getQuestionOfQuestionIdAndInputFormat(String questionId, String inputFormat) {
        Question question = new Question();
        question.setQuestionId(questionId);
        question.setInputFormat(inputFormat);
        return getQuestion(question);
    }
    public Question getQuestionOfQuestionIdAndOutputFormat(String questionId, String outputFormat) {
        Question question = new Question();
        question.setQuestionId(questionId);
        question.setOutputFormat(outputFormat);
        return getQuestion(question);
    }
    public Question getQuestionOfQuestionIdAndInputTest(String questionId, String inputTest) {
        Question question = new Question();
        question.setQuestionId(questionId);
        question.setInputTest(inputTest);
        return getQuestion(question);
    }
    public Question getQuestionOfQuestionIdAndOutputTest(String questionId, String outputTest) {
        Question question = new Question();
        question.setQuestionId(questionId);
        question.setOutputTest(outputTest);
        return getQuestion(question);
    }
    public Question getQuestionOfQuestionIdAndContestId(String questionId, String contestId) {
        Question question = new Question();
        question.setQuestionId(questionId);
        question.setContestId(contestId);
        return getQuestion(question);
    }
    public Question getQuestionOfQuestionIdAndUserId(String questionId, String userId) {
        Question question = new Question();
        question.setQuestionId(questionId);
        question.setUserId(userId);
        return getQuestion(question);
    }
    public Question getQuestionOfQuestionIdAndDemoBody(String questionId, String demoBody) {
        Question question = new Question();
        question.setQuestionId(questionId);
        question.setDemoBody(demoBody);
        return getQuestion(question);
    }
    public Question getQuestionOfTitleAndBody(String title, String body) {
        Question question = new Question();
        question.setTitle(title);
        question.setBody(body);
        return getQuestion(question);
    }
    public Question getQuestionOfTitleAndScore(String title, String score) {
        Question question = new Question();
        question.setTitle(title);
        question.setScore(score);
        return getQuestion(question);
    }
    public Question getQuestionOfTitleAndDemoCode(String title, String demoCode) {
        Question question = new Question();
        question.setTitle(title);
        question.setDemoCode(demoCode);
        return getQuestion(question);
    }
    public Question getQuestionOfTitleAndRightPeople(String title, String rightPeople) {
        Question question = new Question();
        question.setTitle(title);
        question.setRightPeople(rightPeople);
        return getQuestion(question);
    }
    public Question getQuestionOfTitleAndMainPeople(String title, String mainPeople) {
        Question question = new Question();
        question.setTitle(title);
        question.setMainPeople(mainPeople);
        return getQuestion(question);
    }
    public Question getQuestionOfTitleAndStartTime(String title, String startTime) {
        Question question = new Question();
        question.setTitle(title);
        question.setStartTime(startTime);
        return getQuestion(question);
    }
    public Question getQuestionOfTitleAndEndTime(String title, String endTime) {
        Question question = new Question();
        question.setTitle(title);
        question.setEndTime(endTime);
        return getQuestion(question);
    }
    public Question getQuestionOfTitleAndInputFormat(String title, String inputFormat) {
        Question question = new Question();
        question.setTitle(title);
        question.setInputFormat(inputFormat);
        return getQuestion(question);
    }
    public Question getQuestionOfTitleAndOutputFormat(String title, String outputFormat) {
        Question question = new Question();
        question.setTitle(title);
        question.setOutputFormat(outputFormat);
        return getQuestion(question);
    }
    public Question getQuestionOfTitleAndInputTest(String title, String inputTest) {
        Question question = new Question();
        question.setTitle(title);
        question.setInputTest(inputTest);
        return getQuestion(question);
    }
    public Question getQuestionOfTitleAndOutputTest(String title, String outputTest) {
        Question question = new Question();
        question.setTitle(title);
        question.setOutputTest(outputTest);
        return getQuestion(question);
    }
    public Question getQuestionOfTitleAndContestId(String title, String contestId) {
        Question question = new Question();
        question.setTitle(title);
        question.setContestId(contestId);
        return getQuestion(question);
    }
    public Question getQuestionOfTitleAndUserId(String title, String userId) {
        Question question = new Question();
        question.setTitle(title);
        question.setUserId(userId);
        return getQuestion(question);
    }
    public Question getQuestionOfTitleAndDemoBody(String title, String demoBody) {
        Question question = new Question();
        question.setTitle(title);
        question.setDemoBody(demoBody);
        return getQuestion(question);
    }
    public Question getQuestionOfBodyAndScore(String body, String score) {
        Question question = new Question();
        question.setBody(body);
        question.setScore(score);
        return getQuestion(question);
    }
    public Question getQuestionOfBodyAndDemoCode(String body, String demoCode) {
        Question question = new Question();
        question.setBody(body);
        question.setDemoCode(demoCode);
        return getQuestion(question);
    }
    public Question getQuestionOfBodyAndRightPeople(String body, String rightPeople) {
        Question question = new Question();
        question.setBody(body);
        question.setRightPeople(rightPeople);
        return getQuestion(question);
    }
    public Question getQuestionOfBodyAndMainPeople(String body, String mainPeople) {
        Question question = new Question();
        question.setBody(body);
        question.setMainPeople(mainPeople);
        return getQuestion(question);
    }
    public Question getQuestionOfBodyAndStartTime(String body, String startTime) {
        Question question = new Question();
        question.setBody(body);
        question.setStartTime(startTime);
        return getQuestion(question);
    }
    public Question getQuestionOfBodyAndEndTime(String body, String endTime) {
        Question question = new Question();
        question.setBody(body);
        question.setEndTime(endTime);
        return getQuestion(question);
    }
    public Question getQuestionOfBodyAndInputFormat(String body, String inputFormat) {
        Question question = new Question();
        question.setBody(body);
        question.setInputFormat(inputFormat);
        return getQuestion(question);
    }
    public Question getQuestionOfBodyAndOutputFormat(String body, String outputFormat) {
        Question question = new Question();
        question.setBody(body);
        question.setOutputFormat(outputFormat);
        return getQuestion(question);
    }
    public Question getQuestionOfBodyAndInputTest(String body, String inputTest) {
        Question question = new Question();
        question.setBody(body);
        question.setInputTest(inputTest);
        return getQuestion(question);
    }
    public Question getQuestionOfBodyAndOutputTest(String body, String outputTest) {
        Question question = new Question();
        question.setBody(body);
        question.setOutputTest(outputTest);
        return getQuestion(question);
    }
    public Question getQuestionOfBodyAndContestId(String body, String contestId) {
        Question question = new Question();
        question.setBody(body);
        question.setContestId(contestId);
        return getQuestion(question);
    }
    public Question getQuestionOfBodyAndUserId(String body, String userId) {
        Question question = new Question();
        question.setBody(body);
        question.setUserId(userId);
        return getQuestion(question);
    }
    public Question getQuestionOfBodyAndDemoBody(String body, String demoBody) {
        Question question = new Question();
        question.setBody(body);
        question.setDemoBody(demoBody);
        return getQuestion(question);
    }
    public Question getQuestionOfScoreAndDemoCode(String score, String demoCode) {
        Question question = new Question();
        question.setScore(score);
        question.setDemoCode(demoCode);
        return getQuestion(question);
    }
    public Question getQuestionOfScoreAndRightPeople(String score, String rightPeople) {
        Question question = new Question();
        question.setScore(score);
        question.setRightPeople(rightPeople);
        return getQuestion(question);
    }
    public Question getQuestionOfScoreAndMainPeople(String score, String mainPeople) {
        Question question = new Question();
        question.setScore(score);
        question.setMainPeople(mainPeople);
        return getQuestion(question);
    }
    public Question getQuestionOfScoreAndStartTime(String score, String startTime) {
        Question question = new Question();
        question.setScore(score);
        question.setStartTime(startTime);
        return getQuestion(question);
    }
    public Question getQuestionOfScoreAndEndTime(String score, String endTime) {
        Question question = new Question();
        question.setScore(score);
        question.setEndTime(endTime);
        return getQuestion(question);
    }
    public Question getQuestionOfScoreAndInputFormat(String score, String inputFormat) {
        Question question = new Question();
        question.setScore(score);
        question.setInputFormat(inputFormat);
        return getQuestion(question);
    }
    public Question getQuestionOfScoreAndOutputFormat(String score, String outputFormat) {
        Question question = new Question();
        question.setScore(score);
        question.setOutputFormat(outputFormat);
        return getQuestion(question);
    }
    public Question getQuestionOfScoreAndInputTest(String score, String inputTest) {
        Question question = new Question();
        question.setScore(score);
        question.setInputTest(inputTest);
        return getQuestion(question);
    }
    public Question getQuestionOfScoreAndOutputTest(String score, String outputTest) {
        Question question = new Question();
        question.setScore(score);
        question.setOutputTest(outputTest);
        return getQuestion(question);
    }
    public Question getQuestionOfScoreAndContestId(String score, String contestId) {
        Question question = new Question();
        question.setScore(score);
        question.setContestId(contestId);
        return getQuestion(question);
    }
    public Question getQuestionOfScoreAndUserId(String score, String userId) {
        Question question = new Question();
        question.setScore(score);
        question.setUserId(userId);
        return getQuestion(question);
    }
    public Question getQuestionOfScoreAndDemoBody(String score, String demoBody) {
        Question question = new Question();
        question.setScore(score);
        question.setDemoBody(demoBody);
        return getQuestion(question);
    }
    public Question getQuestionOfDemoCodeAndRightPeople(String demoCode, String rightPeople) {
        Question question = new Question();
        question.setDemoCode(demoCode);
        question.setRightPeople(rightPeople);
        return getQuestion(question);
    }
    public Question getQuestionOfDemoCodeAndMainPeople(String demoCode, String mainPeople) {
        Question question = new Question();
        question.setDemoCode(demoCode);
        question.setMainPeople(mainPeople);
        return getQuestion(question);
    }
    public Question getQuestionOfDemoCodeAndStartTime(String demoCode, String startTime) {
        Question question = new Question();
        question.setDemoCode(demoCode);
        question.setStartTime(startTime);
        return getQuestion(question);
    }
    public Question getQuestionOfDemoCodeAndEndTime(String demoCode, String endTime) {
        Question question = new Question();
        question.setDemoCode(demoCode);
        question.setEndTime(endTime);
        return getQuestion(question);
    }
    public Question getQuestionOfDemoCodeAndInputFormat(String demoCode, String inputFormat) {
        Question question = new Question();
        question.setDemoCode(demoCode);
        question.setInputFormat(inputFormat);
        return getQuestion(question);
    }
    public Question getQuestionOfDemoCodeAndOutputFormat(String demoCode, String outputFormat) {
        Question question = new Question();
        question.setDemoCode(demoCode);
        question.setOutputFormat(outputFormat);
        return getQuestion(question);
    }
    public Question getQuestionOfDemoCodeAndInputTest(String demoCode, String inputTest) {
        Question question = new Question();
        question.setDemoCode(demoCode);
        question.setInputTest(inputTest);
        return getQuestion(question);
    }
    public Question getQuestionOfDemoCodeAndOutputTest(String demoCode, String outputTest) {
        Question question = new Question();
        question.setDemoCode(demoCode);
        question.setOutputTest(outputTest);
        return getQuestion(question);
    }
    public Question getQuestionOfDemoCodeAndContestId(String demoCode, String contestId) {
        Question question = new Question();
        question.setDemoCode(demoCode);
        question.setContestId(contestId);
        return getQuestion(question);
    }
    public Question getQuestionOfDemoCodeAndUserId(String demoCode, String userId) {
        Question question = new Question();
        question.setDemoCode(demoCode);
        question.setUserId(userId);
        return getQuestion(question);
    }
    public Question getQuestionOfDemoCodeAndDemoBody(String demoCode, String demoBody) {
        Question question = new Question();
        question.setDemoCode(demoCode);
        question.setDemoBody(demoBody);
        return getQuestion(question);
    }
    public Question getQuestionOfRightPeopleAndMainPeople(String rightPeople, String mainPeople) {
        Question question = new Question();
        question.setRightPeople(rightPeople);
        question.setMainPeople(mainPeople);
        return getQuestion(question);
    }
    public Question getQuestionOfRightPeopleAndStartTime(String rightPeople, String startTime) {
        Question question = new Question();
        question.setRightPeople(rightPeople);
        question.setStartTime(startTime);
        return getQuestion(question);
    }
    public Question getQuestionOfRightPeopleAndEndTime(String rightPeople, String endTime) {
        Question question = new Question();
        question.setRightPeople(rightPeople);
        question.setEndTime(endTime);
        return getQuestion(question);
    }
    public Question getQuestionOfRightPeopleAndInputFormat(String rightPeople, String inputFormat) {
        Question question = new Question();
        question.setRightPeople(rightPeople);
        question.setInputFormat(inputFormat);
        return getQuestion(question);
    }
    public Question getQuestionOfRightPeopleAndOutputFormat(String rightPeople, String outputFormat) {
        Question question = new Question();
        question.setRightPeople(rightPeople);
        question.setOutputFormat(outputFormat);
        return getQuestion(question);
    }
    public Question getQuestionOfRightPeopleAndInputTest(String rightPeople, String inputTest) {
        Question question = new Question();
        question.setRightPeople(rightPeople);
        question.setInputTest(inputTest);
        return getQuestion(question);
    }
    public Question getQuestionOfRightPeopleAndOutputTest(String rightPeople, String outputTest) {
        Question question = new Question();
        question.setRightPeople(rightPeople);
        question.setOutputTest(outputTest);
        return getQuestion(question);
    }
    public Question getQuestionOfRightPeopleAndContestId(String rightPeople, String contestId) {
        Question question = new Question();
        question.setRightPeople(rightPeople);
        question.setContestId(contestId);
        return getQuestion(question);
    }
    public Question getQuestionOfRightPeopleAndUserId(String rightPeople, String userId) {
        Question question = new Question();
        question.setRightPeople(rightPeople);
        question.setUserId(userId);
        return getQuestion(question);
    }
    public Question getQuestionOfRightPeopleAndDemoBody(String rightPeople, String demoBody) {
        Question question = new Question();
        question.setRightPeople(rightPeople);
        question.setDemoBody(demoBody);
        return getQuestion(question);
    }
    public Question getQuestionOfMainPeopleAndStartTime(String mainPeople, String startTime) {
        Question question = new Question();
        question.setMainPeople(mainPeople);
        question.setStartTime(startTime);
        return getQuestion(question);
    }
    public Question getQuestionOfMainPeopleAndEndTime(String mainPeople, String endTime) {
        Question question = new Question();
        question.setMainPeople(mainPeople);
        question.setEndTime(endTime);
        return getQuestion(question);
    }
    public Question getQuestionOfMainPeopleAndInputFormat(String mainPeople, String inputFormat) {
        Question question = new Question();
        question.setMainPeople(mainPeople);
        question.setInputFormat(inputFormat);
        return getQuestion(question);
    }
    public Question getQuestionOfMainPeopleAndOutputFormat(String mainPeople, String outputFormat) {
        Question question = new Question();
        question.setMainPeople(mainPeople);
        question.setOutputFormat(outputFormat);
        return getQuestion(question);
    }
    public Question getQuestionOfMainPeopleAndInputTest(String mainPeople, String inputTest) {
        Question question = new Question();
        question.setMainPeople(mainPeople);
        question.setInputTest(inputTest);
        return getQuestion(question);
    }
    public Question getQuestionOfMainPeopleAndOutputTest(String mainPeople, String outputTest) {
        Question question = new Question();
        question.setMainPeople(mainPeople);
        question.setOutputTest(outputTest);
        return getQuestion(question);
    }
    public Question getQuestionOfMainPeopleAndContestId(String mainPeople, String contestId) {
        Question question = new Question();
        question.setMainPeople(mainPeople);
        question.setContestId(contestId);
        return getQuestion(question);
    }
    public Question getQuestionOfMainPeopleAndUserId(String mainPeople, String userId) {
        Question question = new Question();
        question.setMainPeople(mainPeople);
        question.setUserId(userId);
        return getQuestion(question);
    }
    public Question getQuestionOfMainPeopleAndDemoBody(String mainPeople, String demoBody) {
        Question question = new Question();
        question.setMainPeople(mainPeople);
        question.setDemoBody(demoBody);
        return getQuestion(question);
    }
    public Question getQuestionOfStartTimeAndEndTime(String startTime, String endTime) {
        Question question = new Question();
        question.setStartTime(startTime);
        question.setEndTime(endTime);
        return getQuestion(question);
    }
    public Question getQuestionOfStartTimeAndInputFormat(String startTime, String inputFormat) {
        Question question = new Question();
        question.setStartTime(startTime);
        question.setInputFormat(inputFormat);
        return getQuestion(question);
    }
    public Question getQuestionOfStartTimeAndOutputFormat(String startTime, String outputFormat) {
        Question question = new Question();
        question.setStartTime(startTime);
        question.setOutputFormat(outputFormat);
        return getQuestion(question);
    }
    public Question getQuestionOfStartTimeAndInputTest(String startTime, String inputTest) {
        Question question = new Question();
        question.setStartTime(startTime);
        question.setInputTest(inputTest);
        return getQuestion(question);
    }
    public Question getQuestionOfStartTimeAndOutputTest(String startTime, String outputTest) {
        Question question = new Question();
        question.setStartTime(startTime);
        question.setOutputTest(outputTest);
        return getQuestion(question);
    }
    public Question getQuestionOfStartTimeAndContestId(String startTime, String contestId) {
        Question question = new Question();
        question.setStartTime(startTime);
        question.setContestId(contestId);
        return getQuestion(question);
    }
    public Question getQuestionOfStartTimeAndUserId(String startTime, String userId) {
        Question question = new Question();
        question.setStartTime(startTime);
        question.setUserId(userId);
        return getQuestion(question);
    }
    public Question getQuestionOfStartTimeAndDemoBody(String startTime, String demoBody) {
        Question question = new Question();
        question.setStartTime(startTime);
        question.setDemoBody(demoBody);
        return getQuestion(question);
    }
    public Question getQuestionOfEndTimeAndInputFormat(String endTime, String inputFormat) {
        Question question = new Question();
        question.setEndTime(endTime);
        question.setInputFormat(inputFormat);
        return getQuestion(question);
    }
    public Question getQuestionOfEndTimeAndOutputFormat(String endTime, String outputFormat) {
        Question question = new Question();
        question.setEndTime(endTime);
        question.setOutputFormat(outputFormat);
        return getQuestion(question);
    }
    public Question getQuestionOfEndTimeAndInputTest(String endTime, String inputTest) {
        Question question = new Question();
        question.setEndTime(endTime);
        question.setInputTest(inputTest);
        return getQuestion(question);
    }
    public Question getQuestionOfEndTimeAndOutputTest(String endTime, String outputTest) {
        Question question = new Question();
        question.setEndTime(endTime);
        question.setOutputTest(outputTest);
        return getQuestion(question);
    }
    public Question getQuestionOfEndTimeAndContestId(String endTime, String contestId) {
        Question question = new Question();
        question.setEndTime(endTime);
        question.setContestId(contestId);
        return getQuestion(question);
    }
    public Question getQuestionOfEndTimeAndUserId(String endTime, String userId) {
        Question question = new Question();
        question.setEndTime(endTime);
        question.setUserId(userId);
        return getQuestion(question);
    }
    public Question getQuestionOfEndTimeAndDemoBody(String endTime, String demoBody) {
        Question question = new Question();
        question.setEndTime(endTime);
        question.setDemoBody(demoBody);
        return getQuestion(question);
    }
    public Question getQuestionOfInputFormatAndOutputFormat(String inputFormat, String outputFormat) {
        Question question = new Question();
        question.setInputFormat(inputFormat);
        question.setOutputFormat(outputFormat);
        return getQuestion(question);
    }
    public Question getQuestionOfInputFormatAndInputTest(String inputFormat, String inputTest) {
        Question question = new Question();
        question.setInputFormat(inputFormat);
        question.setInputTest(inputTest);
        return getQuestion(question);
    }
    public Question getQuestionOfInputFormatAndOutputTest(String inputFormat, String outputTest) {
        Question question = new Question();
        question.setInputFormat(inputFormat);
        question.setOutputTest(outputTest);
        return getQuestion(question);
    }
    public Question getQuestionOfInputFormatAndContestId(String inputFormat, String contestId) {
        Question question = new Question();
        question.setInputFormat(inputFormat);
        question.setContestId(contestId);
        return getQuestion(question);
    }
    public Question getQuestionOfInputFormatAndUserId(String inputFormat, String userId) {
        Question question = new Question();
        question.setInputFormat(inputFormat);
        question.setUserId(userId);
        return getQuestion(question);
    }
    public Question getQuestionOfInputFormatAndDemoBody(String inputFormat, String demoBody) {
        Question question = new Question();
        question.setInputFormat(inputFormat);
        question.setDemoBody(demoBody);
        return getQuestion(question);
    }
    public Question getQuestionOfOutputFormatAndInputTest(String outputFormat, String inputTest) {
        Question question = new Question();
        question.setOutputFormat(outputFormat);
        question.setInputTest(inputTest);
        return getQuestion(question);
    }
    public Question getQuestionOfOutputFormatAndOutputTest(String outputFormat, String outputTest) {
        Question question = new Question();
        question.setOutputFormat(outputFormat);
        question.setOutputTest(outputTest);
        return getQuestion(question);
    }
    public Question getQuestionOfOutputFormatAndContestId(String outputFormat, String contestId) {
        Question question = new Question();
        question.setOutputFormat(outputFormat);
        question.setContestId(contestId);
        return getQuestion(question);
    }
    public Question getQuestionOfOutputFormatAndUserId(String outputFormat, String userId) {
        Question question = new Question();
        question.setOutputFormat(outputFormat);
        question.setUserId(userId);
        return getQuestion(question);
    }
    public Question getQuestionOfOutputFormatAndDemoBody(String outputFormat, String demoBody) {
        Question question = new Question();
        question.setOutputFormat(outputFormat);
        question.setDemoBody(demoBody);
        return getQuestion(question);
    }
    public Question getQuestionOfInputTestAndOutputTest(String inputTest, String outputTest) {
        Question question = new Question();
        question.setInputTest(inputTest);
        question.setOutputTest(outputTest);
        return getQuestion(question);
    }
    public Question getQuestionOfInputTestAndContestId(String inputTest, String contestId) {
        Question question = new Question();
        question.setInputTest(inputTest);
        question.setContestId(contestId);
        return getQuestion(question);
    }
    public Question getQuestionOfInputTestAndUserId(String inputTest, String userId) {
        Question question = new Question();
        question.setInputTest(inputTest);
        question.setUserId(userId);
        return getQuestion(question);
    }
    public Question getQuestionOfInputTestAndDemoBody(String inputTest, String demoBody) {
        Question question = new Question();
        question.setInputTest(inputTest);
        question.setDemoBody(demoBody);
        return getQuestion(question);
    }
    public Question getQuestionOfOutputTestAndContestId(String outputTest, String contestId) {
        Question question = new Question();
        question.setOutputTest(outputTest);
        question.setContestId(contestId);
        return getQuestion(question);
    }
    public Question getQuestionOfOutputTestAndUserId(String outputTest, String userId) {
        Question question = new Question();
        question.setOutputTest(outputTest);
        question.setUserId(userId);
        return getQuestion(question);
    }
    public Question getQuestionOfOutputTestAndDemoBody(String outputTest, String demoBody) {
        Question question = new Question();
        question.setOutputTest(outputTest);
        question.setDemoBody(demoBody);
        return getQuestion(question);
    }
    public Question getQuestionOfContestIdAndUserId(String contestId, String userId) {
        Question question = new Question();
        question.setContestId(contestId);
        question.setUserId(userId);
        return getQuestion(question);
    }
    public Question getQuestionOfContestIdAndDemoBody(String contestId, String demoBody) {
        Question question = new Question();
        question.setContestId(contestId);
        question.setDemoBody(demoBody);
        return getQuestion(question);
    }
    public Question getQuestionOfUserIdAndDemoBody(String userId, String demoBody) {
        Question question = new Question();
        question.setUserId(userId);
        question.setDemoBody(demoBody);
        return getQuestion(question);
    }
    public List<Question> getQuestions(Question question) {
        return DBMan.getInstance().queryNoSqlWithoutThrow(question, "question");
    }
    public List<Question> getQuestionsOfQuestionId(String questionId) {
        Question question = new Question();
        question.setQuestionId(questionId);
        return getQuestions(question);
    }
    public List<Question> getQuestionsOfTitle(String title) {
        Question question = new Question();
        question.setTitle(title);
        return getQuestions(question);
    }
    public List<Question> getQuestionsOfBody(String body) {
        Question question = new Question();
        question.setBody(body);
        return getQuestions(question);
    }
    public List<Question> getQuestionsOfScore(String score) {
        Question question = new Question();
        question.setScore(score);
        return getQuestions(question);
    }
    public List<Question> getQuestionsOfDemoCode(String demoCode) {
        Question question = new Question();
        question.setDemoCode(demoCode);
        return getQuestions(question);
    }
    public List<Question> getQuestionsOfRightPeople(String rightPeople) {
        Question question = new Question();
        question.setRightPeople(rightPeople);
        return getQuestions(question);
    }
    public List<Question> getQuestionsOfMainPeople(String mainPeople) {
        Question question = new Question();
        question.setMainPeople(mainPeople);
        return getQuestions(question);
    }
    public List<Question> getQuestionsOfStartTime(String startTime) {
        Question question = new Question();
        question.setStartTime(startTime);
        return getQuestions(question);
    }
    public List<Question> getQuestionsOfEndTime(String endTime) {
        Question question = new Question();
        question.setEndTime(endTime);
        return getQuestions(question);
    }
    public List<Question> getQuestionsOfInputFormat(String inputFormat) {
        Question question = new Question();
        question.setInputFormat(inputFormat);
        return getQuestions(question);
    }
    public List<Question> getQuestionsOfOutputFormat(String outputFormat) {
        Question question = new Question();
        question.setOutputFormat(outputFormat);
        return getQuestions(question);
    }
    public List<Question> getQuestionsOfInputTest(String inputTest) {
        Question question = new Question();
        question.setInputTest(inputTest);
        return getQuestions(question);
    }
    public List<Question> getQuestionsOfOutputTest(String outputTest) {
        Question question = new Question();
        question.setOutputTest(outputTest);
        return getQuestions(question);
    }
    public List<Question> getQuestionsOfContestId(String contestId) {
        Question question = new Question();
        question.setContestId(contestId);
        return getQuestions(question);
    }
    public List<Question> getQuestionsOfUserId(String userId) {
        Question question = new Question();
        question.setUserId(userId);
        return getQuestions(question);
    }
    public List<Question> getQuestionsOfDemoBody(String demoBody) {
        Question question = new Question();
        question.setDemoBody(demoBody);
        return getQuestions(question);
    }
    public List<Question> getQuestionsOfQuestionIdAndTitle(String questionId, String title) {
        Question question = new Question();
        question.setQuestionId(questionId);
        question.setTitle(title);
        return getQuestions(question);
    }
    public List<Question> getQuestionsOfQuestionIdAndBody(String questionId, String body) {
        Question question = new Question();
        question.setQuestionId(questionId);
        question.setBody(body);
        return getQuestions(question);
    }
    public List<Question> getQuestionsOfQuestionIdAndScore(String questionId, String score) {
        Question question = new Question();
        question.setQuestionId(questionId);
        question.setScore(score);
        return getQuestions(question);
    }
    public List<Question> getQuestionsOfQuestionIdAndDemoCode(String questionId, String demoCode) {
        Question question = new Question();
        question.setQuestionId(questionId);
        question.setDemoCode(demoCode);
        return getQuestions(question);
    }
    public List<Question> getQuestionsOfQuestionIdAndRightPeople(String questionId, String rightPeople) {
        Question question = new Question();
        question.setQuestionId(questionId);
        question.setRightPeople(rightPeople);
        return getQuestions(question);
    }
    public List<Question> getQuestionsOfQuestionIdAndMainPeople(String questionId, String mainPeople) {
        Question question = new Question();
        question.setQuestionId(questionId);
        question.setMainPeople(mainPeople);
        return getQuestions(question);
    }
    public List<Question> getQuestionsOfQuestionIdAndStartTime(String questionId, String startTime) {
        Question question = new Question();
        question.setQuestionId(questionId);
        question.setStartTime(startTime);
        return getQuestions(question);
    }
    public List<Question> getQuestionsOfQuestionIdAndEndTime(String questionId, String endTime) {
        Question question = new Question();
        question.setQuestionId(questionId);
        question.setEndTime(endTime);
        return getQuestions(question);
    }
    public List<Question> getQuestionsOfQuestionIdAndInputFormat(String questionId, String inputFormat) {
        Question question = new Question();
        question.setQuestionId(questionId);
        question.setInputFormat(inputFormat);
        return getQuestions(question);
    }
    public List<Question> getQuestionsOfQuestionIdAndOutputFormat(String questionId, String outputFormat) {
        Question question = new Question();
        question.setQuestionId(questionId);
        question.setOutputFormat(outputFormat);
        return getQuestions(question);
    }
    public List<Question> getQuestionsOfQuestionIdAndInputTest(String questionId, String inputTest) {
        Question question = new Question();
        question.setQuestionId(questionId);
        question.setInputTest(inputTest);
        return getQuestions(question);
    }
    public List<Question> getQuestionsOfQuestionIdAndOutputTest(String questionId, String outputTest) {
        Question question = new Question();
        question.setQuestionId(questionId);
        question.setOutputTest(outputTest);
        return getQuestions(question);
    }
    public List<Question> getQuestionsOfQuestionIdAndContestId(String questionId, String contestId) {
        Question question = new Question();
        question.setQuestionId(questionId);
        question.setContestId(contestId);
        return getQuestions(question);
    }
    public List<Question> getQuestionsOfQuestionIdAndUserId(String questionId, String userId) {
        Question question = new Question();
        question.setQuestionId(questionId);
        question.setUserId(userId);
        return getQuestions(question);
    }
    public List<Question> getQuestionsOfQuestionIdAndDemoBody(String questionId, String demoBody) {
        Question question = new Question();
        question.setQuestionId(questionId);
        question.setDemoBody(demoBody);
        return getQuestions(question);
    }
    public List<Question> getQuestionsOfTitleAndBody(String title, String body) {
        Question question = new Question();
        question.setTitle(title);
        question.setBody(body);
        return getQuestions(question);
    }
    public List<Question> getQuestionsOfTitleAndScore(String title, String score) {
        Question question = new Question();
        question.setTitle(title);
        question.setScore(score);
        return getQuestions(question);
    }
    public List<Question> getQuestionsOfTitleAndDemoCode(String title, String demoCode) {
        Question question = new Question();
        question.setTitle(title);
        question.setDemoCode(demoCode);
        return getQuestions(question);
    }
    public List<Question> getQuestionsOfTitleAndRightPeople(String title, String rightPeople) {
        Question question = new Question();
        question.setTitle(title);
        question.setRightPeople(rightPeople);
        return getQuestions(question);
    }
    public List<Question> getQuestionsOfTitleAndMainPeople(String title, String mainPeople) {
        Question question = new Question();
        question.setTitle(title);
        question.setMainPeople(mainPeople);
        return getQuestions(question);
    }
    public List<Question> getQuestionsOfTitleAndStartTime(String title, String startTime) {
        Question question = new Question();
        question.setTitle(title);
        question.setStartTime(startTime);
        return getQuestions(question);
    }
    public List<Question> getQuestionsOfTitleAndEndTime(String title, String endTime) {
        Question question = new Question();
        question.setTitle(title);
        question.setEndTime(endTime);
        return getQuestions(question);
    }
    public List<Question> getQuestionsOfTitleAndInputFormat(String title, String inputFormat) {
        Question question = new Question();
        question.setTitle(title);
        question.setInputFormat(inputFormat);
        return getQuestions(question);
    }
    public List<Question> getQuestionsOfTitleAndOutputFormat(String title, String outputFormat) {
        Question question = new Question();
        question.setTitle(title);
        question.setOutputFormat(outputFormat);
        return getQuestions(question);
    }
    public List<Question> getQuestionsOfTitleAndInputTest(String title, String inputTest) {
        Question question = new Question();
        question.setTitle(title);
        question.setInputTest(inputTest);
        return getQuestions(question);
    }
    public List<Question> getQuestionsOfTitleAndOutputTest(String title, String outputTest) {
        Question question = new Question();
        question.setTitle(title);
        question.setOutputTest(outputTest);
        return getQuestions(question);
    }
    public List<Question> getQuestionsOfTitleAndContestId(String title, String contestId) {
        Question question = new Question();
        question.setTitle(title);
        question.setContestId(contestId);
        return getQuestions(question);
    }
    public List<Question> getQuestionsOfTitleAndUserId(String title, String userId) {
        Question question = new Question();
        question.setTitle(title);
        question.setUserId(userId);
        return getQuestions(question);
    }
    public List<Question> getQuestionsOfTitleAndDemoBody(String title, String demoBody) {
        Question question = new Question();
        question.setTitle(title);
        question.setDemoBody(demoBody);
        return getQuestions(question);
    }
    public List<Question> getQuestionsOfBodyAndScore(String body, String score) {
        Question question = new Question();
        question.setBody(body);
        question.setScore(score);
        return getQuestions(question);
    }
    public List<Question> getQuestionsOfBodyAndDemoCode(String body, String demoCode) {
        Question question = new Question();
        question.setBody(body);
        question.setDemoCode(demoCode);
        return getQuestions(question);
    }
    public List<Question> getQuestionsOfBodyAndRightPeople(String body, String rightPeople) {
        Question question = new Question();
        question.setBody(body);
        question.setRightPeople(rightPeople);
        return getQuestions(question);
    }
    public List<Question> getQuestionsOfBodyAndMainPeople(String body, String mainPeople) {
        Question question = new Question();
        question.setBody(body);
        question.setMainPeople(mainPeople);
        return getQuestions(question);
    }
    public List<Question> getQuestionsOfBodyAndStartTime(String body, String startTime) {
        Question question = new Question();
        question.setBody(body);
        question.setStartTime(startTime);
        return getQuestions(question);
    }
    public List<Question> getQuestionsOfBodyAndEndTime(String body, String endTime) {
        Question question = new Question();
        question.setBody(body);
        question.setEndTime(endTime);
        return getQuestions(question);
    }
    public List<Question> getQuestionsOfBodyAndInputFormat(String body, String inputFormat) {
        Question question = new Question();
        question.setBody(body);
        question.setInputFormat(inputFormat);
        return getQuestions(question);
    }
    public List<Question> getQuestionsOfBodyAndOutputFormat(String body, String outputFormat) {
        Question question = new Question();
        question.setBody(body);
        question.setOutputFormat(outputFormat);
        return getQuestions(question);
    }
    public List<Question> getQuestionsOfBodyAndInputTest(String body, String inputTest) {
        Question question = new Question();
        question.setBody(body);
        question.setInputTest(inputTest);
        return getQuestions(question);
    }
    public List<Question> getQuestionsOfBodyAndOutputTest(String body, String outputTest) {
        Question question = new Question();
        question.setBody(body);
        question.setOutputTest(outputTest);
        return getQuestions(question);
    }
    public List<Question> getQuestionsOfBodyAndContestId(String body, String contestId) {
        Question question = new Question();
        question.setBody(body);
        question.setContestId(contestId);
        return getQuestions(question);
    }
    public List<Question> getQuestionsOfBodyAndUserId(String body, String userId) {
        Question question = new Question();
        question.setBody(body);
        question.setUserId(userId);
        return getQuestions(question);
    }
    public List<Question> getQuestionsOfBodyAndDemoBody(String body, String demoBody) {
        Question question = new Question();
        question.setBody(body);
        question.setDemoBody(demoBody);
        return getQuestions(question);
    }
    public List<Question> getQuestionsOfScoreAndDemoCode(String score, String demoCode) {
        Question question = new Question();
        question.setScore(score);
        question.setDemoCode(demoCode);
        return getQuestions(question);
    }
    public List<Question> getQuestionsOfScoreAndRightPeople(String score, String rightPeople) {
        Question question = new Question();
        question.setScore(score);
        question.setRightPeople(rightPeople);
        return getQuestions(question);
    }
    public List<Question> getQuestionsOfScoreAndMainPeople(String score, String mainPeople) {
        Question question = new Question();
        question.setScore(score);
        question.setMainPeople(mainPeople);
        return getQuestions(question);
    }
    public List<Question> getQuestionsOfScoreAndStartTime(String score, String startTime) {
        Question question = new Question();
        question.setScore(score);
        question.setStartTime(startTime);
        return getQuestions(question);
    }
    public List<Question> getQuestionsOfScoreAndEndTime(String score, String endTime) {
        Question question = new Question();
        question.setScore(score);
        question.setEndTime(endTime);
        return getQuestions(question);
    }
    public List<Question> getQuestionsOfScoreAndInputFormat(String score, String inputFormat) {
        Question question = new Question();
        question.setScore(score);
        question.setInputFormat(inputFormat);
        return getQuestions(question);
    }
    public List<Question> getQuestionsOfScoreAndOutputFormat(String score, String outputFormat) {
        Question question = new Question();
        question.setScore(score);
        question.setOutputFormat(outputFormat);
        return getQuestions(question);
    }
    public List<Question> getQuestionsOfScoreAndInputTest(String score, String inputTest) {
        Question question = new Question();
        question.setScore(score);
        question.setInputTest(inputTest);
        return getQuestions(question);
    }
    public List<Question> getQuestionsOfScoreAndOutputTest(String score, String outputTest) {
        Question question = new Question();
        question.setScore(score);
        question.setOutputTest(outputTest);
        return getQuestions(question);
    }
    public List<Question> getQuestionsOfScoreAndContestId(String score, String contestId) {
        Question question = new Question();
        question.setScore(score);
        question.setContestId(contestId);
        return getQuestions(question);
    }
    public List<Question> getQuestionsOfScoreAndUserId(String score, String userId) {
        Question question = new Question();
        question.setScore(score);
        question.setUserId(userId);
        return getQuestions(question);
    }
    public List<Question> getQuestionsOfScoreAndDemoBody(String score, String demoBody) {
        Question question = new Question();
        question.setScore(score);
        question.setDemoBody(demoBody);
        return getQuestions(question);
    }
    public List<Question> getQuestionsOfDemoCodeAndRightPeople(String demoCode, String rightPeople) {
        Question question = new Question();
        question.setDemoCode(demoCode);
        question.setRightPeople(rightPeople);
        return getQuestions(question);
    }
    public List<Question> getQuestionsOfDemoCodeAndMainPeople(String demoCode, String mainPeople) {
        Question question = new Question();
        question.setDemoCode(demoCode);
        question.setMainPeople(mainPeople);
        return getQuestions(question);
    }
    public List<Question> getQuestionsOfDemoCodeAndStartTime(String demoCode, String startTime) {
        Question question = new Question();
        question.setDemoCode(demoCode);
        question.setStartTime(startTime);
        return getQuestions(question);
    }
    public List<Question> getQuestionsOfDemoCodeAndEndTime(String demoCode, String endTime) {
        Question question = new Question();
        question.setDemoCode(demoCode);
        question.setEndTime(endTime);
        return getQuestions(question);
    }
    public List<Question> getQuestionsOfDemoCodeAndInputFormat(String demoCode, String inputFormat) {
        Question question = new Question();
        question.setDemoCode(demoCode);
        question.setInputFormat(inputFormat);
        return getQuestions(question);
    }
    public List<Question> getQuestionsOfDemoCodeAndOutputFormat(String demoCode, String outputFormat) {
        Question question = new Question();
        question.setDemoCode(demoCode);
        question.setOutputFormat(outputFormat);
        return getQuestions(question);
    }
    public List<Question> getQuestionsOfDemoCodeAndInputTest(String demoCode, String inputTest) {
        Question question = new Question();
        question.setDemoCode(demoCode);
        question.setInputTest(inputTest);
        return getQuestions(question);
    }
    public List<Question> getQuestionsOfDemoCodeAndOutputTest(String demoCode, String outputTest) {
        Question question = new Question();
        question.setDemoCode(demoCode);
        question.setOutputTest(outputTest);
        return getQuestions(question);
    }
    public List<Question> getQuestionsOfDemoCodeAndContestId(String demoCode, String contestId) {
        Question question = new Question();
        question.setDemoCode(demoCode);
        question.setContestId(contestId);
        return getQuestions(question);
    }
    public List<Question> getQuestionsOfDemoCodeAndUserId(String demoCode, String userId) {
        Question question = new Question();
        question.setDemoCode(demoCode);
        question.setUserId(userId);
        return getQuestions(question);
    }
    public List<Question> getQuestionsOfDemoCodeAndDemoBody(String demoCode, String demoBody) {
        Question question = new Question();
        question.setDemoCode(demoCode);
        question.setDemoBody(demoBody);
        return getQuestions(question);
    }
    public List<Question> getQuestionsOfRightPeopleAndMainPeople(String rightPeople, String mainPeople) {
        Question question = new Question();
        question.setRightPeople(rightPeople);
        question.setMainPeople(mainPeople);
        return getQuestions(question);
    }
    public List<Question> getQuestionsOfRightPeopleAndStartTime(String rightPeople, String startTime) {
        Question question = new Question();
        question.setRightPeople(rightPeople);
        question.setStartTime(startTime);
        return getQuestions(question);
    }
    public List<Question> getQuestionsOfRightPeopleAndEndTime(String rightPeople, String endTime) {
        Question question = new Question();
        question.setRightPeople(rightPeople);
        question.setEndTime(endTime);
        return getQuestions(question);
    }
    public List<Question> getQuestionsOfRightPeopleAndInputFormat(String rightPeople, String inputFormat) {
        Question question = new Question();
        question.setRightPeople(rightPeople);
        question.setInputFormat(inputFormat);
        return getQuestions(question);
    }
    public List<Question> getQuestionsOfRightPeopleAndOutputFormat(String rightPeople, String outputFormat) {
        Question question = new Question();
        question.setRightPeople(rightPeople);
        question.setOutputFormat(outputFormat);
        return getQuestions(question);
    }
    public List<Question> getQuestionsOfRightPeopleAndInputTest(String rightPeople, String inputTest) {
        Question question = new Question();
        question.setRightPeople(rightPeople);
        question.setInputTest(inputTest);
        return getQuestions(question);
    }
    public List<Question> getQuestionsOfRightPeopleAndOutputTest(String rightPeople, String outputTest) {
        Question question = new Question();
        question.setRightPeople(rightPeople);
        question.setOutputTest(outputTest);
        return getQuestions(question);
    }
    public List<Question> getQuestionsOfRightPeopleAndContestId(String rightPeople, String contestId) {
        Question question = new Question();
        question.setRightPeople(rightPeople);
        question.setContestId(contestId);
        return getQuestions(question);
    }
    public List<Question> getQuestionsOfRightPeopleAndUserId(String rightPeople, String userId) {
        Question question = new Question();
        question.setRightPeople(rightPeople);
        question.setUserId(userId);
        return getQuestions(question);
    }
    public List<Question> getQuestionsOfRightPeopleAndDemoBody(String rightPeople, String demoBody) {
        Question question = new Question();
        question.setRightPeople(rightPeople);
        question.setDemoBody(demoBody);
        return getQuestions(question);
    }
    public List<Question> getQuestionsOfMainPeopleAndStartTime(String mainPeople, String startTime) {
        Question question = new Question();
        question.setMainPeople(mainPeople);
        question.setStartTime(startTime);
        return getQuestions(question);
    }
    public List<Question> getQuestionsOfMainPeopleAndEndTime(String mainPeople, String endTime) {
        Question question = new Question();
        question.setMainPeople(mainPeople);
        question.setEndTime(endTime);
        return getQuestions(question);
    }
    public List<Question> getQuestionsOfMainPeopleAndInputFormat(String mainPeople, String inputFormat) {
        Question question = new Question();
        question.setMainPeople(mainPeople);
        question.setInputFormat(inputFormat);
        return getQuestions(question);
    }
    public List<Question> getQuestionsOfMainPeopleAndOutputFormat(String mainPeople, String outputFormat) {
        Question question = new Question();
        question.setMainPeople(mainPeople);
        question.setOutputFormat(outputFormat);
        return getQuestions(question);
    }
    public List<Question> getQuestionsOfMainPeopleAndInputTest(String mainPeople, String inputTest) {
        Question question = new Question();
        question.setMainPeople(mainPeople);
        question.setInputTest(inputTest);
        return getQuestions(question);
    }
    public List<Question> getQuestionsOfMainPeopleAndOutputTest(String mainPeople, String outputTest) {
        Question question = new Question();
        question.setMainPeople(mainPeople);
        question.setOutputTest(outputTest);
        return getQuestions(question);
    }
    public List<Question> getQuestionsOfMainPeopleAndContestId(String mainPeople, String contestId) {
        Question question = new Question();
        question.setMainPeople(mainPeople);
        question.setContestId(contestId);
        return getQuestions(question);
    }
    public List<Question> getQuestionsOfMainPeopleAndUserId(String mainPeople, String userId) {
        Question question = new Question();
        question.setMainPeople(mainPeople);
        question.setUserId(userId);
        return getQuestions(question);
    }
    public List<Question> getQuestionsOfMainPeopleAndDemoBody(String mainPeople, String demoBody) {
        Question question = new Question();
        question.setMainPeople(mainPeople);
        question.setDemoBody(demoBody);
        return getQuestions(question);
    }
    public List<Question> getQuestionsOfStartTimeAndEndTime(String startTime, String endTime) {
        Question question = new Question();
        question.setStartTime(startTime);
        question.setEndTime(endTime);
        return getQuestions(question);
    }
    public List<Question> getQuestionsOfStartTimeAndInputFormat(String startTime, String inputFormat) {
        Question question = new Question();
        question.setStartTime(startTime);
        question.setInputFormat(inputFormat);
        return getQuestions(question);
    }
    public List<Question> getQuestionsOfStartTimeAndOutputFormat(String startTime, String outputFormat) {
        Question question = new Question();
        question.setStartTime(startTime);
        question.setOutputFormat(outputFormat);
        return getQuestions(question);
    }
    public List<Question> getQuestionsOfStartTimeAndInputTest(String startTime, String inputTest) {
        Question question = new Question();
        question.setStartTime(startTime);
        question.setInputTest(inputTest);
        return getQuestions(question);
    }
    public List<Question> getQuestionsOfStartTimeAndOutputTest(String startTime, String outputTest) {
        Question question = new Question();
        question.setStartTime(startTime);
        question.setOutputTest(outputTest);
        return getQuestions(question);
    }
    public List<Question> getQuestionsOfStartTimeAndContestId(String startTime, String contestId) {
        Question question = new Question();
        question.setStartTime(startTime);
        question.setContestId(contestId);
        return getQuestions(question);
    }
    public List<Question> getQuestionsOfStartTimeAndUserId(String startTime, String userId) {
        Question question = new Question();
        question.setStartTime(startTime);
        question.setUserId(userId);
        return getQuestions(question);
    }
    public List<Question> getQuestionsOfStartTimeAndDemoBody(String startTime, String demoBody) {
        Question question = new Question();
        question.setStartTime(startTime);
        question.setDemoBody(demoBody);
        return getQuestions(question);
    }
    public List<Question> getQuestionsOfEndTimeAndInputFormat(String endTime, String inputFormat) {
        Question question = new Question();
        question.setEndTime(endTime);
        question.setInputFormat(inputFormat);
        return getQuestions(question);
    }
    public List<Question> getQuestionsOfEndTimeAndOutputFormat(String endTime, String outputFormat) {
        Question question = new Question();
        question.setEndTime(endTime);
        question.setOutputFormat(outputFormat);
        return getQuestions(question);
    }
    public List<Question> getQuestionsOfEndTimeAndInputTest(String endTime, String inputTest) {
        Question question = new Question();
        question.setEndTime(endTime);
        question.setInputTest(inputTest);
        return getQuestions(question);
    }
    public List<Question> getQuestionsOfEndTimeAndOutputTest(String endTime, String outputTest) {
        Question question = new Question();
        question.setEndTime(endTime);
        question.setOutputTest(outputTest);
        return getQuestions(question);
    }
    public List<Question> getQuestionsOfEndTimeAndContestId(String endTime, String contestId) {
        Question question = new Question();
        question.setEndTime(endTime);
        question.setContestId(contestId);
        return getQuestions(question);
    }
    public List<Question> getQuestionsOfEndTimeAndUserId(String endTime, String userId) {
        Question question = new Question();
        question.setEndTime(endTime);
        question.setUserId(userId);
        return getQuestions(question);
    }
    public List<Question> getQuestionsOfEndTimeAndDemoBody(String endTime, String demoBody) {
        Question question = new Question();
        question.setEndTime(endTime);
        question.setDemoBody(demoBody);
        return getQuestions(question);
    }
    public List<Question> getQuestionsOfInputFormatAndOutputFormat(String inputFormat, String outputFormat) {
        Question question = new Question();
        question.setInputFormat(inputFormat);
        question.setOutputFormat(outputFormat);
        return getQuestions(question);
    }
    public List<Question> getQuestionsOfInputFormatAndInputTest(String inputFormat, String inputTest) {
        Question question = new Question();
        question.setInputFormat(inputFormat);
        question.setInputTest(inputTest);
        return getQuestions(question);
    }
    public List<Question> getQuestionsOfInputFormatAndOutputTest(String inputFormat, String outputTest) {
        Question question = new Question();
        question.setInputFormat(inputFormat);
        question.setOutputTest(outputTest);
        return getQuestions(question);
    }
    public List<Question> getQuestionsOfInputFormatAndContestId(String inputFormat, String contestId) {
        Question question = new Question();
        question.setInputFormat(inputFormat);
        question.setContestId(contestId);
        return getQuestions(question);
    }
    public List<Question> getQuestionsOfInputFormatAndUserId(String inputFormat, String userId) {
        Question question = new Question();
        question.setInputFormat(inputFormat);
        question.setUserId(userId);
        return getQuestions(question);
    }
    public List<Question> getQuestionsOfInputFormatAndDemoBody(String inputFormat, String demoBody) {
        Question question = new Question();
        question.setInputFormat(inputFormat);
        question.setDemoBody(demoBody);
        return getQuestions(question);
    }
    public List<Question> getQuestionsOfOutputFormatAndInputTest(String outputFormat, String inputTest) {
        Question question = new Question();
        question.setOutputFormat(outputFormat);
        question.setInputTest(inputTest);
        return getQuestions(question);
    }
    public List<Question> getQuestionsOfOutputFormatAndOutputTest(String outputFormat, String outputTest) {
        Question question = new Question();
        question.setOutputFormat(outputFormat);
        question.setOutputTest(outputTest);
        return getQuestions(question);
    }
    public List<Question> getQuestionsOfOutputFormatAndContestId(String outputFormat, String contestId) {
        Question question = new Question();
        question.setOutputFormat(outputFormat);
        question.setContestId(contestId);
        return getQuestions(question);
    }
    public List<Question> getQuestionsOfOutputFormatAndUserId(String outputFormat, String userId) {
        Question question = new Question();
        question.setOutputFormat(outputFormat);
        question.setUserId(userId);
        return getQuestions(question);
    }
    public List<Question> getQuestionsOfOutputFormatAndDemoBody(String outputFormat, String demoBody) {
        Question question = new Question();
        question.setOutputFormat(outputFormat);
        question.setDemoBody(demoBody);
        return getQuestions(question);
    }
    public List<Question> getQuestionsOfInputTestAndOutputTest(String inputTest, String outputTest) {
        Question question = new Question();
        question.setInputTest(inputTest);
        question.setOutputTest(outputTest);
        return getQuestions(question);
    }
    public List<Question> getQuestionsOfInputTestAndContestId(String inputTest, String contestId) {
        Question question = new Question();
        question.setInputTest(inputTest);
        question.setContestId(contestId);
        return getQuestions(question);
    }
    public List<Question> getQuestionsOfInputTestAndUserId(String inputTest, String userId) {
        Question question = new Question();
        question.setInputTest(inputTest);
        question.setUserId(userId);
        return getQuestions(question);
    }
    public List<Question> getQuestionsOfInputTestAndDemoBody(String inputTest, String demoBody) {
        Question question = new Question();
        question.setInputTest(inputTest);
        question.setDemoBody(demoBody);
        return getQuestions(question);
    }
    public List<Question> getQuestionsOfOutputTestAndContestId(String outputTest, String contestId) {
        Question question = new Question();
        question.setOutputTest(outputTest);
        question.setContestId(contestId);
        return getQuestions(question);
    }
    public List<Question> getQuestionsOfOutputTestAndUserId(String outputTest, String userId) {
        Question question = new Question();
        question.setOutputTest(outputTest);
        question.setUserId(userId);
        return getQuestions(question);
    }
    public List<Question> getQuestionsOfOutputTestAndDemoBody(String outputTest, String demoBody) {
        Question question = new Question();
        question.setOutputTest(outputTest);
        question.setDemoBody(demoBody);
        return getQuestions(question);
    }
    public List<Question> getQuestionsOfContestIdAndUserId(String contestId, String userId) {
        Question question = new Question();
        question.setContestId(contestId);
        question.setUserId(userId);
        return getQuestions(question);
    }
    public List<Question> getQuestionsOfContestIdAndDemoBody(String contestId, String demoBody) {
        Question question = new Question();
        question.setContestId(contestId);
        question.setDemoBody(demoBody);
        return getQuestions(question);
    }
    public List<Question> getQuestionsOfUserIdAndDemoBody(String userId, String demoBody) {
        Question question = new Question();
        question.setUserId(userId);
        question.setDemoBody(demoBody);
        return getQuestions(question);
    }
}
