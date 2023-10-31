package genericsSetMap;

import java.util.Map;
import java.util.TreeMap;

public class EDMap {
	public static void main(String[] args) {
		
		Map<String, String> cookies = new TreeMap<>();
		
		//inserir um elemento no map
		cookies.put("username", "Maria");
		cookies.put("email", "maria@gmail.com");
		cookies.put("phone", "99711122");
		
		//remover um elemento do map
		cookies.remove("email");
		
		//sobreescreve o valor do phone antigo
		cookies.put("phone", "12345678");
		
		//verificar se o map contem chave
		System.out.println("Contains 'phone' key: " + cookies.containsKey("phone"));
		System.out.println("Phone number: " + cookies.get("phone"));
		System.out.println("Email: " + cookies.get("email"));
		
		//percorrer o map
		System.out.println("All cookies: ");
		for (String key : cookies.keySet()) {
			System.out.println(key + ": " + cookies.get(key));
		}
	}
}
