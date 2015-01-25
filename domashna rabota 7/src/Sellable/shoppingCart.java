package Sellable;
import java.math.BigDecimal;
import java.util.*;
public class shoppingCart {
	
	   private BigDecimal money;
	   protected ArrayList<Sellable> list = new ArrayList<Sellable>();
	    
	    
	 public shoppingCart() {
			super();
		
		}


	public shoppingCart(BigDecimal money, ArrayList<Sellable> list) {
		super();
		setMoney(money);
		setList(list);
	}


	public BigDecimal getMoney() {
		return money;
	}


	public void setMoney(BigDecimal money) {
		this.money = money;
	}


	public ArrayList<Sellable> getList() {
		return list;
	}


	public void setList(ArrayList<Sellable> list) {
		this.list = list;
	}
	public void sell(BigDecimal dollars) throws SellableExcepltion{
		if(this.money.compareTo(dollars) == -1){
			throw new SellableExcepltion("Недостатъчна наличност");
		}
		}
	}