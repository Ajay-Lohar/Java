package _10_collectionFramework.mapImpl;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@Builder
public class Customer {
    private int customerId;
    private String customerName;
    private String customerAddress;
    private int customerPhoneNumber;
    private String customerEmailAddress;

}
