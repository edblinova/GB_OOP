package OOP;

import java.util.List;

public class Controller {
    private StreamService streamService;

    public Controller(StreamService streamService) {
        this.streamService = streamService;
    }

    public void sortStream(List<Stream> streams) {
        streamService.sortStream(streams);
    }
}