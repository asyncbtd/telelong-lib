package by.asyncbtd.tll.meta.objects;

import by.asyncbtd.tll.meta.InputFileSerializer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.io.File;
import java.io.InputStream;

@JsonSerialize(using = InputFileSerializer.class, as = String.class)
public class InputFile {

    private String attachName;

    @JsonIgnore
    private String mediaName;

    @JsonIgnore
    private java.io.File newMediaFile;

    @JsonIgnore
    private InputStream newMediaStream;

    @JsonIgnore
    private Boolean isNew;

    public String getAttachName() {
        return this.attachName;
    }

    public String getMediaName() {
        return this.mediaName;
    }

    public java.io.File getNewMediaFile() {
        return this.newMediaFile;
    }

    public InputStream getNewMediaStream() {
        return this.newMediaStream;
    }

    public InputFile(String attachName) {
        this();
        setMedia(attachName);
    }

    /**
     * Constructor to set a new file
     *
     * @param mediaFile File to send
     */
    public InputFile(java.io.File mediaFile) {
        this();
        setMedia(mediaFile, mediaFile.getName());
    }

    /**
     * Constructor to set a new file
     *
     * @param mediaFile File to send
     * @param fileName Name of the file
     */
    public InputFile(java.io.File mediaFile, String fileName) {
        this();
        setMedia(mediaFile, fileName);
    }

    /**
     * Constructor to set a new file as stream
     *
     * @param mediaStream File to send
     * @param fileName Name of the file
     */
    public InputFile(InputStream mediaStream, String fileName) {
        this();
        setMedia(mediaStream, fileName);
    }

    /**
     * Use this setter to send new file.
     * @param mediaFile File to send
     * @param fileName Name of the file
     * @return This object
     */
    public InputFile setMedia(java.io.File mediaFile, String fileName) {
        this.newMediaFile = mediaFile;
        this.mediaName = fileName;
        this.attachName = "attach://" + fileName;
        this.isNew = true;
        return this;
    }

    /**
     * Use this setter to send new file.
     * @param mediaFile File to send
     * @return This object
     */
    public InputFile setMedia(File mediaFile) {
        this.newMediaFile = mediaFile;
        this.mediaName = mediaFile.getName();
        this.attachName = "attach://" + mediaFile.getName();
        this.isNew = true;
        return this;
    }

    /**
     * Use this setter to send new file as stream.
     * @param mediaStream File to send
     * @param fileName Name of the file
     * @return This object
     */
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

    public boolean isNew() {
        return isNew;
    }

    public InputFile() {
    }

    public InputFile(String attachName, String mediaName, File newMediaFile, InputStream newMediaStream, Boolean isNew) {
        this.attachName = attachName;
        this.mediaName = mediaName;
        this.newMediaFile = newMediaFile;
        this.newMediaStream = newMediaStream;
        this.isNew = isNew;
    }
}

