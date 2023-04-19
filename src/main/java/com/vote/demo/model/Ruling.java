package com.vote.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Document("ruling")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Ruling {

    @Id
    @Indexed(unique = true)
    private String id;
    private String title;

    public Ruling(String title) {
        this.title = title;
    }
}
