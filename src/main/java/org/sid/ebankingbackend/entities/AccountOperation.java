package org.sid.ebankingbackend.entities;
import java.util.Date;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor


public class {
    @Id @GenratedValue(strategy=GenrationType.IDENTITY)
    private Long id;
    private Date operationDate  ;
    private double amount;
    @Enumarated(EnumType="STRING")
    private Operationtype type;
    @ManyToOne
    private BankAccount account;
}