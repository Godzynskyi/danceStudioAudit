package gateway.persist;

import domain.StudentEntity;

public interface StudentDBGateway {
    void persist(StudentEntity student);

}

