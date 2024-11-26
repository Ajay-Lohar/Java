package model;

import lombok.*;


@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@Builder
public class Players {
    private  int pid;
    private String pname ;
    private String pcountry ;
    private String prole ;
    private int page ;
}
