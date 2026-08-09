package com.google.firebase.auth;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.common.internal.AbstractC0643s;
import com.google.android.gms.internal.p002firebaseauthapi.zzafc;
import com.google.android.gms.internal.p002firebaseauthapi.zzagl;
import com.google.firebase.auth.internal.GenericIdpActivity;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class N extends AbstractC0691n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Bundle f5963a;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final FirebaseAuth f5964a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Bundle f5965b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Bundle f5966c;

        private a(String str, FirebaseAuth firebaseAuth) {
            Bundle bundle = new Bundle();
            this.f5965b = bundle;
            Bundle bundle2 = new Bundle();
            this.f5966c = bundle2;
            this.f5964a = firebaseAuth;
            bundle.putString("com.google.firebase.auth.KEY_API_KEY", firebaseAuth.l().r().b());
            bundle.putString("com.google.firebase.auth.KEY_PROVIDER_ID", str);
            bundle.putBundle("com.google.firebase.auth.KEY_PROVIDER_CUSTOM_PARAMS", bundle2);
            bundle.putString("com.google.firebase.auth.internal.CLIENT_VERSION", zzafc.zza().zzb());
            bundle.putString("com.google.firebase.auth.KEY_TENANT_ID", firebaseAuth.q());
            bundle.putString("com.google.firebase.auth.KEY_FIREBASE_APP_NAME", firebaseAuth.l().q());
            bundle.putString("com.google.firebase.auth.KEY_CUSTOM_AUTH_DOMAIN", firebaseAuth.n());
        }

        public a a(Map map) {
            for (Map.Entry entry : map.entrySet()) {
                this.f5966c.putString((String) entry.getKey(), (String) entry.getValue());
            }
            return this;
        }

        public N b() {
            return new N(this.f5965b);
        }

        public a c(List list) {
            this.f5965b.putStringArrayList("com.google.firebase.auth.KEY_PROVIDER_SCOPES", new ArrayList<>(list));
            return this;
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f5967a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f5968b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f5969c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f5970d;

        private b(String str) {
            this.f5967a = str;
        }

        public AbstractC0679h a() {
            return E0.A(this.f5967a, this.f5968b, this.f5969c, this.f5970d);
        }

        public b b(String str) {
            this.f5969c = str;
            return this;
        }

        public b c(String str) {
            this.f5968b = str;
            return this;
        }

        public b d(String str, String str2) {
            this.f5968b = str;
            this.f5970d = str2;
            return this;
        }
    }

    private N(Bundle bundle) {
        this.f5963a = bundle;
    }

    public static a d(String str) {
        return e(str, FirebaseAuth.getInstance());
    }

    public static a e(String str, FirebaseAuth firebaseAuth) {
        AbstractC0643s.e(str);
        AbstractC0643s.k(firebaseAuth);
        if (!"facebook.com".equals(str) || zzagl.zza(firebaseAuth.l())) {
            return new a(str, firebaseAuth);
        }
        throw new IllegalArgumentException("Sign in with Facebook is not supported via this method; the Facebook TOS dictate that you must use the Facebook Android SDK for Facebook login.");
    }

    public static b f(String str) {
        return new b(AbstractC0643s.e(str));
    }

    @Override // com.google.firebase.auth.AbstractC0691n
    public final void a(Activity activity) {
        Intent intent = new Intent("com.google.firebase.auth.internal.NONGMSCORE_LINK");
        intent.setClass(activity, GenericIdpActivity.class);
        intent.setPackage(activity.getPackageName());
        intent.putExtras(this.f5963a);
        activity.startActivity(intent);
    }

    @Override // com.google.firebase.auth.AbstractC0691n
    public final void b(Activity activity) {
        Intent intent = new Intent("com.google.firebase.auth.internal.NONGMSCORE_REAUTHENTICATE");
        intent.setClass(activity, GenericIdpActivity.class);
        intent.setPackage(activity.getPackageName());
        intent.putExtras(this.f5963a);
        activity.startActivity(intent);
    }

    @Override // com.google.firebase.auth.AbstractC0691n
    public final void c(Activity activity) {
        Intent intent = new Intent("com.google.firebase.auth.internal.NONGMSCORE_SIGN_IN");
        intent.setClass(activity, GenericIdpActivity.class);
        intent.setPackage(activity.getPackageName());
        intent.putExtras(this.f5963a);
        activity.startActivity(intent);
    }
}
