package OOP;

import java.util.List;

public class StreamService {
    public void sortStream(List<Stream> streams) {
        streams.sort(new StreamComparator());
    }
}