package by.asyncbtd.tll.meta.objects.keyboard;

import by.asyncbtd.tll.meta.objects.chat.ChatAdministratorRights;

public class KeyboardButtonRequestChat {

    private Integer requestId;
    private Boolean chatIsChannel;
    private Boolean chatHasUsername;
    private Boolean chatIsCreated;
    private ChatAdministratorRights userAdministratorRights;
    private ChatAdministratorRights botAdministratorRights;
    private Boolean botIsMember;
    private Boolean requestTitle;
    private Boolean requestUsername;
    private Boolean requestPhoto;

    public Integer getRequestId() {
        return requestId;
    }

    public Boolean getChatIsChannel() {
        return chatIsChannel;
    }

    public Boolean getChatHasUsername() {
        return chatHasUsername;
    }

    public Boolean getChatIsCreated() {
        return chatIsCreated;
    }

    public ChatAdministratorRights getUserAdministratorRights() {
        return userAdministratorRights;
    }

    public ChatAdministratorRights getBotAdministratorRights() {
        return botAdministratorRights;
    }

    public Boolean getBotIsMember() {
        return botIsMember;
    }

    public Boolean getRequestTitle() {
        return requestTitle;
    }

    public Boolean getRequestUsername() {
        return requestUsername;
    }

    public Boolean getRequestPhoto() {
        return requestPhoto;
    }

    public void setRequestId(Integer requestId) {
        this.requestId = requestId;
    }

    public void setChatIsChannel(Boolean chatIsChannel) {
        this.chatIsChannel = chatIsChannel;
    }

    public void setChatHasUsername(Boolean chatHasUsername) {
        this.chatHasUsername = chatHasUsername;
    }

    public void setChatIsCreated(Boolean chatIsCreated) {
        this.chatIsCreated = chatIsCreated;
    }

    public void setUserAdministratorRights(ChatAdministratorRights userAdministratorRights) {
        this.userAdministratorRights = userAdministratorRights;
    }

    public void setBotAdministratorRights(ChatAdministratorRights botAdministratorRights) {
        this.botAdministratorRights = botAdministratorRights;
    }

    public void setBotIsMember(Boolean botIsMember) {
        this.botIsMember = botIsMember;
    }

    public void setRequestTitle(Boolean requestTitle) {
        this.requestTitle = requestTitle;
    }

    public void setRequestUsername(Boolean requestUsername) {
        this.requestUsername = requestUsername;
    }

    public void setRequestPhoto(Boolean requestPhoto) {
        this.requestPhoto = requestPhoto;
    }

    public String toString() {
        return "KeyboardButtonRequestChat(requestId=" + this.getRequestId() +
                ", chatIsChannel=" + this.getChatIsChannel() +
                ", chatHasUsername=" + this.getChatHasUsername() +
                ", chatIsCreated=" + this.getChatIsCreated() +
                ", userAdministratorRights=" + this.getUserAdministratorRights() +
                ", botAdministratorRights=" + this.getBotAdministratorRights() +
                ", botIsMember=" + this.getBotIsMember() +
                ", requestTitle=" + this.getRequestTitle() +
                ", requestUsername=" + this.getRequestUsername() +
                ", requestPhoto=" + this.getRequestPhoto() + ")";
    }

    public KeyboardButtonRequestChat(Integer requestId, Boolean chatIsChannel, Boolean chatHasUsername, Boolean chatIsCreated,
                                     ChatAdministratorRights userAdministratorRights, ChatAdministratorRights botAdministratorRights,
                                     Boolean botIsMember, Boolean requestTitle, Boolean requestUsername, Boolean requestPhoto) {
        this.requestId = requestId;
        this.chatIsChannel = chatIsChannel;
        this.chatHasUsername = chatHasUsername;
        this.chatIsCreated = chatIsCreated;
        this.userAdministratorRights = userAdministratorRights;
        this.botAdministratorRights = botAdministratorRights;
        this.botIsMember = botIsMember;
        this.requestTitle = requestTitle;
        this.requestUsername = requestUsername;
        this.requestPhoto = requestPhoto;
    }
}
