package services;

import models.User;

public class UserService {

    public void registration(String name, String username, long telegramId) {
        User user = new User();
        user.setUsername(username);
        user.setTelegramId(telegramId);
        user.setName(name);

    }
}
