package by.asyncbtd.tll.meta.objects.pasport;

import java.util.List;

public class EncryptedPassportElement {

    private String type;
    private String data;
    private String phoneNumber;
    private String email;
    private List<PassportFile> files;
    private PassportFile frontSide;
    private PassportFile reverseSide;
    private PassportFile selfie;
    private List<PassportFile> translation;
    private String hash;

    public String getType() {
        return type;
    }

    public String getData() {
        return data;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public List<PassportFile> getFiles() {
        return files;
    }

    public PassportFile getFrontSide() {
        return frontSide;
    }

    public PassportFile getReverseSide() {
        return reverseSide;
    }

    public PassportFile getSelfie() {
        return selfie;
    }

    public List<PassportFile> getTranslation() {
        return translation;
    }

    public String getHash() {
        return hash;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setFiles(List<PassportFile> files) {
        this.files = files;
    }

    public void setFrontSide(PassportFile frontSide) {
        this.frontSide = frontSide;
    }

    public void setReverseSide(PassportFile reverseSide) {
        this.reverseSide = reverseSide;
    }

    public void setSelfie(PassportFile selfie) {
        this.selfie = selfie;
    }

    public void setTranslation(List<PassportFile> translation) {
        this.translation = translation;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public String toString() {
        return "EncryptedPassportElement(type=" + this.getType() +
                ", data=" + this.getData() +
                ", phoneNumber=" + this.getPhoneNumber() +
                ", email=" + this.getEmail() +
                ", files=" + this.getFiles() +
                ", frontSide=" + this.getFrontSide() +
                ", reverseSide=" + this.getReverseSide() +
                ", selfie=" + this.getSelfie() +
                ", translation=" + this.getTranslation() +
                ", hash=" + this.getHash() + ")";
    }

    public EncryptedPassportElement() {
    }

    public EncryptedPassportElement(String type, String data, String phoneNumber, String email, List<PassportFile> files, PassportFile frontSide, PassportFile reverseSide,
                                    PassportFile selfie, List<PassportFile> translation, String hash) {
        this.type = type;
        this.data = data;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.files = files;
        this.frontSide = frontSide;
        this.reverseSide = reverseSide;
        this.selfie = selfie;
        this.translation = translation;
        this.hash = hash;
    }
}
