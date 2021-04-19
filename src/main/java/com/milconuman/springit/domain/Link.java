package com.milconuman.springit.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor
@Data
public class Link extends Auditable {
    @Id
    @GeneratedValue
    private Long id;
    @NonNull
    private String title;
    @NonNull
    @Column(length = 2048)
    private String url;

    @OneToMany(mappedBy = "link")
    private List<Comment> comments = new ArrayList<>();
}
