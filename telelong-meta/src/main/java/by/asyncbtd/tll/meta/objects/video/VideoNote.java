package by.asyncbtd.tll.meta.objects.video;

import by.asyncbtd.tll.meta.objects.PhotoSize;

public class VideoNote {

    private String fileId;
    private String fileUniqueId;
    private Integer length;
    private Integer duration;
    private PhotoSize thumbnail;
    private Integer fileSize;

    public String getFileId() {
        return fileId;
    }

    public String getFileUniqueId() {
        return fileUniqueId;
    }

    public Integer getLength() {
        return length;
    }

    public Integer getDuration() {
        return duration;
    }

    public PhotoSize getThumbnail() {
        return thumbnail;
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

    public void setLength(Integer length) {
        this.length = length;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public void setThumbnail(PhotoSize thumbnail) {
        this.thumbnail = thumbnail;
    }

    public void setFileSize(Integer fileSize) {
        this.fileSize = fileSize;
    }

    public String toString() {
        return "VideoNote(fileId=" + this.getFileId() +
                ", fileUniqueId=" + this.getFileUniqueId() +
                ", length=" + this.getLength() +
                ", duration=" + this.getDuration() +
                ", thumbnail=" + this.getThumbnail() +
                ", fileSize=" + this.getFileSize() + ")";
    }

    public VideoNote() {
    }

    public VideoNote(String fileId, String fileUniqueId, Integer length, Integer duration, PhotoSize thumbnail, Integer fileSize) {
        this.fileId = fileId;
        this.fileUniqueId = fileUniqueId;
        this.length = length;
        this.duration = duration;
        this.thumbnail = thumbnail;
        this.fileSize = fileSize;
    }
}
