package untitled.domain;

import java.util.*;
import lombok.*;
import untitled.domain.*;
import untitled.infra.AbstractEvent;

@Data
@ToString
public class MachineAdded extends AbstractEvent {

    private Long id;
    private String name;
    private String modelName;
    private GroupId groupId;
    private List<MachineUser> machineUser;

    public MachineAdded(Machine aggregate) {
        super(aggregate);
    }

    public MachineAdded() {
        super();
    }
}
