package dev.valium.Light.ver2.state;

import dev.valium.Light.ver2.Light;

public class BreathState implements State {
    @Override
    public void pushButton(Light light) {
        light.setState(new RainbowState());
        System.out.println("rainbow");
    }
}
