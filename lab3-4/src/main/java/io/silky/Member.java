package io.silky;

abstract class Member {
    protected String name;
    protected ChatRoomMediator chatRoom;

    public Member(String name) {
        this.name = name;
    }

    public void setChatRoom(ChatRoomMediator chatRoom) {
        this.chatRoom = chatRoom;
    }

    abstract void sendMessage(String message);

    abstract  void sendImage(Image image);

    public void receiveMessage(Object message, MessageType messageType) {
        if (messageType == MessageType.IMAGE) {
            receiveImage((Image) message);
        } else {
            receiveText((String) message);
        }
    }

    public void receiveImage(Image image) {
        image = Utils.limitImageSize(image);
        System.out.println("[ImageMember] [" + name + "] Received message: " + image.getName());
    }

    public void receiveText(String text) {
        text = Utils.filterMessage(text);
        System.out.println("[ImageMember] [" + name + "] Received message: " + text);
    }
}