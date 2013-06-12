package com.iheanyiekechukwu.android.ezcv;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.Button;

public class EasyCustomButton  extends Button{	
	private Typeface mTypeface;
	private String mTypePath;
	
	public EasyCustomButton(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
		// TODO Auto-generated constructor stub
		
		if(!isInEditMode()) {
			TypedArray a = getContext().obtainStyledAttributes(attrs, R.styleable.EasyCustomTextView, 0, 0);
			
			mTypePath = a.getString(R.styleable.EasyCustomTextView_typefaceName);
			
			String fullPath = "fonts/" + mTypePath + ".ttf";
			
			try {
				mTypeface = Typeface.createFromAsset(context.getAssets(), fullPath);
				this.setTypeface(mTypeface);

			} catch(Exception e) {
				e.printStackTrace();
			}
			
			this.setBackgroundColor(Color.BLUE);
			
			a.recycle();
		}
	}
	
	public EasyCustomButton(Context context, AttributeSet attrs) {
		this(context, attrs, 0);
		// TODO Auto-generated constructor stub
	}
	
	public EasyCustomButton(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
	}

}
