package ru.specialist.key_selector;

import ru.specialist.doors.Door;
import ru.specialist.doors.MetalDoor;

public class KeySelector
{
    public String getKey(Door door) {
        if (door.getClass().equals(MetalDoor.class)) {
            return "a";
        } else {
            return null;
        }
    }
}
