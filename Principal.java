public class Principal {
    public static void main(String[] args) {
        Empregado empregado = new Empregado();
        empregado.setNome("Matheus");
        empregado.setEndereço("Pompeia");
        empregado.setTelefone("14981598854");
        empregado.setSalario(1200);

        Empregado empregado2=new Empregado();
        //settar com os seus dados
        System.out.println(empregado.getNome());
        System.out.println(empregado.getEndereço());
        System.out.println(empregado.getTelefone());
        System.out.println(empregado.getSalario());
    }
}