package by.asyncbtd.tll.longpoling;

import by.asyncbtd.tll.meta.objects.Update;

import java.util.List;

public interface LongPollingUpdateConsumer {
    void consume(List<Update> updates);
}
