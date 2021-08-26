package model;

public class Owner {
    private Wallet wallet;

    public Owner(String nombre) {
        super();
        wallet = new Wallet();
        setNombre(nombre);
    }

    private void setNombre(String nombre) {
    }

    public Wallet getWallet() {
        return wallet;
    }

    public String compararWallet(Wallet otraWallet){
        Wallet miWallet = getWallet();

        if(miWallet.getSaldo() > otraWallet.getSaldo() ){
            return "Mi Wallet tiene más saldo";
        }
        else if(miWallet.getSaldo() == otraWallet.getSaldo()){
            return "Ambas wallet tienen el mismo saldo";
        }
        else if(miWallet.getSaldo() < otraWallet.getSaldo()){
            return "La otra wallet tiene más saldo";
        }
        else{ return "Hubo un error"; }//java solicita esto por que si
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Nombre: "+getNombre();
    }

    public String getNombre() {
        return null;
    }

    public void setId(int int1) {
    }

    public int getId() {
        return 0;
    }
    
}
