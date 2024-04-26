package ru.artemev.leetcode.tasks.yaroslav;

import java.util.List;
import org.springframework.stereotype.Component;

@Component
public class OtherTicketSolution {

    public String getSolution(List<Ticket> tickets) {
        Ticket tmpTicket = null;
        for (Ticket ticket : tickets) {
            if (String.valueOf(ticket.getNumber()).length() != 11) {
                continue;
            }
            if(tmpTicket == null) {
                tmpTicket = ticket;
            }
            if (tmpTicket.isPriority() && ticket.isPriority()) {
                tmpTicket = getTicketByType(ticket, tmpTicket);
            } else if (ticket.isPriority()) {
                tmpTicket = ticket;
            } else {
                tmpTicket = getTicketByType(ticket, tmpTicket);
            }
        }
        return tmpTicket == null ? null : tmpTicket.getKey();
    }

    private static Ticket getTicketByType(Ticket ticket, Ticket tmpTicket) {
        int typeTmpTicket = Integer.parseInt(tmpTicket.getType());
        int typeTicket = Integer.parseInt(ticket.getType());
        if (typeTmpTicket > typeTicket) {
            tmpTicket = ticket;
        }
        return tmpTicket;
    }
}
