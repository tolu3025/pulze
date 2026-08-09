package q0;

import android.text.TextUtils;
import com.google.android.gms.common.api.Status;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class r {
    public static Status a(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            return new Status(17499);
        }
        String[] strArrSplit = str.split(":", 2);
        strArrSplit[0] = strArrSplit[0].trim();
        if (strArrSplit.length > 1 && (str2 = strArrSplit[1]) != null) {
            strArrSplit[1] = str2.trim();
        }
        List listAsList = Arrays.asList(strArrSplit);
        return listAsList.size() > 1 ? b((String) listAsList.get(0), (String) listAsList.get(1)) : b((String) listAsList.get(0), null);
    }

    private static Status b(String str, String str2) {
        int i3;
        str.hashCode();
        switch (str) {
            case "USER_CANCELLED":
                i3 = 18001;
                break;
            case "INVALID_RECIPIENT_EMAIL":
                i3 = 17033;
                break;
            case "WEB_CONTEXT_ALREADY_PRESENTED":
                i3 = 17057;
                break;
            case "INTERNAL_SUCCESS_SIGN_OUT":
                i3 = 17091;
                break;
            case "INVALID_IDP_RESPONSE":
            case "INVALID_LOGIN_CREDENTIALS":
            case "INVALID_PENDING_TOKEN":
                i3 = 17004;
                break;
            case "DYNAMIC_LINK_NOT_ACTIVATED":
                i3 = 17068;
                break;
            case "QUOTA_EXCEEDED":
                i3 = 17052;
                break;
            case "WEB_NETWORK_REQUEST_FAILED":
                i3 = 17061;
                break;
            case "INVALID_RECAPTCHA_VERSION":
                i3 = 17206;
                break;
            case "RECAPTCHA_NOT_ENABLED":
                i3 = 17200;
                break;
            case "EXPIRED_OOB_CODE":
                i3 = 17029;
                break;
            case "UNAUTHORIZED_DOMAIN":
                i3 = 17038;
                break;
            case "INVALID_OOB_CODE":
                i3 = 17030;
                break;
            case "MISSING_EMAIL":
                i3 = 17034;
                break;
            case "INVALID_CODE":
                i3 = 17044;
                break;
            case "INVALID_HOSTING_LINK_DOMAIN":
                i3 = 17214;
                break;
            case "TOKEN_EXPIRED":
                i3 = 17021;
                break;
            case "INVALID_TENANT_ID":
                i3 = 17079;
                break;
            case "ALTERNATE_CLIENT_IDENTIFIER_REQUIRED":
                i3 = 18002;
                break;
            case "INVALID_SESSION_INFO":
                i3 = 17046;
                break;
            case "SECOND_FACTOR_EXISTS":
                i3 = 17087;
                break;
            case "INVALID_EMAIL":
            case "INVALID_IDENTIFIER":
                i3 = 17008;
                break;
            case "ADMIN_ONLY_OPERATION":
                i3 = 17085;
                break;
            case "MISSING_OR_INVALID_NONCE":
                i3 = 17094;
                break;
            case "INVALID_CERT_HASH":
                i3 = 17064;
                break;
            case "NO_SUCH_PROVIDER":
                i3 = 17016;
                break;
            case "MFA_ENROLLMENT_NOT_FOUND":
                i3 = 17084;
                break;
            case "MISSING_PASSWORD":
                i3 = 17035;
                break;
            case "CREDENTIAL_TOO_OLD_LOGIN_AGAIN":
                i3 = 17014;
                break;
            case "TIMEOUT":
            case "<<Network Error>>":
                i3 = 17020;
                break;
            case "INVALID_REQ_TYPE":
                i3 = 17207;
                break;
            case "INVALID_RECAPTCHA_ACTION":
                i3 = 17203;
                break;
            case "OPERATION_NOT_ALLOWED":
            case "PASSWORD_LOGIN_DISABLED":
                i3 = 17006;
                break;
            case "WEB_INTERNAL_ERROR":
                i3 = 17062;
                break;
            case "SECOND_FACTOR_LIMIT_EXCEEDED":
                i3 = 17088;
                break;
            case "MISSING_MFA_ENROLLMENT_ID":
                i3 = 17082;
                break;
            case "USER_NOT_FOUND":
            case "EMAIL_NOT_FOUND":
                i3 = 17011;
                break;
            case "CAPTCHA_CHECK_FAILED":
                i3 = 17056;
                break;
            case "WEAK_PASSWORD":
                i3 = 17026;
                break;
            case "UNSUPPORTED_FIRST_FACTOR":
                i3 = 17089;
                break;
            case "INVALID_SENDER":
                i3 = 17032;
                break;
            case "MISSING_PHONE_NUMBER":
                i3 = 17041;
                break;
            case "INVALID_DYNAMIC_LINK_DOMAIN":
                i3 = 17074;
                break;
            case "MISSING_MFA_PENDING_CREDENTIAL":
                i3 = 17081;
                break;
            case "UNSUPPORTED_PASSTHROUGH_OPERATION":
                i3 = 17095;
                break;
            case "EMAIL_EXISTS":
                i3 = 17007;
                break;
            case "INVALID_ID_TOKEN":
                i3 = 17017;
                break;
            case "WEB_STORAGE_UNSUPPORTED":
                i3 = 17065;
                break;
            case "MISSING_CLIENT_TYPE":
                i3 = 17204;
                break;
            case "MISSING_RECAPTCHA_VERSION":
                i3 = 17205;
                break;
            case "UNVERIFIED_EMAIL":
                i3 = 17086;
                break;
            case "REJECTED_CREDENTIAL":
                i3 = 17075;
                break;
            case "INVALID_MFA_PENDING_CREDENTIAL":
                i3 = 17083;
                break;
            case "INVALID_VERIFICATION_PROOF":
                i3 = 17049;
                break;
            case "INVALID_PROVIDER_ID":
                i3 = 17071;
                break;
            case "CREDENTIAL_MISMATCH":
                i3 = 17002;
                break;
            case "WEB_CONTEXT_CANCELED":
                i3 = 17058;
                break;
            case "REQUIRES_SECOND_FACTOR_AUTH":
                i3 = 17078;
                break;
            case "MISSING_CLIENT_IDENTIFIER":
                i3 = 17093;
                break;
            case "INVALID_MESSAGE_PAYLOAD":
                i3 = 17031;
                break;
            case "RESET_PASSWORD_EXCEED_LIMIT":
            case "TOO_MANY_ATTEMPTS_TRY_LATER":
                i3 = 17010;
                break;
            case "INVALID_CUSTOM_TOKEN":
                i3 = 17000;
                break;
            case "INVALID_PASSWORD":
                i3 = 17009;
                break;
            case "INVALID_RECAPTCHA_TOKEN":
                i3 = 17202;
                break;
            case "SESSION_EXPIRED":
                i3 = 17051;
                break;
            case "MISSING_CODE":
                i3 = 17043;
                break;
            case "FEDERATED_USER_ID_ALREADY_LINKED":
                i3 = 17025;
                break;
            case "MISSING_RECAPTCHA_TOKEN":
                i3 = 17201;
                break;
            case "USER_DISABLED":
                i3 = 17005;
                break;
            case "INVALID_PHONE_NUMBER":
                i3 = 17042;
                break;
            case "INVALID_APP_CREDENTIAL":
                i3 = 17028;
                break;
            case "MISSING_CONTINUE_URI":
                i3 = 17040;
                break;
            case "MISSING_SESSION_INFO":
                i3 = 17045;
                break;
            case "EMAIL_CHANGE_NEEDS_VERIFICATION":
                i3 = 17090;
                break;
            case "UNSUPPORTED_TENANT_OPERATION":
                i3 = 17073;
                break;
            default:
                i3 = 17499;
                break;
        }
        if (i3 != 17499) {
            return new Status(i3, str2);
        }
        if (str2 == null) {
            return new Status(i3, str);
        }
        return new Status(i3, str + ":" + str2);
    }
}
