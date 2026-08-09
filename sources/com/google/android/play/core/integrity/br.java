package com.google.android.play.core.integrity;

import android.app.Activity;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.integrity.StandardIntegrityManager;

/* JADX INFO: loaded from: classes.dex */
final class br extends StandardIntegrityManager.StandardIntegrityToken {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f5823a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final y f5824b;

    br(String str, y yVar) {
        this.f5823a = str;
        this.f5824b = yVar;
    }

    @Override // com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityToken
    public final Task<Integer> showDialog(Activity activity, int i3) {
        return this.f5824b.a(activity, i3);
    }

    @Override // com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityToken
    public final String token() {
        return this.f5823a;
    }
}
