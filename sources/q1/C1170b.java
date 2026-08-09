package q1;

import com.google.firebase.firestore.FirebaseFirestore;

/* JADX INFO: renamed from: q1.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1170b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final FirebaseFirestore f10999a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f11000b;

    public C1170b(FirebaseFirestore firebaseFirestore, String str) {
        this.f10999a = firebaseFirestore;
        this.f11000b = str;
    }

    public String a() {
        return this.f11000b;
    }

    public FirebaseFirestore b() {
        return this.f10999a;
    }
}
