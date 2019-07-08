package entidades;

import java.awt.Color;
import javax.swing.JTextField;

public class CampoDigitalizacao {

    private int posicao;
    private JTextField textField;

    public CampoDigitalizacao() {

    }

    public CampoDigitalizacao(int posicao, JTextField textField) {
        this.posicao = posicao;
        this.textField = textField;
    }

    public int getPosicao() {
        return posicao;
    }

    public void setPosicao(int posicao) {
        this.posicao = posicao;
    }

    public JTextField getTextField() {
        return textField;
    }

    public void setTextField(JTextField textField) {
        this.textField = textField;
    }

    public void setTexto(String texto) {
        this.textField.setText(texto);
    }

    public String getTexto() {
        return this.textField.getText();
    }

    public void setCor(Color value) {
        this.textField.setBackground(value);
    }

    @Override
    public String toString() {
        return "Campo{" + "posicao=" + posicao + ", textField=" + textField + '}';
    }

}
