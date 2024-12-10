package by.asyncbtd.tll.meta.objects;

public class Audio {

    private String fileId;
    private String fileUniqueId;
    private String duration;
    private String performer;
    private String title;
    private String fileName;
    private String mimeType;
    private String fileSize;
    private PhotoSize thumbnail;

    public String getFileId() {
        return fileId;
    }

    public String getFileUniqueId() {
        return fileUniqueId;
    }

    public String getDuration() {
        return duration;
    }

    public String getPerformer() {
        return performer;
    }

    public String getTitle() {
        return title;
    }

    public String getFileName() {
        return fileName;
    }

    public String getMimeType() {
        return mimeType;
    }

    public String getFileSize() {
        return fileSize;
    }

    public PhotoSize getThumbnail() {
        return thumbnail;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId;
    }

    public void setFileUniqueId(String fileUniqueId) {
        this.fileUniqueId = fileUniqueId;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public void setPerformer(String performer) {
        this.performer = performer;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public void setMimeType(String mimeType) {
        this.mimeType = mimeType;
    }

    public void setFileSize(String fileSize) {
        this.fileSize = fileSize;
    }

    public void setThumbnail(PhotoSize thumbnail) {
        this.thumbnail = thumbnail;
    }

    public String toString() {
        return "Audio(fileId=" + this.getFileId() +
                ", fileUniqueId=" + this.getFileUniqueId() +
                ", duration=" + this.getDuration() +
                ", performer=" + this.getPerformer() +
                ", title=" + this.getTitle() +
                ", fileName=" + this.getFileName() +
                ", mimeType=" + this.getMimeType() +
                ", fileSize=" + this.getFileSize() +
                ", thumbnail=" + this.getThumbnail() + ")";
    }

    public Audio() {
    }

    public Audio(String fileId, String fileUniqueId, String duration, String performer, String title, String fileName, String mimeType, String fileSize,
                 PhotoSize thumbnail) {
        this.fileId = fileId;
        this.fileUniqueId = fileUniqueId;
        this.duration = duration;
        this.performer = performer;
        this.title = title;
        this.fileName = fileName;
        this.mimeType = mimeType;
        this.fileSize = fileSize;
        this.thumbnail = thumbnail;
    }
}
