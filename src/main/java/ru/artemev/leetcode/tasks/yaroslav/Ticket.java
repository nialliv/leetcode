package ru.artemev.leetcode.tasks.yaroslav;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Ticket {

  private long number;
  private boolean priority;
  private String type;
  private String key;
}
