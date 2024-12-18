package by.asyncbtd.tll.meta.objects.chat.boost;

import by.asyncbtd.tll.meta.objects.User;

public class ChatBoostSourcePremium implements ChatBoostSource {

    private String source;
    private User user;

    public String getSource() {
        return source;
    }

    public User getUser() {
        return user;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String toString() {
        return "ChatBoostSourcePremium(source=" + this.getSource() +
                ", user=" + this.getUser() + ")";
    }

    public ChatBoostSourcePremium() {
    }

    public ChatBoostSourcePremium(String source, User user) {
        this.source = source;
        this.user = user;
    }
}
