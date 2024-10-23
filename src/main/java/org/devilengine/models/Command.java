package org.devilengine.models;

import lombok.*;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Command {
    CommandAction action;
    LocalDateTime dateTime;

    public Command(CommandAction commandAction) {
        this.action = commandAction;
        dateTime = LocalDateTime.now();
    }
}
