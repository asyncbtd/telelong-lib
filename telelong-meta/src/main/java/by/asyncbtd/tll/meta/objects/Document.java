package by.asyncbtd.tll.meta.objects;

public class Document {

    private String fileId;
    private String fileUniqueId;
    private PhotoSize thumbnail;
    private String fileName;
    private Long fileSize;

    public String getFileId() {
        return fileId;
    }

    public String getFileUniqueId() {
        return fileUniqueId;
    }

    public PhotoSize getThumbnail() {
        return thumbnail;
    }

    public String getFileName() {
        return fileName;
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

    public void setThumbnail(PhotoSize thumbnail) {
        this.thumbnail = thumbnail;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public void setFileSize(Long fileSize) {
        this.fileSize = fileSize;
    }

    public String toString() {
        return "Document(fileId=" + this.getFileId() +
                ", fileUniqueId=" + this.getFileUniqueId() +
                ", thumbnail=" + this.getThumbnail() +
                ", fileName=" + this.getFileName() +
                ", fileSize=" + this.getFileSize() + ")";
    }

    public Document(){
    }

    public Document(String fileId, String fileUniqueId, PhotoSize thumbnail, String fileName, Long fileSize) {
        this.fileId = fileId;
        this.fileUniqueId = fileUniqueId;
        this.thumbnail = thumbnail;
        this.fileName = fileName;
        this.fileSize = fileSize;
    }
}
