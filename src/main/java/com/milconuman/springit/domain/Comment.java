package com.milconuman.springit.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@NoArgsConstructor
@Data
@Entity
public class Comment extends Auditable {
    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    private Link link;
}
