package com.github.promptview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.promptview.weidgt.PromptView;

public class MainActivity extends AppCompatActivity {

    private PromptView prompt_view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        prompt_view = (PromptView) findViewById(R.id.prompt_view);

        prompt_view.setIcon(R.mipmap.icon_font_msg_select);
        prompt_view.setName("提示信息");
        prompt_view.setNum(23);
    }
}
