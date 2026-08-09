package r1;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.firebase.firestore.C0724e0;
import com.google.firebase.firestore.C0726f0;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.InterfaceC0738l0;
import java.util.Objects;
import l1.C1018d;
import s1.AbstractC1210a;

/* JADX INFO: loaded from: classes.dex */
public class e implements C1018d.InterfaceC0147d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private C1018d.b f11183a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final FirebaseFirestore f11184b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final byte[] f11185c;

    public e(FirebaseFirestore firebaseFirestore, byte[] bArr) {
        this.f11184b = firebaseFirestore;
        this.f11185c = bArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(C1018d.b bVar, Exception exc) {
        bVar.b("firebase_firestore", exc.getMessage(), AbstractC1210a.a(exc));
        b(null);
    }

    @Override // l1.C1018d.InterfaceC0147d
    public void b(Object obj) {
        this.f11183a.c();
    }

    @Override // l1.C1018d.InterfaceC0147d
    public void c(Object obj, final C1018d.b bVar) {
        this.f11183a = bVar;
        C0724e0 c0724e0T = this.f11184b.T(this.f11185c);
        Objects.requireNonNull(bVar);
        c0724e0T.a(new InterfaceC0738l0() { // from class: r1.c
            @Override // com.google.firebase.firestore.InterfaceC0738l0
            public final void a(Object obj2) {
                bVar.a((C0726f0) obj2);
            }
        });
        c0724e0T.addOnFailureListener(new OnFailureListener() { // from class: r1.d
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                this.f11181a.d(bVar, exc);
            }
        });
    }
}
