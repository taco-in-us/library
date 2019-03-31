package com.example.library.lendInfo.model;


import lombok.Data;

import javax.persistence.Entity;
import java.time.LocalDateTime;

@Entity
@Data
public class LendInfo {

    private LocalDateTime lendDate;
    private LocalDateTime dueDate;
    private LocalDateTime returnDate;

    private String bookId;

    private String userId;
}
