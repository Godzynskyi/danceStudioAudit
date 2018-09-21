package gateway.persist;

import domain.GroupEntity;

import java.util.ArrayList;
import java.util.List;

public class GroupDBGatewayStub implements GroupDbGateway {
    public List<GroupEntity> persistInvocations = new ArrayList<>();

    @Override
    public void persist(GroupEntity group) {
        persistInvocations.add(group);
    }
}
