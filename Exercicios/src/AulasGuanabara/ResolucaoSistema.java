package AulasGuanabara;

import java.awt.Toolkit;
import java.awt.Dimension;

public class ResolucaoSistema {

	public static void main(String[] args) {
		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension dimensoes = tk.getScreenSize();
		
		System.out.println("A resolução do seu sistema é: " + dimensoes.width + " X " + dimensoes.height);
	}

}
