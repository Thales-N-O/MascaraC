package AppRoot;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import javax.swing.*;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Controller {
    @FXML
    private Button meuBotao;
    @FXML
    private JLabel label1WinInfo;
    @FXML
    private void quandoClica() throws IOException {
        meuBotao.setText("clicou");
        System.out.println("Você clicou");
        ProcessBuilder configBios = new ProcessBuilder("cmd.exe","/C","start","wmic","bios","get","serialnumber");
        ProcessBuilder sched = new ProcessBuilder("cmd.exe","/c","start","taskschd.msc");
        configBios.start();
        sched.start();
    }
}
