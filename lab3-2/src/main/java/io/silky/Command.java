package io.silky;

public interface Command {
    void execute();
    void undo();
    void redo();
}
