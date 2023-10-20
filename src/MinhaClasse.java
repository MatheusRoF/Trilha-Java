
public class MinhaClasse {  
    
    // executavel metodo main
    public static void main (String [] args){
        System.out.print ("Olá ");

        // definir valor fixo (final)
        // conveçao camel case e uper case
        // variavel: Tipo nome = atribuição (opcional)
        int idade = 23;
        double altura = 180;
        String meuNome = "Matheus";
        // sempre que falar de idade vai ser int
        String primeiroNome = "Matheus";
        String segundoNome = " Rodrigues";
        String nomeCompleto = nomeComleto(primeiroNome, segundoNome);

        System.out.print(nomeCompleto);
        //Metodos: TipoRetorno nome parametro(s)        
    }
    public static String nomeComleto (String primeiroNome, String segundoNome){
        return primeiroNome.concat("").concat(segundoNome);
    }      
    //Pacotes*
}
