package q0;

import com.google.android.gms.common.internal.AbstractC0643s;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import java.util.List;

/* JADX INFO: renamed from: q0.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1154m extends com.google.firebase.auth.H {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C1150i f10757a;

    public C1154m(C1150i c1150i) {
        AbstractC0643s.k(c1150i);
        this.f10757a = c1150i;
    }

    @Override // com.google.firebase.auth.H
    public final Task a(com.google.firebase.auth.I i3, String str) {
        AbstractC0643s.k(i3);
        C1150i c1150i = this.f10757a;
        return FirebaseAuth.getInstance(c1150i.O()).Q(c1150i, i3, str);
    }

    @Override // com.google.firebase.auth.H
    public final List b() {
        return this.f10757a.b0();
    }

    @Override // com.google.firebase.auth.H
    public final Task c() {
        return this.f10757a.t(false).continueWithTask(new C1153l(this));
    }

    @Override // com.google.firebase.auth.H
    public final Task d(String str) {
        AbstractC0643s.e(str);
        C1150i c1150i = this.f10757a;
        return FirebaseAuth.getInstance(c1150i.O()).T(c1150i, str);
    }
}
