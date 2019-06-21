package io.github.pmackowski.rsocket.raft.storage;

public class StorageException extends RuntimeException {

    public StorageException(Throwable throwable) {
        super(throwable);
    }

    public StorageException(String s) {
        super(s);
    }

    public StorageException(String s, Throwable throwable) {
        super(s, throwable);
    }
}
