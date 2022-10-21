package com.example.kiashop.entities;

import com.example.kiashop.bases.BaseEntity;
import com.example.kiashop.enums.GenderEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@Entity(name = "users")
public class UserEntity extends BaseEntity {

    @Column(nullable = false, unique = true)
    private String username;

    @Column(columnDefinition = "text")
    private String password;

    @Column(nullable = false, unique = true)
    private String email;

    @Column
    private String firstName;

    @Column
    private String lastName;

    @Column
    private String avatar;

    @Enumerated(EnumType.STRING)
    private GenderEnum gender;

    @ManyToMany
    @JoinTable(
            name = "users_roles",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id"))
    private List<RoleEntity> roles;

    @OneToMany(mappedBy = "user")
    private List<DeviceEntity> devices;

    @OneToMany(mappedBy = "user")
    private List<OrderEntity> orders;

    @OneToMany(mappedBy = "user")
    private List<ProductCommentEntity> productComments;
}