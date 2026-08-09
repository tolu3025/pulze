package androidx.window.layout;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.Display;
import android.view.DisplayCutout;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class WindowMetricsCalculatorCompat implements WindowMetricsCalculator {
    public static final WindowMetricsCalculatorCompat INSTANCE = new WindowMetricsCalculatorCompat();
    private static final String TAG;

    static {
        String simpleName = WindowMetricsCalculatorCompat.class.getSimpleName();
        kotlin.jvm.internal.m.d(simpleName, "WindowMetricsCalculatorC…at::class.java.simpleName");
        TAG = simpleName;
    }

    private WindowMetricsCalculatorCompat() {
    }

    private final DisplayCutout getCutoutForDisplay(Display display) {
        try {
            Constructor<?> constructor = Class.forName("android.view.DisplayInfo").getConstructor(new Class[0]);
            constructor.setAccessible(true);
            Object objNewInstance = constructor.newInstance(new Object[0]);
            Method declaredMethod = display.getClass().getDeclaredMethod("getDisplayInfo", objNewInstance.getClass());
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(display, objNewInstance);
            Field declaredField = objNewInstance.getClass().getDeclaredField("displayCutout");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(objNewInstance);
            if (m.a(obj)) {
                return n.a(obj);
            }
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException e3) {
            Log.w(TAG, e3);
        }
        return null;
    }

    private final int getNavigationBarHeight(Context context) {
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android");
        if (identifier > 0) {
            return resources.getDimensionPixelSize(identifier);
        }
        return 0;
    }

    private final void getRectSizeFromDisplay(Activity activity, Rect rect) {
        activity.getWindowManager().getDefaultDisplay().getRectSize(rect);
    }

    @Override // androidx.window.layout.WindowMetricsCalculator
    public WindowMetrics computeCurrentWindowMetrics(Activity activity) {
        kotlin.jvm.internal.m.e(activity, "activity");
        int i3 = Build.VERSION.SDK_INT;
        return new WindowMetrics(i3 >= 30 ? ActivityCompatHelperApi30.INSTANCE.currentWindowBounds(activity) : i3 >= 29 ? computeWindowBoundsQ$window_release(activity) : i3 >= 28 ? computeWindowBoundsP$window_release(activity) : i3 >= 24 ? computeWindowBoundsN$window_release(activity) : computeWindowBoundsIceCreamSandwich$window_release(activity));
    }

    @Override // androidx.window.layout.WindowMetricsCalculator
    public WindowMetrics computeMaximumWindowMetrics(Activity activity) {
        Rect rect;
        kotlin.jvm.internal.m.e(activity, "activity");
        if (Build.VERSION.SDK_INT >= 30) {
            rect = ActivityCompatHelperApi30.INSTANCE.maximumWindowBounds(activity);
        } else {
            Display display = activity.getWindowManager().getDefaultDisplay();
            kotlin.jvm.internal.m.d(display, "display");
            Point realSizeForDisplay$window_release = getRealSizeForDisplay$window_release(display);
            rect = new Rect(0, 0, realSizeForDisplay$window_release.x, realSizeForDisplay$window_release.y);
        }
        return new WindowMetrics(rect);
    }

    public final Rect computeWindowBoundsIceCreamSandwich$window_release(Activity activity) {
        int i3;
        kotlin.jvm.internal.m.e(activity, "activity");
        Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        kotlin.jvm.internal.m.d(defaultDisplay, "defaultDisplay");
        Point realSizeForDisplay$window_release = getRealSizeForDisplay$window_release(defaultDisplay);
        Rect rect = new Rect();
        int i4 = realSizeForDisplay$window_release.x;
        if (i4 == 0 || (i3 = realSizeForDisplay$window_release.y) == 0) {
            defaultDisplay.getRectSize(rect);
        } else {
            rect.right = i4;
            rect.bottom = i3;
        }
        return rect;
    }

    public final Rect computeWindowBoundsN$window_release(Activity activity) {
        kotlin.jvm.internal.m.e(activity, "activity");
        Rect rect = new Rect();
        Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        defaultDisplay.getRectSize(rect);
        if (!ActivityCompatHelperApi24.INSTANCE.isInMultiWindowMode(activity)) {
            kotlin.jvm.internal.m.d(defaultDisplay, "defaultDisplay");
            Point realSizeForDisplay$window_release = getRealSizeForDisplay$window_release(defaultDisplay);
            int navigationBarHeight = getNavigationBarHeight(activity);
            int i3 = rect.bottom;
            if (i3 + navigationBarHeight == realSizeForDisplay$window_release.y) {
                rect.bottom = i3 + navigationBarHeight;
            } else {
                int i4 = rect.right;
                if (i4 + navigationBarHeight == realSizeForDisplay$window_release.x) {
                    rect.right = i4 + navigationBarHeight;
                }
            }
        }
        return rect;
    }

    public final Rect computeWindowBoundsP$window_release(Activity activity) {
        DisplayCutout cutoutForDisplay;
        Rect rect;
        kotlin.jvm.internal.m.e(activity, "activity");
        Rect rect2 = new Rect();
        Configuration configuration = activity.getResources().getConfiguration();
        try {
            Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(configuration);
            if (ActivityCompatHelperApi24.INSTANCE.isInMultiWindowMode(activity)) {
                Object objInvoke = obj.getClass().getDeclaredMethod("getBounds", new Class[0]).invoke(obj, new Object[0]);
                if (objInvoke == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.graphics.Rect");
                }
                rect = (Rect) objInvoke;
            } else {
                Object objInvoke2 = obj.getClass().getDeclaredMethod("getAppBounds", new Class[0]).invoke(obj, new Object[0]);
                if (objInvoke2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.graphics.Rect");
                }
                rect = (Rect) objInvoke2;
            }
            rect2.set(rect);
        } catch (IllegalAccessException e3) {
            e = e3;
            Log.w(TAG, e);
            getRectSizeFromDisplay(activity, rect2);
        } catch (NoSuchFieldException e4) {
            e = e4;
            Log.w(TAG, e);
            getRectSizeFromDisplay(activity, rect2);
        } catch (NoSuchMethodException e5) {
            e = e5;
            Log.w(TAG, e);
            getRectSizeFromDisplay(activity, rect2);
        } catch (InvocationTargetException e6) {
            e = e6;
            Log.w(TAG, e);
            getRectSizeFromDisplay(activity, rect2);
        }
        Display currentDisplay = activity.getWindowManager().getDefaultDisplay();
        Point point = new Point();
        DisplayCompatHelperApi17 displayCompatHelperApi17 = DisplayCompatHelperApi17.INSTANCE;
        kotlin.jvm.internal.m.d(currentDisplay, "currentDisplay");
        displayCompatHelperApi17.getRealSize(currentDisplay, point);
        ActivityCompatHelperApi24 activityCompatHelperApi24 = ActivityCompatHelperApi24.INSTANCE;
        if (!activityCompatHelperApi24.isInMultiWindowMode(activity)) {
            int navigationBarHeight = getNavigationBarHeight(activity);
            int i3 = rect2.bottom;
            if (i3 + navigationBarHeight == point.y) {
                rect2.bottom = i3 + navigationBarHeight;
            } else {
                int i4 = rect2.right;
                if (i4 + navigationBarHeight == point.x) {
                    rect2.right = i4 + navigationBarHeight;
                } else if (rect2.left == navigationBarHeight) {
                    rect2.left = 0;
                }
            }
        }
        if ((rect2.width() < point.x || rect2.height() < point.y) && !activityCompatHelperApi24.isInMultiWindowMode(activity) && (cutoutForDisplay = getCutoutForDisplay(currentDisplay)) != null) {
            int i5 = rect2.left;
            DisplayCompatHelperApi28 displayCompatHelperApi28 = DisplayCompatHelperApi28.INSTANCE;
            if (i5 == displayCompatHelperApi28.safeInsetLeft(cutoutForDisplay)) {
                rect2.left = 0;
            }
            if (point.x - rect2.right == displayCompatHelperApi28.safeInsetRight(cutoutForDisplay)) {
                rect2.right += displayCompatHelperApi28.safeInsetRight(cutoutForDisplay);
            }
            if (rect2.top == displayCompatHelperApi28.safeInsetTop(cutoutForDisplay)) {
                rect2.top = 0;
            }
            if (point.y - rect2.bottom == displayCompatHelperApi28.safeInsetBottom(cutoutForDisplay)) {
                rect2.bottom += displayCompatHelperApi28.safeInsetBottom(cutoutForDisplay);
            }
        }
        return rect2;
    }

    public final Rect computeWindowBoundsQ$window_release(Activity activity) {
        kotlin.jvm.internal.m.e(activity, "activity");
        Configuration configuration = activity.getResources().getConfiguration();
        try {
            Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(configuration);
            Object objInvoke = obj.getClass().getDeclaredMethod("getBounds", new Class[0]).invoke(obj, new Object[0]);
            if (objInvoke != null) {
                return new Rect((Rect) objInvoke);
            }
            throw new NullPointerException("null cannot be cast to non-null type android.graphics.Rect");
        } catch (IllegalAccessException e3) {
            e = e3;
            Log.w(TAG, e);
            return computeWindowBoundsP$window_release(activity);
        } catch (NoSuchFieldException e4) {
            e = e4;
            Log.w(TAG, e);
            return computeWindowBoundsP$window_release(activity);
        } catch (NoSuchMethodException e5) {
            e = e5;
            Log.w(TAG, e);
            return computeWindowBoundsP$window_release(activity);
        } catch (InvocationTargetException e6) {
            e = e6;
            Log.w(TAG, e);
            return computeWindowBoundsP$window_release(activity);
        }
    }

    public final Point getRealSizeForDisplay$window_release(Display display) {
        kotlin.jvm.internal.m.e(display, "display");
        Point point = new Point();
        DisplayCompatHelperApi17.INSTANCE.getRealSize(display, point);
        return point;
    }
}
