package io.github.pmackowski.rsocket.raft.cli.command;

import picocli.CommandLine.Command;
import picocli.CommandLine.Option;

@Command(name = "zomky", helpCommand = true, version = "1.0.0", subcommands = {
    AgentCommand.class,
    JoinCommand.class
})
public class MainCommand {

    @Option(names = {"--help", "-h"}, usageHelp = true)
    private boolean help = false;

    @Option(names = {"--version", "-v"}, versionHelp = true)
    private boolean version = false;

    @Option(names = "--dry-run")
    private boolean dryRun = false;

    @Option(names = {"--port"})
    private Integer port = 7000;

    public boolean isHelp() {
        return help;
    }

    public boolean isVersion() {
        return version;
    }

    public boolean isDryRun() {
        return dryRun;
    }

    public Integer getPort() {
        return port;
    }
}
