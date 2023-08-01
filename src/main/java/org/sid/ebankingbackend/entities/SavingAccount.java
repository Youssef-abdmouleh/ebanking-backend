package org.sid.ebankingbackend.entities;
import java.util.List;

@Data @NoArgsConstructor @AllArgsConstructor
@Entity
@DiscriminatorType("SA")
public class SavingAccount extends BankAccount {
    private double interestRate;
}