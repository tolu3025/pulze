package c2;

import M1.g;
import c2.AbstractC0583q0;
import java.io.Closeable;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: c2.q0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0583q0 extends K implements Closeable, AutoCloseable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f5172c = new a(null);

    /* JADX INFO: renamed from: c2.q0$a */
    public static final class a extends M1.b {
        private a() {
            super(K.f5091b, new U1.l() { // from class: c2.p0
                @Override // U1.l
                public final Object invoke(Object obj) {
                    return AbstractC0583q0.a.d((g.b) obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final AbstractC0583q0 d(g.b bVar) {
            if (bVar instanceof AbstractC0583q0) {
                return (AbstractC0583q0) bVar;
            }
            return null;
        }

        public /* synthetic */ a(kotlin.jvm.internal.h hVar) {
            this();
        }
    }

    public abstract Executor Y();
}
