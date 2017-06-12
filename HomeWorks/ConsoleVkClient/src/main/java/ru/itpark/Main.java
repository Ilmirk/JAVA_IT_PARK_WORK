package ru.itpark;

import ru.itpark.vk.api.core.ApiBuilder;
import ru.itpark.vk.api.core.VkApi;
import ru.itpark.vk.models.Friend;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        VkApi api = ApiBuilder.buildRestTemplateApi();

        List<Friend> friends = api.getUserFriends(51824897, 30, "sex","country", "domain", "city", "photo_200_orig");
        for (Friend friend : friends) {
            System.out.println(friend);
        }
    }
}
