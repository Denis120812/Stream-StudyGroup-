import java.util.Iterator;
import java.util.List;


public class Stream implements Iterable<StudyGroup> {
    private List<StudyGroup> studyGroups;


    public Stream(List<StudyGroup> studyGroups) {
        this.studyGroups = studyGroups;
    }

    public List<StudyGroup> getStudyGroups() {
        return studyGroups;
    }


    public int getGroupCount() {
        return studyGroups.size();
    }


    @Override
    public Iterator<StudyGroup> iterator() {
        return studyGroups.iterator();
    }
}
