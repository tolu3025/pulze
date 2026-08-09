package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class zzamn {
    private static final char[] zza;

    static {
        char[] cArr = new char[80];
        zza = cArr;
        Arrays.fill(cArr, ' ');
    }

    static String zza(zzamm zzammVar, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(str);
        zza(zzammVar, sb, 0);
        return sb.toString();
    }

    private static void zza(int i3, StringBuilder sb) {
        while (i3 > 0) {
            char[] cArr = zza;
            int length = i3 > cArr.length ? cArr.length : i3;
            sb.append(cArr, 0, length);
            i3 -= length;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0166  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void zza(com.google.android.gms.internal.p002firebaseauthapi.zzamm r19, java.lang.StringBuilder r20, int r21) {
        /*
            Method dump skipped, instruction units count: 580
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p002firebaseauthapi.zzamn.zza(com.google.android.gms.internal.firebase-auth-api.zzamm, java.lang.StringBuilder, int):void");
    }

    static void zza(StringBuilder sb, int i3, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                zza(sb, i3, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                zza(sb, i3, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        zza(i3, sb);
        if (!str.isEmpty()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(Character.toLowerCase(str.charAt(0)));
            for (int i4 = 1; i4 < str.length(); i4++) {
                char cCharAt = str.charAt(i4);
                if (Character.isUpperCase(cCharAt)) {
                    sb2.append("_");
                }
                sb2.append(Character.toLowerCase(cCharAt));
            }
            str = sb2.toString();
        }
        sb.append(str);
        if (obj instanceof String) {
            sb.append(": \"");
            sb.append(zzann.zza(zzajv.zza((String) obj)));
            sb.append('\"');
            return;
        }
        if (obj instanceof zzajv) {
            sb.append(": \"");
            sb.append(zzann.zza((zzajv) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof zzalf) {
            sb.append(" {");
            zza((zzalf) obj, sb, i3 + 2);
            sb.append("\n");
            zza(i3, sb);
            sb.append("}");
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb.append(": ");
            sb.append(obj);
            return;
        }
        sb.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        int i5 = i3 + 2;
        zza(sb, i5, "key", entry.getKey());
        zza(sb, i5, "value", entry.getValue());
        sb.append("\n");
        zza(i3, sb);
        sb.append("}");
    }
}
