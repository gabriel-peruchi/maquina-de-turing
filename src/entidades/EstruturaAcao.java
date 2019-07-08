
package entidades;

public class EstruturaAcao {
    
    private String estadoAtual;
    private String simboloLido;
    private String proximoEstado;
    private String simboloEscrever;
    private String direcao;
    
    public EstruturaAcao() { }

    public EstruturaAcao(String estadoAtual, String simboloLido, String proximoEstado, 
            String simboloEscrever, String direcao) {
        this.estadoAtual = estadoAtual;
        this.simboloLido = simboloLido;
        this.proximoEstado = proximoEstado;
        this.simboloEscrever = simboloEscrever;
        this.direcao = direcao;
    }

    public String getEstadoAtual() {
        return estadoAtual;
    }

    public void setEstadoAtual(String estadoAtual) {
        this.estadoAtual = estadoAtual;
    }

    public String getSimboloLido() {
        return simboloLido;
    }

    public void setSimboloLido(String simboloLido) {
        this.simboloLido = simboloLido;
    }

    public String getProximoEstado() {
        return proximoEstado;
    }

    public void setProximoEstado(String proximoEstado) {
        this.proximoEstado = proximoEstado;
    }

    public String getSimboloEscrever() {
        return simboloEscrever;
    }

    public void setSimboloEscrever(String simboloEscrever) {
        this.simboloEscrever = simboloEscrever;
    }

    public String getDirecao() {
        return direcao;
    }

    public void setDirecao(String direcao) {
        this.direcao = direcao;
    }

    @Override
    public String toString() {
        return "Objeto{" + "estadoAtual=" + estadoAtual + ", simboloLido=" + 
                simboloLido + ", proximoEstado=" + proximoEstado + 
                ", simboloEscrever=" + simboloEscrever + ", direcao=" + direcao 
                + '}';
    }
    
    public String toStringExport() {
        return getEstadoAtual() + ";" + getSimboloLido() + ";" +
                getProximoEstado() + ";" + getSimboloEscrever() +
                ";" + getDirecao();
    }
    
    
}
