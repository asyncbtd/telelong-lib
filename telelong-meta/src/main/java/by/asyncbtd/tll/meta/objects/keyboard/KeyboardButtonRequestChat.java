package by.asyncbtd.tll.meta.objects.keyboard;

import by.asyncbtd.tll.meta.objects.chat.ChatAdministratorRights;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class KeyboardButtonRequestChat {

    @JsonProperty("request_id")
    private Integer requestId;

    @JsonProperty("chat_is_channel")
    private Boolean chatIsChannel;

    @JsonProperty("chat_is_forum")
    private Boolean chatIsForum;

    @JsonProperty("chat_has_username")
    private Boolean chatHasUsername;

    @JsonProperty("chat_is_created")
    private Boolean chatIsCreated;

    @JsonProperty("user_administrator_rights")
    private ChatAdministratorRights userAdministratorRights;

    @JsonProperty("bot_administrator_rights")
    private ChatAdministratorRights botAdministratorRights;

    @JsonProperty("bot_is_member")
    private Boolean botIsMember;

    @JsonProperty("request_title")
    private Boolean requestTitle;

    @JsonProperty("request_username")
    private Boolean requestUsername;

    @JsonProperty("request_photo")
    private Boolean requestPhoto;

    public Integer getRequestId() {
        return requestId;
    }

    public Boolean getChatIsChannel() {
        return chatIsChannel;
    }

    public Boolean getChatIsForum() {
        return chatIsForum;
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

    public void setChatIsForum(Boolean chatIsForum) {
        this.chatIsForum = chatIsForum;
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
                ", chatIsForum=" + this.getChatIsForum() +
                ", chatHasUsername=" + this.getChatHasUsername() +
                ", chatIsCreated=" + this.getChatIsCreated() +
                ", userAdministratorRights=" + this.getUserAdministratorRights() +
                ", botAdministratorRights=" + this.getBotAdministratorRights() +
                ", botIsMember=" + this.getBotIsMember() +
                ", requestTitle=" + this.getRequestTitle() +
                ", requestUsername=" + this.getRequestUsername() +
                ", requestPhoto=" + this.getRequestPhoto() + ")";
    }

    public KeyboardButtonRequestChat(Integer requestId, Boolean chatIsChannel, Boolean chatIsForum, Boolean chatHasUsername, Boolean chatIsCreated,
                                     ChatAdministratorRights userAdministratorRights, ChatAdministratorRights botAdministratorRights,
                                     Boolean botIsMember, Boolean requestTitle, Boolean requestUsername, Boolean requestPhoto) {
        this.requestId = requestId;
        this.chatIsChannel = chatIsChannel;
        this.chatIsForum = chatIsForum;
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
