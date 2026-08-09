package com.google.android.recaptcha;

import kotlin.jvm.internal.h;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public final class RecaptchaAction {
    public static final Companion Companion = new Companion(null);
    public static final RecaptchaAction LOGIN = new RecaptchaAction("login");
    public static final RecaptchaAction SIGNUP = new RecaptchaAction("signup");
    private final String action;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(h hVar) {
            this();
        }

        public final RecaptchaAction custom(String str) {
            return new RecaptchaAction(str, null);
        }
    }

    private RecaptchaAction(String str) {
        this.action = str;
    }

    public static /* synthetic */ RecaptchaAction copy$default(RecaptchaAction recaptchaAction, String str, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = recaptchaAction.action;
        }
        return recaptchaAction.copy(str);
    }

    public static final RecaptchaAction custom(String str) {
        return Companion.custom(str);
    }

    public final String component1() {
        return this.action;
    }

    public final RecaptchaAction copy(String str) {
        return new RecaptchaAction(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RecaptchaAction) && m.a(this.action, ((RecaptchaAction) obj).action);
    }

    public final String getAction() {
        return this.action;
    }

    public int hashCode() {
        return this.action.hashCode();
    }

    public String toString() {
        return "RecaptchaAction(action=" + this.action + ")";
    }

    public /* synthetic */ RecaptchaAction(String str, h hVar) {
        this(str);
    }
}
