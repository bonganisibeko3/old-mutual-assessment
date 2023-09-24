package za.co.oldmutual.assessment;

import za.co.oldmutual.assessment.IDestination;
import za.co.oldmutual.assessment.ISource;

import java.util.Objects;

public class Copier {
    private final ISource source;
    private final IDestination destination;

    public Copier(ISource source, IDestination destination) {
        this.source = Objects.requireNonNull(source);
        this.destination = Objects.requireNonNull(destination);
    }

    public void copy() {
        char currentChar;
        StringBuilder stringBuilder = new StringBuilder();

        while ((currentChar = source.readChar()) != '\n') {
            stringBuilder.append(currentChar);
        }

        destination.writeChars(stringBuilder.toString());
    }
}