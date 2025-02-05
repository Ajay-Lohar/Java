package com.itshaala;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@Builder
public class Movie {
    private int movieId;
    private String movieName;
    private String movieDescription;
}
