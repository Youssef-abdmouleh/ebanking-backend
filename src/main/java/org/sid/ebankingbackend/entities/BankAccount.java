package org.sid.ebankingbackend.entities;

import java.util.Date;
import java.util.List;

@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="TYPE",length="4")
@Data @NoArgsConstructor @AllArgsConstructor

public class BankAccount {
    @Id
    private String id;
    private double balance;
    private Date createdAt;
    @Enumarated(EnumType="STRING")
    private AccountStatus status;
    @ManyToOne
    private Customer customer;
    @OneToMany(mappedBy="account" ,Fetch=FetchType.LAZY )
    private List<AccountOperation> accountOperation;
}