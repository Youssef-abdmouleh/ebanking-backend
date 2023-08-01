package org.sid.ebankingbackend.services;



@Service
@Transactional
public class BankServices {
    @Autowired
    private BankAccountRepository bankAccountRepository;
    public void consulter(){
        BankAccount bankAccount=bankAccountRepository.findById("		")orElse(null)
				if (!bankAccount=null){
					System.out.println("*****************")
					System.out.println(bankAccount.getId());
					System.out.println(bankAccount.getBalance());
					System.out.println(bankAccount.getStatus());
					System.out.println(bankAccount.getCreatedAt());
					System.out.println(bankAccount.getCustomer().getName());
					System.out.println(bankAccount.getClass().getSimpleName());
					
					if( bankAccount instanceof currentAccount){
						System.out.println("Over Draft=> " +((currentAccount)bankAccount).getOverDraft);
					}else if(bankAccount instanceof SavingAccount){
						System.out.println("Interest Rate=> " +((SavingAccount)bankAccount).getInterestRate);
					}
					bankAccount.getAccountOperation().forEach(op=>{
						System.out.println(op.getType()+"\t"+op.getOperationDate()+"\t"+op.getAmount());
					});
				}

    }
}
