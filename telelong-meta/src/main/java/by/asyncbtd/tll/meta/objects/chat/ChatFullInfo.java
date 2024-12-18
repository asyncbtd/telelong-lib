package by.asyncbtd.tll.meta.objects.chat;

import by.asyncbtd.tll.meta.objects.Birthdate;
import by.asyncbtd.tll.meta.objects.business.BusinessIntro;
import by.asyncbtd.tll.meta.objects.business.BusinessLocation;
import by.asyncbtd.tll.meta.objects.business.BusinessOpeningHours;
import by.asyncbtd.tll.meta.objects.message.Message;
import by.asyncbtd.tll.meta.objects.reaction.ReactionType;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class ChatFullInfo {

    @JsonProperty("id")
    private Long id;

    @JsonProperty("type")
    private String type;

    @JsonProperty("title")
    private String title;

    @JsonProperty("username")
    private String username;

    @JsonProperty("first_name")
    private String firstName;

    @JsonProperty("last_name")
    private String lastName;

    @JsonProperty("is_forum")
    private Boolean isForum;

    @JsonProperty("")
    private Integer accentColorId;

    @JsonProperty("")
    private Integer maxReactionCount;

    @JsonProperty("")
    private ChatPhoto photo;

    @JsonProperty("")
    private List<String> activeUsernames;

    @JsonProperty("")
    private Birthdate birthdate;

    @JsonProperty("")
    private BusinessIntro businessIntro;

    @JsonProperty("")
    private BusinessLocation businessLocation;

    @JsonProperty("")
    private BusinessOpeningHours businessOpeningHours;

    @JsonProperty("")
    private Chat personalChat;

    @JsonProperty("")
    private List<ReactionType> availableReactions;

    @JsonProperty("")
    private String backgroundCustomEmojiId;

    @JsonProperty("")
    private Integer profileAccentColorId;

    @JsonProperty("")
    private String profileBackgroundCustomEmojiId;

    @JsonProperty("")
    private String emojiStatusCustomEmojiId;

    @JsonProperty("")
    private Integer emojiStatusExpirationDate;

    @JsonProperty("")
    private String bio;

    @JsonProperty("")
    private Boolean hasPrivateForwards;

    @JsonProperty("")
    private Boolean hasRestrictedVoiceAndVideoMessages;

    @JsonProperty("")
    private Boolean joinToSendMessages;

    @JsonProperty("")
    private Boolean joinByRequest;

    @JsonProperty("")
    private String description;

    @JsonProperty("")
    private String inviteLink;

    @JsonProperty("")
    private Message pinnedMessage;

    @JsonProperty("")
    private ChatPermissions permissions;

    @JsonProperty("")
    private Boolean canSendPaidMedia;

    @JsonProperty("")
    private Integer slowModeDelay;

    @JsonProperty("")
    private Integer unrestrictBoostCount;

    @JsonProperty("")
    private Integer messageAutoDeleteTime;

    @JsonProperty("")
    private Boolean hasAggressiveAntiSpamEnabled;

    @JsonProperty("")
    private Boolean hasHiddenMembers;

    @JsonProperty("")
    private Boolean hasProtectedContent;

    @JsonProperty("")
    private Boolean hasVisibleHistory;

    @JsonProperty("")
    private String stickerSetName;

    @JsonProperty("")
    private Boolean canSetStickerSet;

    @JsonProperty("")
    private String customEmojiStickerSetName;

    @JsonProperty("")
    private Long linkedChatId;

    @JsonProperty("")
    private ChatLocation location;

    public Long getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public String getTitle() {
        return title;
    }

    public String getUsername() {
        return username;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Boolean getIsForum() {
        return isForum;
    }

    public Integer getAccentColorId() {
        return accentColorId;
    }

    public Integer getMaxReactionCount() {
        return maxReactionCount;
    }

    public ChatPhoto getPhoto() {
        return photo;
    }

    public List<String> getActiveUsernames() {
        return activeUsernames;
    }

    public Birthdate getBirthdate() {
        return birthdate;
    }

    public BusinessIntro getBusinessIntro() {
        return businessIntro;
    }

    public BusinessLocation getBusinessLocation() {
        return businessLocation;
    }

    public BusinessOpeningHours getBusinessOpeningHours() {
        return businessOpeningHours;
    }

    public Chat getPersonalChat() {
        return personalChat;
    }

    public List<ReactionType> getAvailableReactions() {
        return availableReactions;
    }

    public String getBackgroundCustomEmojiId() {
        return backgroundCustomEmojiId;
    }

    public Integer getProfileAccentColorId() {
        return profileAccentColorId;
    }

    public String getProfileBackgroundCustomEmojiId() {
        return profileBackgroundCustomEmojiId;
    }

    public String getEmojiStatusCustomEmojiId() {
        return emojiStatusCustomEmojiId;
    }

    public Integer getEmojiStatusExpirationDate() {
        return emojiStatusExpirationDate;
    }

    public String getBio() {
        return bio;
    }

    public Boolean getHasPrivateForwards() {
        return hasPrivateForwards;
    }

    public Boolean getHasRestrictedVoiceAndVideoMessages() {
        return hasRestrictedVoiceAndVideoMessages;
    }

    public Boolean getJoinToSendMessages() {
        return joinToSendMessages;
    }

    public Boolean getJoinByRequest() {
        return joinByRequest;
    }

    public String getDescription() {
        return description;
    }

    public String getInviteLink() {
        return inviteLink;
    }

    public Message getPinnedMessage() {
        return pinnedMessage;
    }

    public ChatPermissions getPermissions() {
        return permissions;
    }

    public Boolean getCanSendPaidMedia() {
        return canSendPaidMedia;
    }

    public Integer getSlowModeDelay() {
        return slowModeDelay;
    }

    public Integer getUnrestrictBoostCount() {
        return unrestrictBoostCount;
    }

    public Integer getMessageAutoDeleteTime() {
        return messageAutoDeleteTime;
    }

    public Boolean getHasAggressiveAntiSpamEnabled() {
        return hasAggressiveAntiSpamEnabled;
    }

    public Boolean getHasHiddenMembers() {
        return hasHiddenMembers;
    }

    public Boolean getHasProtectedContent() {
        return hasProtectedContent;
    }

    public Boolean getHasVisibleHistory() {
        return hasVisibleHistory;
    }

    public String getStickerSetName() {
        return stickerSetName;
    }

    public Boolean getCanSetStickerSet() {
        return canSetStickerSet;
    }

    public String getCustomEmojiStickerSetName() {
        return customEmojiStickerSetName;
    }

    public Long getLinkedChatId() {
        return linkedChatId;
    }

    public ChatLocation getLocation() {
        return location;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setIsForum(Boolean forum) {
        isForum = forum;
    }

    public void setAccentColorId(Integer accentColorId) {
        this.accentColorId = accentColorId;
    }

    public void setMaxReactionCount(Integer maxReactionCount) {
        this.maxReactionCount = maxReactionCount;
    }

    public void setPhoto(ChatPhoto photo) {
        this.photo = photo;
    }

    public void setActiveUsernames(List<String> activeUsernames) {
        this.activeUsernames = activeUsernames;
    }

    public void setBirthdate(Birthdate birthdate) {
        this.birthdate = birthdate;
    }

    public void setBusinessIntro(BusinessIntro businessIntro) {
        this.businessIntro = businessIntro;
    }

    public void setBusinessLocation(BusinessLocation businessLocation) {
        this.businessLocation = businessLocation;
    }

    public void setBusinessOpeningHours(BusinessOpeningHours businessOpeningHours) {
        this.businessOpeningHours = businessOpeningHours;
    }

    public void setPersonalChat(Chat personalChat) {
        this.personalChat = personalChat;
    }

    public void setAvailableReactions(List<ReactionType> availableReactions) {
        this.availableReactions = availableReactions;
    }

    public void setBackgroundCustomEmojiId(String backgroundCustomEmojiId) {
        this.backgroundCustomEmojiId = backgroundCustomEmojiId;
    }

    public void setProfileAccentColorId(Integer profileAccentColorId) {
        this.profileAccentColorId = profileAccentColorId;
    }

    public void setProfileBackgroundCustomEmojiId(String profileBackgroundCustomEmojiId) {
        this.profileBackgroundCustomEmojiId = profileBackgroundCustomEmojiId;
    }

    public void setEmojiStatusCustomEmojiId(String emojiStatusCustomEmojiId) {
        this.emojiStatusCustomEmojiId = emojiStatusCustomEmojiId;
    }

    public void setEmojiStatusExpirationDate(Integer emojiStatusExpirationDate) {
        this.emojiStatusExpirationDate = emojiStatusExpirationDate;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public void setHasPrivateForwards(Boolean hasPrivateForwards) {
        this.hasPrivateForwards = hasPrivateForwards;
    }

    public void setHasRestrictedVoiceAndVideoMessages(Boolean hasRestrictedVoiceAndVideoMessages) {
        this.hasRestrictedVoiceAndVideoMessages = hasRestrictedVoiceAndVideoMessages;
    }

    public void setJoinToSendMessages(Boolean joinToSendMessages) {
        this.joinToSendMessages = joinToSendMessages;
    }

    public void setJoinByRequest(Boolean joinByRequest) {
        this.joinByRequest = joinByRequest;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setInviteLink(String inviteLink) {
        this.inviteLink = inviteLink;
    }

    public void setPinnedMessage(Message pinnedMessage) {
        this.pinnedMessage = pinnedMessage;
    }

    public void setPermissions(ChatPermissions permissions) {
        this.permissions = permissions;
    }

    public void setCanSendPaidMedia(Boolean canSendPaidMedia) {
        this.canSendPaidMedia = canSendPaidMedia;
    }

    public void setSlowModeDelay(Integer slowModeDelay) {
        this.slowModeDelay = slowModeDelay;
    }

    public void setUnrestrictBoostCount(Integer unrestrictBoostCount) {
        this.unrestrictBoostCount = unrestrictBoostCount;
    }

    public void setMessageAutoDeleteTime(Integer messageAutoDeleteTime) {
        this.messageAutoDeleteTime = messageAutoDeleteTime;
    }

    public void setHasAggressiveAntiSpamEnabled(Boolean hasAggressiveAntiSpamEnabled) {
        this.hasAggressiveAntiSpamEnabled = hasAggressiveAntiSpamEnabled;
    }

    public void setHasHiddenMembers(Boolean hasHiddenMembers) {
        this.hasHiddenMembers = hasHiddenMembers;
    }

    public void setHasProtectedContent(Boolean hasProtectedContent) {
        this.hasProtectedContent = hasProtectedContent;
    }

    public void setHasVisibleHistory(Boolean hasVisibleHistory) {
        this.hasVisibleHistory = hasVisibleHistory;
    }

    public void setStickerSetName(String stickerSetName) {
        this.stickerSetName = stickerSetName;
    }

    public void setCanSetStickerSet(Boolean canSetStickerSet) {
        this.canSetStickerSet = canSetStickerSet;
    }

    public void setCustomEmojiStickerSetName(String customEmojiStickerSetName) {
        this.customEmojiStickerSetName = customEmojiStickerSetName;
    }

    public void setLinkedChatId(Long linkedChatId) {
        this.linkedChatId = linkedChatId;
    }

    public void setLocation(ChatLocation location) {
        this.location = location;
    }

    public String toString() {
        return "Chat(id=" + this.getId() +
                ", type=" + this.getType() +
                ", title=" + this.getTitle() +
                ", username=" + this.getUsername() +
                ", firstName=" + this.getFirstName() +
                ", lastName=" + this.getLastName() +
                ", isForum=" + this.getIsForum() +
                ", accentColorId=" + this.getAccentColorId() +
                ", maxReactionCount=" + this.getMaxReactionCount() +
                ", photo=" + this.getPhoto() +
                ", activeUsernames=" + this.getActiveUsernames() +
                ", birthdate=" + this.getBirthdate() +
                ", businessIntro=" + this.getBusinessIntro() +
                ", businessLocation=" + this.getBusinessLocation() +
                ", businessOpeningHours=" + this.getBusinessOpeningHours() +
                ", personalChat=" + this.getPersonalChat() +
                ", availableReactions=" + this.getAvailableReactions() +
                ", backgroundCustomEmojiId=" + this.getBackgroundCustomEmojiId() +
                ", profileAccentColorId=" + this.getProfileAccentColorId() +
                ", profileBackgroundCustomEmojiId=" + this.getProfileBackgroundCustomEmojiId() +
                ", emojiStatusCustomEmojiId=" + this.getEmojiStatusCustomEmojiId() +
                ", emojiStatusExpirationDate=" + this.getEmojiStatusExpirationDate() +
                ", bio=" + this.getBio() +
                ", hasPrivateForwards=" + this.getHasPrivateForwards() +
                ", hasRestrictedVoiceAndVideoMessages=" + this.getHasRestrictedVoiceAndVideoMessages() +
                ", joinToSendMessages=" + this.getJoinToSendMessages() +
                ", joinByRequest=" + this.getJoinByRequest() +
                ", description=" + this.getDescription() +
                ", inviteLink=" + this.getInviteLink() +
                ", pinnedMessage=" + this.getPinnedMessage() +
                ", permissions=" + this.getPermissions() +
                ", canSendPaidMedia=" + this.getCanSendPaidMedia() +
                ", slowModeDelay=" + this.getSlowModeDelay() +
                ", unrestrictBoostCount=" + this.getUnrestrictBoostCount() +
                ", messageAutoDeleteTime=" + this.getMessageAutoDeleteTime() +
                ", hasAggressiveAntiSpamEnabled=" + this.getHasAggressiveAntiSpamEnabled() +
                ", hasHiddenMembers=" + this.getHasHiddenMembers() +
                ", hasProtectedContent=" + this.getHasProtectedContent() +
                ", hasVisibleHistory=" + this.getHasVisibleHistory() +
                ", stickerSetName=" + this.getStickerSetName() +
                ", canSetStickerSet=" + this.getCanSetStickerSet() +
                ", customEmojiStickerSetName=" + this.getCustomEmojiStickerSetName() +
                ", linkedChatId=" + this.getLinkedChatId() +
                ", location=" + this.getLocation() + ")";
    }

    public ChatFullInfo() {
    }

    public ChatFullInfo(Long id, String type, String title, String username, String firstName, String lastName, Boolean isForum, Integer accentColorId, Integer maxReactionCount,
                        ChatPhoto photo, List<String> activeUsernames, Birthdate birthdate, BusinessIntro businessIntro, BusinessLocation businessLocation,
                        BusinessOpeningHours businessOpeningHours, Chat personalChat, List<ReactionType> availableReactions, String backgroundCustomEmojiId,
                        Integer profileAccentColorId, String profileBackgroundCustomEmojiId, String emojiStatusCustomEmojiId, Integer emojiStatusExpirationDate, String bio,
                        Boolean hasPrivateForwards, Boolean hasRestrictedVoiceAndVideoMessages, Boolean joinToSendMessages, Boolean joinByRequest, String description,
                        String inviteLink, Message pinnedMessage, ChatPermissions permissions, Boolean canSendPaidMedia, Integer slowModeDelay, Integer unrestrictBoostCount,
                        Integer messageAutoDeleteTime, Boolean hasAggressiveAntiSpamEnabled, Boolean hasHiddenMembers, Boolean hasProtectedContent, Boolean hasVisibleHistory,
                        String stickerSetName, Boolean canSetStickerSet, String customEmojiStickerSetName, Long linkedChatId, ChatLocation location) {
        this.id = id;
        this.type = type;
        this.title = title;
        this.username = username;
        this.firstName = firstName;
        this.lastName = lastName;
        this.isForum = isForum;
        this.accentColorId = accentColorId;
        this.maxReactionCount = maxReactionCount;
        this.photo = photo;
        this.activeUsernames = activeUsernames;
        this.birthdate = birthdate;
        this.businessIntro = businessIntro;
        this.businessLocation = businessLocation;
        this.businessOpeningHours = businessOpeningHours;
        this.personalChat = personalChat;
        this.availableReactions = availableReactions;
        this.backgroundCustomEmojiId = backgroundCustomEmojiId;
        this.profileAccentColorId = profileAccentColorId;
        this.profileBackgroundCustomEmojiId = profileBackgroundCustomEmojiId;
        this.emojiStatusCustomEmojiId = emojiStatusCustomEmojiId;
        this.emojiStatusExpirationDate = emojiStatusExpirationDate;
        this.bio = bio;
        this.hasPrivateForwards = hasPrivateForwards;
        this.hasRestrictedVoiceAndVideoMessages = hasRestrictedVoiceAndVideoMessages;
        this.joinToSendMessages = joinToSendMessages;
        this.joinByRequest = joinByRequest;
        this.description = description;
        this.inviteLink = inviteLink;
        this.pinnedMessage = pinnedMessage;
        this.permissions = permissions;
        this.canSendPaidMedia = canSendPaidMedia;
        this.slowModeDelay = slowModeDelay;
        this.unrestrictBoostCount = unrestrictBoostCount;
        this.messageAutoDeleteTime = messageAutoDeleteTime;
        this.hasAggressiveAntiSpamEnabled = hasAggressiveAntiSpamEnabled;
        this.hasHiddenMembers = hasHiddenMembers;
        this.hasProtectedContent = hasProtectedContent;
        this.hasVisibleHistory = hasVisibleHistory;
        this.stickerSetName = stickerSetName;
        this.canSetStickerSet = canSetStickerSet;
        this.customEmojiStickerSetName = customEmojiStickerSetName;
        this.linkedChatId = linkedChatId;
        this.location = location;
    }
}

