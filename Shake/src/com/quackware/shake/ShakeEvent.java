/*
 * Shake - Android gesture recognition and mapping based off of Wiigee
 * Copyright (C) 2012 Curtis Larson
 *
 *
 * This file is part of Shake.
 *
 * Shake is free software; you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License along
 * with this program; if not, write to the Free Software Foundation, Inc.,
 * 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.
 */
package com.quackware.shake;

import com.quackware.shake.wiigee.logic.Gesture;

public class ShakeEvent {
	
	private App mApp;
	private Gesture mGesture;
	private Action mAction;
	
	private boolean mEnabled;

	public ShakeEvent(App app, Gesture gesture, Action action)
	{
		mApp = app;
		mGesture = gesture;
		mAction = action;
		mEnabled = true;
	}
	
	public void setEnabled(boolean enabled)
	{
		mEnabled = enabled;
	}
}
