package io.syncoder.cli;

import io.syncoder.commands.VersionCommand;
import picocli.CommandLine.Command;
import picocli.CommandLine.Option;


@Command(
        name = "tez",
        description = "Tez CLI",
        mixinStandardHelpOptions = true // -h, --help
)
public class DevCli implements Runnable {

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
