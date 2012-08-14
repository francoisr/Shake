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

package com.quackware.shake.wiigee.device;


public class AndroidDevice extends Device {

	public AndroidDevice(boolean autofiltering) {
		super(autofiltering);
		// TODO Auto-generated constructor stub
	}
	
	public void addAccelerationEvent(double[] accelerationEvent)
	{
		this.fireAccelerationEvent(accelerationEvent);
	}

}