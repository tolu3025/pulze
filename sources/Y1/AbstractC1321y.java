package y1;

import e0.AbstractC0825f;

/* JADX INFO: renamed from: y1.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1321y extends W {
    protected AbstractC1321y() {
    }

    @Override // y1.W
    public V a() {
        return e().a();
    }

    protected abstract W e();

    public String toString() {
        return AbstractC0825f.b(this).d("delegate", e()).toString();
    }
}
