package com.google.android.gms.common.api;

/* JADX INFO: loaded from: classes.dex */
public class b extends Exception {

    @Deprecated
    protected final Status mStatus;

    public b(Status status) {
        int iT = status.t();
        String strU = status.u() != null ? status.u() : "";
        StringBuilder sb = new StringBuilder(String.valueOf(iT).length() + 2 + String.valueOf(strU).length());
        sb.append(iT);
        sb.append(": ");
        sb.append(strU);
        super(sb.toString());
        this.mStatus = status;
    }

    public Status getStatus() {
        return this.mStatus;
    }

    public int getStatusCode() {
        return this.mStatus.t();
    }

    @Deprecated
    public String getStatusMessage() {
        return this.mStatus.u();
    }
}
