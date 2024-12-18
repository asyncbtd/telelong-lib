package by.asyncbtd.tll.longpoling;

import by.asyncbtd.tll.meta.objects.Update;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class ResponseList {

    @JsonProperty("ok")
    String ok;

    @JsonProperty("result")
    List<Update> resultUpdates;

    public String getOk() {
        return this.ok;
    }

    public List<Update> getResultUpdates() {
        return this.resultUpdates;
    }

    public void setResultUpdates(List<Update> resultUpdates) {
        this.resultUpdates = resultUpdates;
    }

    public void setOk(String ok) {
        this.ok = ok;
    }

    @Override
    public String toString() {
        return "ResponseList(ok=" + this.getOk() +
                ", resultUpdates=" + this.getResultUpdates() + ")";
    }

    public ResponseList() {
    }

    public ResponseList(String ok, List<Update> resultUpdates) {
        this.ok = ok;
        this.resultUpdates = resultUpdates;
    }
}
