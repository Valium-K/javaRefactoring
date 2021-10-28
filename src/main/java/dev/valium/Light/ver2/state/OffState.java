package dev.valium.Light.ver2.state;

import dev.valium.Light.ver2.Light;

public class OffState implements State {
    @Override
    public void pushButton(Light light) {
        light.setState(new OnState());
        System.out.println("on");
    }
}
