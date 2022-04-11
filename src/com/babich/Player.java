package com.babich;

import lombok.Data;

import java.util.HashSet;
import java.util.Set;

@Data
public class Player {

    public Player(String name) {
        this.name = name;
    }

    private String name;
    private int points;
    private Set<String> usedPalindromes = new HashSet<>();
}
