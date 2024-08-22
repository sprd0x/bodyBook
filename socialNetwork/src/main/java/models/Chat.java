package models;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.UUID;

@AllArgsConstructor
@Data
public class Chat {
    private UUID id;
    private UUID firstUserId;
    private UUID secondUserId;

}
