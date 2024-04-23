package ru.artemev.leetcode;

import org.springframework.stereotype.Service;

import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class RunnerTask {
  @PostConstruct
  public void init() {}
}
