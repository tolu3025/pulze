package androidx.window.embedding;

import J1.N;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import androidx.window.R;
import b2.p;
import java.util.Set;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public final class SplitRuleParser {
    private final ComponentName buildClassName(String str, CharSequence charSequence) {
        if (charSequence == null || charSequence.length() == 0) {
            throw new IllegalArgumentException("Activity name must not be null");
        }
        String string = charSequence.toString();
        if (string.charAt(0) == '.') {
            return new ComponentName(str, m.k(str, string));
        }
        int iZ = p.z(string, '/', 0, false, 6, null);
        if (iZ > 0) {
            str = string.substring(0, iZ);
            m.d(str, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            string = string.substring(iZ + 1);
            m.d(string, "(this as java.lang.String).substring(startIndex)");
        }
        if (m.a(string, "*") || p.z(string, '.', 0, false, 6, null) >= 0) {
            return new ComponentName(str, string);
        }
        return new ComponentName(str, str + '.' + string);
    }

    private final ActivityFilter parseActivityFilter(Context context, XmlResourceParser xmlResourceParser) {
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(xmlResourceParser, R.styleable.ActivityFilter, 0, 0);
        String string = typedArrayObtainStyledAttributes.getString(R.styleable.ActivityFilter_activityName);
        String string2 = typedArrayObtainStyledAttributes.getString(R.styleable.ActivityFilter_activityAction);
        String packageName = context.getApplicationContext().getPackageName();
        m.d(packageName, "packageName");
        return new ActivityFilter(buildClassName(packageName, string), string2);
    }

    private final ActivityRule parseSplitActivityRule(Context context, XmlResourceParser xmlResourceParser) {
        return new ActivityRule(N.b(), context.getTheme().obtainStyledAttributes(xmlResourceParser, R.styleable.ActivityRule, 0, 0).getBoolean(R.styleable.ActivityRule_alwaysExpand, false));
    }

    private final SplitPairFilter parseSplitPairFilter(Context context, XmlResourceParser xmlResourceParser) {
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(xmlResourceParser, R.styleable.SplitPairFilter, 0, 0);
        String string = typedArrayObtainStyledAttributes.getString(R.styleable.SplitPairFilter_primaryActivityName);
        String string2 = typedArrayObtainStyledAttributes.getString(R.styleable.SplitPairFilter_secondaryActivityName);
        String string3 = typedArrayObtainStyledAttributes.getString(R.styleable.SplitPairFilter_secondaryActivityAction);
        String packageName = context.getApplicationContext().getPackageName();
        m.d(packageName, "packageName");
        return new SplitPairFilter(buildClassName(packageName, string), buildClassName(packageName, string2), string3);
    }

    private final SplitPairRule parseSplitPairRule(Context context, XmlResourceParser xmlResourceParser) {
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(xmlResourceParser, R.styleable.SplitPairRule, 0, 0);
        float f3 = typedArrayObtainStyledAttributes.getFloat(R.styleable.SplitPairRule_splitRatio, 0.0f);
        int dimension = (int) typedArrayObtainStyledAttributes.getDimension(R.styleable.SplitPairRule_splitMinWidth, 0.0f);
        int dimension2 = (int) typedArrayObtainStyledAttributes.getDimension(R.styleable.SplitPairRule_splitMinSmallestWidth, 0.0f);
        int i3 = typedArrayObtainStyledAttributes.getInt(R.styleable.SplitPairRule_splitLayoutDirection, 3);
        return new SplitPairRule(N.b(), typedArrayObtainStyledAttributes.getBoolean(R.styleable.SplitPairRule_finishPrimaryWithSecondary, false), typedArrayObtainStyledAttributes.getBoolean(R.styleable.SplitPairRule_finishSecondaryWithPrimary, true), typedArrayObtainStyledAttributes.getBoolean(R.styleable.SplitPairRule_clearTop, false), dimension, dimension2, f3, i3);
    }

    private final SplitPlaceholderRule parseSplitPlaceholderRule(Context context, XmlResourceParser xmlResourceParser) {
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(xmlResourceParser, R.styleable.SplitPlaceholderRule, 0, 0);
        String string = typedArrayObtainStyledAttributes.getString(R.styleable.SplitPlaceholderRule_placeholderActivityName);
        float f3 = typedArrayObtainStyledAttributes.getFloat(R.styleable.SplitPlaceholderRule_splitRatio, 0.0f);
        int dimension = (int) typedArrayObtainStyledAttributes.getDimension(R.styleable.SplitPlaceholderRule_splitMinWidth, 0.0f);
        int dimension2 = (int) typedArrayObtainStyledAttributes.getDimension(R.styleable.SplitPlaceholderRule_splitMinSmallestWidth, 0.0f);
        int i3 = typedArrayObtainStyledAttributes.getInt(R.styleable.SplitPlaceholderRule_splitLayoutDirection, 3);
        String packageName = context.getApplicationContext().getPackageName();
        m.d(packageName, "packageName");
        ComponentName componentNameBuildClassName = buildClassName(packageName, string);
        Set setB = N.b();
        Intent component = new Intent().setComponent(componentNameBuildClassName);
        m.d(component, "Intent().setComponent(pl…eholderActivityClassName)");
        return new SplitPlaceholderRule(setB, component, dimension, dimension2, f3, i3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x00e5, code lost:
    
        continue;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.util.Set<androidx.window.embedding.EmbeddingRule> parseSplitXml(android.content.Context r9, int r10) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            Method dump skipped, instruction units count: 260
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.window.embedding.SplitRuleParser.parseSplitXml(android.content.Context, int):java.util.Set");
    }

    public final Set<EmbeddingRule> parseSplitRules$window_release(Context context, int i3) {
        m.e(context, "context");
        return parseSplitXml(context, i3);
    }
}
