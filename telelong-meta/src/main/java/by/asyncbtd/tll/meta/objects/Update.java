package by.asyncbtd.tll.meta.objects;

import by.asyncbtd.tll.meta.objects.business.BusinessConnection;
import by.asyncbtd.tll.meta.objects.business.BusinessMessagesDeleted;
import by.asyncbtd.tll.meta.objects.chat.ChatJoinRequest;
import by.asyncbtd.tll.meta.objects.chat.boost.ChatBoostRemoved;
import by.asyncbtd.tll.meta.objects.chat.member.ChatMemberUpdated;
import by.asyncbtd.tll.meta.objects.chat.boost.ChatBoostUpdated;
import by.asyncbtd.tll.meta.objects.message.Message;
import by.asyncbtd.tll.meta.objects.paid.PaidMediaPurchased;
import by.asyncbtd.tll.meta.objects.poll.Poll;
import by.asyncbtd.tll.meta.objects.poll.PollAnswer;
import by.asyncbtd.tll.meta.objects.reaction.MessageReactionUpdated;
import by.asyncbtd.tll.meta.objects.reaction.MessageReactionCountUpdated;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Update {

    @JsonProperty("update_id")
    private Integer updateId;

    @JsonProperty("message")
    private Message message;

    @JsonProperty("edited_message")
    private Message editedMessage;

    @JsonProperty("channel_post")
    private Message channelPost;

    @JsonProperty("edited_channel_post")
    private Message editedChannelPost;

    @JsonProperty("business_connection")
    private BusinessConnection businessConnection;

    @JsonProperty("business_message")
    private Message businessMessage;

    @JsonProperty("edited_business_message")
    private Message editedBusinessMessage;

    @JsonProperty("deleted_business_messages")
    private BusinessMessagesDeleted deletedBusinessMessages;

    @JsonProperty("message_reaction")
    private MessageReactionUpdated messageReaction;

    @JsonProperty("message_reaction_count")
    private MessageReactionCountUpdated messageReactionCountUpdated;

    @JsonProperty("inline_query")
    private InlineQuery inlineQuery;

    @JsonProperty("chosen_inline_result")
    private ChosenInlineResult chosenInlineResult;

    @JsonProperty("callback_query")
    private CallbackQuery callbackQuery;

    @JsonProperty("shipping_query")
    private ShippingQuery shippingQuery;

    @JsonProperty("pre_checkout_query")
    private PreCheckoutQuery preCheckoutQuery;

    @JsonProperty("purchased_paid_media")
    private PaidMediaPurchased purchasedPaidMedia;

    @JsonProperty("poll")
    private Poll poll;

    @JsonProperty("poll_answer")
    private PollAnswer pollAnswer;

    @JsonProperty("my_chat_member")
    private ChatMemberUpdated myChatMember;

    @JsonProperty("chat_member")
    private ChatMemberUpdated chatMember;

    @JsonProperty("chat_join_request")
    private ChatJoinRequest chatJoinRequest;

    @JsonProperty("chat_boost")
    private ChatBoostUpdated chatBoost;

    @JsonProperty("removed_chat_boost")
    private ChatBoostRemoved removedChatBoost;

    public Integer getUpdateId() {
        return updateId;
    }

    public Message getMessage() {
        return message;
    }

    public Message getEditedMessage() {
        return editedMessage;
    }

    public Message getChannelPost() {
        return channelPost;
    }

    public Message getEditedChannelPost() {
        return editedChannelPost;
    }

    public BusinessConnection getBusinessConnection() {
        return businessConnection;
    }

    public Message getBusinessMessage() {
        return businessMessage;
    }

    public Message getEditedBusinessMessage() {
        return editedBusinessMessage;
    }

    public BusinessMessagesDeleted getDeletedBusinessMessages() {
        return deletedBusinessMessages;
    }

    public MessageReactionUpdated getMessageReaction() {
        return messageReaction;
    }

    public MessageReactionCountUpdated getMessageReactionCountUpdated() {
        return messageReactionCountUpdated;
    }

    public InlineQuery getInlineQuery() {
        return inlineQuery;
    }

    public ChosenInlineResult getChosenInlineResult() {
        return chosenInlineResult;
    }

    public CallbackQuery getCallbackQuery() {
        return callbackQuery;
    }

    public ShippingQuery getShippingQuery() {
        return shippingQuery;
    }

    public PreCheckoutQuery getPreCheckoutQuery() {
        return preCheckoutQuery;
    }

    public PaidMediaPurchased getPurchasedPaidMedia() {
        return purchasedPaidMedia;
    }

    public Poll getPoll() {
        return poll;
    }

    public PollAnswer getPollAnswer() {
        return pollAnswer;
    }

    public ChatMemberUpdated getMyChatMember() {
        return myChatMember;
    }

    public ChatMemberUpdated getChatMember() {
        return chatMember;
    }

    public ChatJoinRequest getChatJoinRequest() {
        return chatJoinRequest;
    }

    public ChatBoostUpdated getChatBoost() {
        return chatBoost;
    }

    public ChatBoostRemoved getRemovedChatBoost() {
        return removedChatBoost;
    }

    public void setUpdateId(Integer updateId) {
        this.updateId = updateId;
    }

    public void setMessage(Message message) {
        this.message = message;
    }

    public void setEditedMessage(Message editedMessage) {
        this.editedMessage = editedMessage;
    }

    public void setChannelPost(Message channelPost) {
        this.channelPost = channelPost;
    }

    public void setEditedChannelPost(Message editedChannelPost) {
        this.editedChannelPost = editedChannelPost;
    }

    public void setBusinessConnection(BusinessConnection businessConnection) {
        this.businessConnection = businessConnection;
    }

    public void setBusinessMessage(Message businessMessage) {
        this.businessMessage = businessMessage;
    }

    public void setEditedBusinessMessage(Message editedBusinessMessage) {
        this.editedBusinessMessage = editedBusinessMessage;
    }

    public void setDeletedBusinessMessages(BusinessMessagesDeleted deletedBusinessMessages) {
        this.deletedBusinessMessages = deletedBusinessMessages;
    }

    public void setMessageReaction(MessageReactionUpdated messageReaction) {
        this.messageReaction = messageReaction;
    }

    public void setMessageReactionCountUpdated(MessageReactionCountUpdated messageReactionCountUpdated) {
        this.messageReactionCountUpdated = messageReactionCountUpdated;
    }

    public void setInlineQuery(InlineQuery inlineQuery) {
        this.inlineQuery = inlineQuery;
    }

    public void setChosenInlineResult(ChosenInlineResult chosenInlineResult) {
        this.chosenInlineResult = chosenInlineResult;
    }

    public void setCallbackQuery(CallbackQuery callbackQuery) {
        this.callbackQuery = callbackQuery;
    }

    public void setShippingQuery(ShippingQuery shippingQuery) {
        this.shippingQuery = shippingQuery;
    }

    public void setPreCheckoutQuery(PreCheckoutQuery preCheckoutQuery) {
        this.preCheckoutQuery = preCheckoutQuery;
    }

    public void setPurchasedPaidMedia(PaidMediaPurchased purchasedPaidMedia) {
        this.purchasedPaidMedia = purchasedPaidMedia;
    }

    public void setPoll(Poll poll) {
        this.poll = poll;
    }

    public void setPollAnswer(PollAnswer pollAnswer) {
        this.pollAnswer = pollAnswer;
    }

    public void setMyChatMember(ChatMemberUpdated myChatMember) {
        this.myChatMember = myChatMember;
    }

    public void setChatMember(ChatMemberUpdated chatMember) {
        this.chatMember = chatMember;
    }

    public void setChatJoinRequest(ChatJoinRequest chatJoinRequest) {
        this.chatJoinRequest = chatJoinRequest;
    }

    public void setChatBoost(ChatBoostUpdated chatBoost) {
        this.chatBoost = chatBoost;
    }

    public void setRemovedChatBoost(ChatBoostRemoved removedChatBoost) {
        this.removedChatBoost = removedChatBoost;
    }

    public String toString() {
        return "Update(updateId=" + this.getUpdateId() +
                ", message=" + this.getMessage() +
                ", editedMessage=" + this.getEditedMessage() +
                ", channelPost=" + this.getChannelPost() +
                ", editedChannelPost=" + this.getEditedChannelPost() +
                ", businessConnection=" + this.getBusinessConnection() +
                ", businessMessage=" + this.getBusinessMessage() +
                ", editedBusinessMessage=" + this.getEditedBusinessMessage() +
                ", deletedBusinessMessages=" + this.getDeletedBusinessMessages() +
                ", messageReaction=" + this.getMessageReaction() +
                ", messageReactionCountUpdated=" + this.getMessageReactionCountUpdated() +
                ", inlineQuery=" + this.getInlineQuery() +
                ", chosenInlineResult=" + this.getChosenInlineResult() +
                ", callbackQuery=" + this.getCallbackQuery() +
                ", shippingQuery=" + this.getShippingQuery() +
                ", preCheckoutQuery=" + this.getPreCheckoutQuery() +
                ", purchasedPaidMedia=" + this.getPurchasedPaidMedia() +
                ", poll=" + this.getPoll() +
                ", pollAnswer=" + this.getPollAnswer() +
                ", myChatMember=" + this.getMyChatMember() +
                ", chatMember=" + this.getChatMember() +
                ", chatJoinRequest=" + this.getChatJoinRequest() +
                ", chatBoost=" + this.getChatBoost() +
                ", removedChatBoost=" + this.getRemovedChatBoost() + ")";
    }

    public Update() {
    }

    public Update(Integer updateId, Message message, Message editedMessage, Message channelPost, Message editedChannelPost, BusinessConnection businessConnection,
                  Message businessMessage, Message editedBusinessMessage, BusinessMessagesDeleted deletedBusinessMessages, MessageReactionUpdated messageReaction,
                  MessageReactionCountUpdated messageReactionCountUpdated, InlineQuery inlineQuery, ChosenInlineResult chosenInlineResult, CallbackQuery callbackQuery,
                  ShippingQuery shippingQuery, PreCheckoutQuery preCheckoutQuery, PaidMediaPurchased purchasedPaidMedia, Poll poll, PollAnswer pollAnswer,
                  ChatMemberUpdated myChatMember, ChatMemberUpdated chatMember, ChatJoinRequest chatJoinRequest, ChatBoostUpdated chatBoost, ChatBoostRemoved removedChatBoost) {
        this.updateId = updateId;
        this.message = message;
        this.editedMessage = editedMessage;
        this.channelPost = channelPost;
        this.editedChannelPost = editedChannelPost;
        this.businessConnection = businessConnection;
        this.businessMessage = businessMessage;
        this.editedBusinessMessage = editedBusinessMessage;
        this.deletedBusinessMessages = deletedBusinessMessages;
        this.messageReaction = messageReaction;
        this.messageReactionCountUpdated = messageReactionCountUpdated;
        this.inlineQuery = inlineQuery;
        this.chosenInlineResult = chosenInlineResult;
        this.callbackQuery = callbackQuery;
        this.shippingQuery = shippingQuery;
        this.preCheckoutQuery = preCheckoutQuery;
        this.purchasedPaidMedia = purchasedPaidMedia;
        this.poll = poll;
        this.pollAnswer = pollAnswer;
        this.myChatMember = myChatMember;
        this.chatMember = chatMember;
        this.chatJoinRequest = chatJoinRequest;
        this.chatBoost = chatBoost;
        this.removedChatBoost = removedChatBoost;
    }
}
