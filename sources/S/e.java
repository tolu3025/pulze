package s;

import androidx.datastore.preferences.protobuf.AbstractC0505t;

/* JADX INFO: loaded from: classes.dex */
abstract /* synthetic */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final /* synthetic */ int[] f11224a;

    static {
        int[] iArr = new int[AbstractC0505t.d.values().length];
        f11224a = iArr;
        try {
            iArr[AbstractC0505t.d.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f11224a[AbstractC0505t.d.NEW_BUILDER.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f11224a[AbstractC0505t.d.BUILD_MESSAGE_INFO.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f11224a[AbstractC0505t.d.GET_DEFAULT_INSTANCE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f11224a[AbstractC0505t.d.GET_PARSER.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f11224a[AbstractC0505t.d.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            f11224a[AbstractC0505t.d.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
    }
}
