package by.asyncbtd.tll.meta.methods;

import by.asyncbtd.tll.meta.objects.LinkPreviewOptions;
import by.asyncbtd.tll.meta.objects.keyboard.inline.InlineKeyboardMarkup;
import by.asyncbtd.tll.meta.objects.message.MessageEntity;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class EditMessageText {

    @JsonProperty("business_connection_id")
    private String businessConnectionId;

    @JsonProperty("chat_id")
    private Long chatId;

    @JsonProperty("message_id")
    private Integer messageId;

    @JsonProperty("inline_message_id")
    private String inlineMessageId;

    @JsonProperty("text")
    private String text;

    @JsonProperty("parse_mode")
    private String parseMode;

    @JsonProperty("entities")
    private List<MessageEntity> entities;

    @JsonProperty("link_preview_options")
    private LinkPreviewOptions linkPreviewOptions;

    @JsonProperty("reply_markup")
    private InlineKeyboardMarkup replyMarkup;

    public String getBusinessConnectionId() {
        return businessConnectionId;
    }

    public Long getChatId() {
        return chatId;
    }

    public Integer getMessageId() {
        return messageId;
    }

    public String getInlineMessageId() {
        return inlineMessageId;
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

    public InlineKeyboardMarkup getReplyMarkup() {
        return replyMarkup;
    }

    public void setBusinessConnectionId(String businessConnectionId) {
        this.businessConnectionId = businessConnectionId;
    }

    public void setChatId(Long chatId) {
        this.chatId = chatId;
    }

    public void setMessageId(Integer messageId) {
        this.messageId = messageId;
    }

    public void setInlineMessageId(String inlineMessageId) {
        this.inlineMessageId = inlineMessageId;
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

    public void setReplyMarkup(InlineKeyboardMarkup replyMarkup) {
        this.replyMarkup = replyMarkup;
    }

    @Override
    public String toString() {
        return "EditMessageText(businessConnectionId=" + this.getBusinessConnectionId() +
                ", chatId=" + this.getChatId() +
                ", messageId=" + this.getMessageId() +
                ", inlineMessageId=" + this.getInlineMessageId() +
                ", text=" + this.getText() +
                ", parseMode=" + this.getParseMode() +
                ", entities=" + this.getEntities() +
                ", linkPreviewOptions=" + this.getLinkPreviewOptions() +
                ", replyMarkup=" + this.getReplyMarkup() + ")";
    }
}
