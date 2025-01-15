package by.asyncbtd.tll.meta.methods;

import by.asyncbtd.tll.meta.objects.InputFile;
import by.asyncbtd.tll.meta.objects.ReplyParameters;
import by.asyncbtd.tll.meta.objects.keyboard.ReplyMarkup;
import by.asyncbtd.tll.meta.objects.message.MessageEntity;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SendAnimation {

    @JsonProperty("business_connection_id")
    private String businessConnectionId;

    @JsonProperty("chat_id")
    private Integer chatId;

    @JsonProperty("message_thread_id")
    private Integer messageThreadId;

    @JsonProperty("animation")
    private InputFile animation;

    @JsonProperty("duration")
    private Integer duration;

    @JsonProperty("width")
    private Integer width;

    @JsonProperty("height")
    private Integer height;

    @JsonProperty("thumbnail")
    private InputFile thumbnail;

    @JsonProperty("caption")
    private String caption;

    @JsonProperty("parse_mode")
    private String parseMode;

    @JsonProperty("caption_entities")
    private List<MessageEntity> captionEntities;

    @JsonProperty("show_caption_above_media")
    private Boolean showCaptionAboveMedia;

    @JsonProperty("has_spoiler")
    private Boolean hasSpoiler;

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

    public Integer getChatId() {
        return chatId;
    }

    public Integer getMessageThreadId() {
        return messageThreadId;
    }

    public InputFile getAnimation() {
        return animation;
    }

    public Integer getDuration() {
        return duration;
    }

    public Integer getWidth() {
        return width;
    }

    public Integer getHeight() {
        return height;
    }

    public InputFile getThumbnail() {
        return thumbnail;
    }

    public String getCaption() {
        return caption;
    }

    public String getParseMode() {
        return parseMode;
    }

    public List<MessageEntity> getCaptionEntities() {
        return captionEntities;
    }

    public Boolean getShowCaptionAboveMedia() {
        return showCaptionAboveMedia;
    }

    public Boolean getHasSpoiler() {
        return hasSpoiler;
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

    public void setChatId(Integer chatId) {
        this.chatId = chatId;
    }

    public void setMessageThreadId(Integer messageThreadId) {
        this.messageThreadId = messageThreadId;
    }

    public void setAnimation(InputFile animation) {
        this.animation = animation;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public void setThumbnail(InputFile thumbnail) {
        this.thumbnail = thumbnail;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public void setParseMode(String parseMode) {
        this.parseMode = parseMode;
    }

    public void setCaptionEntities(List<MessageEntity> captionEntities) {
        this.captionEntities = captionEntities;
    }

    public void setShowCaptionAboveMedia(Boolean showCaptionAboveMedia) {
        this.showCaptionAboveMedia = showCaptionAboveMedia;
    }

    public void setHasSpoiler(Boolean hasSpoiler) {
        this.hasSpoiler = hasSpoiler;
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
        return "SendAnimation(businessConnectionId=" + this.getBusinessConnectionId() +
                ", chatId=" + this.getChatId() +
                ", messageThreadId=" + this.getMessageThreadId() +
                ", animation=" + this.getAnimation() +
                ", duration=" + this.getDuration() +
                ", width=" + this.getWidth() +
                ", height=" + this.getHeight() +
                ", thumbnail=" + this.getThumbnail() +
                ", caption=" + this.getCaption() +
                ", parseMode=" + this.getParseMode() +
                ", captionEntities=" + this.getCaptionEntities() +
                ", showCaptionAboveMedia=" + this.getShowCaptionAboveMedia() +
                ", hasSpoiler=" + this.getHasSpoiler() +
                ", disableNotification=" + this.getDisableNotification() +
                ", protectContent=" + this.getProtectContent() +
                ", allowPaidBroadcast=" + this.getAllowPaidBroadcast() +
                ", messageEffectId=" + this.getMessageEffectId() +
                ", replyParameters=" + this.getReplyParameters() +
                ", replyMarkup=" + this.getReplyMarkup() + ")";
    }

    public SendAnimation() {
    }

    public SendAnimation(String businessConnectionId, Integer chatId, Integer messageThreadId, InputFile animation, Integer duration,
                         Integer width, Integer height, InputFile thumbnail, String caption, String parseMode, List<MessageEntity> captionEntities,
                         Boolean showCaptionAboveMedia, Boolean hasSpoiler, Boolean disableNotification, Boolean protectContent,
                         Boolean allowPaidBroadcast, String messageEffectId, ReplyParameters replyParameters, ReplyMarkup replyMarkup) {
        this.businessConnectionId = businessConnectionId;
        this.chatId = chatId;
        this.messageThreadId = messageThreadId;
        this.animation = animation;
        this.duration = duration;
        this.width = width;
        this.height = height;
        this.thumbnail = thumbnail;
        this.caption = caption;
        this.parseMode = parseMode;
        this.captionEntities = captionEntities;
        this.showCaptionAboveMedia = showCaptionAboveMedia;
        this.hasSpoiler = hasSpoiler;
        this.disableNotification = disableNotification;
        this.protectContent = protectContent;
        this.allowPaidBroadcast = allowPaidBroadcast;
        this.messageEffectId = messageEffectId;
        this.replyParameters = replyParameters;
        this.replyMarkup = replyMarkup;
    }
}
