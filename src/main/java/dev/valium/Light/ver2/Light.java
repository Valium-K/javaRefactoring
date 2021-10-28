package dev.valium.Light.ver2;

import dev.valium.Light.ver2.state.State;

public abstract class Light {
    private State state;

    protected Light() {}
    public Light(State state) {
        this.state = state;
    }
    public void pushButton() {
        state.pushButton(this);
    }
    public void setState(State state) {
        this.state = state;
    }
}
