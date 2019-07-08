package modelos;

import entidades.EstruturaAcao;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class ObjetoModeloTabela extends AbstractTableModel {
    
    private final List<EstruturaAcao> linhas;
    private final String[] colunas = new String[]{"Estado Atual", "Símbolo Lido", 
            "Próximo Estado", "Símbolo Escrever", "Direção"};

    public ObjetoModeloTabela() {
        this.linhas = new ArrayList<>();
    }
    
    public ObjetoModeloTabela(List<EstruturaAcao> lista) {
        this.linhas = new ArrayList<>(lista);
    }

    @Override
    public int getRowCount() {
        return linhas.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }
    
    @Override
    public String getColumnName(int columnIndex) {
        return colunas[columnIndex];
    }
    
    @Override
    public boolean isCellEditable(int linha, int coluna) {
        return true;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        EstruturaAcao obj = linhas.get(rowIndex);

        switch (columnIndex) {
            case 0:
                return obj.getEstadoAtual();
            case 1:
                return obj.getSimboloLido();
            case 2:
                return obj.getProximoEstado();
            case 3:
                return obj.getSimboloEscrever();
            case 4:
                return obj.getDirecao();
            default:
                throw new IndexOutOfBoundsException("Coluna não encontrada.");
        }
    }
    
    @Override
    public void setValueAt(Object Value, int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0:
                linhas.get(rowIndex).setEstadoAtual((String) Value);
                break;
            case 1:
                linhas.get(rowIndex).setSimboloLido((String) Value);
                break;
            case 2:
                linhas.get(rowIndex).setProximoEstado((String) Value);
                break;
            case 3:
                linhas.get(rowIndex).setSimboloEscrever((String) Value);
                break;
            case 4:
                linhas.get(rowIndex).setDirecao((String) Value);
                break;
        }
        
        fireTableCellUpdated(rowIndex, columnIndex);
    }
    
    public List<EstruturaAcao> getListaObjetos() {
        return this.linhas;
    }
    
    public EstruturaAcao getObjeto(int indiceLinha) {
        return linhas.get(indiceLinha);
    }
    
    public void addObjeto(EstruturaAcao o) {
        // Adiciona o registro.
        linhas.add(o);
        int ultimoIndice = getRowCount() - 1;
        fireTableRowsInserted(ultimoIndice, ultimoIndice);
    }
    
     /* Remove a linha especificada. */
    public void remove(int indiceLinha) {
        linhas.remove(indiceLinha);
        fireTableRowsDeleted(indiceLinha, indiceLinha);
    }

    /* Adiciona uma lista de Objetos ao final dos registros. */
    public void addLista(List<EstruturaAcao> l) {
        // Pega o tamanho antigo da tabela.
        int tamanhoAntigo = getRowCount();

        // Adiciona os registros.
        linhas.addAll(l);
        fireTableRowsInserted(tamanhoAntigo, getRowCount() - 1);
    }

    public void limpar() {
        linhas.clear();
        fireTableDataChanged();
    }

    public boolean isEmpty() {
        return linhas.isEmpty();
    }
    
}
