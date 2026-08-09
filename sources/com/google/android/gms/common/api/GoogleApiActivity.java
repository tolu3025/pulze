package com.google.android.gms.common.api;

import M.C0413a;
import M.C0421i;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.api.internal.C0607g;
import com.google.android.gms.common.internal.AbstractC0643s;

/* JADX INFO: loaded from: classes.dex */
public class GoogleApiActivity extends Activity implements DialogInterface.OnCancelListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected int f5308a = 0;

    public static Intent a(Context context, PendingIntent pendingIntent, int i3, boolean z2) {
        Intent intent = new Intent(context, (Class<?>) GoogleApiActivity.class);
        intent.putExtra("pending_intent", pendingIntent);
        intent.putExtra("failing_client_id", i3);
        intent.putExtra("notify_manager", z2);
        return intent;
    }

    private final void b() {
        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            Log.e("GoogleApiActivity", "Activity started without extras");
            finish();
            return;
        }
        PendingIntent pendingIntent = (PendingIntent) extras.get("pending_intent");
        Integer num = (Integer) extras.get("error_code");
        if (pendingIntent == null && num == null) {
            Log.e("GoogleApiActivity", "Activity started without resolution");
            finish();
            return;
        }
        if (pendingIntent == null) {
            C0421i.m().n(this, ((Integer) AbstractC0643s.k(num)).intValue(), 2, this);
            this.f5308a = 1;
            return;
        }
        try {
            startIntentSenderForResult(pendingIntent.getIntentSender(), 1, null, 0, 0, 0);
            this.f5308a = 1;
        } catch (ActivityNotFoundException e3) {
            if (extras.getBoolean("notify_manager", true)) {
                C0607g.n(this).A(new C0413a(22, null), getIntent().getIntExtra("failing_client_id", -1));
            } else {
                String string = pendingIntent.toString();
                StringBuilder sb = new StringBuilder(string.length() + 36);
                sb.append("Activity not found while launching ");
                sb.append(string);
                sb.append(".");
                String string2 = sb.toString();
                if (Build.FINGERPRINT.contains("generic")) {
                    string2 = string2.concat(" This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store.");
                }
                Log.e("GoogleApiActivity", string2, e3);
            }
            this.f5308a = 1;
            finish();
        } catch (IntentSender.SendIntentException e4) {
            Log.e("GoogleApiActivity", "Failed to launch pendingIntent", e4);
            finish();
        }
    }

    @Override // android.app.Activity
    protected final void onActivityResult(int i3, int i4, Intent intent) {
        super.onActivityResult(i3, i4, intent);
        if (i3 == 1) {
            boolean booleanExtra = getIntent().getBooleanExtra("notify_manager", true);
            this.f5308a = 0;
            setResult(i4, intent);
            if (booleanExtra) {
                C0607g c0607gN = C0607g.n(this);
                if (i4 == -1) {
                    c0607gN.t();
                } else if (i4 == 0) {
                    c0607gN.A(new C0413a(13, null), getIntent().getIntExtra("failing_client_id", -1));
                }
            }
        } else if (i3 == 2) {
            this.f5308a = 0;
            setResult(i4, intent);
        }
        finish();
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.f5308a = 0;
        setResult(0);
        finish();
    }

    @Override // android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.f5308a = bundle.getInt("resolution");
        }
        if (this.f5308a != 1) {
            b();
        }
    }

    @Override // android.app.Activity
    protected final void onSaveInstanceState(Bundle bundle) {
        bundle.putInt("resolution", this.f5308a);
        super.onSaveInstanceState(bundle);
    }
}
