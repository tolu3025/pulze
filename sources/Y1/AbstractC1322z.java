package y1;

import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: y1.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1322z extends AbstractC1321y {
    protected AbstractC1322z() {
    }

    @Override // y1.AbstractC1321y
    protected abstract W e();

    @Override // y1.W
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public AbstractC1322z c(long j3, TimeUnit timeUnit) {
        e().c(j3, timeUnit);
        return g();
    }

    @Override // y1.W
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public AbstractC1322z d() {
        e().d();
        return g();
    }

    private AbstractC1322z g() {
        return this;
    }
}
