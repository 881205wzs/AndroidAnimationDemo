package com.davis.animation.animator.specials.in;

import android.animation.ObjectAnimator;
import android.view.View;

import com.davis.animation.animator.BaseViewAnimator;
import com.davis.animation.evaluator.AnimEvaluator;
import com.davis.animation.evaluator.EvaluatorType;

public class DropOutAnimator extends BaseViewAnimator {
    @Override
    protected void prepare(View target) {
        int distance = target.getTop() + target.getHeight();
        getAnimatorAgent().playTogether(
                ObjectAnimator.ofFloat(target, "alpha", 0, 1),
                AnimEvaluator.build(EvaluatorType.BounceEaseOut, getDuration(), ObjectAnimator.ofFloat(target, "translationY", -distance, 0))
        );
    }
}
