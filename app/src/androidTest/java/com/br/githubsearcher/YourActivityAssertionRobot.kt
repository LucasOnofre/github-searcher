package com.br.githubsearcher

import com.br.githubsearcher.utils.BaseRobot
import com.onoffrice.githubsearcher.R

fun check(func: YourActivityAssertionRobot.() -> Unit) =
    YourActivityAssertionRobot().apply { func() }

open class YourActivityAssertionRobot : BaseRobot() {

    fun titleIsVisible() {
        checkViewHasText(R.id.title, "Projeto base")
    }
}


