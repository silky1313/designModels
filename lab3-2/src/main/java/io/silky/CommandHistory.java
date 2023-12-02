package io.silky;

import java.util.ArrayList;
import java.util.List;

public class CommandHistory {
    private List<Command> commands = new ArrayList<>();
    private int currentIndex = -1;

    public void executeCommand(Command command) {
        command.execute();
        commands.add(command);
        currentIndex++;
    }

    public void undo() {
        if (currentIndex >= 0) {
            Command command = commands.get(currentIndex);
            command.undo();
            currentIndex--;
        }
    }

    public void redo() {
        if (currentIndex < commands.size() - 1) {
            currentIndex++;
            Command command = commands.get(currentIndex);
            command.redo();
        }
    }
}
