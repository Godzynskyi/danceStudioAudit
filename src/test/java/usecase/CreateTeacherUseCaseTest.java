package usecase;

import domain.TeacherEntity;
import gateway.persist.TeacherDBGateway;
import gateway.persist.TeacherDBGatewayStub;
import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class CreateTeacherUseCaseTest {
    private CreateTeacherUseCase useCase;

    private TeacherDBGatewayStub teacherDBGateway = new TeacherDBGatewayStub();

    @Before
    public void setUp() {
        useCase = new CreateTeacherUseCase(teacherDBGateway);
    }

    @Test
    public void shouldPersistTeacher() {
        TeacherEntity teacher = new TeacherEntity("Ira");
        useCase.createTeacher(teacher);

        assertThat(teacherDBGateway.persistTeacherInvocations).containsOnly(teacher);
    }
}