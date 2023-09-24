package za.co.oldmutual.assessment;

import org.junit.Test;
import za.co.oldmutual.assessment.Copier;
import za.co.oldmutual.assessment.IDestination;
import za.co.oldmutual.assessment.ISource;

import static org.mockito.Mockito.*;

public class CopierTest {

    @Test
    public void testCopy() {

        ISource source = mock(ISource.class);
        IDestination destination = mock(IDestination.class);
        when(source.readChar()).thenReturn('H', 'e', 'l', 'l', 'o', '\n');
        Copier copier = new Copier(source, destination);
        copier.copy();
        verify(destination).writeChars("Hello");
    }
}