package com.davis.animation.animator.specials.out;

import android.animation.ObjectAnimator;
import android.view.View;

import com.davis.animation.animator.BaseViewAnimator;
import com.davis.animation.evaluator.AnimEvaluator;
import com.davis.animation.evaluator.EvaluatorType;

public class TakingOffAnimator extends BaseViewAnimator {
    @Override
    protected void prepare(View target) {
        getAnimatorAgent().playTogether(
                AnimEvaluator.build(EvaluatorType.QuintEaseOut, getDuration(), ObjectAnimator.ofFloat(target, "scaleX", 1f, 1.5f)),
                AnimEvaluator.build(EvaluatorType.QuintEaseOut, getDuration(), ObjectAnimator.ofFloat(target, "scaleY", 1f, 1.5f)),
                AnimEvaluator.build(EvaluatorType.QuintEaseOut, getDuration(), ObjectAnimator.ofFloat(target, "alpha", 1, 0))
        );
    }
}
