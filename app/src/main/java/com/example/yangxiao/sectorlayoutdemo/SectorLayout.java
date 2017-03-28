package com.example.yangxiao.sectorlayoutdemo;

import android.content.Context;
import android.support.annotation.NonNull;
import android.widget.FrameLayout;

import java.util.ArrayList;

/**
 * @Author yangxiao on 3/28/2017.
 */

public class SectorLayout extends FrameLayout {
    public interface SectorView {
        public String getName();
        public String getLabel();
        public int getIcon();
        public void onClick();
    }

    private SectorView mCenterView;
    private ArrayList<SectorView> mViews = new ArrayList<>();

    public SectorLayout(@NonNull Context context) {
        super(context);
    }

    public void addView(SectorView view) {
        this.mViews.add(view);
    }

    public void setCenterView(SectorView view) {
        this.mCenterView = view;
    }


}
