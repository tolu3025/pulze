package S0;

import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayList;
import java.util.List;
import r0.C1200c;
import r0.InterfaceC1202e;
import r0.h;
import r0.j;

/* JADX INFO: loaded from: classes.dex */
public class b implements j {
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object c(String str, C1200c c1200c, InterfaceC1202e interfaceC1202e) {
        try {
            c.b(str);
            return c1200c.h().a(interfaceC1202e);
        } finally {
            c.a();
        }
    }

    @Override // r0.j
    public List a(ComponentRegistrar componentRegistrar) {
        ArrayList arrayList = new ArrayList();
        for (final C1200c c1200cT : componentRegistrar.getComponents()) {
            final String strI = c1200cT.i();
            if (strI != null) {
                c1200cT = c1200cT.t(new h() { // from class: S0.a
                    @Override // r0.h
                    public final Object a(InterfaceC1202e interfaceC1202e) {
                        return b.c(strI, c1200cT, interfaceC1202e);
                    }
                });
            }
            arrayList.add(c1200cT);
        }
        return arrayList;
    }
}
