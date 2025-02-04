package Model;

import lombok.*;


    @AllArgsConstructor
    @NoArgsConstructor
    @Data
    @ToString
    @Builder
    public class Customer {

        private String username ;
        private String password ;
        private String email ;

    }


