package com.tk.trafficlight.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotBlank;
import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document
@Builder
public class Employee {

    private String id;

    @NotBlank(message = "Employee must have a name")
    private String name;

    private String role;
    private String team;
    private String project;
    private String region;
    private Date lastContact;
    private Stage stage;
    private GoalStatus goalStatus;
    private List<Status> status;

}
