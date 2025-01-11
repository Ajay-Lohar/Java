package model;


import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@Builder
public class Task {

    private int id;
    private String taskName;
    private String taskDescription;

}
