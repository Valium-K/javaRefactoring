package dev.valium.translator;

public class English implements Language {
    private final String targetSentence;

    public English(String targetSentence) {
        this.targetSentence = targetSentence;
    }

    @Override
    public String translate() {
        return "영어로 번역합니다";
    }
}
