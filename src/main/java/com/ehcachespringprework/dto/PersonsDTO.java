package com.ehcachespringprework.dto;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class PersonsDTO {
    private long id;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String address;
    private Long departmentId;
    private String departmentName;
}
