package com.didem.lombok.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
@Getter @Setter @NoArgsConstructor
@ToString
public class User implements Serializable {
    private Long id; // will be set when persisting

    private String firstName;
    private String lastName;
    private int age;
}
