package dev.valium.Light.ver2;

import dev.valium.Light.ver1.Light;
import dev.valium.Light.ver2.state.OffState;

public class Main {
    public static void main(String[] args) {
        LogitechLight light = new LogitechLight(new OffState());

        light.pushButton();
        light.pushButton();
        light.pushButton();
        light.pushButton();
    }
}
