package by.asyncbtd.tll.longpoling;

import by.asyncbtd.tll.meta.objects.Update;

import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public interface LongPollingSingleThreadUpdateConsumer extends LongPollingUpdateConsumer {

    Executor updatesProcessorExecutor = Executors.newSingleThreadExecutor();

    @Override
    default void consume(List<Update> updates) {
        updates.forEach(update -> updatesProcessorExecutor.execute(() -> consume(update)));
    }

    void consume(Update update);
}
