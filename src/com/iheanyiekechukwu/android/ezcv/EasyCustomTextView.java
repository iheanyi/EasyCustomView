package com.iheanyiekechukwu.android.ezcv;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;


public class EasyCustomTextView extends TextView {
	
	private Typeface mTypeface;
	private String mTypePath;
	
	
	public EasyCustomTextView(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
		
		if(!isInEditMode()) {
			TypedArray a = getContext().obtainStyledAttributes(attrs, R.styleable.EasyCustomTextView, 0, 0);
			
			mTypePath = a.getString(R.styleable.EasyCustomTextView_typefaceName);
			
			if(mTypePath == null || mTypePath == "") {
				mTypePath = "Roboto-Light";
			}
			
			String fullPath = "fonts/" + mTypePath + ".ttf";
			
			try {
				mTypeface = Typeface.createFromAsset(context.getAssets(), fullPath);
				this.setTypeface(mTypeface);

			} catch(Exception e) {
				//mTypeface = Typeface.createFromAsset(context.getAssets(), "fonts/Roboto-Light.ttf");
				//this.setTypeface(mTypeface);
				e.printStackTrace();
			}
			
		}
	}
	
	public EasyCustomTextView(Context context, AttributeSet attrs) {
		super(context, attrs, 0);
		// TODO Auto-generated constructor stub
	}
	
	public EasyCustomTextView(Context context) {
		super(context);
		//This fallbacks to the default TextView without applying any custom fonts
	}

}
