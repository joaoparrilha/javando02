package funcionalLambda.util;

import java.util.function.Consumer;

import funcionalLambda.entities.Product;

public class ProductConsumer implements Consumer<Product>{

	@Override
	public void accept(Product p) {
		p.setPrice(p.getPrice() * 1.1);
	}

}
