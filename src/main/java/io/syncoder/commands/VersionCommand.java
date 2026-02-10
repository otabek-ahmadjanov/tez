package io.syncoder.commands;

import picocli.CommandLine.Command;

@Command(name = "version", description = "Print devcli version")
public class VersionCommand implements Runnable {

    @Override
    public void run() {
        System.out.println("devcli 0.1.0");
    }
}
