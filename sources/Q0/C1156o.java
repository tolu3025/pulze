package q0;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC0643s;
import com.google.android.gms.internal.p002firebaseauthapi.zzaas;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.C0666a0;
import com.google.firebase.auth.FirebaseAuth;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k0.C0992f;

/* JADX INFO: renamed from: q0.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1156o extends com.google.firebase.auth.K {
    public static final Parcelable.Creator<C1156o> CREATOR = new C1158q();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f10763a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C1157p f10764b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f10765c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.firebase.auth.E0 f10766d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final C1150i f10767e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List f10768f;

    public C1156o(List list, C1157p c1157p, String str, com.google.firebase.auth.E0 e02, C1150i c1150i, List list2) {
        this.f10763a = (List) AbstractC0643s.k(list);
        this.f10764b = (C1157p) AbstractC0643s.k(c1157p);
        this.f10765c = AbstractC0643s.e(str);
        this.f10766d = e02;
        this.f10767e = c1150i;
        this.f10768f = (List) AbstractC0643s.k(list2);
    }

    public static C1156o x(zzaas zzaasVar, FirebaseAuth firebaseAuth, com.google.firebase.auth.A a3) {
        List<com.google.firebase.auth.J> listZzc = zzaasVar.zzc();
        ArrayList arrayList = new ArrayList();
        for (com.google.firebase.auth.J j3 : listZzc) {
            if (j3 instanceof com.google.firebase.auth.U) {
                arrayList.add((com.google.firebase.auth.U) j3);
            }
        }
        List<com.google.firebase.auth.J> listZzc2 = zzaasVar.zzc();
        ArrayList arrayList2 = new ArrayList();
        for (com.google.firebase.auth.J j4 : listZzc2) {
            if (j4 instanceof C0666a0) {
                arrayList2.add((C0666a0) j4);
            }
        }
        return new C1156o(arrayList, C1157p.u(zzaasVar.zzc(), zzaasVar.zzb()), firebaseAuth.l().q(), zzaasVar.zza(), (C1150i) a3, arrayList2);
    }

    @Override // com.google.firebase.auth.K
    public final FirebaseAuth s() {
        return FirebaseAuth.getInstance(C0992f.p(this.f10765c));
    }

    @Override // com.google.firebase.auth.K
    public final List t() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f10763a.iterator();
        while (it.hasNext()) {
            arrayList.add((com.google.firebase.auth.U) it.next());
        }
        Iterator it2 = this.f10768f.iterator();
        while (it2.hasNext()) {
            arrayList.add((C0666a0) it2.next());
        }
        return arrayList;
    }

    @Override // com.google.firebase.auth.K
    public final com.google.firebase.auth.L u() {
        return this.f10764b;
    }

    @Override // com.google.firebase.auth.K
    public final Task v(com.google.firebase.auth.I i3) {
        return s().W(i3, this.f10764b, this.f10767e).continueWithTask(new C1155n(this));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int iA = N.c.a(parcel);
        N.c.G(parcel, 1, this.f10763a, false);
        N.c.A(parcel, 2, u(), i3, false);
        N.c.C(parcel, 3, this.f10765c, false);
        N.c.A(parcel, 4, this.f10766d, i3, false);
        N.c.A(parcel, 5, this.f10767e, i3, false);
        N.c.G(parcel, 6, this.f10768f, false);
        N.c.b(parcel, iA);
    }
}
