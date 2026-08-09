package Y1;

import J1.C;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class e extends C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f3542a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f3543b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f3544c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f3545d;

    public e(int i3, int i4, int i5) {
        this.f3542a = i5;
        this.f3543b = i4;
        boolean z2 = true;
        if (i5 <= 0 ? i3 < i4 : i3 > i4) {
            z2 = false;
        }
        this.f3544c = z2;
        this.f3545d = z2 ? i3 : i4;
    }

    @Override // J1.C
    public int b() {
        int i3 = this.f3545d;
        if (i3 != this.f3543b) {
            this.f3545d = this.f3542a + i3;
        } else {
            if (!this.f3544c) {
                throw new NoSuchElementException();
            }
            this.f3544c = false;
        }
        return i3;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f3544c;
    }
}
