package com.test.viewpager.transformer

import android.view.View
import androidx.viewpager.widget.ViewPager
import kotlin.math.abs

/**
 * page -> 현재 페이지 , position -> 현재 페이지의 위치
 * camDistance의 값만큼 뷰가 z축으로 떠있음
 * */


class RotatePagerTransformer : ViewPager.PageTransformer {
    var camDistance: Float? = null

    constructor() {
        camDistance = 12000f
    }

    constructor(camDistance: Float) {
        this.camDistance = camDistance
    }

    override fun transformPage(page: View, position: Float) {

        page.translationX = -(page.width * position)
        page.cameraDistance = camDistance!!

        if (position < 0.5 && position > -0.5) {
            page.visibility = View.VISIBLE
        } else {
            page.visibility = View.INVISIBLE
        }

        if (position < -1) {  //현재 페이지가 화면 좌측으로 완전히 벗어남
            page.alpha = 0f

        } else if (position <= 0) { //현재 페이지가 좌측으로 이동중
            page.alpha = 1f
            page.rotationY = 180 * (1 - abs(position) + 1)

        } else if (position <= 1) { //현재 페이지가 화면 우측으로 이동중
            page.alpha = 1f
            page.rotationY = -180 * (1 - abs(position) + 1)

        } else {  //현재 페이지가 화면 우측으로 완전히 벗어남
            page.alpha = 0f

        }
    }
}