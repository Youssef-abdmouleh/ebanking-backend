package org.sid.ebankingbackend.entities;
import java.util.List;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class Customer{
    @Id @GenratedValue(strategy=GenrationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    @OneToMany (mappedBy="customer")
    private List<BankAccount> bankAccount;
}