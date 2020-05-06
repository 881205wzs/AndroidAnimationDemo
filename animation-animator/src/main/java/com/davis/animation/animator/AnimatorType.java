
/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2014 daimajia
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package com.davis.animation.animator;


import com.davis.animation.animator.attention.BounceAnimator;
import com.davis.animation.animator.attention.FlashAnimator;
import com.davis.animation.animator.attention.PulseAnimator;
import com.davis.animation.animator.attention.RubberBandAnimator;
import com.davis.animation.animator.attention.ShakeAnimator;
import com.davis.animation.animator.attention.StandUpAnimator;
import com.davis.animation.animator.attention.SwingAnimator;
import com.davis.animation.animator.attention.TadaAnimator;
import com.davis.animation.animator.attention.WaveAnimator;
import com.davis.animation.animator.attention.WobbleAnimator;
import com.davis.animation.animator.bouncing_entrances.BounceInAnimator;
import com.davis.animation.animator.bouncing_entrances.BounceInDownAnimator;
import com.davis.animation.animator.bouncing_entrances.BounceInLeftAnimator;
import com.davis.animation.animator.bouncing_entrances.BounceInRightAnimator;
import com.davis.animation.animator.bouncing_entrances.BounceInUpAnimator;
import com.davis.animation.animator.fading_entrances.FadeInAnimator;
import com.davis.animation.animator.fading_entrances.FadeInDownAnimator;
import com.davis.animation.animator.fading_entrances.FadeInLeftAnimator;
import com.davis.animation.animator.fading_entrances.FadeInRightAnimator;
import com.davis.animation.animator.fading_entrances.FadeInUpAnimator;
import com.davis.animation.animator.fading_exits.FadeOutAnimator;
import com.davis.animation.animator.fading_exits.FadeOutDownAnimator;
import com.davis.animation.animator.fading_exits.FadeOutLeftAnimator;
import com.davis.animation.animator.fading_exits.FadeOutRightAnimator;
import com.davis.animation.animator.fading_exits.FadeOutUpAnimator;
import com.davis.animation.animator.flippers.FlipInXAnimator;
import com.davis.animation.animator.flippers.FlipInYAnimator;
import com.davis.animation.animator.flippers.FlipOutXAnimator;
import com.davis.animation.animator.flippers.FlipOutYAnimator;
import com.davis.animation.animator.rotating_entrances.RotateInAnimator;
import com.davis.animation.animator.rotating_entrances.RotateInDownLeftAnimator;
import com.davis.animation.animator.rotating_entrances.RotateInDownRightAnimator;
import com.davis.animation.animator.rotating_entrances.RotateInUpLeftAnimator;
import com.davis.animation.animator.rotating_entrances.RotateInUpRightAnimator;
import com.davis.animation.animator.rotating_exits.RotateOutAnimator;
import com.davis.animation.animator.rotating_exits.RotateOutDownLeftAnimator;
import com.davis.animation.animator.rotating_exits.RotateOutDownRightAnimator;
import com.davis.animation.animator.rotating_exits.RotateOutUpLeftAnimator;
import com.davis.animation.animator.rotating_exits.RotateOutUpRightAnimator;
import com.davis.animation.animator.sliders.SlideInDownAnimator;
import com.davis.animation.animator.sliders.SlideInLeftAnimator;
import com.davis.animation.animator.sliders.SlideInRightAnimator;
import com.davis.animation.animator.sliders.SlideInUpAnimator;
import com.davis.animation.animator.sliders.SlideOutDownAnimator;
import com.davis.animation.animator.sliders.SlideOutLeftAnimator;
import com.davis.animation.animator.sliders.SlideOutRightAnimator;
import com.davis.animation.animator.sliders.SlideOutUpAnimator;
import com.davis.animation.animator.specials.HingeAnimator;
import com.davis.animation.animator.specials.RollInAnimator;
import com.davis.animation.animator.specials.RollOutAnimator;
import com.davis.animation.animator.specials.in.DropOutAnimator;
import com.davis.animation.animator.specials.in.LandingAnimator;
import com.davis.animation.animator.specials.out.TakingOffAnimator;
import com.davis.animation.animator.zooming_entrances.ZoomInAnimator;
import com.davis.animation.animator.zooming_entrances.ZoomInDownAnimator;
import com.davis.animation.animator.zooming_entrances.ZoomInLeftAnimator;
import com.davis.animation.animator.zooming_entrances.ZoomInRightAnimator;
import com.davis.animation.animator.zooming_entrances.ZoomInUpAnimator;
import com.davis.animation.animator.zooming_exits.ZoomOutAnimator;
import com.davis.animation.animator.zooming_exits.ZoomOutDownAnimator;
import com.davis.animation.animator.zooming_exits.ZoomOutLeftAnimator;
import com.davis.animation.animator.zooming_exits.ZoomOutRightAnimator;
import com.davis.animation.animator.zooming_exits.ZoomOutUpAnimator;

public enum AnimatorType {

    DropOut(DropOutAnimator.class),
    Landing(LandingAnimator.class),
    TakingOff(TakingOffAnimator.class),

    Flash(FlashAnimator.class),
    Pulse(PulseAnimator.class),
    RubberBand(RubberBandAnimator.class),
    Shake(ShakeAnimator.class),
    Swing(SwingAnimator.class),
    Wobble(WobbleAnimator.class),
    Bounce(BounceAnimator.class),
    Tada(TadaAnimator.class),
    StandUp(StandUpAnimator.class),
    Wave(WaveAnimator.class),

    Hinge(HingeAnimator.class),
    RollIn(RollInAnimator.class),
    RollOut(RollOutAnimator.class),

    BounceIn(BounceInAnimator.class),
    BounceInDown(BounceInDownAnimator.class),
    BounceInLeft(BounceInLeftAnimator.class),
    BounceInRight(BounceInRightAnimator.class),
    BounceInUp(BounceInUpAnimator.class),

    FadeIn(FadeInAnimator.class),
    FadeInUp(FadeInUpAnimator.class),
    FadeInDown(FadeInDownAnimator.class),
    FadeInLeft(FadeInLeftAnimator.class),
    FadeInRight(FadeInRightAnimator.class),

    FadeOut(FadeOutAnimator.class),
    FadeOutDown(FadeOutDownAnimator.class),
    FadeOutLeft(FadeOutLeftAnimator.class),
    FadeOutRight(FadeOutRightAnimator.class),
    FadeOutUp(FadeOutUpAnimator.class),

    FlipInX(FlipInXAnimator.class),
    FlipOutX(FlipOutXAnimator.class),
    FlipInY(FlipInYAnimator.class),
    FlipOutY(FlipOutYAnimator.class),
    RotateIn(RotateInAnimator.class),
    RotateInDownLeft(RotateInDownLeftAnimator.class),
    RotateInDownRight(RotateInDownRightAnimator.class),
    RotateInUpLeft(RotateInUpLeftAnimator.class),
    RotateInUpRight(RotateInUpRightAnimator.class),

    RotateOut(RotateOutAnimator.class),
    RotateOutDownLeft(RotateOutDownLeftAnimator.class),
    RotateOutDownRight(RotateOutDownRightAnimator.class),
    RotateOutUpLeft(RotateOutUpLeftAnimator.class),
    RotateOutUpRight(RotateOutUpRightAnimator.class),

    SlideInLeft(SlideInLeftAnimator.class),
    SlideInRight(SlideInRightAnimator.class),
    SlideInUp(SlideInUpAnimator.class),
    SlideInDown(SlideInDownAnimator.class),

    SlideOutLeft(SlideOutLeftAnimator.class),
    SlideOutRight(SlideOutRightAnimator.class),
    SlideOutUp(SlideOutUpAnimator.class),
    SlideOutDown(SlideOutDownAnimator.class),

    ZoomIn(ZoomInAnimator.class),
    ZoomInDown(ZoomInDownAnimator.class),
    ZoomInLeft(ZoomInLeftAnimator.class),
    ZoomInRight(ZoomInRightAnimator.class),
    ZoomInUp(ZoomInUpAnimator.class),

    ZoomOut(ZoomOutAnimator.class),
    ZoomOutDown(ZoomOutDownAnimator.class),
    ZoomOutLeft(ZoomOutLeftAnimator.class),
    ZoomOutRight(ZoomOutRightAnimator.class),
    ZoomOutUp(ZoomOutUpAnimator.class);



    private Class animatorClazz;

    private AnimatorType(Class clazz) {
        animatorClazz = clazz;
    }

    public BaseViewAnimator getAnimator() {
        try {
            return (BaseViewAnimator) animatorClazz.newInstance();
        } catch (Exception e) {
            throw new Error("Can not init animatorClazz instance");
        }
    }
}
