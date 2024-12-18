package by.asyncbtd.tll.meta.objects;

public class Voice {

    private String fileId;
    private String fileUniqueId;
    private Integer duration;
    private String mimeType;
    private Long fileSize;

    public String getFileId() {
        return fileId;
    }

    public String getFileUniqueId() {
        return fileUniqueId;
    }

    public Integer getDuration() {
        return duration;
    }

    public String getMimeType() {
        return mimeType;
    }

    public Long getFileSize() {
        return fileSize;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId;
    }

    public void setFileUniqueId(String fileUniqueId) {
        this.fileUniqueId = fileUniqueId;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public void setMimeType(String mimeType) {
        this.mimeType = mimeType;
    }

    public void setFileSize(Long fileSize) {
        this.fileSize = fileSize;
    }

    public String toString() {
        return "Voice(fileId=" + this.getFileId() +
                ", fileUniqueId=" + this.getFileUniqueId() +
                ", duration=" + this.getDuration() +
                ", mimeType=" + this.getMimeType() +
                ", fileSize=" + this.getFileSize() + ")";
    }

    public Voice() {
    }

    public Voice(String fileId, String fileUniqueId, Integer duration, String mimeType, Long fileSize) {
        this.fileId = fileId;
        this.fileUniqueId = fileUniqueId;
        this.duration = duration;
        this.mimeType = mimeType;
        this.fileSize = fileSize;
    }
}
