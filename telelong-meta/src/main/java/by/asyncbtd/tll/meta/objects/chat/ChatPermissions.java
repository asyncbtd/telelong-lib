package by.asyncbtd.tll.meta.objects.chat;

public class ChatPermissions {

    private Boolean canSendMessage;
    private Boolean canSendAudios;
    private Boolean canSendDocuments;
    private Boolean canSendPhotos;
    private Boolean canSendVideos;
    private Boolean canSendVideoNotes;
    private Boolean canSendVoiceNotes;
    private Boolean canSendPolls;
    private Boolean canSendOtherMessages;
    private Boolean canAddWebPagePreviews;
    private Boolean canChangeInfo;
    private Boolean canInviteUsers;
    private Boolean canPinMessages;
    private Boolean canManageTopics;

    public Boolean getCanSendMessage() {
        return canSendMessage;
    }

    public Boolean getCanSendAudios() {
        return canSendAudios;
    }

    public Boolean getCanSendDocuments() {
        return canSendDocuments;
    }

    public Boolean getCanSendPhotos() {
        return canSendPhotos;
    }

    public Boolean getCanSendVideos() {
        return canSendVideos;
    }

    public Boolean getCanSendVideoNotes() {
        return canSendVideoNotes;
    }

    public Boolean getCanSendVoiceNotes() {
        return canSendVoiceNotes;
    }

    public Boolean getCanSendPolls() {
        return canSendPolls;
    }

    public Boolean getCanSendOtherMessages() {
        return canSendOtherMessages;
    }

    public Boolean getCanAddWebPagePreviews() {
        return canAddWebPagePreviews;
    }

    public Boolean getCanChangeInfo() {
        return canChangeInfo;
    }

    public Boolean getCanInviteUsers() {
        return canInviteUsers;
    }

    public Boolean getCanPinMessages() {
        return canPinMessages;
    }

    public Boolean getCanManageTopics() {
        return canManageTopics;
    }

    public void setCanSendMessage(Boolean canSendMessage) {
        this.canSendMessage = canSendMessage;
    }

    public void setCanSendAudios(Boolean canSendAudios) {
        this.canSendAudios = canSendAudios;
    }

    public void setCanSendDocuments(Boolean canSendDocuments) {
        this.canSendDocuments = canSendDocuments;
    }

    public void setCanSendPhotos(Boolean canSendPhotos) {
        this.canSendPhotos = canSendPhotos;
    }

    public void setCanSendVideos(Boolean canSendVideos) {
        this.canSendVideos = canSendVideos;
    }

    public void setCanSendVideoNotes(Boolean canSendVideoNotes) {
        this.canSendVideoNotes = canSendVideoNotes;
    }

    public void setCanSendVoiceNotes(Boolean canSendVoiceNotes) {
        this.canSendVoiceNotes = canSendVoiceNotes;
    }

    public void setCanSendPolls(Boolean canSendPolls) {
        this.canSendPolls = canSendPolls;
    }

    public void setCanSendOtherMessages(Boolean canSendOtherMessages) {
        this.canSendOtherMessages = canSendOtherMessages;
    }

    public void setCanAddWebPagePreviews(Boolean canAddWebPagePreviews) {
        this.canAddWebPagePreviews = canAddWebPagePreviews;
    }

    public void setCanChangeInfo(Boolean canChangeInfo) {
        this.canChangeInfo = canChangeInfo;
    }

    public void setCanInviteUsers(Boolean canInviteUsers) {
        this.canInviteUsers = canInviteUsers;
    }

    public void setCanPinMessages(Boolean canPinMessages) {
        this.canPinMessages = canPinMessages;
    }

    public void setCanManageTopics(Boolean canManageTopics) {
        this.canManageTopics = canManageTopics;
    }

    public String toString() {
        return "ChatPermissions(canSendMessage=" + this.getCanSendMessage() +
                ", canSendAudios=" + this.getCanSendAudios() +
                ", canSendDocuments=" + this.getCanSendDocuments() +
                ", canSendPhotos=" + this.getCanSendPhotos() +
                ", canSendVideos=" + this.getCanSendVideos() +
                ", canSendVideoNotes=" + this.getCanSendVideoNotes() +
                ", canSendVoiceNotes=" + this.getCanSendVoiceNotes() +
                ", canSendPolls=" + this.getCanSendPolls() +
                ", canSendOtherMessages=" + this.getCanSendOtherMessages() +
                ", canAddWebPagePreviews=" + this.getCanAddWebPagePreviews() +
                ", canChangeInfo=" + this.getCanChangeInfo() +
                ", canInviteUsers=" + this.getCanInviteUsers() +
                ", canPinMessages=" + this.getCanPinMessages() +
                ", canManageTopics=" + this.getCanManageTopics() + ")";
    }

    public ChatPermissions() {
    }

    public ChatPermissions(Boolean canSendMessage, Boolean canSendAudios, Boolean canSendDocuments, Boolean canSendPhotos, Boolean canSendVideos, Boolean canSendVideoNotes,
                           Boolean canSendVoiceNotes, Boolean canSendPolls, Boolean canSendOtherMessages, Boolean canAddWebPagePreviews, Boolean canChangeInfo,
                           Boolean canInviteUsers, Boolean canPinMessages, Boolean canManageTopics) {
        this.canSendMessage = canSendMessage;
        this.canSendAudios = canSendAudios;
        this.canSendDocuments = canSendDocuments;
        this.canSendPhotos = canSendPhotos;
        this.canSendVideos = canSendVideos;
        this.canSendVideoNotes = canSendVideoNotes;
        this.canSendVoiceNotes = canSendVoiceNotes;
        this.canSendPolls = canSendPolls;
        this.canSendOtherMessages = canSendOtherMessages;
        this.canAddWebPagePreviews = canAddWebPagePreviews;
        this.canChangeInfo = canChangeInfo;
        this.canInviteUsers = canInviteUsers;
        this.canPinMessages = canPinMessages;
        this.canManageTopics = canManageTopics;
    }
}
