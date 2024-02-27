class main {
    public static void main(String[] args) {
        class conta {
            private int saldo;

            public void setSaldo(int saldo) {
                this.saldo = saldo;
            }

            public int getSaldo() {
                return saldo;
            }

            public void depositar(int valor) {
                saldo += valor;
            }

            public void verificar() {
                System.out.println("O saldo é de: " + getSaldo());
            }
            
        }





    }
}