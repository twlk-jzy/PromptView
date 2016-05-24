package com.github.promptview.weidgt;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

import com.github.promptview.R;

/**
 * Created by jzy on 2016/5/23.
 */
public class PromptView extends FrameLayout {
    private ImageView ivIcon;
    private TextView tvNum;
    private TextView tvName;

    private Context mContext;

    public PromptView(Context context) {
        this(context, null);
    }

    public PromptView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public PromptView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.mContext = context;
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.view_bottom_main,this,true);
        ivIcon = (ImageView) view.findViewById(R.id.iv_icon);
        tvName = (TextView) view.findViewById(R.id.tv_name);
        tvNum = (TextView) view.findViewById(R.id.tv_num);
    }

    public void setIcon(int iconId) {
        if (ivIcon != null) {
            ivIcon.setImageResource(iconId);
        }
    }

    public void serIcon(Bitmap bitmap) {
        if (ivIcon != null && bitmap != null) {
            ivIcon.setImageBitmap(bitmap);
        }
    }

    public void setName(String name) {
        if (!TextUtils.isEmpty(name) && tvName != null) {
            tvName.setText(name);
        }
    }

    public void setNameColor(int resColor) {
        if (tvName != null) {
            tvName.setTextColor(resColor);
        }
    }

    public String getName() {
        return tvName.getText().toString();
    }

    public void setNum(int num) {
        if (tvNum != null) {
            if (num > 0) {
                tvNum.setVisibility(VISIBLE);
                tvNum.setText(String.valueOf(num));
            } else {
                tvNum.setVisibility(GONE);
            }
        }
    }

    public int getNum() {
        String num = tvNum.getText().toString();
        return num == null ? 0 : Integer.parseInt(num);
    }
}
