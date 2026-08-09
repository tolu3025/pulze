package com.google.protobuf;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
class H implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Iterator f6699a;

    public H(Iterator it) {
        this.f6699a = it;
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Map.Entry next() {
        Map.Entry entry = (Map.Entry) this.f6699a.next();
        entry.getValue();
        return entry;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f6699a.hasNext();
    }

    @Override // java.util.Iterator
    public void remove() {
        this.f6699a.remove();
    }
}
