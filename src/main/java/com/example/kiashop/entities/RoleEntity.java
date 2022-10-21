package com.example.kiashop.entities;

import com.example.kiashop.bases.BaseEntity;
import com.example.kiashop.enums.RoleEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import java.util.List;

@Entity(name = "roles")
@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class RoleEntity extends BaseEntity {

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, unique = true)
    private RoleEnum name;

    @ManyToMany(mappedBy = "roles")
    private List<UserEntity> users;
}
