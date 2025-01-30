package ru.artemev.leetcode;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.collections4.MapUtils;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Slf4j
@Service
@RequiredArgsConstructor
public class RunnerTask {

    private final Random random = new Random();

    @EventListener(ApplicationReadyEvent.class)
    public void init() {
        log.info("I'm Started");
        Map<Character, List<String>> words = Stream.generate(this::getRandomWord)
                .limit(1000)
                .collect(Collectors.groupingBy(word -> word.charAt(0)));

        words.computeIfAbsent('0', k -> new ArrayList<>()).add("value");
        MapUtils.debugPrint(System.out, "words", words);
    }

    private String getRandomWord() {
        char[] word = new char[random.nextInt(8) + 3];
        for (int i = 0; i < word.length; i++) {
            word[i] = (char) ('a' + random.nextInt(26));
        }
        return new String(word);
    }
}
