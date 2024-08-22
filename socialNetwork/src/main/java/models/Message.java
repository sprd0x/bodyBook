package models;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.UUID;

@AllArgsConstructor
@Data
public class Message {
    private UUID id;
    private String text;
    private UUID senderId;
    private UUID receiverId;
    private LocalDateTime sentTime;

}
