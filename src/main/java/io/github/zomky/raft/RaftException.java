package io.github.zomky.raft;

public class RaftException extends RuntimeException {

    public RaftException(String message) {
        super(message);
    }

    public RaftException(String message, Throwable cause) {
        super(message, cause);
    }

    public RaftException(Throwable throwable) {
        super(throwable);
    }
}
