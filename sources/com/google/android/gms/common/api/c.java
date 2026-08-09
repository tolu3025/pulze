package com.google.android.gms.common.api;

import V0.F;
import V0.I;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {
    public static String a(int i3) {
        switch (i3) {
            case -1:
                return "SUCCESS_CACHE";
            case 0:
                return "SUCCESS";
            case 1:
            case I.ARRAY_VALUE_FIELD_NUMBER /* 9 */:
            case 11:
            case F.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
            default:
                StringBuilder sb = new StringBuilder(String.valueOf(i3).length() + 21);
                sb.append("unknown status code: ");
                sb.append(i3);
                return sb.toString();
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case I.TIMESTAMP_VALUE_FIELD_NUMBER /* 10 */:
                return "DEVELOPER_ERROR";
            case 13:
                return "ERROR";
            case 14:
                return "INTERRUPTED";
            case 15:
                return "TIMEOUT";
            case 16:
                return "CANCELED";
            case I.STRING_VALUE_FIELD_NUMBER /* 17 */:
                return "API_NOT_CONNECTED";
            case I.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                return "DEAD_CLIENT";
            case I.FIELD_REFERENCE_VALUE_FIELD_NUMBER /* 19 */:
                return "REMOTE_EXCEPTION";
            case I.FUNCTION_VALUE_FIELD_NUMBER /* 20 */:
                return "CONNECTION_SUSPENDED_DURING_CALL";
            case I.PIPELINE_VALUE_FIELD_NUMBER /* 21 */:
                return "RECONNECTION_TIMED_OUT_DURING_UPDATE";
            case I.VARIABLE_REFERENCE_VALUE_FIELD_NUMBER /* 22 */:
                return "RECONNECTION_TIMED_OUT";
        }
    }
}
