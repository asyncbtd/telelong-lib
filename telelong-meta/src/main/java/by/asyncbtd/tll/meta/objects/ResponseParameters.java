package by.asyncbtd.tll.meta.objects;

public class ResponseParameters {

    private Integer migrateToChatId;
    private Integer retryAfter;

    public Integer getMigrateToChatId() {
        return migrateToChatId;
    }

    public Integer getRetryAfter() {
        return retryAfter;
    }

    public void setMigrateToChatId(Integer migrateToChatId) {
        this.migrateToChatId = migrateToChatId;
    }

    public void setRetryAfter(Integer retryAfter) {
        this.retryAfter = retryAfter;
    }

    public String toString() {
        return "ResponseParameters(migrateToChatId=" + this.getMigrateToChatId() +
                ", retryAfter=" + this.getRetryAfter() + ")";
    }

    public ResponseParameters() {
    }

    public ResponseParameters(Integer migrateToChatId, Integer retryAfter) {
        this.migrateToChatId = migrateToChatId;
        this.retryAfter = retryAfter;
    }
}
