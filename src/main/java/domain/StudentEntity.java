package domain;

import java.util.List;

public class StudentEntity {
    private String name;
    private List<GroupEntity> groups;
    private List<String> phoneNumbers;
    private List<ParentEntity> parents;

    public StudentEntity(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
