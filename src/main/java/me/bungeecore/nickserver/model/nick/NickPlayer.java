package me.bungeecore.nickserver.model.nick;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class NickPlayer {

    private UUID uuid;
    private UUID nickUUID;
    private String rank;
    private boolean networkNick;
}
