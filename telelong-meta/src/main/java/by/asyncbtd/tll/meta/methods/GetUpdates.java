package by.asyncbtd.tll.meta.methods;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class GetUpdates {

    @JsonProperty("offset")
    private Integer offset;

    @JsonProperty("limit")
    private Integer limit;

    @JsonProperty("timeout")
    private Integer timeout;

    @JsonProperty("allowed_updates")
    private List<String> allowedUpdates;

    public GetUpdates() {
    }

    public Integer getOffset() {
        return offset;
    }

    public Integer getLimit() {
        return limit;
    }

    public Integer getTimeout() {
        return timeout;
    }

    public List<String> getAllowedUpdates() {
        return allowedUpdates;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public void setTimeout(Integer timeout) {
        this.timeout = timeout;
    }

    public void setAllowedUpdates(List<String> allowedUpdates) {
        this.allowedUpdates = allowedUpdates;
    }
}
