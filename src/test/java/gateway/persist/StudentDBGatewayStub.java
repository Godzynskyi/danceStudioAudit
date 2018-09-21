package gateway.persist;

import domain.StudentEntity;

import java.util.ArrayList;
import java.util.List;

public class StudentDBGatewayStub implements StudentDBGateway {
    public List<StudentEntity> persistInvocations = new ArrayList<>();

    @Override
    public void persist(StudentEntity student) {
        persistInvocations.add(student);
    }

}
