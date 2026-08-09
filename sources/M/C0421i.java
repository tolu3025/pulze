package M;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.util.Log;
import android.util.TypedValue;
import android.widget.ProgressBar;
import androidx.core.app.g;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.internal.InterfaceC0611k;
import com.google.android.gms.common.api.internal.N;
import com.google.android.gms.common.api.internal.O;
import com.google.android.gms.common.internal.AbstractC0643s;
import com.google.android.gms.internal.base.zak;

/* JADX INFO: renamed from: M.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0421i extends j {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f2672c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.google.android.gms.common.internal.D f2673d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Object f2670f = new Object();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final C0421i f2671g = new C0421i();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f2669e = j.f2674a;

    public static C0421i m() {
        return f2671g;
    }

    @Override // M.j
    public Intent a(Context context, int i3, String str) {
        return super.a(context, i3, str);
    }

    @Override // M.j
    public PendingIntent b(Context context, int i3, int i4) {
        return super.b(context, i3, i4);
    }

    @Override // M.j
    public final String d(int i3) {
        return super.d(i3);
    }

    @Override // M.j
    public int f(Context context) {
        return super.f(context);
    }

    @Override // M.j
    public int g(Context context, int i3) {
        return super.g(context, i3);
    }

    @Override // M.j
    public final boolean i(int i3) {
        return super.i(i3);
    }

    public Dialog k(Activity activity, int i3, int i4, DialogInterface.OnCancelListener onCancelListener) {
        return p(activity, i3, com.google.android.gms.common.internal.H.b(activity, a(activity, i3, "d"), i4), onCancelListener, null);
    }

    public PendingIntent l(Context context, C0413a c0413a) {
        return c0413a.w() ? c0413a.v() : b(context, c0413a.t(), 0);
    }

    public boolean n(Activity activity, int i3, int i4, DialogInterface.OnCancelListener onCancelListener) {
        Dialog dialogK = k(activity, i3, i4, onCancelListener);
        if (dialogK == null) {
            return false;
        }
        w(activity, dialogK, "GooglePlayServicesErrorDialog", onCancelListener);
        return true;
    }

    public void o(Context context, int i3) {
        r(context, i3, null, c(context, i3, 0, "n"));
    }

    final Dialog p(Context context, int i3, com.google.android.gms.common.internal.H h3, DialogInterface.OnCancelListener onCancelListener, DialogInterface.OnClickListener onClickListener) {
        if (i3 == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        AlertDialog.Builder builder = "Theme.Dialog.Alert".equals(context.getResources().getResourceEntryName(typedValue.resourceId)) ? new AlertDialog.Builder(context, 5) : null;
        if (builder == null) {
            builder = new AlertDialog.Builder(context);
        }
        builder.setMessage(com.google.android.gms.common.internal.E.c(context, i3));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        String strE = com.google.android.gms.common.internal.E.e(context, i3);
        DialogInterface.OnClickListener onClickListener2 = h3;
        if (strE != null) {
            if (h3 == null) {
                onClickListener2 = onClickListener;
            }
            builder.setPositiveButton(strE, onClickListener2);
        }
        String strA = com.google.android.gms.common.internal.E.a(context, i3);
        if (strA != null) {
            builder.setTitle(strA);
        }
        Log.w("GoogleApiAvailability", String.format("Creating dialog for Google Play services availability issue. ConnectionResult=%s", Integer.valueOf(i3)), new IllegalArgumentException());
        return builder.create();
    }

    public final boolean q(Activity activity, InterfaceC0611k interfaceC0611k, int i3, int i4, DialogInterface.OnCancelListener onCancelListener) {
        Dialog dialogP = p(activity, i3, com.google.android.gms.common.internal.H.c(interfaceC0611k, a(activity, i3, "d"), 2), onCancelListener, null);
        if (dialogP == null) {
            return false;
        }
        w(activity, dialogP, "GooglePlayServicesErrorDialog", onCancelListener);
        return true;
    }

    final void r(Context context, int i3, String str, PendingIntent pendingIntent) {
        int i4;
        String str2;
        Log.w("GoogleApiAvailability", String.format("GMS core API Availability. ConnectionResult=%s, tag=%s", Integer.valueOf(i3), null), new IllegalArgumentException());
        if (i3 == 18) {
            x(context);
            return;
        }
        if (pendingIntent == null) {
            if (i3 == 6) {
                Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
                return;
            }
            return;
        }
        String strB = com.google.android.gms.common.internal.E.b(context, i3);
        String strD = com.google.android.gms.common.internal.E.d(context, i3);
        Resources resources = context.getResources();
        NotificationManager notificationManager = (NotificationManager) AbstractC0643s.k(context.getSystemService("notification"));
        g.d dVarN = new g.d(context).k(true).e(true).i(strB).n(new g.b().h(strD));
        boolean zC = com.google.android.gms.common.util.g.c(context);
        int i5 = R.drawable.stat_sys_warning;
        if (zC) {
            int i6 = context.getApplicationInfo().icon;
            if (i6 != 0) {
                i5 = i6;
            }
            dVarN.m(i5).l(2);
            if (com.google.android.gms.common.util.g.d(context)) {
                dVarN.a(L.a.f2625a, resources.getString(L.b.f2640o), pendingIntent);
            } else {
                dVarN.g(pendingIntent);
            }
        } else {
            dVarN.m(R.drawable.stat_sys_warning).o(resources.getString(L.b.f2633h)).p(System.currentTimeMillis()).g(pendingIntent).h(strD);
        }
        if (com.google.android.gms.common.util.l.c()) {
            AbstractC0643s.m(com.google.android.gms.common.util.l.c());
            synchronized (f2670f) {
                str2 = this.f2672c;
            }
            if (str2 == null) {
                str2 = "com.google.android.gms.availability";
                NotificationChannel notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
                String string = context.getResources().getString(L.b.f2632g);
                if (notificationChannel == null) {
                    notificationManager.createNotificationChannel(AbstractC0420h.a("com.google.android.gms.availability", string, 4));
                } else if (!string.contentEquals(notificationChannel.getName())) {
                    notificationChannel.setName(string);
                    notificationManager.createNotificationChannel(notificationChannel);
                }
            }
            dVarN.f(str2);
        }
        Notification notificationB = dVarN.b();
        if (i3 == 1 || i3 == 2 || i3 == 3) {
            n.f2680b.set(false);
            i4 = 10436;
        } else {
            i4 = 39789;
        }
        notificationManager.notify(i4, notificationB);
    }

    public final boolean s(Context context, C0413a c0413a, int i3) {
        PendingIntent pendingIntentL;
        if (T.c.a(context) || (pendingIntentL = l(context, c0413a)) == null) {
            return false;
        }
        r(context, c0413a.t(), null, zak.zaa(context, 0, GoogleApiActivity.a(context, pendingIntentL, i3, true), zak.zaa | 134217728));
        t(context, c0413a, false);
        return true;
    }

    public final void t(Context context, C0413a c0413a, boolean z2) {
        Integer numS = c0413a.s();
        com.google.android.gms.common.internal.B b3 = new com.google.android.gms.common.internal.B(numS == null ? -1 : numS.intValue(), context.getPackageName(), System.currentTimeMillis(), c0413a.t(), z2);
        if (this.f2673d == null) {
            this.f2673d = new O.f(context);
        }
        this.f2673d.b(b3);
    }

    public final Dialog u(Activity activity, DialogInterface.OnCancelListener onCancelListener) {
        ProgressBar progressBar = new ProgressBar(activity, null, R.attr.progressBarStyleLarge);
        progressBar.setIndeterminate(true);
        progressBar.setVisibility(0);
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setView(progressBar);
        builder.setMessage(com.google.android.gms.common.internal.E.c(activity, 18));
        builder.setPositiveButton("", (DialogInterface.OnClickListener) null);
        AlertDialog alertDialogCreate = builder.create();
        w(activity, alertDialogCreate, "GooglePlayServicesUpdatingDialog", onCancelListener);
        return alertDialogCreate;
    }

    public final O v(Context context, N n3) {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
        intentFilter.addDataScheme("package");
        O o2 = new O(n3);
        androidx.core.content.a.h(context, o2, intentFilter, 2);
        o2.a(context);
        if (h(context, "com.google.android.gms")) {
            return o2;
        }
        n3.a();
        o2.b();
        return null;
    }

    final void w(Activity activity, Dialog dialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof androidx.fragment.app.d) {
                t.u1(dialog, onCancelListener).t1(((androidx.fragment.app.d) activity).I(), str);
                return;
            }
        } catch (NoClassDefFoundError unused) {
        }
        DialogFragmentC0414b.a(dialog, onCancelListener).show(activity.getFragmentManager(), str);
    }

    final void x(Context context) {
        new v(this, context).sendEmptyMessageDelayed(1, 120000L);
    }
}
