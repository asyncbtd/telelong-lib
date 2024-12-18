package by.asyncbtd.tll.meta.objects;

public class PhotoSize {

    private String fileId;
    private String fileUniqueId;
    private Integer width;
    private Integer height;
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

    public void setFileSize(Integer fileSize) {
        this.fileSize = fileSize;
    }

    public String toString() {
        return "PhotoSize(fileId=" + this.getFileId() +
                ", fileUniqueId=" + this.getFileUniqueId() +
                ", width=" + this.getWidth() +
                ", height=" + this.getHeight() +
                ", fileSize=" + this.getFileSize() + ")";
    }

    public PhotoSize() {
    }

    public PhotoSize(String fileId, String fileUniqueId, Integer width, Integer height, Integer fileSize) {
        this.fileId = fileId;
        this.fileUniqueId = fileUniqueId;
        this.width = width;
        this.height = height;
        this.fileSize = fileSize;
    }
}
