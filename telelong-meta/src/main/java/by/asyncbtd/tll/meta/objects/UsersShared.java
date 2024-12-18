package by.asyncbtd.tll.meta.objects;

import java.util.List;

public class UsersShared {

    private Integer requestId;
    private List<SharedUser> users;

    public Integer getRequestId() {
        return requestId;
    }

    public List<SharedUser> getUsers() {
        return users;
    }

    public void setRequestId(Integer requestId) {
        this.requestId = requestId;
    }

    public void setUsers(List<SharedUser> users) {
        this.users = users;
    }

    public String toString() {
        return "UsersShared(requestId=" + this.getRequestId() +
                ", users=" + this.getUsers() + ")";
    }

    public UsersShared() {
    }

    public UsersShared(Integer requestId, List<SharedUser> users) {
        this.requestId = requestId;
        this.users = users;
    }
}
