package ru.artemev.leetcode;

import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import ru.artemev.leetcode.tasks.strings.LongestSubstring;

@Slf4j
@Service
@RequiredArgsConstructor
public class RunnerTask {
  @PostConstruct
  public void init() {}
}
