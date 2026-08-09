package s;

import androidx.datastore.preferences.protobuf.C0507v;
import java.io.InputStream;
import kotlin.jvm.internal.m;
import p.C1050d;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f11223a = new a(null);

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.h hVar) {
            this();
        }

        public final f a(InputStream input) throws C1050d {
            m.e(input, "input");
            try {
                f fVarV = f.V(input);
                m.d(fVarV, "{\n                Prefer…From(input)\n            }");
                return fVarV;
            } catch (C0507v e3) {
                throw new C1050d("Unable to parse preferences proto.", e3);
            }
        }
    }
}
