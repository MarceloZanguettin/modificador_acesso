public class TestaFilme {

    public static void main(String[] args){
        Filme f= new Filme();
        f.setCodigo(1);
        f.setNome("A era do Gelo");
        f.setValor(2);

        System.out.println("O código do filme é: " +f.getCodigo());

        f.setCodigo(2);
        f.setNome("Star Wars");
        f.setValor(5);

        System.out.println("O código do filme é: " +f.getCodigo());
        System.out.println("O nome do filme é: " +f.getNome());
        System.out.println("O valor do filme é: " +f.getValor());
    }
    
}
