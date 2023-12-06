package io.silky;

public class TextMember extends Member {
    public TextMember(String name) {
        super(name);
    }

    @Override
    void sendMessage(String message) {
        super.chatRoom.notify(message, this, MessageType.STRING);
    }

    @Override
    void sendImage(Image image) {
        System.out.println("Sorry, you do not have permission to send pictures");
    }
}