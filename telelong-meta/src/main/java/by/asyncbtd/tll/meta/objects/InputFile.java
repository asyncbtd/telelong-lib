package by.asyncbtd.tll.meta.objects;

import java.io.InputStream;

public class InputFile {

    private String attachName;
    private String mediaName;
    private java.io.File newMediaFile;
    private InputStream newMediaStream;
    private Boolean isNew;

    public String getAttachName() {
        return attachName;
    }

    public String getMediaName() {
        return mediaName;
    }

    public java.io.File getNewMediaFile() {
        return newMediaFile;
    }

    public InputStream getNewMediaStream() {
        return newMediaStream;
    }

    public Boolean getIsNew() {
        return isNew;
    }

    public InputFile setMedia(java.io.File mediaFile, String fileName) {
        this.newMediaFile = mediaFile;
        this.mediaName = fileName;
        this.attachName = "attach://" + fileName;
        this.isNew = true;
        return this;
    }

    public InputFile setMedia(java.io.File mediaFile) {
        this.newMediaFile = mediaFile;
        this.mediaName = mediaFile.getName();
        this.attachName = "attach://" + mediaFile.getName();
        this.isNew = true;
        return this;
    }

    public InputFile setMedia(InputStream mediaStream, String fileName) {
        this.newMediaStream = mediaStream;
        this.mediaName = fileName;
        this.attachName = "attach://" + fileName;
        this.isNew = true;
        return this;
    }

    public InputFile setMedia(String attachName) {
        this.attachName = attachName;
        this.isNew = false;
        return this;
    }
}

