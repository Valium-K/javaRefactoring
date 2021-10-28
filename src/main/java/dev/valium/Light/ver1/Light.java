package dev.valium.Light.ver1;

/**
 * push button; light on -> breathing effect -> rainbow color change -> light off
 */
public class Light {
    private State state;

    private enum State {
        ON, BREATHING, RAINBOW, OFF
    }

    public Light() {
        this.state = State.OFF;
    }

    public State getState() {
        return this.state;
    }
    public void pushButton() {

        changeState();

        System.out.println("current State = " + this.state);
    }
    private void changeState() {
        switch (this.state) {
            case ON:
                this.state = State.BREATHING;
                break;
            case BREATHING:
                this.state = State.RAINBOW;
                break;
            case RAINBOW:
                this.state = State.OFF;
                break;
            case OFF:
                this.state = State.ON;
                break;
            default:
                throw new RuntimeException();
        }
    }
}
