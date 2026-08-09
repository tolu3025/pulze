package kotlin.coroutines.jvm.internal;

import I1.n;
import I1.o;
import java.io.Serializable;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public abstract class a implements M1.d, e, Serializable {
    private final M1.d completion;

    public a(M1.d dVar) {
        this.completion = dVar;
    }

    public M1.d create(M1.d completion) {
        m.e(completion, "completion");
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    public e getCallerFrame() {
        M1.d dVar = this.completion;
        if (dVar instanceof e) {
            return (e) dVar;
        }
        return null;
    }

    public final M1.d getCompletion() {
        return this.completion;
    }

    public StackTraceElement getStackTraceElement() {
        return g.d(this);
    }

    protected abstract Object invokeSuspend(Object obj);

    protected void releaseIntercepted() {
    }

    @Override // M1.d
    public final void resumeWith(Object obj) {
        Object objInvokeSuspend;
        M1.d dVar = this;
        while (true) {
            h.b(dVar);
            a aVar = (a) dVar;
            M1.d dVar2 = aVar.completion;
            m.b(dVar2);
            try {
                objInvokeSuspend = aVar.invokeSuspend(obj);
            } catch (Throwable th) {
                n.a aVar2 = n.f2411b;
                obj = n.b(o.a(th));
            }
            if (objInvokeSuspend == N1.d.e()) {
                return;
            }
            obj = n.b(objInvokeSuspend);
            aVar.releaseIntercepted();
            if (!(dVar2 instanceof a)) {
                dVar2.resumeWith(obj);
                return;
            }
            dVar = dVar2;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Continuation at ");
        Object stackTraceElement = getStackTraceElement();
        if (stackTraceElement == null) {
            stackTraceElement = getClass().getName();
        }
        sb.append(stackTraceElement);
        return sb.toString();
    }

    public M1.d create(Object obj, M1.d completion) {
        m.e(completion, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }
}
