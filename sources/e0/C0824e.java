package e0;

import java.io.IOException;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: renamed from: e0.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0824e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f7067a;

    private C0824e(String str) {
        this.f7067a = (String) AbstractC0829j.n(str);
    }

    public static C0824e e(char c3) {
        return new C0824e(String.valueOf(c3));
    }

    public Appendable a(Appendable appendable, Iterator it) throws IOException {
        AbstractC0829j.n(appendable);
        if (it.hasNext()) {
            while (true) {
                appendable.append(f(it.next()));
                if (!it.hasNext()) {
                    break;
                }
                appendable.append(this.f7067a);
            }
        }
        return appendable;
    }

    public final StringBuilder b(StringBuilder sb, Iterator it) {
        try {
            a(sb, it);
            return sb;
        } catch (IOException e3) {
            throw new AssertionError(e3);
        }
    }

    public final String c(Iterable iterable) {
        return d(iterable.iterator());
    }

    public final String d(Iterator it) {
        return b(new StringBuilder(), it).toString();
    }

    CharSequence f(Object obj) {
        Objects.requireNonNull(obj);
        return obj instanceof CharSequence ? (CharSequence) obj : obj.toString();
    }
}
