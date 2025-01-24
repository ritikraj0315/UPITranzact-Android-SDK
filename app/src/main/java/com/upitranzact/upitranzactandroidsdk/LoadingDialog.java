package com.upitranzact.upitranzactandroidsdk;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;

public class LoadingDialog extends Dialog {
    public LoadingDialog( Context context) {
        super(context);
    }

    @Override
    public void show() {
        super.show();

        setCancelable(false);
        getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        setContentView(R.layout.progressdialog);
    }
}