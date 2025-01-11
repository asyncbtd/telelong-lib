package by.asyncbtd.tll.meta.methods;

import by.asyncbtd.tll.meta.objects.ReplyParameters;
import by.asyncbtd.tll.meta.objects.keyboard.reply.ReplyKeyboard;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SendDice {

    private static final List<String> VALID_EMOJI = Collections.unmodifiableList(Arrays.asList("🎲", "🎯", "🏀", "⚽", "🎳", "🎰"));

    @JsonProperty("business_connection_id")
    private String businessConnectionId;

    @JsonProperty("chat_id")
    private Long chatId;

    @JsonProperty("message_thread_id")
    private Integer messageThreadId;

    @JsonProperty("emoji")
    private String emoji;

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
    private ReplyKeyboard replyMarkup;

    public String getBusinessConnectionId() {
        return businessConnectionId;
    }

    public Long getChatId() {
        return chatId;
    }

    public Integer getMessageThreadId() {
        return messageThreadId;
    }

    public String getEmoji() {
        return emoji;
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

    public ReplyKeyboard getReplyMarkup() {
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

    public void setEmoji(String emoji) {
        this.emoji = emoji;
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

    public void setReplyMarkup(ReplyKeyboard replyMarkup) {
        this.replyMarkup = replyMarkup;
    }

    @Override
    public String toString() {
        return "SendDice(businessConnectionId=" + this.getBusinessConnectionId() +
                ", chatId=" + this.getChatId() +
                ", messageThreadId=" + this.getMessageThreadId() +
                ", emoji=" + this.getEmoji() +
                ", disableNotification=" + this.getDisableNotification() +
                ", protectContent=" + this.getProtectContent() +
                ", allowPaidBroadcast=" + this.getAllowPaidBroadcast() +
                ", messageEffectId=" + this.getMessageEffectId() +
                ", replyParameters=" + this.getReplyParameters() +
                ", replyMarkup=" + this.getReplyMarkup() + ")";
    }
}
