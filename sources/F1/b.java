package F1;

import e0.AbstractC0829j;
import java.util.concurrent.Executor;
import y1.AbstractC1299b;
import y1.AbstractC1301d;
import y1.C1300c;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AbstractC1301d f1517a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C1300c f1518b;

    public interface a {
        b a(AbstractC1301d abstractC1301d, C1300c c1300c);
    }

    protected b(AbstractC1301d abstractC1301d, C1300c c1300c) {
        this.f1517a = (AbstractC1301d) AbstractC0829j.o(abstractC1301d, "channel");
        this.f1518b = (C1300c) AbstractC0829j.o(c1300c, "callOptions");
    }

    protected abstract b a(AbstractC1301d abstractC1301d, C1300c c1300c);

    public final C1300c b() {
        return this.f1518b;
    }

    public final b c(AbstractC1299b abstractC1299b) {
        return a(this.f1517a, this.f1518b.l(abstractC1299b));
    }

    public final b d(Executor executor) {
        return a(this.f1517a, this.f1518b.n(executor));
    }
}
