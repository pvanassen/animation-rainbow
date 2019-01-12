package nl.pvanassen.christmas.tree.animation.rainbow.animation

import nl.pvanassen.christmas.tree.animation.common.model.Animation
import nl.pvanassen.christmas.tree.animation.common.model.TreeModel
import nl.pvanassen.christmas.tree.canvas.Canvas
import javax.inject.Singleton

@Singleton
class Rainbow(private val canvas: Canvas, private val treeModel:TreeModel): Animation<RainbowState> {


    override fun getFrame(seed:Long, frame:Int, nsPerFrame:Int, state:RainbowState): ByteArray {
        return canvas.getValues()
    }

    override fun getStateObject(): RainbowState {
        return RainbowState()
    }
}
