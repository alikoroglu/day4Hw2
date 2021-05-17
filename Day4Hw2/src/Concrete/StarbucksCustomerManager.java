package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.ICustomerCheckService;
import Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager{

	ICustomerCheckService _customerCheckService;
	public StarbucksCustomerManager(ICustomerCheckService customerCheckService) {
		_customerCheckService = customerCheckService;
	}
	@Override
	public void save(Customer customer) {
		//checkIfRealPerson(customer)
		if (_customerCheckService.CheckIfRealPerson(customer)){
			System.out.println("Starbucks saved to db: "+customer.firstName);
			}
		//else {throw new Exception("Not a valid person");}
		
		
	}

	

}