package io.syncoder.cli;

import io.syncoder.commands.VersionCommand;
import picocli.CommandLine.Command;
import picocli.CommandLine.Option;

@Command(name = "tez", description = "Tez CLI", subcommands = {
        VersionCommand.class // Добавляем подкоманды если есть
})
public class DevCli implements Runnable {

    @Option(names = {"-h", "--help"}, usageHelp = true, description = "Show help message")
    boolean help;

    @Option(names = {"-v", "--version"}, description = "Print version and exit")
    boolean version;

    @Override
    public void run() {
        if (version) {
            System.out.println("tez 0.1.0");
            return;
        }
        System.out.println("Run: tez --help");
    }
}
