package by.asyncbtd.tll.meta.objects;

import java.io.File;

public class Sticker {

    private String fileId;
    private String fileUniqueId;
    private String type;
    private Integer width;
    private Integer height;
    private Boolean isAnimated;
    private Boolean isVideo;
    private PhotoSize thumbnail;
    private String emoji;
    private String setName;
    private File premiumAnimation;
    private MaskPosition maskPosition;
    private String customEmojiId;
    private Boolean needsRepainting;
    private Integer fileSize;

    public String getFileId() {
        return fileId;
    }

    public String getFileUniqueId() {
        return fileUniqueId;
    }

    public String getType() {
        return type;
    }

    public Integer getWidth() {
        return width;
    }

    public Integer getHeight() {
        return height;
    }

    public Boolean getIsAnimated() {
        return isAnimated;
    }

    public Boolean getIsVideo() {
        return isVideo;
    }

    public PhotoSize getThumbnail() {
        return thumbnail;
    }

    public String getEmoji() {
        return emoji;
    }

    public String getSetName() {
        return setName;
    }

    public File getPremiumAnimation() {
        return premiumAnimation;
    }

    public MaskPosition getMaskPosition() {
        return maskPosition;
    }

    public String getCustomEmojiId() {
        return customEmojiId;
    }

    public Boolean getNeedsRepainting() {
        return needsRepainting;
    }

    public Integer getFileSize() {
        return fileSize;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId;
    }

    public void setFileUniqueId(String fileUniqueId) {
        this.fileUniqueId = fileUniqueId;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public void setIsAnimated(Boolean animated) {
        isAnimated = animated;
    }

    public void setIsVideo(Boolean video) {
        isVideo = video;
    }

    public void setThumbnail(PhotoSize thumbnail) {
        this.thumbnail = thumbnail;
    }

    public void setEmoji(String emoji) {
        this.emoji = emoji;
    }

    public void setSet_name(String set_name) {
        this.setName = set_name;
    }

    public void setPremiumAnimation(File premiumAnimation) {
        this.premiumAnimation = premiumAnimation;
    }

    public void setMaskPosition(MaskPosition maskPosition) {
        this.maskPosition = maskPosition;
    }

    public void setCustomEmojiId(String customEmojiId) {
        this.customEmojiId = customEmojiId;
    }

    public void setNeedsRepainting(Boolean needsRepainting) {
        this.needsRepainting = needsRepainting;
    }

    public void setFileSize(Integer fileSize) {
        this.fileSize = fileSize;
    }

    public String toSring() {
        return "Sticker(fileId=" + this.getFileId() +
                ", fileUniqueId=" + this.getFileUniqueId() +
                ", type=" + this.getType() +
                ", width=" + this.getWidth() +
                ", height=" + this.getHeight() +
                ", isAnimated=" + this.getIsAnimated() +
                ", isVideo=" + this.getIsVideo() +
                ", thumbnail=" + this.getThumbnail() +
                ", emoji=" + this.getEmoji() +
                ", setName=" + this.getSetName() +
                ", premiumAnimation=" + this.getPremiumAnimation() +
                ", maskPosition=" + this.getMaskPosition() +
                ", customEmojiId=" + this.getCustomEmojiId() +
                ", needsRepainting=" + this.getNeedsRepainting() +
                ", fileSize=" + this.getFileSize() + ")";
    }

    public Sticker() {
    }

    public Sticker(String fileId, String fileUniqueId, String type, Integer width, Integer height, Boolean isAnimated, Boolean isVideo, PhotoSize thumbnail, String emoji,
                   String setName, File premiumAnimation, MaskPosition maskPosition, String customEmojiId, Boolean needsRepainting, Integer fileSize) {
        this.fileId = fileId;
        this.fileUniqueId = fileUniqueId;
        this.type = type;
        this.width = width;
        this.height = height;
        this.isAnimated = isAnimated;
        this.isVideo = isVideo;
        this.thumbnail = thumbnail;
        this.emoji = emoji;
        this.setName = setName;
        this.premiumAnimation = premiumAnimation;
        this.maskPosition = maskPosition;
        this.customEmojiId = customEmojiId;
        this.needsRepainting = needsRepainting;
        this.fileSize = fileSize;
    }
}
