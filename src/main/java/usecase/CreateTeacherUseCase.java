package usecase;

import domain.TeacherEntity;
import gateway.persist.TeacherDBGateway;

public class CreateTeacherUseCase {
    private TeacherDBGateway teacherDBGateway;

    public CreateTeacherUseCase(TeacherDBGateway teacherDBGateway) {
        this.teacherDBGateway = teacherDBGateway;
    }

    public void createTeacher(TeacherEntity teacher) {
        teacherDBGateway.persist(teacher);
    }
}
