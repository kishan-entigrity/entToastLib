package com.mycpe.mycpetoastlib;

import android.content.Context;
import android.widget.Toast;

public class ToastMessage {

    public static void s(Context context, String message) {

        Toast.makeText(context, ""+message, Toast.LENGTH_SHORT).show();

    }

    public static void longToast(Context context, String message) {

        Toast.makeText(context, ""+message, Toast.LENGTH_LONG).show();

    }

}
