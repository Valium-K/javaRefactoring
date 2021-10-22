package dev.valium.player;

public class Player {
    public enum MediaType {
        VIDEO {
            @Override
            public void play() {
                System.out.println("video: play()");
            }

            @Override
            public void stop() {
                System.out.println("video: stop()");
            }

            @Override
            public void loop() {
                System.out.println("video: loop()");
            }
        },
        MUSIC {
            @Override
            public void play() {
                System.out.println("music: play()");
            }

            @Override
            public void stop() {
                System.out.println("music: stop()");
            }

            @Override
            public void loop() {
                System.out.println("music: loop()");
            }
        };

        public abstract void play();
        public abstract void stop();
        public abstract void loop();
    }
    private MediaType mediaType;

    private Player() {}
    public Player(MediaType mediaType) {
        this.mediaType = mediaType;
    }

    public void play() { mediaType.play(); }
    public void stop() { mediaType.stop(); }
    public void loop() { mediaType.loop(); }
}
