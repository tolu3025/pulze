package p1;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.InterfaceC0668b0;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import p1.AbstractC1068c0;

/* JADX INFO: renamed from: p1.a0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1064a0 implements AbstractC1068c0.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final Map f10379a = new HashMap();

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void e(AbstractC1068c0.F f3, Task task) {
        if (!task.isSuccessful()) {
            f3.b(AbstractC1113w.e(task.getException()));
            return;
        }
        InterfaceC0668b0 interfaceC0668b0 = (InterfaceC0668b0) task.getResult();
        f10379a.put(interfaceC0668b0.e(), interfaceC0668b0);
        f3.a(new AbstractC1068c0.z.a().b(Long.valueOf(interfaceC0668b0.h())).c(Long.valueOf(interfaceC0668b0.b())).f(interfaceC0668b0.e()).e(interfaceC0668b0.a()).d(Long.valueOf(interfaceC0668b0.g())).a());
    }

    @Override // p1.AbstractC1068c0.j
    public void a(String str, String str2, AbstractC1068c0.F f3) {
        com.google.firebase.auth.Y yB = com.google.firebase.auth.Z.b((InterfaceC0668b0) f10379a.get(str), str2);
        String string = UUID.randomUUID().toString();
        Y.f10369d.put(string, yB);
        f3.a(string);
    }

    @Override // p1.AbstractC1068c0.j
    public void b(String str, String str2, AbstractC1068c0.F f3) {
        com.google.firebase.auth.Y yC = com.google.firebase.auth.Z.c(str, str2);
        String string = UUID.randomUUID().toString();
        Y.f10369d.put(string, yC);
        f3.a(string);
    }

    @Override // p1.AbstractC1068c0.j
    public void c(String str, final AbstractC1068c0.F f3) {
        com.google.firebase.auth.Z.a((com.google.firebase.auth.L) Y.f10367b.get(str)).addOnCompleteListener(new OnCompleteListener() { // from class: p1.Z
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                C1064a0.e(f3, task);
            }
        });
    }
}
