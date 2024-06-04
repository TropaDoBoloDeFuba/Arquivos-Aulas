public class App {
    public static void main(String[] args) {
        System.out.println("Cadastro de usuários");

        ClientesDAO cliente = new ClientesDAO();
        cliente.cadastrarCliente("Mateus Figueiredo", "mateusfigueiredogama@gmail.com", "(12) 98824-4891", 2125.50);
    }
}
