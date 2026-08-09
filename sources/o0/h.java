package O0;

import android.content.Context;
import r0.C1200c;
import r0.InterfaceC1202e;
import r0.r;

/* JADX INFO: loaded from: classes.dex */
public abstract class h {

    public interface a {
        String a(Object obj);
    }

    public static C1200c b(String str, String str2) {
        return C1200c.l(f.a(str, str2), f.class);
    }

    public static C1200c c(final String str, final a aVar) {
        return C1200c.m(f.class).b(r.j(Context.class)).e(new r0.h() { // from class: O0.g
            @Override // r0.h
            public final Object a(InterfaceC1202e interfaceC1202e) {
                return h.d(str, aVar, interfaceC1202e);
            }
        }).d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ f d(String str, a aVar, InterfaceC1202e interfaceC1202e) {
        return f.a(str, aVar.a((Context) interfaceC1202e.a(Context.class)));
    }
}
