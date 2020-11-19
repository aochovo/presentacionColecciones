package queue;

import java.util.concurrent.atomic.AtomicLong;

public class FifoEntry<E extends Comparable<? super E>>
implements Comparable<FifoEntry<E>> {

static final AtomicLong seq = new AtomicLong(0);
final long seqNum;
final E entry;

public FifoEntry(E entry) {
seqNum = seq.getAndIncrement();
this.entry = entry;
}

public E getEntry() { return entry; }

// Se comprar seg�n la prioridad del elemento.
// A igual prioridad, se compara seg�n el n�mero
// de la secuencia

// Nos permite "ordenar" los elementos
// de igual prioridad

public int compareTo(FifoEntry<E> other) {
int res = entry.compareTo(other.entry);
if (res == 0 && other.entry != this.entry)
    res = (seqNum < other.seqNum ? -1 : 1);
return res;
}
}