package by.asyncbtd.tll.meta.objects;

public class File {

    private String fileId;
    private String fileUniqueId;
    private Integer fileSize;
    private String filePath;

    public String getFileId() {
        return fileId;
    }

    public String getFileUniqueId() {
        return fileUniqueId;
    }

    public Integer getFileSize() {
        return fileSize;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId;
    }

    public void setFileUniqueId(String fileUniqueId) {
        this.fileUniqueId = fileUniqueId;
    }

    public void setFileSize(Integer fileSize) {
        this.fileSize = fileSize;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public String toString() {
        return "File(fileId=" + this.getFileId() +
                ", fileUniqueId=" + this.getFileUniqueId() +
                ", fileSize=" + this.getFileSize() +
                ", filePath=" + this.getFilePath() + ")";
    }

    public File() {
    }

    public File(String fileId, String fileUniqueId, Integer fileSize, String filePath) {
        this.fileId = fileId;
        this.fileUniqueId = fileUniqueId;
        this.fileSize = fileSize;
        this.filePath = filePath;
    }
}
