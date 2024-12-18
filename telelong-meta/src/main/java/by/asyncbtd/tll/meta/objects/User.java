package by.asyncbtd.tll.meta.objects;

import com.fasterxml.jackson.annotation.JsonProperty;

public class User {

    /**
     * Unique identifier for this user or bot. This number may have more than 32 significant bits and some programming
     * languages may have difficulty/silent defects in interpreting it. But it has at most 52 significant bits,
     * so a 64-bit integer or double-precision float type are safe for storing this identifier. */
    @JsonProperty("id")
    private Integer id;

    @JsonProperty("is_bot")
    private Boolean isBot;

    @JsonProperty("first_name")
    private String firstName;

    @JsonProperty("last_name")
    private String lastName;

    @JsonProperty("username")
    private String username;

    @JsonProperty("language_code")
    private String languageCode;

    @JsonProperty("is_premium")
    private Boolean isPremium;

    @JsonProperty("added_to_attachment_menu")
    private Boolean addedToAttachmentMenu;

    @JsonProperty("can_join_groups")
    private Boolean canJoinGroups;

    @JsonProperty("can_read_all_group_messages")
    private Boolean canReadAllGroupMessages;

    @JsonProperty("supports_inline_queries")
    private Boolean supportsInlineQueries;

    @JsonProperty("can_connect_to_business")
    private Boolean canConnectToBusiness;

    @JsonProperty("has_main_web_app")
    private Boolean hasMainWebApp;

    public Integer getId() {
        return this.id;
    }

    public Boolean getIsBot() {
        return this.isBot;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getUsername() {
        return this.username;
    }

    public String getLanguageCode() {
        return this.languageCode;
    }

    public Boolean getIsPremium() {
        return this.isPremium;
    }

    public Boolean getAddedToAttachmentMenu() {
        return this.addedToAttachmentMenu;
    }

    public Boolean getCanJoinGroups() {
        return this.canJoinGroups;
    }

    public Boolean getCanReadAllGroupMessages() {
        return this.canReadAllGroupMessages;
    }

    private Boolean getSupportsInlineQueries() {
        return this.supportsInlineQueries;
    }

    private Boolean getCanConnectToBusiness() {
        return this.canConnectToBusiness;
    }

    private Boolean getHasMainWebApp() {
        return this.hasMainWebApp;
    }

    public void setId(Integer id) {
        if (id == null) {
            throw new NullPointerException("id cannot be empty");
        } else {
            this.id = id;
        }
    }

    public void setIsBot(Boolean isBot) {
        if (isBot == null) {
            throw new NullPointerException("isBot cannot be empty");
        } else {
            this.isBot = isBot;
        }
    }

    public void setFirstName(String firstName) {
        if (firstName == null) {
            throw new NullPointerException("firstName cannot be empty");
        } else {
            this.firstName = firstName;
        }
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    public void setIsPremium(Boolean isPremium) {
        this.isPremium = isPremium;
    }

    public void setAddedToAttachmentMenu(Boolean addedToAttachmentMenu) {
        this.addedToAttachmentMenu = addedToAttachmentMenu;
    }

    public void setCanJoinGroups(Boolean canJoinGroups) {
        this.canJoinGroups = canJoinGroups;
    }

    public void setCanReadAllGroupMessages(Boolean canReadAllGroupMessages) {
        this.canReadAllGroupMessages = canReadAllGroupMessages;
    }

    public void setSupportsInlineQueries(Boolean supportsInlineQueries) {
        this.supportsInlineQueries = supportsInlineQueries;
    }

    public void setCanConnectToBusiness(Boolean canConnectToBusiness) {
        this.canConnectToBusiness = canConnectToBusiness;
    }

    public void setHasMainWebApp(Boolean hasMainWebApp) {
        this.hasMainWebApp = hasMainWebApp;
    }

    public String toString() {
        return "User(id=" + this.getId() +
                ", isBot=" + this.getIsBot() +
                ", firstName=" + this.getFirstName() +
                ", lastName=" + this.getLastName() +
                ", username=" + this.getUsername() +
                ", languageCode=" + this.getLanguageCode() +
                ", isPremium=" + this.getIsPremium() +
                ", addedToAttachmentMenu=" + this.getAddedToAttachmentMenu() +
                ", canJoinGroups=" + this.getCanJoinGroups() +
                ", canReadAllGroupMessages=" + this.getCanReadAllGroupMessages() +
                ", supportsInlineQueries=" + this.getSupportsInlineQueries() +
                ", canConnectToBusiness=" + this.getCanConnectToBusiness() +
                ", hasMainWebApp=" + this.getHasMainWebApp() + ")";
    }

    public User() {
    }

    public User(Integer id, Boolean isBot, String firstName) {
        this.id = id;
        this.isBot = isBot;
        this.firstName = firstName;
    }

    public User(Integer id, Boolean isBot, String firstName, String lastName, String username, String languageCode, Boolean isPremium,
                Boolean addedToAttachmentMenu, Boolean canJoinGroups, Boolean canReadAllGroupMessages, Boolean supportsInlineQueries,
                Boolean canConnectToBusiness, Boolean hasMainWebApp) {
        this.id = id;
        this.isBot = isBot;
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.languageCode = languageCode;
        this.isPremium = isPremium;
        this.addedToAttachmentMenu = addedToAttachmentMenu;
        this.canJoinGroups = canJoinGroups;
        this.canReadAllGroupMessages = canReadAllGroupMessages;
        this.supportsInlineQueries = supportsInlineQueries;
        this.canConnectToBusiness = canConnectToBusiness;
        this.hasMainWebApp = hasMainWebApp;
    }
}
