package t0;

import java.util.AbstractMap;
import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.EmptyStackException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public class d implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayDeque f11298a = new ArrayDeque();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f11299b;

    d(h hVar, Object obj, Comparator comparator, boolean z2) {
        int iCompare;
        this.f11299b = z2;
        while (!hVar.isEmpty()) {
            if (obj != null) {
                Object key = hVar.getKey();
                iCompare = z2 ? comparator.compare(obj, key) : comparator.compare(key, obj);
            } else {
                iCompare = 1;
            }
            if (iCompare < 0) {
                hVar = z2 ? hVar.a() : hVar.e();
            } else if (iCompare == 0) {
                this.f11298a.push((j) hVar);
                return;
            } else {
                this.f11298a.push((j) hVar);
                if (z2) {
                }
            }
        }
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Map.Entry next() {
        try {
            j jVar = (j) this.f11298a.pop();
            AbstractMap.SimpleEntry simpleEntry = new AbstractMap.SimpleEntry(jVar.getKey(), jVar.getValue());
            if (this.f11299b) {
                for (h hVarA = jVar.a(); !hVarA.isEmpty(); hVarA = hVarA.e()) {
                    this.f11298a.push((j) hVarA);
                }
            } else {
                for (h hVarE = jVar.e(); !hVarE.isEmpty(); hVarE = hVarE.a()) {
                    this.f11298a.push((j) hVarE);
                }
            }
            return simpleEntry;
        } catch (EmptyStackException unused) {
            throw new NoSuchElementException();
        }
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f11298a.size() > 0;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("remove called on immutable collection");
    }
}
