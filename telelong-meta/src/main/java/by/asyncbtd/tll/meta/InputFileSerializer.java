package by.asyncbtd.tll.meta;

import by.asyncbtd.tll.meta.objects.InputFile;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.IOException;

public class InputFileSerializer extends JsonSerializer<InputFile> {

    @Override
    public void serialize(InputFile value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
        gen.writeObject(value.getAttachName());
    }
}
