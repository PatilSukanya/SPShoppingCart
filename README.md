## Project Name: SpShoppingCart

### Technology Used:
	Java
	Maven
	Spring Boot
	Spring MVC
	Junit, Mockito
	H2-Database
	Postman
	Apache TomCat
	Hibernate
	Exception Handling
	Logger Log4j- implemented using AOP
	CommandLine Runner implemented for loading database while launching application.

### SPShopping cart:
1. Develop a product service to publish the details of the products - DONE
2. Develop an order service to place the orders details and get persisted to H2 DB. Ensure that the atomicity is achieved - DONE
3. Cover Unit test cases using JUNIT, Mockito - DONE

### Table structure 

#### Table : Product
	1. productId(int)
	2. name(String)
	3. status(String)
	4. brands(List<Brand>)

#### Table: Brand
	1. brandId(int)
	2. productId(int)
	3. brand(String)
	4. quantity(int)
  5. price(Double)

#### Table: Orders
	1. orderId(int)
	2. orderDate(Date)
	3. orderDileveredDate(Date)
	4. orderStatus(String)
	5. productId(int)
	6. paymentSource(String)
	7. paymentStatus(String)
	8. customers(List<Customer>)

#### Table: Customer
	1. orderId(int)
	2. customerName(String)
	3. address(String)
	

### 1. Get. Service implemented for Products and Brands:
	a. getting all products details
		/products
	b. getting products detail by id
		/products/id/{id}
	c. getting products detail by name
		/products/name/{name}

	a. getting all brands details
		/brands
	b. getting brands by brand id
		/brands/id/{id}
	c. getting brands by brand name
		/brands/brand/{name}
	d. getting brands by productId
 		brands/productId/{productId}

### 2.Post service implemented for Orders and customer
 
 /orders
	need to send data for this post service. Below is example given:
	{
		"orderDate":"2022-06-23",
		"orderDileveredDate":"2022-06-28",
		"orderStatus": "Shipped",
		"productId": 3,
		"paymentSource":"UPI",
		"paymentStatus": "Done",
		"customers":
			[{
			"userId": 3,
			"customerName":"Sukanya",
			"address":"Jalgaon"
			}]
	}
-------------------------------------------------------
	{
		"orderDate":"2022-02-25",
		"orderDileveredDate":"2022-02-29",
		"orderStatus": "Delivered",
		"productId": 6,
		"paymentSource":"Online",
		"paymentStatus": "Pending",
		"customers":
			[{
			"userId": 4,
			"customerName":"Shubhangi",
			"address":"Nashik"
			}]
	}

### 3.Get Services implemented for orders
	a. getting all order details
		/orders
	b. getting order details by order ID
		/orders/id/{id}

/customers
	We are posting customer details from /order service but for testing we can send below data for this service :
	{    
  		 "customerName":"Sukanya",    
   		 "address":"Pune"
	}

### QUERY:
SELECT O.*,C.CUSTOMER_NAME ,C.ADDRESS  FROM TBL_ORDERS O,TBL_CUSTOMER C


