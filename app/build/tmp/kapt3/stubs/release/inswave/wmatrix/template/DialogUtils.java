package inswave.wmatrix.template;

import java.lang.System;

/**
 * @author tarkarn
 * @since 2022.04.06
 *
 * Template 에서 사용하기 위한 Dialog.
 * Custom 한 Dialog 를 사용하려는 경우에는 해당 파일을 제거 후
 * TemplateActivity 에서 사용하는 부분을 대체 하면 된다.
 */
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J.\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u000bH\u0007J.\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u000bH\u0007\u00a8\u0006\r"}, d2 = {"Linswave/wmatrix/template/DialogUtils;", "", "()V", "exit", "", "dialog", "Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;", "title", "", "message", "onPositiveButtonClicked", "Lkotlin/Function0;", "forceExit", "WMatrix (Product)_v0.0.1_20230524075605_release"})
public final class DialogUtils {
    @org.jetbrains.annotations.NotNull()
    public static final inswave.wmatrix.template.DialogUtils INSTANCE = null;
    
    private DialogUtils() {
        super();
    }
    
    @androidx.annotation.MainThread()
    public final void exit(@org.jetbrains.annotations.NotNull()
    com.google.android.material.dialog.MaterialAlertDialogBuilder dialog, @org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    java.lang.String message, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onPositiveButtonClicked) {
    }
    
    @androidx.annotation.MainThread()
    public final void forceExit(@org.jetbrains.annotations.NotNull()
    com.google.android.material.dialog.MaterialAlertDialogBuilder dialog, @org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    java.lang.String message, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onPositiveButtonClicked) {
    }
}