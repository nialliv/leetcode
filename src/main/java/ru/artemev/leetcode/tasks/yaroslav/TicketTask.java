package ru.artemev.leetcode.tasks.yaroslav;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.Comparator;
import java.util.List;

@Slf4j
@Component
public class TicketTask {

    public static final Comparator<Ticket> COMPARE_BY_PRIORITY = (first, second) -> {
        if (first.isPriority() && second.isPriority()) {
            int typeNumFirst = Integer.parseInt(first.getType());
            int typeNumSecond = Integer.parseInt(second.getType());
            if (typeNumFirst > typeNumSecond) {
                return 1;
            }
            if (typeNumFirst < typeNumSecond) {
                return -1;
            }
        }
        if (first.isPriority()) {
            return 1;
        }
        if (second.isPriority()) {
            return -1;
        }
        return 0;
    };

    public String getSolution(List<Ticket> tickets) {
        tickets.sort(COMPARE_BY_PRIORITY);
        log.info(tickets.toString());
        return tickets.stream()
                .filter(ticket -> ticket.getNumber() == 11)
                .findFirst()
                .map(Ticket::getKey)
                .orElse(null);
    }
}
