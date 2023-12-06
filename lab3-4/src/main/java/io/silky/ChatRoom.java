package io.silky;

import java.util.ArrayList;
import java.util.List;

public class ChatRoom implements ChatRoomMediator {
    private final List<Member> members;

    public ChatRoom() {
        this.members = new ArrayList<>();
    }

    public void registerMember(Member member) {
        members.add(member);
        member.setChatRoom(this);
    }

    @Override
    public void notify(Object message, Member sender, MessageType messageType) {
        for(Member i : members) {
            if (i != sender) {
                i.receiveMessage(message, messageType);
            }
        }
    }
}