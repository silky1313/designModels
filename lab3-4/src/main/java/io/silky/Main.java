package io.silky;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> forbiddenWords = new ArrayList<>();
        forbiddenWords.add("bad");
        forbiddenWords.add("evil");
        Utils.forbiddenWords = forbiddenWords;
        Utils.imageSizeLimit = 10;

        ChatRoom chatRoom = new ChatRoom();
        Member member1 = new TextMember("Member1");
        Member member2 = new TextMember("Member2");
        Member member3 = new ImageMember("Member3");

        chatRoom.registerMember(member1);
        chatRoom.registerMember(member2);
        chatRoom.registerMember(member3);

        member1.sendMessage("Hello everyone!");
        member2.sendMessage("Nice to meet you!");
        member2.sendMessage("You are bad!");
        member3.sendImage(new Image("image.jpg", 15));
    }
}