package p1;

import com.google.firebase.auth.InterfaceC0668b0;
import p1.AbstractC1068c0;

/* JADX INFO: renamed from: p1.b0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1066b0 implements AbstractC1068c0.l {
    @Override // p1.AbstractC1068c0.l
    public void a(String str, String str2, AbstractC1068c0.G g3) {
        ((InterfaceC0668b0) C1064a0.f10379a.get(str)).i(str2);
        g3.a();
    }

    @Override // p1.AbstractC1068c0.l
    public void b(String str, String str2, String str3, AbstractC1068c0.F f3) {
        InterfaceC0668b0 interfaceC0668b0 = (InterfaceC0668b0) C1064a0.f10379a.get(str);
        f3.a((str2 == null || str3 == null) ? interfaceC0668b0.f() : interfaceC0668b0.d(str2, str3));
    }
}
