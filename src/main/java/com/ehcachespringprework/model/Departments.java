package com.ehcachespringprework.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Departments {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String departmentName;
    @OneToMany(mappedBy = "department", cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private List<Persons> persons = new ArrayList<>();
}
