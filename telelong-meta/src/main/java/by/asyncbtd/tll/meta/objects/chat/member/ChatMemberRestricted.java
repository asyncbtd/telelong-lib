package by.asyncbtd.tll.meta.objects.chat.member;

import by.asyncbtd.tll.meta.objects.User;

public class ChatMemberRestricted implements ChatMember {

    private String status;
    private User user;
    private Boolean isMember;
    private Boolean canSendMessages;
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
    private Integer untilDate;

    public String getStatus() {
        return status;
    }

    public User getUser() {
        return user;
    }

    public Boolean getIsMember() {
        return isMember;
    }

    public Boolean getCanSendMessages() {
        return canSendMessages;
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

    public Integer getUntilDate() {
        return untilDate;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setIsMember(Boolean isMember) {
        this.isMember = isMember;
    }

    public void setCanSendMessages(Boolean canSendMessages) {
        this.canSendMessages = canSendMessages;
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

    public void setUntilDate(Integer untilDate) {
        this.untilDate = untilDate;
    }

    public String toString() {
        return "ChatMemberRestricted(status=" + this.getStatus() +
                ", user=" + this.getUser() +
                ", isMember=" + this.getIsMember() +
                ", canSendMessages=" + this.getCanSendMessages() +
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
                ", canManageTopics=" + this.getCanManageTopics() +
                ", untilDate=" + this.getUntilDate() + ")";
    }

    public ChatMemberRestricted() {
    }

    public ChatMemberRestricted(String status, User user, Boolean isMember, Boolean canSendMessages, Boolean canSendAudios, Boolean canSendDocuments,
                                Boolean canSendPhotos, Boolean canSendVideos, Boolean canSendVideoNotes, Boolean canSendVoiceNotes, Boolean canSendPolls,
                                Boolean canSendOtherMessages, Boolean canAddWebPagePreviews, Boolean canChangeInfo, Boolean canInviteUsers, Boolean canPinMessages,
                                Boolean canManageTopics, Integer untilDate) {
        this.status = status;
        this.user = user;
        this.isMember = isMember;
        this.canSendMessages = canSendMessages;
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
        this.untilDate = untilDate;
    }
}
