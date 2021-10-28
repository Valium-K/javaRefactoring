package dev.valium;

import dev.valium.player.Player;
import dev.valium.translator.English;
import dev.valium.translator.Korean;
import dev.valium.translator.Language;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

@Slf4j
public class Main {
    public static void main(String[] args) {
        Player player = new Player(Player.MediaType.MUSIC);

        player.play();


        String[] s = "test1 test2 test3".split(" ");
    }

    private static void lang() {
        String targetSentence = "번역될 문장";

        Language language1 = new Korean(targetSentence);
        Language language2 = new English(targetSentence);

        System.out.println(language1.translate());
        System.out.println(language2.translate());
    }
}
