package e2;

import c2.InterfaceC0576n;
import h2.D;
import h2.G;

/* JADX INFO: loaded from: classes.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final m f7142a = new m(-1, null, null, 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f7143b = G.e("kotlinx.coroutines.bufferedChannel.segmentSize", 32, 0, 0, 12, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f7144c = G.e("kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations", 10000, 0, 0, 12, null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final D f7145d = new D("BUFFERED");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final D f7146e = new D("SHOULD_BUFFER");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final D f7147f = new D("S_RESUMING_BY_RCV");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final D f7148g = new D("RESUMING_BY_EB");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final D f7149h = new D("POISONED");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final D f7150i = new D("DONE_RCV");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final D f7151j = new D("INTERRUPTED_SEND");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final D f7152k = new D("INTERRUPTED_RCV");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final D f7153l = new D("CHANNEL_CLOSED");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final D f7154m = new D("SUSPEND");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final D f7155n = new D("SUSPEND_NO_WAITER");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final D f7156o = new D("FAILED");

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final D f7157p = new D("NO_RECEIVE_RESULT");

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final D f7158q = new D("CLOSE_HANDLER_CLOSED");

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final D f7159r = new D("CLOSE_HANDLER_INVOKED");

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final D f7160s = new D("NO_CLOSE_CAUSE");

    /* synthetic */ class a extends kotlin.jvm.internal.k implements U1.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f7161a = new a();

        a() {
            super(2, f.class, "createSegment", "createSegment(JLkotlinx/coroutines/channels/ChannelSegment;)Lkotlinx/coroutines/channels/ChannelSegment;", 1);
        }

        public final m c(long j3, m mVar) {
            return f.x(j3, mVar);
        }

        @Override // U1.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return c(((Number) obj).longValue(), (m) obj2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long A(int i3) {
        if (i3 == 0) {
            return 0L;
        }
        if (i3 != Integer.MAX_VALUE) {
            return i3;
        }
        return Long.MAX_VALUE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean B(InterfaceC0576n interfaceC0576n, Object obj, U1.q qVar) {
        Object objB = interfaceC0576n.b(obj, null, qVar);
        if (objB == null) {
            return false;
        }
        interfaceC0576n.n(objB);
        return true;
    }

    static /* synthetic */ boolean C(InterfaceC0576n interfaceC0576n, Object obj, U1.q qVar, int i3, Object obj2) {
        if ((i3 & 2) != 0) {
            qVar = null;
        }
        return B(interfaceC0576n, obj, qVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long v(long j3, boolean z2) {
        return (z2 ? 4611686018427387904L : 0L) + j3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long w(long j3, int i3) {
        return (((long) i3) << 60) + j3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final m x(long j3, m mVar) {
        return new m(j3, mVar, mVar.y(), 0);
    }

    public static final Z1.e y() {
        return a.f7161a;
    }

    public static final D z() {
        return f7153l;
    }
}
