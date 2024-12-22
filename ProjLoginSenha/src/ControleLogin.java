
import javax.swing.JOptionPane;


public class ControleLogin {
    
    Usuario usu = new Usuario();
    
    public void Logar(String log, int sen){
        usu.setLogin(log);
        usu.setSenha(sen);
        boolean status=usu.Verifica();
        if (status==true){
            new FormSistema().setVisible(true);
        }
        else{
            JOptionPane.showMessageDialog(null,"Login/Senha incorretos !");
            new FormLogin().setVisible(true);
        }
    }
}
