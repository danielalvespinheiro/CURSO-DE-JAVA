package AULASDAUDEMI;

public class Aula059 {

	public static void main(String[] args) {
		
		String original = "ABC DEF GJK IMN opq rst UVW aacc    ";
		String o1 = original.toLowerCase();
		String o2 = original.toUpperCase();
		String o3 = original.trim(); //elimina os espaços vazios.
		String o4 = original.substring(2); //so vai mostrar os valores da 2 posição em diante! 
											//ja criamos um gerador de senhas aleatório.
		String o5 = original.substring(2, 9); //9 é o limite de núumeros.
		String o6 = original.replace("a", "x"); //o replace faz uma troca.
		int i = original.indexOf("BC"); //fala qual o primeiro número da posição dessa String.
		int j = original.lastIndexOf("IMN"); //fala qual o ultimo
		
		System.out.println(o1);
		System.out.println(o2);
		System.out.println("!" + o3 + "!");
		System.out.println(o4);
		System.out.println(o5);
		System.out.println(o6);//obs: so trocou os a por x por conta dele esta em minúsculo.
		System.out.println(i);
		System.out.println(j);
	}

}
