package Abstract;

import Entities.Customer;

public abstract class BaseCustomerManager implements ICustomerService {

	@Override
	public abstract void save(Customer customer); {
		//System.out.println("Saved to db: "+customer.firstName);
		
		
	}

}