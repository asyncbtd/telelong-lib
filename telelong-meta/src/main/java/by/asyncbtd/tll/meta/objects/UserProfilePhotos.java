package by.asyncbtd.tll.meta.objects;

import java.util.List;

public class UserProfilePhotos {

    private Integer totalCount;
    private List<List<PhotoSize>> photos;

    public Integer getTotalCount() {
        return totalCount;
    }

    public List<List<PhotoSize>> getPhotos() {
        return photos;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public void setPhotos(List<List<PhotoSize>> photos) {
        this.photos = photos;
    }

    public String toString() {
        return "UserProfilePhotos(totalCount=" + this.getTotalCount() +
                ", photos=" + this.getPhotos() + ")";
    }

    public UserProfilePhotos() {
    }

    public UserProfilePhotos(Integer totalCount, List<List<PhotoSize>> photos) {
        this.totalCount = totalCount;
        this.photos = photos;
    }
}
