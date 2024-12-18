package by.asyncbtd.tll.meta.objects;

import by.asyncbtd.tll.meta.objects.chat.Chat;
import by.asyncbtd.tll.meta.objects.game.Game;
import by.asyncbtd.tll.meta.objects.giveaway.Giveaway;
import by.asyncbtd.tll.meta.objects.giveaway.GiveawayWinners;
import by.asyncbtd.tll.meta.objects.message.MessageOrigin;
import by.asyncbtd.tll.meta.objects.paid.PaidMediaInfo;
import by.asyncbtd.tll.meta.objects.poll.Poll;
import by.asyncbtd.tll.meta.objects.video.Video;
import by.asyncbtd.tll.meta.objects.video.VideoNote;

import java.util.List;

public class ExternalReplyInfo {

    private MessageOrigin origin;
    private Chat chat;
    private Long messageId;
    private LinkPreviewOptions linkPreviewOptions;
    private Animation animation;
    private Audio audio;
    private Document document;
    private PaidMediaInfo paidMedia;
    private List<PhotoSize> photo;
    private Sticker sticker;
    private Story story;
    private Video video;
    private VideoNote videoNote;
    private Voice voice;
    private Boolean hasMediaSpoiler;
    private Contact contact;
    private Dice dice;
    private Game game;
    private Giveaway giveaway;
    private GiveawayWinners giveawayWinners;
    private Invoice invoice;
    private Location location;
    private Poll poll;
    private Venue venue;

    public MessageOrigin getOrigin() {
        return origin;
    }

    public Chat getChat() {
        return chat;
    }

    public Long getMessageId() {
        return messageId;
    }

    public LinkPreviewOptions getLinkPreviewOptions() {
        return linkPreviewOptions;
    }

    public Animation getAnimation() {
        return animation;
    }

    public Audio getAudio() {
        return audio;
    }

    public Document getDocument() {
        return document;
    }

    public PaidMediaInfo getPaidMedia() {
        return paidMedia;
    }

    public List<PhotoSize> getPhoto() {
        return photo;
    }

    public Sticker getSticker() {
        return sticker;
    }

    public Story getStory() {
        return story;
    }

    public Video getVideo() {
        return video;
    }

    public VideoNote getVideoNote() {
        return videoNote;
    }

    public Voice getVoice() {
        return voice;
    }

    public Boolean getHasMediaSpoiler() {
        return hasMediaSpoiler;
    }

    public Contact getContact() {
        return contact;
    }

    public Dice getDice() {
        return dice;
    }

    public Game getGame() {
        return game;
    }

    public Giveaway getGiveaway() {
        return giveaway;
    }

    public GiveawayWinners getGiveawayWinners() {
        return giveawayWinners;
    }

    public Invoice getInvoice() {
        return invoice;
    }

    public Location getLocation() {
        return location;
    }

    public Poll getPoll() {
        return poll;
    }

    public Venue getVenue() {
        return venue;
    }

    public void setOrigin(MessageOrigin origin) {
        this.origin = origin;
    }

    public void setChat(Chat chat) {
        this.chat = chat;
    }

    public void setMessageId(Long messageId) {
        this.messageId = messageId;
    }

    public void setLinkPreviewOptions(LinkPreviewOptions linkPreviewOptions) {
        this.linkPreviewOptions = linkPreviewOptions;
    }

    public void setAnimation(Animation animation) {
        this.animation = animation;
    }

    public void setAudio(Audio audio) {
        this.audio = audio;
    }

    public void setDocument(Document document) {
        this.document = document;
    }

    public void setPaidMedia(PaidMediaInfo paidMedia) {
        this.paidMedia = paidMedia;
    }

    public void setPhoto(List<PhotoSize> photo) {
        this.photo = photo;
    }

    public void setSticker(Sticker sticker) {
        this.sticker = sticker;
    }

    public void setStory(Story story) {
        this.story = story;
    }

    public void setVideo(Video video) {
        this.video = video;
    }

    public void setVideoNote(VideoNote videoNote) {
        this.videoNote = videoNote;
    }

    public void setVoice(Voice voice) {
        this.voice = voice;
    }

    public void setHasMediaSpoiler(Boolean hasMediaSpoiler) {
        this.hasMediaSpoiler = hasMediaSpoiler;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public void setDice(Dice dice) {
        this.dice = dice;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public void setGiveaway(Giveaway giveaway) {
        this.giveaway = giveaway;
    }

    public void setGiveawayWinners(GiveawayWinners giveawayWinners) {
        this.giveawayWinners = giveawayWinners;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public void setPoll(Poll poll) {
        this.poll = poll;
    }

    public void setVenue(Venue venue) {
        this.venue = venue;
    }

    public String toString() {
        return "ExternalReplyInfo(origin=" + this.getOrigin() +
                ", chat=" + this.getChat() +
                ", messageId=" + this.getMessageId() +
                ", linkPreviewOptions=" + this.getLinkPreviewOptions() +
                ", animation=" + this.getAnimation() +
                ", audio=" + this.getAudio() +
                ", document=" + this.getDocument() +
                ", paidMedia=" + this.getPaidMedia() +
                ", photo=" + this.getPhoto() +
                ", sticker=" + this.getSticker() +
                ", story=" + this.getStory() +
                ", video=" + this.getVideo() +
                ", videoNote=" + this.getVideoNote() +
                ", voice=" + this.getVoice() +
                ", hasMediaSpoiler=" + this.getHasMediaSpoiler() +
                ", contact=" + this.getContact() +
                ", dice=" + this.getDice() +
                ", game=" + this.getGame() +
                ", giveaway=" + this.getGiveaway() +
                ", giveawayWinners=" + this.getGiveawayWinners() +
                ", invoice=" + this.getInvoice() +
                ", location=" + this.getLocation() +
                ", poll=" + this.getPoll() +
                ", venue=" + this.getVenue() + ")";
    }

    public ExternalReplyInfo() {
    }

    public ExternalReplyInfo(MessageOrigin origin, Chat chat, Long messageId, LinkPreviewOptions linkPreviewOptions, Animation animation, Audio audio, Document document,
                             PaidMediaInfo paidMedia, List<PhotoSize> photo, Sticker sticker, Story story, Video video, VideoNote videoNote, Voice voice,
                             Boolean hasMediaSpoiler, Contact contact, Dice dice, Game game, Giveaway giveaway, GiveawayWinners giveawayWinners, Invoice invoice,
                             Location location, Poll poll, Venue venue) {
        this.origin = origin;
        this.chat = chat;
        this.messageId = messageId;
        this.linkPreviewOptions = linkPreviewOptions;
        this.animation = animation;
        this.audio = audio;
        this.document = document;
        this.paidMedia = paidMedia;
        this.photo = photo;
        this.sticker = sticker;
        this.story = story;
        this.video = video;
        this.videoNote = videoNote;
        this.voice = voice;
        this.hasMediaSpoiler = hasMediaSpoiler;
        this.contact = contact;
        this.dice = dice;
        this.game = game;
        this.giveaway = giveaway;
        this.giveawayWinners = giveawayWinners;
        this.invoice = invoice;
        this.location = location;
        this.poll = poll;
        this.venue = venue;
    }
}
