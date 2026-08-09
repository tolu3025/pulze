package com.google.android.gms.common.util;

import V0.I;
import android.text.TextUtils;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Pattern f5672a = Pattern.compile("\\\\.");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Pattern f5673b = Pattern.compile("[\\\\\"/\b\f\n\r\t]");

    public static String a(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        Matcher matcher = f5673b.matcher(str);
        StringBuffer stringBuffer = null;
        while (matcher.find()) {
            if (stringBuffer == null) {
                stringBuffer = new StringBuffer();
            }
            char cCharAt = matcher.group().charAt(0);
            if (cCharAt == '\f') {
                str2 = "\\\\f";
            } else if (cCharAt == '\r') {
                str2 = "\\\\r";
            } else if (cCharAt == '\"') {
                str2 = "\\\\\\\"";
            } else if (cCharAt == '/') {
                str2 = "\\\\/";
            } else if (cCharAt != '\\') {
                switch (cCharAt) {
                    case '\b':
                        str2 = "\\\\b";
                        break;
                    case I.ARRAY_VALUE_FIELD_NUMBER /* 9 */:
                        str2 = "\\\\t";
                        break;
                    case I.TIMESTAMP_VALUE_FIELD_NUMBER /* 10 */:
                        str2 = "\\\\n";
                        break;
                }
            } else {
                str2 = "\\\\\\\\";
            }
            matcher.appendReplacement(stringBuffer, str2);
        }
        if (stringBuffer == null) {
            return str;
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }
}
