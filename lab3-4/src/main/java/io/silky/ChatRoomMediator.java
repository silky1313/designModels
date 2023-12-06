package io.silky;

public interface ChatRoomMediator {
    void notify(Object message, Member sender, MessageType messageType);
}

