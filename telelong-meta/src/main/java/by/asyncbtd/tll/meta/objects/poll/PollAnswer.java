package by.asyncbtd.tll.meta.objects.poll;

import by.asyncbtd.tll.meta.objects.chat.Chat;
import by.asyncbtd.tll.meta.objects.User;

import java.util.List;

public class PollAnswer {

    private String pollId;
    private Chat voterChat;
    private User user;
    private List<Integer> optionIds;

    public String getPollId() {
        return pollId;
    }

    public Chat getVoterChat() {
        return voterChat;
    }

    public User getUser() {
        return user;
    }

    public List<Integer> getOptionIds() {
        return optionIds;
    }

    public void setPollId(String pollId) {
        this.pollId = pollId;
    }

    public void setVoterChat(Chat voterChat) {
        this.voterChat = voterChat;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setOptionIds(List<Integer> optionIds) {
        this.optionIds = optionIds;
    }

    public String toString() {
        return "PollAnswer(pollId=" + this.getPollId() +
                ", voterChat=" + this.getVoterChat() +
                ", user=" + this.getUser() +
                ", optionIds=" + this.getOptionIds() + ")";
    }

    public PollAnswer() {
    }

    public PollAnswer(String pollId, Chat voterChat, User user, List<Integer> optionIds) {
        this.pollId = pollId;
        this.voterChat = voterChat;
        this.user = user;
        this.optionIds = optionIds;
    }
}
