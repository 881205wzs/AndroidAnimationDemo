package com.davis.animation.animator.specials.in;

import android.animation.ObjectAnimator;
import android.view.View;

import com.davis.animation.animator.BaseViewAnimator;
import com.davis.animation.evaluator.AnimEvaluator;
import com.davis.animation.evaluator.EvaluatorType;

public class LandingAnimator extends BaseViewAnimator {
    @Override
    protected void prepare(View target) {
        getAnimatorAgent().playTogether(
                AnimEvaluator.build(EvaluatorType.QuintEaseOut, getDuration(), ObjectAnimator.ofFloat(target, "scaleX", 1.5f, 1f)),
                AnimEvaluator.build(EvaluatorType.QuintEaseOut, getDuration(), ObjectAnimator.ofFloat(target, "scaleY", 1.5f, 1f)),
                AnimEvaluator.build(EvaluatorType.QuintEaseOut, getDuration(), ObjectAnimator.ofFloat(target, "alpha", 0, 1f))
        );
    }
}
