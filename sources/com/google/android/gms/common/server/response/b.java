package com.google.android.gms.common.server.response;

import com.google.android.gms.common.internal.AbstractC0642q;
import com.google.android.gms.common.internal.AbstractC0643s;
import com.google.android.gms.common.server.response.a;

/* JADX INFO: loaded from: classes.dex */
public abstract class b extends a implements N.d {
    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!getClass().isInstance(obj)) {
            return false;
        }
        a aVar = (a) obj;
        for (a.C0110a c0110a : getFieldMappings().values()) {
            if (isFieldSet(c0110a)) {
                if (!aVar.isFieldSet(c0110a) || !AbstractC0642q.b(getFieldValue(c0110a), aVar.getFieldValue(c0110a))) {
                    return false;
                }
            } else if (aVar.isFieldSet(c0110a)) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.gms.common.server.response.a
    public Object getValueObject(String str) {
        return null;
    }

    public int hashCode() {
        int iHashCode = 0;
        for (a.C0110a c0110a : getFieldMappings().values()) {
            if (isFieldSet(c0110a)) {
                iHashCode = (iHashCode * 31) + AbstractC0643s.k(getFieldValue(c0110a)).hashCode();
            }
        }
        return iHashCode;
    }

    @Override // com.google.android.gms.common.server.response.a
    public boolean isPrimitiveFieldSet(String str) {
        return false;
    }
}
