package com.hashedin.springsecuritydemo;


import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class User {

    @Id
    private Long id;
    private String username;
    private String password;
    private String role;


}
