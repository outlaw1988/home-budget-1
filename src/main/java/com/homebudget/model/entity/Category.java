package com.homebudget.model.entity;

import com.homebudget.common.Constants;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "category")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "type")
    @Enumerated(EnumType.STRING)
    private Constants.Type type;

    @Column(name = "name")
    @NotNull
    private String name;

//    @ManyToOne
//    private UserEntity user;

}