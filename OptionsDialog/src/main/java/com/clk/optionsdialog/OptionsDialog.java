package com.clk.optionsdialog;

import android.app.Activity;
import android.app.Dialog;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.cardview.widget.CardView;

// Created by @colakcode on GitHub 18.08.2020

public class OptionsDialog {
    private static final String TAG = "clk_OptionsDialog";
    private static Dialog dialog;
    public static Button buttonRight, buttonLeft, buttonMiddle;
    private static TextView textViewInfo;
    private static CardView cardView;

    public enum DialogGravity{BOTTOM,CENTER,TOP}

    public static void showWithTwoOptions(Activity activity, String textInfo, String textRightButton, String textLeftButton, DialogGravity gravity){

        dialog=new Dialog(activity);
        dialog.setContentView(R.layout.dialog_options);
        RelativeLayout layoutMain=dialog.findViewById(R.id.layoutAdd);
        cardView=dialog.findViewById(R.id.cardView);
        buttonRight =dialog.findViewById(R.id.buttonRight);
        buttonLeft =dialog.findViewById(R.id.buttonLeft);
        buttonMiddle =dialog.findViewById(R.id.buttonMiddle);
        buttonMiddle.setVisibility(View.GONE);
        textViewInfo =dialog.findViewById(R.id.textViewInfo);

        textViewInfo.setText(textInfo);
        buttonRight.setText(textRightButton);
        buttonLeft.setText(textLeftButton);

        DialogMethods.setWidth(activity,dialog);
        DialogMethods.setGravity(dialog, getGravity(gravity));
        DialogMethods.setAnimation(activity,layoutMain);
        dialog.show();

    }

    public static void showWithOneOption(Activity activity, String textInfo, String textRightButton, DialogGravity gravity){

        dialog=new Dialog(activity);
        dialog.setContentView(R.layout.dialog_options);
        RelativeLayout layoutMain=dialog.findViewById(R.id.layoutAdd);
        cardView=dialog.findViewById(R.id.cardView);
        buttonRight =dialog.findViewById(R.id.buttonRight);
        buttonLeft =dialog.findViewById(R.id.buttonLeft);
        buttonLeft.setVisibility(View.GONE);
        buttonMiddle =dialog.findViewById(R.id.buttonMiddle);
        buttonMiddle.setVisibility(View.GONE);
        textViewInfo =dialog.findViewById(R.id.textViewInfo);

        textViewInfo.setText(textInfo);
        buttonRight.setText(textRightButton);

        DialogMethods.setWidth(activity,dialog);
        DialogMethods.setGravity(dialog,  getGravity(gravity));
        DialogMethods.setAnimation(activity,layoutMain);
        dialog.show();
    }

    public static void showWithThreeOptions(Activity activity, String textInfo, String textLeftButton, String textRightButton, String textMiddleButton, DialogGravity gravity){

        dialog=new Dialog(activity);
        dialog.setContentView(R.layout.dialog_options);
        RelativeLayout layoutMain=dialog.findViewById(R.id.layoutAdd);
        cardView=dialog.findViewById(R.id.cardView);
        buttonRight =dialog.findViewById(R.id.buttonRight);
        buttonLeft =dialog.findViewById(R.id.buttonLeft);
        buttonMiddle =dialog.findViewById(R.id.buttonMiddle);
        textViewInfo =dialog.findViewById(R.id.textViewInfo);

        textViewInfo.setText(textInfo);
        buttonRight.setText(textRightButton);
        buttonLeft.setText(textLeftButton);
        buttonMiddle.setText(textMiddleButton);

        DialogMethods.setWidth(activity,dialog);
        DialogMethods.setGravity(dialog,  getGravity(gravity));
        DialogMethods.setAnimation(activity,layoutMain);
        dialog.show();

    }

    public static void setBackgroundColor(int backgroundColor){
       if(cardView!=null) cardView.setCardBackgroundColor(backgroundColor);
    }

    public static void setTextInfoColor(int backgroundColor){
        textViewInfo.setTextColor(backgroundColor);
    }

    public static void setAllButtonsTextColor(int backgroundColor){
        if(buttonLeft!=null) buttonLeft.setTextColor(backgroundColor);
        if(buttonRight!=null) buttonRight.setTextColor(backgroundColor);
        if(buttonMiddle!=null) buttonMiddle.setTextColor(backgroundColor);
    }

    public static void dismiss(){
        if(dialog!=null && dialog.isShowing()) dialog.dismiss();
    }

    private static int getGravity(DialogGravity dialogGravity){
        int gravity=0;
        switch (dialogGravity){
            case BOTTOM:
                gravity = Gravity.BOTTOM;
                break;
            case CENTER:
                gravity =  Gravity.CENTER;
                break;
            case TOP:
                gravity =  Gravity.TOP;
                break;
        }
        return gravity;
    }

    public static Button getButtonRight(){
        return buttonRight;
    }

    public static  Button getButtonLeft(){
        return buttonLeft;
    }

    public static Button getButtonMiddle(){
        return buttonMiddle;
    }

    public static CardView getBackgroundCardView(){
        return cardView;
    }

    public static TextView getInfoTextView(){
        return textViewInfo;
    }
}
