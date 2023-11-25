package OOP;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Stream implements Iterable<EduGroup> {
    private List<EduGroup> eduGroups;

    public Stream() {
        this.eduGroups = new ArrayList<>();
    }

    public void addGroup(EduGroup group) {
        eduGroups.add(group);
    }

    public List<EduGroup> showGroups() {
        return eduGroups;
    }

    @Override
    public Iterator<EduGroup> iterator() {
        return eduGroups.iterator();
    }
}