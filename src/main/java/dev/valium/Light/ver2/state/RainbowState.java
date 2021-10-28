package dev.valium.Light.ver2.state;

import dev.valium.Light.ver2.Light;

public class RainbowState implements State {
    @Override
    public void pushButton(Light light) {
        light.setState(new OffState());
        System.out.println("off");
    }
}
