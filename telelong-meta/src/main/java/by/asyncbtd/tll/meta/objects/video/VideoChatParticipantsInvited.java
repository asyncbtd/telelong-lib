package by.asyncbtd.tll.meta.objects.video;

import by.asyncbtd.tll.meta.objects.User;

import java.util.List;

public class VideoChatParticipantsInvited {

    private List<User> users;

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public String toString() {
        return "VideoChatParticipantsInvited(users=" + this.getUsers() + ")";
    }

    public VideoChatParticipantsInvited() {
    }

    public VideoChatParticipantsInvited(List<User> users) {
        this.users = users;
    }
}
