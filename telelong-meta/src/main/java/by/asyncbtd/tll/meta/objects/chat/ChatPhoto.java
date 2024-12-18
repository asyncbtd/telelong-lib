package by.asyncbtd.tll.meta.objects.chat;

public class ChatPhoto {

    private String smallFileId;
    private String smallFileUniqueId;
    private String bigFileId;
    private String bigFileUniqueId;

    public String getSmallFileId() {
        return this.smallFileId;
    }

    public String getSmallFileUniqueId() {
        return this.smallFileUniqueId;
    }

    public String getBigFileId() {
        return this.bigFileId;
    }

    public String getBigFileUniqueId() {
        return this.bigFileUniqueId;
    }

    public void setSmallFileId() {
        this.smallFileId = smallFileId;
    }

    public void setSmallFileUniqueId() {
        this.smallFileUniqueId = smallFileUniqueId;
    }

    public void setBigFileId() {
        this.bigFileId = bigFileId;
    }

    public void setBigFileUniqueId() {
        this.bigFileUniqueId = bigFileUniqueId;
    }

    public String toString() {
        return "ChatPhoto(smallFileId=" + this.getSmallFileId() +
                ", smallFileUniqueId=" + this.getSmallFileUniqueId() +
                ", bigFileId=" + this.getBigFileId() +
                ", bigFileUniqueId=" + this.getBigFileUniqueId() + ")";
    }

    public ChatPhoto() {
    }

    public ChatPhoto(String smallFileId, String smallFileUniqueId, String bigFileId, String bigFileUniqueId) {
        this.smallFileId = smallFileId;
        this.smallFileUniqueId = smallFileUniqueId;
        this.bigFileId = bigFileId;
        this.bigFileUniqueId = bigFileUniqueId;
    }
}
