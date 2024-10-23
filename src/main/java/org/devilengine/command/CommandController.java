package org.devilengine.command;

import org.devilengine.models.Command;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v1/command")
public class CommandController {

    private final ICommandService commandService;

    public CommandController(ICommandService commandService) {
        this.commandService = commandService;
    }

    @GetMapping("/retain-commands")
    public List<Command> retainAllCommands() {
        return commandService.retainAllCommands();
    }
}
