package inswave.wmatrix.template;

import java.lang.System;

/**
 * W-Matrix TemplateActivity
 */
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0017\u001a\u00020\u0018H\u0003J\b\u0010\u0019\u001a\u00020\u0018H\u0002J\b\u0010\u001a\u001a\u00020\u0018H\u0002J\u0012\u0010\u001b\u001a\u00020\u00182\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0014J\b\u0010\u001e\u001a\u00020\u0018H\u0014J\b\u0010\u001f\u001a\u00020\u0018H\u0016J\b\u0010 \u001a\u00020\u0018H\u0016J\u0010\u0010!\u001a\u00020\u00182\u0006\u0010\"\u001a\u00020#H\u0016J\b\u0010$\u001a\u00020\u0018H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006%"}, d2 = {"Linswave/wmatrix/template/TemplateActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Linswave/wmatrix/provider/WMatrixProvider$CallbackListener;", "Linswave/wmatrix/view/WMatrix$WebViewEvent;", "()V", "binding", "Linswave/wmatrix/template/databinding/TemplateMainBinding;", "provider", "Linswave/wmatrix/provider/WMatrixProvider;", "getProvider", "()Linswave/wmatrix/provider/WMatrixProvider;", "setProvider", "(Linswave/wmatrix/provider/WMatrixProvider;)V", "useServerSelectScreen", "", "wMatrix", "Linswave/wmatrix/view/WMatrix;", "getWMatrix", "()Linswave/wmatrix/view/WMatrix;", "setWMatrix", "(Linswave/wmatrix/view/WMatrix;)V", "webView", "Landroid/webkit/WebView;", "addBackPressedEventListener", "", "exitDialog", "initialize", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onDismiss", "onProviderCreate", "onProviderError", "error", "Linswave/wmatrix/provider/model/ProviderError;", "onProviderStart", "WMatrix (Product)_v0.0.1_20230524081009_release"})
public final class TemplateActivity extends androidx.appcompat.app.AppCompatActivity implements inswave.wmatrix.provider.WMatrixProvider.CallbackListener, inswave.wmatrix.view.WMatrix.WebViewEvent {
    private inswave.wmatrix.template.databinding.TemplateMainBinding binding;
    @org.jetbrains.annotations.Nullable()
    private inswave.wmatrix.provider.WMatrixProvider provider;
    @org.jetbrains.annotations.Nullable()
    private inswave.wmatrix.view.WMatrix wMatrix;
    private android.webkit.WebView webView;
    private boolean useServerSelectScreen = false;
    
    public TemplateActivity() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final inswave.wmatrix.provider.WMatrixProvider getProvider() {
        return null;
    }
    
    public final void setProvider(@org.jetbrains.annotations.Nullable()
    inswave.wmatrix.provider.WMatrixProvider p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final inswave.wmatrix.view.WMatrix getWMatrix() {
        return null;
    }
    
    public final void setWMatrix(@org.jetbrains.annotations.Nullable()
    inswave.wmatrix.view.WMatrix p0) {
    }
    
    /**
     * W-Matrix 를 사용하기 위한 SDK 초기화.
     */
    private final void initialize() {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    /**
     * W-Matrix Provider 가 생성된 상태.
     */
    @java.lang.Override()
    public void onProviderCreate() {
    }
    
    /**
     * W-Matrix Provider 가 구동된 상태.
     */
    @java.lang.Override()
    public void onProviderStart() {
    }
    
    /**
     * W-Matrix Provider 생성, 구동 중 에러 발생 시 콜백.
     */
    @java.lang.Override()
    public void onProviderError(@org.jetbrains.annotations.NotNull()
    inswave.wmatrix.provider.model.ProviderError error) {
    }
    
    /**
     * 기존 onBackPressed 가 deprecated 에 따른 처리.
     * Supported on Android 1.6+
     */
    @androidx.annotation.MainThread()
    private final void addBackPressedEventListener() {
    }
    
    @java.lang.Override()
    protected void onDestroy() {
    }
    
    /**
     * WebView 에서 $h.dismissScreen(); 요청이 오는 경우에 해당 method 로 callback 이 온다.
     */
    @java.lang.Override()
    public void onDismiss() {
    }
    
    private final void exitDialog() {
    }
}