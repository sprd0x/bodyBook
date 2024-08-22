package models;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.UUID;
@AllArgsConstructor
@Data

public class User {
    private UUID id;
    private String name;
    private String username;
    private int notifications;
    private Long telegramId;


    public User() {
        this.id = UUID.randomUUID();
        this.notifications = 0;
    }
}
