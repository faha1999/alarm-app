package com.unique.alarmclock.util;

import android.view.View;

import com.unique.alarmclock.model.Alarm;

public interface OnToggleAlarmListener {
    void onToggle(Alarm alarm);
    void onDelete(Alarm alarm);
    void onItemClick(Alarm alarm,View view);
}
