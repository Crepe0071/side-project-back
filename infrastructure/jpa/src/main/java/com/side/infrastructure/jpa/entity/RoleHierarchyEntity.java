package com.side.infrastructure.jpa.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "role_hierarchy")
@IdClass(RoleHierarchyKey.class)
public class RoleHierarchyEntity {

    @Id
    @Column(name = "child_id")
    private String childId;

    @Id
    @Column(name = "parent_id")
    private String parentId;

    @Transient
    private RoleEntity childRole;

    @Transient
    private RoleEntity parentRole;
}