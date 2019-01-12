package nl.pvanassen.christmas.tree.animation.rainbow.animation

import nl.pvanassen.christmas.tree.animation.common.model.Animation
import nl.pvanassen.christmas.tree.animation.common.model.TreeModel
import nl.pvanassen.christmas.tree.canvas.Canvas
import javax.imageio.ImageIO
import javax.inject.Singleton

@Singleton
class Rainbow(private val canvas: Canvas, private val treeModel:TreeModel): Animation<RainbowState> {

    private val rainbow = ImageIO.read(javaClass.getResourceAsStream("/rainbow.png"))

    override fun getFrame(seed:Long, frame:Int, nsPerFrame:Int, state:RainbowState): ByteArray {
        canvas.setImage(0, state.pos++, rainbow)
        if (state.pos > rainbow.height + 420) {
            state.pos = -420
        }
        return canvas.getValues()
    }

    override fun getStateObject(): RainbowState {
        return RainbowState(-420)
    }
}
