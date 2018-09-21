package usecase;

import domain.GroupEntity;
import gateway.persist.GroupDBGatewayStub;
import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CreateGroupUseCaseTest {
    private CreateGroupUseCase useCase;

    private GroupDBGatewayStub groupDbGateway = new GroupDBGatewayStub();

    @Before
    public void setUp() {
        useCase = new CreateGroupUseCase(groupDbGateway);
    }

    @Test
    public void shouldPersistGroup() {
        GroupEntity group = new GroupEntity();

        useCase.createGroup(group);

        assertThat(groupDbGateway.persistInvocations).containsOnly(group);
    }
}