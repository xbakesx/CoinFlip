/*
 *========================================================================
 * Util.java
 * Jul 31, 2011 9:03:43 PM | variable
 * Copyright (c) 2011 Richard Banasiak
 *========================================================================
 * This file is part of CoinFlip.
 *
 *    CoinFlip is free software: you can redistribute it and/or modify
 *    it under the terms of the GNU General Public License as published by
 *    the Free Software Foundation, either version 3 of the License, or
 *    (at your option) any later version.
 *
 *    CoinFlip is distributed in the hope that it will be useful,
 *    but WITHOUT ANY WARRANTY; without even the implied warranty of
 *    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *    GNU General Public License for more details.
 *
 *    You should have received a copy of the GNU General Public License
 *    along with CoinFlip.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.banasiak.coinflip;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.util.Log;

public class Util
{
    // debugging tag
    private static final String TAG = "Util";

    private final Context mContext;

    public Util(Context context)
    {
        mContext = context;
    }

    // check to see if an extension package is installed
    public boolean isExtPkgInstalled(String extPkg)
    {
        Log.d(TAG, "isExtPkgInstalled()");
        boolean isInstalled = false;
        try
        {
            PackageInfo packageInfo = mContext.getPackageManager().getPackageInfo(extPkg, 0);
            if (packageInfo != null)
            {
                Log.d(TAG, extPkg + " is installed");
                isInstalled = true;
            }
        }
        catch (NameNotFoundException e)
        {
            Log.d(TAG, "NameNotFoundException");
            e.printStackTrace();
        }
        return isInstalled;
    }
}
