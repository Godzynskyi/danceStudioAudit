package gateway.persist;

import domain.TeacherEntity;

import java.util.ArrayList;
import java.util.List;

public class TeacherDBGatewayStub implements TeacherDBGateway {
    public List<TeacherEntity> persistTeacherInvocations = new ArrayList<>();

    @Override
    public void persist(TeacherEntity teacher) {
        persistTeacherInvocations.add(teacher);
    }
}
