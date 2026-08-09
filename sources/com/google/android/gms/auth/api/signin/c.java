package com.google.android.gms.auth.api.signin;

import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
final /* synthetic */ class c implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final /* synthetic */ c f5297a = new c();

    private /* synthetic */ c() {
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        Parcelable.Creator<GoogleSignInAccount> creator = GoogleSignInAccount.CREATOR;
        return ((Scope) obj).s().compareTo(((Scope) obj2).s());
    }
}
