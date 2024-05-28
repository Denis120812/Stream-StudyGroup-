

public class StudyGroup {
    private String groupName; // приватная поле groupName

    public StudyGroup(String groupName) {
        this.groupName = groupName;
    }


    public String getGroupName() {
        return groupName;
    }


    @Override
    public String toString() {
        return groupName;
    }
}
