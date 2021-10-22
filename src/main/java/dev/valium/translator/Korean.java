package dev.valium.translator;

public class Korean implements Language {
    private final String targetSentence;

    public Korean(String targetSentence) {
        this.targetSentence = targetSentence;
    }

    @Override
    public String translate() {
        return "한국어로 번역합니다.";
    }
}
