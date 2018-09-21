package usecase;

import domain.StudentEntity;
import gateway.persist.StudentDBGateway;

public class CreateStudentUseCase {
    private final StudentDBGateway studentDBGateway;

    public CreateStudentUseCase(StudentDBGateway studentDBGateway) {
        this.studentDBGateway = studentDBGateway;
    }

    public void createStudent(StudentEntity student) {
        studentDBGateway.persist(student);
    }
}
