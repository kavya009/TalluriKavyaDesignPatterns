package structuralPattern_Composit;

import java.util.ArrayList;
import java.util.List;
public class Composit_example {
		  public static void main(String[] args) {
		    CompositeAccount compo = new CompositeAccount();

		    compo.addAccount(new DepositeAccount("A001", 1000));
		    compo.addAccount(new DepositeAccount("A002", 100));
		    compo.addAccount(new SavingAccount("A009", 700));

		    float totalBal = compo.getBal();
		    System.out.println("Total Balance : " + totalBal);
		  }

		}
	


	abstract class Acc {
	  public abstract float getBal();
	}

	class DepositeAccount extends Acc{
	  private String acc_No;
	  private float account_Bal;

	  public DepositeAccount(String accountNo, float accountBalance) {
	    super();
	    this.acc_No = accountNo;
	    this.account_Bal = accountBalance;
	  }

	  public float getBal() {
	    return account_Bal;
	  }

	}

	class SavingAccount extends Acc {
	  private String accountNo;
	  private float accountBalance;

	  public SavingAccount(String accountNo, float accountBalance) {
	    super();
	    this.accountNo = accountNo;
	    this.accountBalance = accountBalance;
	  }

	  public float getBal() {
	    return accountBalance;
	  }
	}

	class CompositeAccount extends Acc {
	  private float total;
	  private List<Acc> accountList = new ArrayList<Acc>();

	  public float getBal() {
	    total = 0;
	    for (Acc f : accountList) {
	      total = total + f.getBal();
	    }
	    return total;
	  }

	  public void addAccount(Acc acc) {
	    accountList.add(acc);
	  }

	  public void removeAccount(Acc acc) {
	    accountList.add(acc);
	  }
	}

	
