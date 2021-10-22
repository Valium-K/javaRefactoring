package dev.valium.translator;

public interface Language {
    LanguageType defaultLanguageType = LanguageType.KOREAN;
    String translate();
}
