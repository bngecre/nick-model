package me.bungeecore.nickserver.model.nick;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Nick {

    private String name;
    private UUID uuid;

    private String value;
    private String texture;
}
