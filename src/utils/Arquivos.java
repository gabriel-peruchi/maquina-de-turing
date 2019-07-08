package utils;

import entidades.EstruturaAcao;
import java.awt.Component;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class Arquivos {

    public static String lerArquivo(String nomeArquivo) {
        if (nomeArquivo.isEmpty()) {
            return "";
        }

        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        
        try {
            fileReader = new FileReader(nomeArquivo);
            bufferedReader = new BufferedReader(fileReader);
            StringBuilder sb = new StringBuilder();

            while (bufferedReader.ready()) {
                sb.append(bufferedReader.readLine());
                sb.append("\n");
            }
            
            return sb.toString();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao abrir o arquivo: "
                    + ex.getMessage());
        } finally {
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(null, "Erro ao abrir o arquivo: "
                            + ex.getMessage());
                }
            }
            if (fileReader != null) {
                try {
                    fileReader.close();
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(null, "Erro ao abrir o arquivo: "
                            + ex.getMessage());
                }
            }
        }
        return null;
    }
    
    public static String abrirArquivoDialog(Component comp) {
        JFileChooser fc = new JFileChooser(System.getProperty("user.dir"));
        fc.showOpenDialog(comp);
        
        File selFile = fc.getSelectedFile();
        if (selFile == null) {
            return "";
        }
        
        return selFile.getAbsolutePath();
    }
    
    public static void salvarArquivoDialog(Component comp, List<EstruturaAcao> objetos) {
        JFileChooser fc =new JFileChooser(System.getProperty("user.dir"));
 
        int userSelection = fc.showSaveDialog(comp);
        if (userSelection == JFileChooser.APPROVE_OPTION) {
            File file = fc.getSelectedFile();
            
            try (BufferedWriter conexao = new BufferedWriter(new FileWriter(file.getAbsolutePath(), true))) {
                for (EstruturaAcao obj : objetos) {
                    conexao.write(obj.toStringExport());
                    conexao.newLine();
                }
                
                JOptionPane.showMessageDialog(null, "Arquivo salvo com sucesso!");
            } catch (IOException ex) {
                Logger.getLogger(Arquivos.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
}
