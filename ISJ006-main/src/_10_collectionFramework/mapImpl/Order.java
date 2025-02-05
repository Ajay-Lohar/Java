package _10_collectionFramework.mapImpl;

import lombok.*;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@Builder
public class Order {
    private int orderId;
    private String orderName;
    private int orderValue;
    private LocalDateTime orderPlacedTime;
    private int customerId;
}
