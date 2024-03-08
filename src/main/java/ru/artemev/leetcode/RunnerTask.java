package ru.artemev.leetcode;

import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import ru.artemev.leetcode.tasks.ClimbingStairs;
import ru.artemev.leetcode.tasks.MaxFrequencyElements;
import ru.artemev.leetcode.tasks.yaroslav.Ticket;
import ru.artemev.leetcode.tasks.yaroslav.TicketTask;

import java.util.List;

@Component
@Slf4j
@RequiredArgsConstructor
public class RunnerTask {
    @PostConstruct
    public void init() {
        int[] array1 = new int[]{1,2,2,3,1,4};
        int[] array2 = new int[]{1,2,3,4,5};

        log.info("Array1 = {}", MaxFrequencyElements.maxFrequencyElements(array1));
        log.info("Array2 = {}", MaxFrequencyElements.maxFrequencyElements(array2));
    }

}
