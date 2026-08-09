package Y1;

import J1.AbstractC0409m;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public final class b extends AbstractC0409m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f3532a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f3533b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f3534c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f3535d;

    public b(char c3, char c4, int i3) {
        this.f3532a = i3;
        this.f3533b = c4;
        boolean z2 = true;
        if (i3 <= 0 ? m.f(c3, c4) < 0 : m.f(c3, c4) > 0) {
            z2 = false;
        }
        this.f3534c = z2;
        this.f3535d = z2 ? c3 : c4;
    }

    @Override // J1.AbstractC0409m
    public char b() {
        int i3 = this.f3535d;
        if (i3 != this.f3533b) {
            this.f3535d = this.f3532a + i3;
        } else {
            if (!this.f3534c) {
                throw new NoSuchElementException();
            }
            this.f3534c = false;
        }
        return (char) i3;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f3534c;
    }
}
