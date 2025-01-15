package by.asyncbtd.tll.meta.objects.keyboard;

import by.asyncbtd.tll.meta.objects.keyboard.inline.InlineKeyboardMarkup;
import by.asyncbtd.tll.meta.objects.keyboard.reply.ReplyKeyboardMarkup;
import by.asyncbtd.tll.meta.objects.keyboard.reply.ReplyKeyboardRemove;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(
        use = JsonTypeInfo.Id.DEDUCTION,
        defaultImpl = Void.class
)
@JsonSubTypes({
        @JsonSubTypes.Type(value = InlineKeyboardMarkup.class),
        @JsonSubTypes.Type(value = ReplyKeyboardMarkup.class),
        @JsonSubTypes.Type(value = ReplyKeyboardRemove.class),
        @JsonSubTypes.Type(value = ForceReply.class)
})
public interface ReplyMarkup {
}