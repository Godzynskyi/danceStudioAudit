package usecase;

import domain.GroupEntity;
import gateway.persist.GroupDbGateway;

public class CreateGroupUseCase {
    private GroupDbGateway groupDbGateway;

    public CreateGroupUseCase(GroupDbGateway groupDbGateway) {

        this.groupDbGateway = groupDbGateway;
    }

    public void createGroup(GroupEntity group) {
        groupDbGateway.persist(group);
    }
}
