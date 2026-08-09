package com.google.android.play.core.common;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.ResultReceiver;

/* JADX INFO: loaded from: classes.dex */
public class PlayCoreDialogWrapperActivity extends Activity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ResultReceiver f5726a;

    private final void a() {
        ResultReceiver resultReceiver = this.f5726a;
        if (resultReceiver != null) {
            resultReceiver.send(3, new Bundle());
        }
    }

    @Override // android.app.Activity
    protected final void onActivityResult(int i3, int i4, Intent intent) {
        ResultReceiver resultReceiver;
        Bundle bundle;
        int i5;
        super.onActivityResult(i3, i4, intent);
        if (i3 == 0 && (resultReceiver = this.f5726a) != null) {
            if (i4 == -1) {
                bundle = new Bundle();
                i5 = 1;
            } else if (i4 == 0) {
                bundle = new Bundle();
                i5 = 2;
            }
            resultReceiver.send(i5, bundle);
        }
        finish();
    }

    @Override // android.app.Activity
    protected final void onCreate(Bundle bundle) {
        Intent intent;
        int intExtra = getIntent().getIntExtra("window_flags", 0);
        if (intExtra != 0) {
            getWindow().getDecorView().setSystemUiVisibility(intExtra);
            intent = new Intent();
            intent.putExtra("window_flags", intExtra);
        } else {
            intent = null;
        }
        Intent intent2 = intent;
        super.onCreate(bundle);
        if (bundle != null) {
            this.f5726a = (ResultReceiver) bundle.getParcelable("result_receiver");
            return;
        }
        this.f5726a = (ResultReceiver) getIntent().getParcelableExtra("result_receiver");
        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            a();
            finish();
        } else {
            try {
                startIntentSenderForResult(((PendingIntent) extras.get("confirmation_intent")).getIntentSender(), 0, intent2, 0, 0, 0);
            } catch (IntentSender.SendIntentException unused) {
                a();
                finish();
            }
        }
    }

    @Override // android.app.Activity
    protected final void onSaveInstanceState(Bundle bundle) {
        bundle.putParcelable("result_receiver", this.f5726a);
    }
}
