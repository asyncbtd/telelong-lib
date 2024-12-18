package by.asyncbtd.tll.meta.objects;

public class Animation {

    private String fileId;
    private String fileUniqueId;
    private Integer width;
    private Integer height;
    private Integer duration;
    private PhotoSize thumbnail;
    private String fileName;
    private String mimeType;
    private Integer fileSize;

    public String getFileId() {
        return fileId;
    }

    public String getFileUniqueId() {
        return fileUniqueId;
    }

    public Integer getWidth() {
        return width;
    }

    public Integer getHeight() {
        return height;
    }

    public Integer getDuration() {
        return duration;
    }

    public PhotoSize getThumbnail() {
        return thumbnail;
    }

    public String getFileName() {
        return fileName;
    }

    public String getMimeType() {
        return mimeType;
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

    public void setWidth(Integer width) {
        this.width = width;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public void setThumbnail(PhotoSize thumbnail) {
        this.thumbnail = thumbnail;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public void setMimeType(String mimeType) {
        this.mimeType = mimeType;
    }

    public void setFileSize(Integer fileSize) {
        this.fileSize = fileSize;
    }

    public String toString() {
        return "Animation(fileId=" + this.getFileId() +
                ", fileUniqueId=" + this.getFileUniqueId() +
                ", width=" + this.getWidth() +
                ", height=" + this.getHeight() +
                ", duration=" + this.getDuration() +
                ", thumbnail=" + this.getThumbnail() +
                ", fileName=" + this.getFileName() +
                ", mimeType=" + this.getMimeType() +
                ", fileSize=" + this.getFileSize() + ")";
    }

    public Animation() {
    }

    public Animation(String fileId, String fileUniqueId, Integer width, Integer height, Integer duration, PhotoSize thumbnail, String fileName,
                     String mimeType, Integer fileSize) {
        this.fileId = fileId;
        this.fileUniqueId = fileUniqueId;
        this.width = width;
        this.height = height;
        this.duration = duration;
        this.thumbnail = thumbnail;
        this.fileName = fileName;
        this.mimeType = mimeType;
        this.fileSize = fileSize;
    }
}
