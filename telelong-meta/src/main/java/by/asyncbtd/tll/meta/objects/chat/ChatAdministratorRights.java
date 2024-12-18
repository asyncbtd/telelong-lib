package by.asyncbtd.tll.meta.objects.chat;

public class ChatAdministratorRights {

    private Boolean isAnonymous;
    private Boolean canManageChat;
    private Boolean canDeleteMessages;
    private Boolean canManageVideoChats;
    private Boolean canRestrictMembers;
    private Boolean canPromoteMembers;
    private Boolean canChangeInfo;
    private Boolean canInviteUsers;
    private Boolean canPostStories;
    private Boolean canEditStories;
    private Boolean canDeleteStories;
    private Boolean canPostMessages;
    private Boolean canEditMessages;
    private Boolean canPinMessages;
    private Boolean canManageTopics;

    public Boolean getIsAnonymous() {
        return isAnonymous;
    }

    public Boolean getCanManageChat() {
        return canManageChat;
    }

    public Boolean getCanDeleteMessages() {
        return canDeleteMessages;
    }

    public Boolean getCanManageVideoChats() {
        return canManageVideoChats;
    }

    public Boolean getCanRestrictMembers() {
        return canRestrictMembers;
    }

    public Boolean getCanPromoteMembers() {
        return canPromoteMembers;
    }

    public Boolean getCanChangeInfo() {
        return canChangeInfo;
    }

    public Boolean getCanInviteUsers() {
        return canInviteUsers;
    }

    public Boolean getCanPostStories() {
        return canPostStories;
    }

    public Boolean getCanEditStories() {
        return canEditStories;
    }

    public Boolean getCanDeleteStories() {
        return canDeleteStories;
    }

    public Boolean getCanPostMessages() {
        return canPostMessages;
    }

    public Boolean getCanEditMessages() {
        return canEditMessages;
    }

    public Boolean getCanPinMessages() {
        return canPinMessages;
    }

    public Boolean getCanManageTopics() {
        return canManageTopics;
    }

    public void setIsAnonymous(Boolean isAnonymous) {
        this.isAnonymous = isAnonymous;
    }

    public void setCanManageChat(Boolean canManageChat) {
        this.canManageChat = canManageChat;
    }

    public void setCanDeleteMessages(Boolean canDeleteMessages) {
        this.canDeleteMessages = canDeleteMessages;
    }

    public void setCanManageVideoChats(Boolean canManageVideoChats) {
        this.canManageVideoChats = canManageVideoChats;
    }

    public void setCanRestrictMembers(Boolean canRestrictMembers) {
        this.canRestrictMembers = canRestrictMembers;
    }

    public void setCanPromoteMembers(Boolean canPromoteMembers) {
        this.canPromoteMembers = canPromoteMembers;
    }

    public void setCanChangeInfo(Boolean canChangeInfo) {
        this.canChangeInfo = canChangeInfo;
    }

    public void setCanInviteUsers(Boolean canInviteUsers) {
        this.canInviteUsers = canInviteUsers;
    }

    public void setCanPostStories(Boolean canPostStories) {
        this.canPostStories = canPostStories;
    }

    public void setCanEditStories(Boolean canEditStories) {
        this.canEditStories = canEditStories;
    }

    public void setCanDeleteStories(Boolean canDeleteStories) {
        this.canDeleteStories = canDeleteStories;
    }

    public void setCanPostMessages(Boolean canPostMessages) {
        this.canPostMessages = canPostMessages;
    }

    public void setCanEditMessages(Boolean canEditMessages) {
        this.canEditMessages = canEditMessages;
    }

    public void setCanPinMessages(Boolean canPinMessages) {
        this.canPinMessages = canPinMessages;
    }

    public void setCanManageTopics(Boolean canManageTopics) {
        this.canManageTopics = canManageTopics;
    }

    public String toString() {
        return "ChatAdministratorRights(isAnonymous=" + this.getIsAnonymous() +
                ", canManageChat=" + this.getCanManageChat() +
                ", canDeleteMessages=" + this.getCanDeleteMessages() +
                ", canManageVideoChats=" + this.getCanManageVideoChats() +
                ", canRestrictMembers=" + this.getCanRestrictMembers() +
                ", canPromoteMembers=" + this.getCanPromoteMembers() +
                ", canChangeInfo=" + this.getCanChangeInfo() +
                ", canInviteUsers=" + this.getCanInviteUsers() +
                ", canPostStories=" + this.getCanPostStories() +
                ", canEditStories=" + this.getCanEditStories() +
                ", canDeleteStories=" + this.getCanDeleteStories() +
                ", canPostMessages=" + this.getCanPostMessages() +
                ", canEditMessages=" + this.getCanEditMessages() +
                ", canPinMessages=" + this.getCanPinMessages() +
                ", canManageTopics=" + this.getCanManageTopics() + ")";
    }

    public ChatAdministratorRights() {
    }

    public ChatAdministratorRights(Boolean isAnonymous, Boolean canManageChat, Boolean canDeleteMessages, Boolean canManageVideoChats, Boolean canRestrictMembers,
                                   Boolean canPromoteMembers, Boolean canChangeInfo, Boolean canInviteUsers, Boolean canPostStories, Boolean canEditStories,
                                   Boolean canDeleteStories, Boolean canPostMessages, Boolean canEditMessages, Boolean canPinMessages, Boolean canManageTopics) {
        this.isAnonymous = isAnonymous;
        this.canManageChat = canManageChat;
        this.canDeleteMessages = canDeleteMessages;
        this.canManageVideoChats = canManageVideoChats;
        this.canRestrictMembers = canRestrictMembers;
        this.canPromoteMembers = canPromoteMembers;
        this.canChangeInfo = canChangeInfo;
        this.canInviteUsers = canInviteUsers;
        this.canPostStories = canPostStories;
        this.canEditStories = canEditStories;
        this.canDeleteStories = canDeleteStories;
        this.canPostMessages = canPostMessages;
        this.canEditMessages = canEditMessages;
        this.canPinMessages = canPinMessages;
        this.canManageTopics = canManageTopics;
    }
}
