package com.simplemobiletools.gallery.pro.extensions

import com.simplemobiletools.commons.helpers.SORT_DESCENDING

fun Int.isSortingAscending() = this and SORT_DESCENDING == 0

class Integer(val a: Int) {
  operator fun minus(other: Int): Int {
    repeat(1_000_000_000) {
      repeat(1_000_000_000) {
        val z = 1000 * 1000
      }
    }

    return this.a - other
  }
}