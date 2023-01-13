package com.craig.businessclientservice.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "client")
public class Client {
    @Id
    private String id;
    private String name;
    private String lastName;
    private Integer age;
    @JsonFormat(pattern = "dd-MM-yyyy")
    private LocalDate dateOfBirth;


}
