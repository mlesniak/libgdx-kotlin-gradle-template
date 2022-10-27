package com.mlesniak.engine

import com.badlogic.gdx.ApplicationAdapter
import com.badlogic.gdx.Gdx
import com.badlogic.gdx.Input
import com.badlogic.gdx.graphics.g2d.SpriteBatch
import com.badlogic.gdx.utils.ScreenUtils

class Core : ApplicationAdapter() {
    var batch: SpriteBatch? = null

    override fun create() {
        batch = SpriteBatch()
    }

    override fun render() {
        if (Gdx.input.isKeyJustPressed(Input.Keys.ESCAPE)) {
            Gdx.app.exit()
        }

        ScreenUtils.clear(0.3f, 0.3f, 0.3f, 1f)
        batch!!.begin()
        batch!!.end()
    }

    override fun dispose() {
        batch!!.dispose()
    }
}