package com.google.android.gms.common.util;

import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class k {
    public static void a(StringBuilder sb, HashMap map) {
        sb.append("{");
        boolean z2 = true;
        for (String str : map.keySet()) {
            if (!z2) {
                sb.append(",");
            }
            String str2 = (String) map.get(str);
            sb.append("\"");
            sb.append(str);
            sb.append("\":");
            if (str2 == null) {
                sb.append("null");
            } else {
                sb.append("\"");
                sb.append(str2);
                sb.append("\"");
            }
            z2 = false;
        }
        sb.append("}");
    }
}
