package com.audacious_software.passive_data_kit.accessibility;

import android.accessibilityservice.AccessibilityService;
import android.view.accessibility.AccessibilityEvent;

import com.audacious_software.passive_data_kit.accessibility.generators.AccessibilityEvents;

public class AccessibilityEventsService extends AccessibilityService {
    @Override
    public void onAccessibilityEvent(AccessibilityEvent event) {
        AccessibilityEvents.getInstance(this).processEvent(this, event);
    }

    @Override
    public void onInterrupt() {
    }
}

