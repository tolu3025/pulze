package y1;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public class r {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final Logger f12046b = Logger.getLogger(r.class.getName());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final r f12047c = new r();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f12048a = 0;

    public interface a {
    }

    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final c f12049a;

        static {
            AtomicReference atomicReference = new AtomicReference();
            f12049a = a(atomicReference);
            Throwable th = (Throwable) atomicReference.get();
            if (th != null) {
                r.f12046b.log(Level.FINE, "Storage override doesn't exist. Using default", th);
            }
        }

        private static c a(AtomicReference atomicReference) {
            try {
                return (c) Class.forName("io.grpc.override.ContextStorageOverride").asSubclass(c.class).getConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (ClassNotFoundException e3) {
                atomicReference.set(e3);
                return new q0();
            } catch (Exception e4) {
                throw new RuntimeException("Storage override failed to initialize", e4);
            }
        }
    }

    public static abstract class c {
        public abstract r a();

        public abstract void b(r rVar, r rVar2);

        public abstract r c(r rVar);
    }

    private r() {
        k(0);
    }

    static Object d(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(String.valueOf(obj2));
    }

    public static r e() {
        r rVarA = j().a();
        return rVarA == null ? f12047c : rVarA;
    }

    static c j() {
        return b.f12049a;
    }

    private static void k(int i3) {
        if (i3 == 1000) {
            f12046b.log(Level.SEVERE, "Context ancestry chain length is abnormally long. This suggests an error in application code. Length exceeded: 1000", (Throwable) new Exception());
        }
    }

    public void a(a aVar, Executor executor) {
        d(aVar, "cancellationListener");
        d(executor, "executor");
    }

    public r b() {
        r rVarC = j().c(this);
        return rVarC == null ? f12047c : rVarC;
    }

    public Throwable c() {
        return null;
    }

    public void f(r rVar) {
        d(rVar, "toAttach");
        j().b(this, rVar);
    }

    public C1316t g() {
        return null;
    }

    public boolean h() {
        return false;
    }

    public void i(a aVar) {
    }
}
