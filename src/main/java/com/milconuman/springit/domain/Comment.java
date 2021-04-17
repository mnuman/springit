package com.milconuman.springit.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Objects;

@NoArgsConstructor
@Data
@Entity
public class Comment {
    @Id
    @GeneratedValue
    private Long id;
}
