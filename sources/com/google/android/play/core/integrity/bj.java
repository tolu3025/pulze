package com.google.android.play.core.integrity;

import android.app.Activity;
import android.os.Bundle;
import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes.dex */
final class bj extends y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ bk f5805a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bj(bk bkVar, String str, long j3) {
        super(str, j3);
        this.f5805a = bkVar;
    }

    @Override // com.google.android.play.core.integrity.y
    final Task b(Activity activity, Bundle bundle) {
        bundle.putLong("cloud.prj", this.f5805a.f5808e);
        return this.f5805a.f5806c.c(activity, bundle);
    }
}
