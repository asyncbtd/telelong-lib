package by.asyncbtd.tll.meta.objects.pasport;

public class PassportFile {

    private String fileId;
    private String fileUniqueId;
    private Integer fileSize;
    private Integer fileDate;

    public String getFileId() {
        return fileId;
    }

    public String getFileUniqueId() {
        return fileUniqueId;
    }

    public Integer getFileSize() {
        return fileSize;
    }

    public Integer getFileDate() {
        return fileDate;
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

    public void setFileDate(Integer fileDate) {
        this.fileDate = fileDate;
    }

    public String toString() {
        return "PassportFile(fileId=" + this.getFileId() +
                ", fileUniqueId=" + this.getFileUniqueId() +
                ", fileSize=" + this.getFileSize() +
                ", fileDate=" + this.getFileDate() + ")";
    }

    public PassportFile() {
    }

    public PassportFile(String fileId, String fileUniqueId, Integer fileSize, Integer fileDate) {
        this.fileId = fileId;
        this.fileUniqueId = fileUniqueId;
        this.fileSize = fileSize;
        this.fileDate = fileDate;
    }
}
