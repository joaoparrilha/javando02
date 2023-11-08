package funcionalLambda.util;

import java.util.function.Function;

import funcionalLambda.entities.Product;

public class ProductFunction implements Function<Product, String>{

	@Override
	public String apply(Product p) {
		return p.getName().toUpperCase();
	}

}
