package by.asyncbtd.tll.meta.objects.pasport;

import java.util.List;

public class PassportData {

    private List<EncryptedPassportElement> data;
    private EncryptedPassportElement credentials;

    public List<EncryptedPassportElement> getData() {
        return data;
    }

    public EncryptedPassportElement getCredentials() {
        return credentials;
    }

    public void setData(List<EncryptedPassportElement> data) {
        this.data = data;
    }

    public void setCredentials(EncryptedPassportElement credentials) {
        this.credentials = credentials;
    }

    public String toString() {
        return "PassportData(data=" + this.getData() +
                ", credentials=" + this.getCredentials() + ")";
    }

    public PassportData() {
    }

    public PassportData(List<EncryptedPassportElement> data, EncryptedPassportElement credentials) {
        this.data = data;
        this.credentials = credentials;
    }
}
