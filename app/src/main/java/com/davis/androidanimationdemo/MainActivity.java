package com.davis.androidanimationdemo;

import android.animation.Animator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.davis.animation.animator.AnimAnimator;
import com.davis.animation.animator.AnimatorType;

public class MainActivity extends AppCompatActivity {

    private ListView mListView;
    private EffectAdapter mAdapter;
    private View mTarget;
    private AnimAnimator.AnimatorString rope;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init(){
        mListView = (ListView) findViewById(R.id.list_items);
        mTarget = findViewById(R.id.hello_world);

        mAdapter = new EffectAdapter(this);
        mListView.setAdapter(mAdapter);

        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (rope != null) {
                    rope.stop(true);
                }
                AnimatorType technique = (AnimatorType) view.getTag();
                rope = AnimAnimator.with(technique)
                        .duration(1200)
                        .repeat(AnimAnimator.INFINITE)
                        .pivot(AnimAnimator.CENTER_PIVOT, AnimAnimator.CENTER_PIVOT)
                        .interpolate(new AccelerateDecelerateInterpolator())
                        .withListener(new Animator.AnimatorListener() {
                            @Override
                            public void onAnimationStart(Animator animation) {

                            }

                            @Override
                            public void onAnimationEnd(Animator animation) {
                            }

                            @Override
                            public void onAnimationCancel(Animator animation) {
                                Toast.makeText(MainActivity.this, "canceled previous animation", Toast.LENGTH_SHORT).show();
                            }

                            @Override
                            public void onAnimationRepeat(Animator animation) {

                            }
                        })
                        .playOn(mTarget);
            }
        });
        findViewById(R.id.hello_world).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (rope != null) {
                    rope.stop(true);
                }
            }
        });
    }

    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        if (hasFocus) {
            rope = AnimAnimator.with(AnimatorType.FadeIn).duration(1000).playOn(mTarget);// after start,just click mTarget view, rope is not init
        }
    }
}
