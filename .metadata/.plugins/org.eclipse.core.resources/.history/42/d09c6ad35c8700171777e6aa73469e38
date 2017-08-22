import javax.swing.JOptionPane;
public class Login {
	public static void main(String[] args) {
		
		String usrSistema = "root";
		String senhaSistema = "123";
		
		String usuario = JOptionPane.showInputDialog("Usuario");
		String senha = JOptionPane.showInputDialog("Senha");
		
		//verifica o login
		if(usuario.equals(usrSistema) 
		    && senha.equals(senhaSistema)) {
			JOptionPane.showMessageDialog(null, "Bem vindo", "Sistema", JOptionPane.INFORMATION_MESSAGE);	
			
		} else {
			JOptionPane.showMessageDialog(null, "Usuario ou senha invalidos", "Sistema", JOptionPane.ERROR_MESSAGE);	
		}
		
	}
}