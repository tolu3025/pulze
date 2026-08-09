package Y1;

import J1.AbstractC0409m;

/* JADX INFO: loaded from: classes.dex */
public abstract class a implements Iterable, V1.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C0071a f3528d = new C0071a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final char f3529a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final char f3530b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f3531c;

    /* JADX INFO: renamed from: Y1.a$a, reason: collision with other inner class name */
    public static final class C0071a {
        private C0071a() {
        }

        public /* synthetic */ C0071a(kotlin.jvm.internal.h hVar) {
            this();
        }
    }

    public a(char c3, char c4, int i3) {
        if (i3 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i3 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.f3529a = c3;
        this.f3530b = (char) P1.c.b(c3, c4, i3);
        this.f3531c = i3;
    }

    public final char a() {
        return this.f3529a;
    }

    public final char b() {
        return this.f3530b;
    }

    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public AbstractC0409m iterator() {
        return new b(this.f3529a, this.f3530b, this.f3531c);
    }
}
