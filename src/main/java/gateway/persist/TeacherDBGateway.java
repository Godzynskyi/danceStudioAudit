package gateway.persist;

import domain.TeacherEntity;

public interface TeacherDBGateway {
    void persist(TeacherEntity teacher);
}
