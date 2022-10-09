package com.dipirona;

import java.io.IOException;

public class executar_comando {
    public static void cmd(String args) throws IOException, InterruptedException {
        String comando = "cmd /c start cmd.exe /c "+args;
        Process cmd = Runtime.getRuntime().exec(comando);
        cmd.waitFor();
    }
}
