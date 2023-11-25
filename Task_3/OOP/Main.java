package OOP;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        EduGroup group1 = new EduGroup("Группа 1");
        EduGroup group2 = new EduGroup("Группа 2");
        EduGroup group3 = new EduGroup("Группа 3");

        Stream stream1 = new Stream();
        stream1.addGroup(group1);
        stream1.addGroup(group2);

        Stream stream2 = new Stream();
        stream2.addGroup(group3);

        StreamService streamService = new StreamService();
        Controller controller = new Controller(streamService);

        List<Stream> streams = new ArrayList<>();
        streams.add(stream1);
        streams.add(stream2);
        controller.sortStream(streams);

        for (Stream stream : streams) {
            System.out.println("Поток: ");
            for (EduGroup group : stream) {
                System.out.println("- " + group.getName());
            }
        }
    }
}