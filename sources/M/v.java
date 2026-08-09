package M;

import android.content.Context;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.internal.base.zao;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
final class v extends zao {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f2691a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ C0421i f2692b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(C0421i c0421i, Context context) {
        super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper());
        Objects.requireNonNull(c0421i);
        this.f2692b = c0421i;
        this.f2691a = context.getApplicationContext();
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i3 = message.what;
        if (i3 != 1) {
            StringBuilder sb = new StringBuilder(String.valueOf(i3).length() + 39);
            sb.append("Don't know how to handle this message: ");
            sb.append(i3);
            Log.w("GoogleApiAvailability", sb.toString());
            return;
        }
        C0421i c0421i = this.f2692b;
        Context context = this.f2691a;
        int iF = c0421i.f(context);
        if (c0421i.i(iF)) {
            c0421i.o(context, iF);
        }
    }
}
