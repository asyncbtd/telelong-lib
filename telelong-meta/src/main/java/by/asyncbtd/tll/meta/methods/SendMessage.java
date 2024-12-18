package by.asyncbtd.tll.meta.methods;

import by.asyncbtd.tll.meta.objects.LinkPreviewOptions;
import by.asyncbtd.tll.meta.objects.ReplyParameters;
import by.asyncbtd.tll.meta.objects.keyboard.reply.ReplyMarkup;
import by.asyncbtd.tll.meta.objects.message.MessageEntity;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SendMessage {

    @JsonProperty("business_connection_id")
    private String businessConnectionId;

    @JsonProperty("chat_id")
    private Long chatId;

    @JsonProperty("message_thread_id")
    private Integer messageThreadId;

    @JsonProperty("text")
    private String text;

    @JsonProperty("parse_mode")
    private String parseMode;

    @JsonProperty("entities")
    private List<MessageEntity> entities;

    @JsonProperty("link_preview_options")
    private LinkPreviewOptions linkPreviewOptions;

    @JsonProperty("disable_notification")
    private Boolean disableNotification;

    @JsonProperty("protect_content")
    private Boolean protectContent;

    @JsonProperty("allow_paid_broadcast")
    private Boolean allowPaidBroadcast;

    @JsonProperty("message_effect_id")
    private String messageEffectId;

    @JsonProperty("reply_parameters")
    private ReplyParameters replyParameters;

    @JsonProperty("reply_markup")
    private ReplyMarkup replyMarkup;

    public String getBusinessConnectionId() {
        return businessConnectionId;
    }

    public Long getChatId() {
        return chatId;
    }

    public Integer getMessageThreadId() {
        return messageThreadId;
    }

    public String getText() {
        return text;
    }

    public String getParseMode() {
        return parseMode;
    }

    public List<MessageEntity> getEntities() {
        return entities;
    }

    public LinkPreviewOptions getLinkPreviewOptions() {
        return linkPreviewOptions;
    }

    public Boolean getDisableNotification() {
        return disableNotification;
    }

    public Boolean getProtectContent() {
        return protectContent;
    }

    public Boolean getAllowPaidBroadcast() {
        return allowPaidBroadcast;
    }

    public String getMessageEffectId() {
        return messageEffectId;
    }

    public ReplyParameters getReplyParameters() {
        return replyParameters;
    }

    public ReplyMarkup getReplyMarkup() {
        return replyMarkup;
    }

    public void setBusinessConnectionId(String businessConnectionId) {
        this.businessConnectionId = businessConnectionId;
    }

    public void setChatId(Long chatId) {
        this.chatId = chatId;
    }

    public void setMessageThreadId(Integer messageThreadId) {
        this.messageThreadId = messageThreadId;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setParseMode(String parseMode) {
        this.parseMode = parseMode;
    }

    public void setEntities(List<MessageEntity> entities) {
        this.entities = entities;
    }

    public void setLinkPreviewOptions(LinkPreviewOptions linkPreviewOptions) {
        this.linkPreviewOptions = linkPreviewOptions;
    }

    public void setDisableNotification(Boolean disableNotification) {
        this.disableNotification = disableNotification;
    }

    public void setProtectContent(Boolean protectContent) {
        this.protectContent = protectContent;
    }

    public void setAllowPaidBroadcast(Boolean allowPaidBroadcast) {
        this.allowPaidBroadcast = allowPaidBroadcast;
    }

    public void setMessageEffectId(String messageEffectId) {
        this.messageEffectId = messageEffectId;
    }

    public void setReplyParameters(ReplyParameters replyParameters) {
        this.replyParameters = replyParameters;
    }

    public void setReplyMarkup(ReplyMarkup replyMarkup) {
        this.replyMarkup = replyMarkup;
    }

    @Override
    public String toString() {
        return "SendMessage(businessConnectionId=" + this.getBusinessConnectionId() +
                ", chatId=" + this.getChatId() +
                ", messageThreadId=" + this.getMessageThreadId() +
                ", text=" + this.getText() +
                ", parseMode=" + this.getParseMode() +
                ", entities=" + this.getEntities() +
                ", linkPreviewOptions=" + this.getLinkPreviewOptions() +
                ", disableNotification=" + this.getDisableNotification() +
                ", protectContent=" + this.getProtectContent() +
                ", allowPaidBroadcast=" + this.getAllowPaidBroadcast() +
                ", messageEffectId=" + this.getMessageEffectId() +
                ", replyParameters=" + this.getReplyParameters() +
                ", replyMarkup=" + this.getReplyMarkup() + ")";
    }

    public SendMessage() {
    }

    public SendMessage(String businessConnectionId, Long chatId, Integer messageThreadId, String text, String parseMode,
                       List<MessageEntity> entities, LinkPreviewOptions linkPreviewOptions, Boolean disableNotification,
                       Boolean protectContent, Boolean allowPaidBroadcast, String messageEffectId,
                       ReplyParameters replyParameters, ReplyMarkup replyMarkup) {
        this.businessConnectionId = businessConnectionId;
        this.chatId = chatId;
        this.messageThreadId = messageThreadId;
        this.text = text;
        this.parseMode = parseMode;
        this.entities = entities;
        this.linkPreviewOptions = linkPreviewOptions;
        this.disableNotification = disableNotification;
        this.protectContent = protectContent;
        this.allowPaidBroadcast = allowPaidBroadcast;
        this.messageEffectId = messageEffectId;
        this.replyParameters = replyParameters;
        this.replyMarkup = replyMarkup;
    }
}
