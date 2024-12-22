
public class Usuario {
    
    private String login;
    private int senha;
    
    
    public String getLogin(){
        return this.login;
    }
    
    public void setLogin(String login){
        this.login=login;
    }
    
    public int getSenha(){
        return this.senha;
    }
    
    
    public void setSenha(int senha){
        this.senha = senha;
    }
    
    
        public boolean Verifica(){
        
        if(this.login.equals("Lucas")&& (senha==1234)){
        return true; 
    }
        else{
            return false;
        }
        
    }
}
