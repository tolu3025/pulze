package com.google.android.play.core.integrity;

import android.app.Activity;
import android.os.Bundle;
import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes.dex */
final class ah extends y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ ai f5745a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ah(ai aiVar, String str, long j3) {
        super(str, j3);
        this.f5745a = aiVar;
    }

    @Override // com.google.android.play.core.integrity.y
    final Task b(Activity activity, Bundle bundle) {
        return this.f5745a.f5746a.b(activity, bundle);
    }
}
