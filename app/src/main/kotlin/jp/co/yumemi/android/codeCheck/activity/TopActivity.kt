/*
 * Copyright © 2021 YUMEMI Inc. All rights reserved.
 */
package jp.co.yumemi.android.codeCheck

import androidx.appcompat.app.AppCompatActivity
//import jp.co.yumemi.android.codeCheck.R
import jp.co.yumemi.android.code_check.R
import java.util.*

class TopActivity : AppCompatActivity(R.layout.activity_top) {

    companion object {
        var lastSearchDate: Date? = null
    }
}
