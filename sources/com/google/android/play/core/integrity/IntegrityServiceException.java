package com.google.android.play.core.integrity;

import com.google.android.gms.common.api.Status;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public class IntegrityServiceException extends com.google.android.gms.common.api.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Throwable f5727a;

    IntegrityServiceException(int i3, Throwable th) {
        super(new Status(i3, String.format(Locale.ROOT, "Integrity API error (%d): %s.", Integer.valueOf(i3), com.google.android.play.core.integrity.model.a.a(i3))));
        if (i3 == 0) {
            throw new IllegalArgumentException("ErrorCode should not be 0.");
        }
        this.f5727a = th;
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable getCause() {
        return this.f5727a;
    }

    public int getErrorCode() {
        return super.getStatusCode();
    }
}
