package poo;

public class Program {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe a idade do competidor: ");
		idade = entrada.nextInt();
		
		

		
		
		if (idade >= 10 && idade <=13) cat = "Infantil";
		else
			if (idade >= 14 && idade <= 16) cat = "Juvenil";
			else
				if (idade >= 17 && idade <= 20) cat =
				"J�nior";
				else
					if (idade >= 21 && idade <=
					30) cat = "Adulto";
					else
						if (idade >= 31 &&
						idade <= 99) cat = "Veterano";
						else
							cat = "Idade
							inv�lida";
							System.out.printf("A categoria do competidor � %s.",
									cat);


	}

}
