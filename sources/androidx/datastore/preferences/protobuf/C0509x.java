package androidx.datastore.preferences.protobuf;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
class C0509x implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Iterator f4301a;

    public C0509x(Iterator it) {
        this.f4301a = it;
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Map.Entry next() {
        Map.Entry entry = (Map.Entry) this.f4301a.next();
        entry.getValue();
        return entry;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f4301a.hasNext();
    }

    @Override // java.util.Iterator
    public void remove() {
        this.f4301a.remove();
    }
}
