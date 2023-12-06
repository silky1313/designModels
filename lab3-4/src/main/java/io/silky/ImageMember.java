package io.silky;

public class ImageMember extends Member {
    public ImageMember(String name) {
        super(name);
    }

    @Override
    void sendMessage(String message) {
        super.chatRoom.notify(message, this, MessageType.STRING);
    }

    @Override
    void sendImage(Image image) {
        super.chatRoom.notify(image, this, MessageType.IMAGE);
    }
}
