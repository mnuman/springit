package com.milconuman.springit.repository;

import com.milconuman.springit.domain.Link;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LinkRepository extends JpaRepository<Link, Long> {
/*    Simple method definition to be implemented under the hood by Spring JPA
    public Link findByTitle(String title);
*/
}
