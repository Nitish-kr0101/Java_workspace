package com.example.demoApp;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
@EqualsAndHashCode

public class Cricket {
    private int teamId;
    private int noOfPlayers;
    private String teamName;
}
