package org.devilengine.command;

import org.devilengine.models.Command;
import org.devilengine.models.CommandAction;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommandService implements ICommandService{

    @Override
    public List<Command> retainAllCommands() {
        return List.of(new Command[]{
                new Command(CommandAction.START),
                new Command(CommandAction.STOP),
        });
    }
}
