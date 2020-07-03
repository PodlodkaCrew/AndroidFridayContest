package com.simplemobiletools.gallery.pro

import androidx.multidex.MultiDexApplication
import com.github.ajalt.reprint.core.Reprint
import com.simplemobiletools.commons.extensions.checkUseEnglish
import com.simplemobiletools.gallery.pro.asynctasks.checkUseGallery

class App : MultiDexApplication() {
    override fun onCreate() {
        super.onCreate()
        checkUseEnglish()
        checkUseGallery()
        Reprint.initialize(this)
    }
}
