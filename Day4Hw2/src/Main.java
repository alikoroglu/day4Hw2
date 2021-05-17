

import Abstract.BaseCustomerManager;
import Abstract.ICustomerCheckService;
import Abstract.IEntity;
import Concrete.CustomerCheckManager;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		ICustomerCheckService checkService = new CustomerCheckManager();//neyle check edceðimi seçiyorum	
		BaseCustomerManager customerManager = new StarbucksCustomerManager(checkService);
		
		Customer customer = new Customer();
		customer.id = 1;
		customer.dateOfBirth=LocalDate.of(1997, 10, 05);
		customer.firstName="Ali";
		customer.lastName="Köroðlu";
		customer.nationalityId="52365942312";
		customerManager.save(customer);

	}

}

