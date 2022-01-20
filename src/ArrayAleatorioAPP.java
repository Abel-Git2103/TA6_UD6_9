import javax.swing.JOptionPane;

public class ArrayAleatorioAPP {

	public static void main(String[] args) {
		
		String numTexto = JOptionPane.showInputDialog("Introduce el tamaño del array");
		int num[] = new int[Integer.parseInt(numTexto)];
		
		rellenarValoresRandom(num, 0, 9);
		
		mostrarValores(num);

	}
	
	public static void rellenarValoresRandom(int lista[], int num1, int num2) {
		
		for(int i = 0; i < lista.length; i++) {
			lista[i] = (int) ((Math.random() * (num2 - num1) + num1));
		}
	}

	public static void mostrarValores(int lista[]) {
	
		for(int i = 0; i < lista.length; i++) {
			System.out.println("En el indice " + i + " el valor es " + lista[i]);		
		}
	}
}