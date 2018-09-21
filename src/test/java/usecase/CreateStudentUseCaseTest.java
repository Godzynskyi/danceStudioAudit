package usecase;

import domain.StudentEntity;
import gateway.persist.StudentDBGatewayStub;
import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CreateStudentUseCaseTest {
    private CreateStudentUseCase useCase;

    private StudentDBGatewayStub studentDBGateway = new StudentDBGatewayStub();

    @Before
    public void setUp() {
        useCase = new CreateStudentUseCase(studentDBGateway);
    }

    @Test
    public void shouldPersistUser() {
        StudentEntity student = new StudentEntity("Ira");

        useCase.createStudent(student);

        assertThat(studentDBGateway.persistInvocations).containsOnly(student);
    }
}