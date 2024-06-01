package ru.artemev.leetcode;

import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;
import ru.artemev.leetcode.tasks.helpers.ListNode;
import ru.artemev.leetcode.tasks.structures.MergeToLists;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Random;
import java.util.stream.Stream;

@Slf4j
@Service
@RequiredArgsConstructor
public class RunnerTask {

    @EventListener(ApplicationReadyEvent.class)
    public void init() {

//        ListNode list1 = ListNode.convert(generateRandomSortedList(10));
//        ListNode list2 = ListNode.convert(generateRandomSortedList(10));
//
//        int beforeNotMy = LocalDateTime.now().getNano();
//        MergeToLists.mergeToLists_NotMy(list1, list2);
//        int benchNotMy = LocalDateTime.now().minusNanos(beforeNotMy).getNano();
//
//        int beforeMy = LocalDateTime.now().getNano();
//        MergeToLists.mergeToLists(list1, list2);
//        int benchMy = LocalDateTime.now().minusNanos(beforeMy).getNano();
//
//        log.info("My result     = [{}]", benchMy);
//        log.info("Not my result = [{}]", benchNotMy);
//

    }

//    private int[] generateRandomSortedList(int limit) {
//        return Stream.generate(() -> new Random().nextInt(1000))
//                .limit(limit)
//                .sorted()
//                .mapToInt(i -> i)
//                .toArray();
//    }
}
