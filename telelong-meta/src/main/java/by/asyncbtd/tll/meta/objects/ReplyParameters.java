package by.asyncbtd.tll.meta.objects;

import by.asyncbtd.tll.meta.objects.message.MessageEntity;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ReplyParameters {

    @JsonProperty("message_id")
    private Integer messageId;

    @JsonProperty("chat_id")
    private Long chatId;

    @JsonProperty("allow_sending_without_reply")
    private Boolean allowSendingWithoutReply;

    @JsonProperty("quote")
    private String quote;

    @JsonProperty("quote_parse_mode")
    private String quoteParseMode;

    @JsonProperty("quote_entities")
    private List<MessageEntity> quoteEntities;

    @JsonProperty("quote_position")
    private Integer quotePosition;

    public Integer getMessageId() {
        return messageId;
    }

    public Long getChatId() {
        return chatId;
    }

    public Boolean getAllowSendingWithoutReply() {
        return allowSendingWithoutReply;
    }

    public String getQuote() {
        return quote;
    }

    public String getQuoteParseMode() {
        return quoteParseMode;
    }

    public List<MessageEntity> getQuoteEntities() {
        return quoteEntities;
    }

    public Integer getQuotePosition() {
        return quotePosition;
    }

    public void setMessageId(Integer messageId) {
        this.messageId = messageId;
    }

    public void setChatId(Long chatId) {
        this.chatId = chatId;
    }

    public void setAllowSendingWithoutReply(Boolean allowSendingWithoutReply) {
        this.allowSendingWithoutReply = allowSendingWithoutReply;
    }

    public void setQuote(String quote) {
        this.quote = quote;
    }

    public void setQuoteParseMode(String quoteParseMode) {
        this.quoteParseMode = quoteParseMode;
    }

    public void setQuoteEntities(List<MessageEntity> quoteEntities) {
        this.quoteEntities = quoteEntities;
    }

    public void setQuotePosition(Integer quotePosition) {
        this.quotePosition = quotePosition;
    }

    public String toString() {
        return "ReplyParameters(messageId=" + this.getMessageId() +
                ", chatId=" + this.getChatId() +
                ", allowSendingWithoutReply=" + this.getAllowSendingWithoutReply() +
                ", quote=" + this.getQuote() +
                ", quoteParseMode=" + this.getQuoteParseMode() +
                ", quoteEntities=" + this.getQuoteEntities() +
                ", quotePosition=" + this.getQuotePosition() + ")";
    }

    public ReplyParameters() {
    }

    public ReplyParameters(Integer messageId, Long chatId, Boolean allowSendingWithoutReply, String quote, String quoteParseMode,
                           List<MessageEntity> quoteEntities, Integer quotePosition) {
        this.messageId = messageId;
        this.chatId = chatId;
        this.allowSendingWithoutReply = allowSendingWithoutReply;
        this.quote = quote;
        this.quoteParseMode = quoteParseMode;
        this.quoteEntities = quoteEntities;
        this.quotePosition = quotePosition;
    }
}
