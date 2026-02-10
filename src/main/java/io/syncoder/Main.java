package io.syncoder;

import io.syncoder.cli.DevCli;
import picocli.CommandLine;

public class Main {
    public static void main(String[] args) {
         CommandLine cmd = new CommandLine(new DevCli());

        int exitCode = cmd.execute(args);
        System.exit(exitCode);
    }
}