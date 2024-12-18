package by.asyncbtd.tll.meta.objects.poll;

import by.asyncbtd.tll.meta.objects.message.MessageEntity;

import java.util.List;

public class Poll {

    private String id;
    private String question;
    private List<MessageEntity> questionEntities;
    private List<PollOption> options;
    private Integer totalVoterCount;
    private Boolean isClosed;
    private Boolean isAnonymous;
    private String type;
    private Boolean allowsMultipleAnswers;
    private Integer correctOptionId;
    private String explanation;
    private List<MessageEntity> explanationEntities;
    private Integer openPeriod;
    private Integer closeDate;

    public String getId() {
        return id;
    }

    public String getQuestion() {
        return question;
    }

    public List<MessageEntity> getQuestionEntities() {
        return questionEntities;
    }

    public List<PollOption> getOptions() {
        return options;
    }

    public Integer getTotalVoterCount() {
        return totalVoterCount;
    }

    public Boolean getIsClosed() {
        return isClosed;
    }

    public Boolean getIsAnonymous() {
        return isAnonymous;
    }

    public String getType() {
        return type;
    }

    public Boolean getAllowsMultipleAnswers() {
        return allowsMultipleAnswers;
    }

    public Integer getCorrectOptionId() {
        return correctOptionId;
    }

    public String getExplanation() {
        return explanation;
    }

    public List<MessageEntity> getExplanationEntities() {
        return explanationEntities;
    }

    public Integer getOpenPeriod() {
        return openPeriod;
    }

    public Integer getCloseDate() {
        return closeDate;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public void setQuestionEntities(List<MessageEntity> questionEntities) {
        this.questionEntities = questionEntities;
    }

    public void setOptions(List<PollOption> options) {
        this.options = options;
    }

    public void setTotalVoterCount(Integer totalVoterCount) {
        this.totalVoterCount = totalVoterCount;
    }

    public void setIsClosed(Boolean isClosed) {
        this.isClosed = isClosed;
    }

    public void setIsAnonymous(Boolean isAnonymous) {
        this.isAnonymous = isAnonymous;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setAllowsMultipleAnswers(Boolean allowsMultipleAnswers) {
        this.allowsMultipleAnswers = allowsMultipleAnswers;
    }

    public void setCorrectOptionId(Integer correctOptionId) {
        this.correctOptionId = correctOptionId;
    }

    public void setExplanation(String explanation) {
        this.explanation = explanation;
    }

    public void setExplanationEntities(List<MessageEntity> explanationEntities) {
        this.explanationEntities = explanationEntities;
    }

    public void setOpenPeriod(Integer openPeriod) {
        this.openPeriod = openPeriod;
    }

    public void setCloseDate(Integer closeDate) {
        this.closeDate = closeDate;
    }

    public String toString() {
        return "Poll(id=" + this.getId() +
                ", question=" + this.getQuestion() +
                ", questionEntities=" + this.getQuestionEntities() +
                ", options=" + this.getOptions() +
                ", totalVoterCount=" + this.getTotalVoterCount() +
                ", isClosed=" + this.getIsClosed() +
                ", isAnonymous=" + this.getIsAnonymous() +
                ", type=" + this.getType() +
                ", allowsMultipleAnswers=" + this.getAllowsMultipleAnswers() +
                ", correctOptionId=" + this.getCorrectOptionId() +
                ", explanation=" + this.getExplanation() +
                ", explanationEntities=" + this.getExplanationEntities() +
                ", openPeriod=" + this.getOpenPeriod() +
                ", closeDate=" + this.getCloseDate() + ")";
    }

    public Poll() {
    }

    public Poll(String id, String question, List<MessageEntity> questionEntities, List<PollOption> options, Integer totalVoterCount, Boolean isClosed,
                Boolean isAnonymous, String type, Boolean allowsMultipleAnswers, Integer correctOptionId, String explanation, List<MessageEntity> explanationEntities,
                Integer openPeriod, Integer closeDate) {
        this.id = id;
        this.question = question;
        this.questionEntities = questionEntities;
        this.options = options;
        this.totalVoterCount = totalVoterCount;
        this.isClosed = isClosed;
        this.isAnonymous = isAnonymous;
        this.type = type;
        this.allowsMultipleAnswers = allowsMultipleAnswers;
        this.correctOptionId = correctOptionId;
        this.explanation = explanation;
        this.explanationEntities = explanationEntities;
        this.openPeriod = openPeriod;
        this.closeDate = closeDate;
    }
}
