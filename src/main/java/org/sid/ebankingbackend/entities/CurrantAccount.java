package org.sid.ebankingbackend.entities;
import java.util.List;

@Data @NoArgsConstructor @AllArgsConstructor
@Entity
@DiscriminatorType("CA")
public class CurrentAccount extends BankAccount {
    private double overDraft;
}