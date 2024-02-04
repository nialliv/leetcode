package ru.artemev.leetcode;

import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import ru.artemev.leetcode.tasks.ClimbingStairs;

@Component
@Slf4j
@RequiredArgsConstructor
public class RunnerTask {
    @PostConstruct
    public void init() {
        System.out.println(ClimbingStairs.climbStairs(2));
    }

}
