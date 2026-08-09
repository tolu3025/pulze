package io.flutter.plugin.platform;

import android.content.Context;
import android.view.MotionEvent;
import io.flutter.embedding.android.r;

/* JADX INFO: loaded from: classes.dex */
public class b extends io.flutter.embedding.android.r {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private a f7875l;

    public b(Context context, int i3, int i4, a aVar) {
        super(context, i3, i4, r.b.overlay);
        this.f7875l = aVar;
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        a aVar = this.f7875l;
        if (aVar == null || !aVar.a(motionEvent, true)) {
            return super.onHoverEvent(motionEvent);
        }
        return true;
    }
}
