public class Violao {

    private double preco;
    private String cor;
    private String tipoCorda;
    private String tamanhoBraco;
    private String tipoTarraxa;
    private String materialCorpo;

    private Violao(double preco, String cor, String tipoCorda, String tamanhoBraco, String tipoTarraxa, String materialCorpo) {
        this.preco = preco;
        this.cor = cor;
        this.tipoCorda = tipoCorda;
        this.tamanhoBraco = tamanhoBraco;
        this.tipoTarraxa = tipoTarraxa;
        this.materialCorpo = materialCorpo;
    }

    public static class ViolaoBuilder {
        private double preco;
        private String cor;
        private String tipoCorda;
        private String tamanhoBraco;
        private String tipoTarraxa;
        private String materialCorpo;

        public ViolaoBuilder() {
        }

        public ViolaoBuilder preco(double preco){
            this.preco = preco;
            return this;
        }
        public ViolaoBuilder cor(String cor){
            this.cor = cor;
            return this;
        }
        public ViolaoBuilder tipoCorda(String tipoCorda){
            this.tipoCorda = tipoCorda;
            return this;
        }
        public ViolaoBuilder tamanhoBraco(String tamanhoBraco){
            this.tamanhoBraco = tamanhoBraco;
            return this;
        }
        public ViolaoBuilder tipoTarraxa(String tipoTarraxa){
            this.tipoTarraxa = tipoTarraxa;
            return this;
        }
        public ViolaoBuilder materialCorpo(String materialCorpo){
            this.materialCorpo = materialCorpo;
            return this;
        }

        public Violao criarViolao(){
            return new Violao(preco,cor,tipoCorda,tamanhoBraco,tipoTarraxa,materialCorpo);
        }
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getTipoCorda() {
        return tipoCorda;
    }

    public void setTipoCorda(String tipoCorda) {
        this.tipoCorda = tipoCorda;
    }

    public String getTamanhoBraco() {
        return tamanhoBraco;
    }

    public void setTamanhoBraco(String tamanhoBraco) {
        this.tamanhoBraco = tamanhoBraco;
    }

    public String getTipoTarraxa() {
        return tipoTarraxa;
    }

    public void setTipoTarraxa(String tipoTarraxa) {
        this.tipoTarraxa = tipoTarraxa;
    }

    public String getMaterialCorpo() {
        return materialCorpo;
    }

    public void setMaterialCorpo(String materialCorpo) {
        this.materialCorpo = materialCorpo;
    }
}
