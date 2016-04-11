package com.thea.gather.vectordrawable;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.graphics.drawable.AnimatedVectorDrawableCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Interpolator;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private ImageView iv;
    private AnimatedVectorDrawableCompat mAnimatedVectorDrawable;
    private Interpolator interp;
    private int duration;
    /*private TextView text;
    private AnimatedVectorDrawable searchToBar;
    private AnimatedVectorDrawable barToSearch;
    private float offset;
    private boolean expanded = false;*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*iv = (ImageView) findViewById(R.id.search);
        text = (TextView) findViewById(R.id.text);
        searchToBar = (AnimatedVectorDrawable) getResources().getDrawable(R.drawable.anim_search_to_bar);
        barToSearch = (AnimatedVectorDrawable) getResources().getDrawable(R.drawable.anim_bar_to_search);
        interp = AnimationUtils.loadInterpolator(this, android.R.interpolator.linear_out_slow_in);
        duration = getResources().getInteger(R.integer.duration_bar);
        // iv is sized to hold the search+bar so when only showing the search icon, translate the
        // whole view left by half the difference to keep it centered
        offset = -71f * (int) getResources().getDisplayMetrics().scaledDensity;
        iv.setTranslationX(offset);*/

        iv = (ImageView) findViewById(R.id.iv);
        Drawable drawable = iv.getDrawable();
        if (drawable instanceof Animatable)
            ((Animatable) drawable).start();
        /*mAnimatedVectorDrawable = AnimatedVectorDrawableCompat.create(this, R.drawable.animated_cpu);
        interp = AnimationUtils.loadInterpolator(this, android.R.interpolator.accelerate_decelerate);
        duration = getResources().getInteger(R.integer.duration_bar);

        iv.setImageDrawable(mAnimatedVectorDrawable);
        mAnimatedVectorDrawable.start();
        iv.animate().translationX(0f).setDuration(duration).setInterpolator(interp);*/


    }

    public void animate(View view) {

        /*if (!expanded) {
            iv.setImageDrawable(searchToBar);
            searchToBar.start();
            iv.animate().translationX(0f).setDuration(duration).setInterpolator(interp);
            text.animate().alpha(1f).setStartDelay(duration - 100).setDuration(100).setInterpolator(interp);
        } else {
            iv.setImageDrawable(barToSearch);
            barToSearch.start();
            iv.animate().translationX(offset).setDuration(duration).setInterpolator(interp);
            text.setAlpha(0f);
        }
        expanded = !expanded;*/
    }
}
