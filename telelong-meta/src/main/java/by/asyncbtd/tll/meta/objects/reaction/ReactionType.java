package by.asyncbtd.tll.meta.objects.reaction;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.EXISTING_PROPERTY,
        property = "type",
        defaultImpl = Void.class
)
@JsonSubTypes({
        @JsonSubTypes.Type(value = ReactionTypeEmoji.class, name = ReactionType.EMOJI_TYPE),
        @JsonSubTypes.Type(value = ReactionTypeCustomEmoji.class, name = ReactionType.CUSTOM_EMOJI_TYPE),
        @JsonSubTypes.Type(value = ReactionTypePaid.class, name = ReactionType.PAID_TYPE)
})
public interface ReactionType {
    String EMOJI_TYPE = "emoji";
    String CUSTOM_EMOJI_TYPE = "custom_emoji";
    String PAID_TYPE = "paid";

    String getType();
}
