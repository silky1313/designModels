package io.silky;

import java.util.List;

public class Utils {
    public static int imageSizeLimit;
    public static List<String> forbiddenWords;

    public static String filterMessage(String message) {
        for (String word : forbiddenWords) {
            message = message.replaceAll(word, "***");
        }
        return message;
    }


    public static Image limitImageSize(Image image) {
        if (image.getSize() > imageSizeLimit) {
            System.out.println("Image size exceeds the limit. Resizing...");
            return new Image(image.getName(), imageSizeLimit);
        }
        return image;
    }
}
