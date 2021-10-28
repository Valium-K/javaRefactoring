package dev.valium.Light.ver2.state;

import dev.valium.Light.ver2.Light;

public class OnState implements State {
    @Override
    public void pushButton(Light light) {
        light.setState(new BreathState());
        System.out.println("breath");
    }
}
