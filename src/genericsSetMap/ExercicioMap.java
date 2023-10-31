package genericsSetMap;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class ExercicioMap {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Map<String, Integer> votos = new LinkedHashMap<>();
		
		System.out.print("Enter file full path: ");
		String path = sc.nextLine();
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			
			String line = br.readLine();
			while (line != null) {
			
				String[] fields = line.split(",");
				String nome = fields[0];
				int count = Integer.parseInt(fields[1]);
				
				if (votos.containsKey(nome)) {
					int votosSingulares = votos.get(nome);
					votos.put(nome, count + votosSingulares);
				} else {
					votos.put(nome, count);
				}
				
				line = br.readLine();
			}	
			
			for (String key : votos.keySet()) {
				System.out.println(key + ": " + votos.get(key));
			}

		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		sc.close();
	}
}
