package by.asyncbtd.tll.meta.objects.business;

import by.asyncbtd.tll.meta.objects.chat.Chat;

import java.util.List;

public class BusinessMessagesDeleted {

    private String businessConnectionId;
    private Chat chat;
    private List<Long> messageIds;

    public String getBusinessConnectionId() {
        return businessConnectionId;
    }

    public Chat getChat() {
        return chat;
    }

    public List<Long> getMessageIds() {
        return messageIds;
    }

    public void setBusinessConnectionId(String businessConnectionId) {
        this.businessConnectionId = businessConnectionId;
    }

    public void setChat(Chat chat) {
        this.chat = chat;
    }

    public void setMessageIds(List<Long> messageIds) {
        this.messageIds = messageIds;
    }

    public String toString() {
        return "BusinessMessagesDeleted(businessConnectionId=" + this.getBusinessConnectionId() +
                ", chat=" + this.getChat() +
                ", messageIds=" + this.getMessageIds() + ")";
    }

    public BusinessMessagesDeleted() {
    }

    public BusinessMessagesDeleted(String businessConnectionId, Chat chat, List<Long> messageIds) {
        this.businessConnectionId = businessConnectionId;
        this.chat = chat;
        this.messageIds = messageIds;
    }
}
