package com.springboot.SPShoppingCart;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.springboot.SPShoppingCart.entity.Brand;
import com.springboot.SPShoppingCart.entity.Product;
import com.springboot.SPShoppingCart.repository.IBrandRepo;
import com.springboot.SPShoppingCart.repository.IProductRepo;

@Component
public class MyRunner implements CommandLineRunner {

	private final IProductRepo prodRepository;

	private final IBrandRepo brandRepository;
	
	

	public MyRunner(IProductRepo prodRepository, IBrandRepo brandRepository) {
		this.prodRepository = prodRepository;
		this.brandRepository = brandRepository;
	}

	@Override
    public void run(String... args) throws Exception {
        prodRepository.deleteAll();
        brandRepository.deleteAll();
        List<Brand> mobileBrands=List.of(new Brand(1, "Redmi",5, 10000.0),
											new Brand(1, "Vivo",10, 11400.0), 
											new Brand(1, "Apple",9, 11400.0),
											new Brand(1, "JioPhone",10, 99.9));
        
        List<Brand> laptopBrands=List.of(new Brand(2, "Asus", 5, 24999.0),
							                new Brand(2, "Hp", 6, 39999.0),
							                new Brand(2, "Lenovo", 6, 41000.0),
							                new Brand(2, "Apple", 3, 52000.0),
							                new Brand(2, "Dell", 7, 35000.0));
        
        List<Brand> earphoneBrands=List.of(new Brand(3, "Boat", 6, 400.0),
							                new Brand(3, "JBL", 7, 500.0),
							                new Brand(3, "Oneplus", 3, 1500.0),
							                new Brand(3, "Realme", 4, 600.0),
							                new Brand(3, "Samsung", 5, 450.0));
        
        List<Brand> speakerBrands=List.of(new Brand(4, "Boat",9, 2000.0),
							        		new Brand(4, "JBL",4, 2400.0),
							        		new Brand(4, "Marshall",3, 3000.0),
							        		new Brand(4, "Sony",5, 3500.0),
							        		new Brand(4, "Bose",6, 1500.0));



		List<Brand> cameraBrands=List.of(new Brand(5, "Sony",6, 5000.0),
							        		new Brand(5, "Canon",8, 3000.0),
							        		new Brand(5, "Nikon",5, 3400.0),
							        		new Brand(5, "Panasonic",7, 6200.0),
							        		new Brand(5, "Samsung",6, 3500.0),
							        		new Brand(5, "GoPro",5, 2500.0),
							        		new Brand(5, "Pentax",3, 3300.0));



		List<Brand> powerBankBrands=List.of(new Brand(6, "Anker",3, 800.0),
							        		new Brand(6, "INIU",5, 1200.0),
							        		new Brand(6, "Mophie",7, 1400.0),
							        		new Brand(6, "Omni",4, 500.0),
							        		new Brand(6, "iMuto",2, 900.0));



    	List<Brand> tabletBrands=List.of(new Brand(7, "Apple iPad", 7, 12000.0),
								         new Brand(7, "Samsung Galaxy", 4, 11300.0),
								         new Brand(7, "Lenovo", 6, 9000.0),
								         new Brand(7, "Realme", 5, 11200.0),
								         new Brand(7, "Nokia", 3, 11999.0));
									        
        prodRepository.save(new Product("Mobile",mobileBrands,"Available"));
        prodRepository.save(new Product("Laptop",laptopBrands,"Available"));
        prodRepository.save(new Product("Earphone",earphoneBrands,"Available"));
        prodRepository.save(new Product("Speaker",speakerBrands,"Available"));
        prodRepository.save(new Product("Camera",cameraBrands,"Available"));
        prodRepository.save(new Product("PowerBank",powerBankBrands,"Available"));
        prodRepository.save(new Product("Tablet",tabletBrands,"Available"));
        
        }
}
